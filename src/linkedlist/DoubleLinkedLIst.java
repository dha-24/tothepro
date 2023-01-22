package linkedlist;

public class DoubleLinkedLIst {
    Node head_ref;

    public class Node{
        int data;
        Node prev, next;

        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        };
    }

    public void push(int data){
        Node nodeToPush = new Node(data);
        nodeToPush.next = head_ref;
        nodeToPush.prev = null;

        if(head_ref!=null){
            head_ref.prev = nodeToPush;
        }

        head_ref = nodeToPush;
    }

    public void printList(){
        Node tmp = head_ref;
        Node last = null;
        System.out.println("print forward");

      while(tmp!=null){
        System.out.println("  "+tmp.data);
        last = tmp;
        tmp = tmp.next;
       }

        System.out.println("print backward");

        while(last!=null){
            System.out.println("  "+last.data);
            last = last.prev;
        }
    }

public void insertAfter(int prevData, int newData){
        Node tmp = head_ref;
        Node previous = null;
    System.out.println("Head Value :"+head_ref.data);

        while(tmp.next!= null){

            if(tmp.data == prevData){
                previous = tmp;
                  System.out.println("previus Value: " + previous.data + " current Data: "+ tmp.data + "Next data is :"+previous.next.data);
                break;
            }
            tmp = tmp.next;
        }

        if(previous!=null){
            System.out.println("not a head node");
            Node new_node = new Node(newData);
            new_node.next = previous.next;
            new_node.prev = previous;
            previous.next = new_node;
            if(new_node.next!=null){
                new_node.next.prev = new_node;
            }
            System.out.println("prinitng list after insert");
            printList();

        }





}


    public static void main(String[] args) {
        DoubleLinkedLIst dll = new DoubleLinkedLIst();
        dll.push(1);
        dll.push(2);
        dll.push(3);
        dll.push(4);
        dll.push(8);
        dll.printList();
        dll.insertAfter(4, 5);
        dll.insertAfter(8, 10);
    }



}
