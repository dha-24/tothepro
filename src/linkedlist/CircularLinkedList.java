package linkedlist;

public class CircularLinkedList {

    static class Node{
        int data;
        Node next;
    };

    static Node deleteNode(Node head, int val){
        if(head == null){
            System.out.println("Nothing to do ->> head null");
            return null;
        }
        Node current = head, prev = new Node();


        while(current.data!=val){
            if(current.next == head){
                System.out.println("Looping complete");
                break;
            }
            prev = current;
            current = current.next;
        }

 // if node is the only node.
        if(current.next == head){
            head = null;
            return head;
        }

       //deleting the head with more elements
        //if there are more elements in the list
        if(current == head){
            prev = head;
            while(prev.next!=head){
                prev = prev.next;
            }
            head = current.next;
            prev.next = head;
        }
       //if deleting the last Node
        // tricky because last.next pointing to the head
        else if(current.next == head){
            prev.next = head;
        } else {
            prev.next = current.next;
        }
        return head;
    }

    static Node push(Node head_ref, int data){
        Node new_node = new Node();
        Node tmp = head_ref;
        new_node.data = data;
        new_node.next = head_ref;

        if(head_ref!=null){
            while(tmp.next!=head_ref){
                tmp = tmp.next;
            }
            tmp.next = new_node;
        } else new_node.next = new_node;
      head_ref = new_node;
     return head_ref;
    }

    static void circularPrintList(Node head){
        Node tmp = head;
        if(head!=null){

            do{
                System.out.println(tmp.data+" -> ");
                tmp = tmp.next;
            }while(tmp!=head);


        } else System.out.println("head is null : which means list is null");


    }

    public static void main(String[] args) {
        Node head = null;
        head = push(head, 10);
        head = push(head, 20);
        head = push(head, 30);
        circularPrintList(head);
        head = deleteNode(head, 10);
        circularPrintList(head);
    }

}
