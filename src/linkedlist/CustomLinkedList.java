package linkedlist;
//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


import com.sun.org.apache.xpath.internal.objects.XNull;
import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;

// LL has basically 3 months  -- push
public class CustomLinkedList {
//head of the list, property is having no data and point towards the null.
    Node head;

 class Node{
    int data;
    Node next;

    Node(int nodeValue){
        data = nodeValue;
        next = null;
    }
}
//to insert the  --- value at the top of the linkedList
public void push(int newValue){
Node nodeToInsert = new Node(newValue);
nodeToInsert.next = head;  // because currently head poinintg to the
head = nodeToInsert;
}

public void insertAt(Node prevNode, int newValue){
    if(prevNode == null){
        System.out.println("Previous node seems to be empty");
        return;
    }
    Node newNode = new Node(newValue);
    newNode.next = prevNode.next;
    prevNode.next = newNode;

}

public void append(int newValue){
     Node newNode = new Node(newValue);
     if(head == null){
        head = newNode;
        return;
     }
     newNode.next = null;//because we have to make it last node in list
    Node last = head;
    while(last.next!=null){
        last = last.next;
    }
    last.next = newNode;
    return;
}

    public void printList(){
        Node myNode =  head;
        while(myNode!=null){
            System.out.println(myNode.data);
            myNode = myNode.next;
        }
    }

    public int size(Node head){
     if(head == null){
         return 0;
     }
     if(head!=null && head.next==null){
         return 1;
     }
    return 1 + size(head.next);
    }


    Node reverseList(Node node){
     Node prev = null;
     Node next = null;
     Node current = head;
     while(current!=null){
         next = current.next;
         current.next = prev;
         prev = current;
         current = next;
     }
    node = prev; // head ref = last node which is having null
         return node;
    }


    public static void main(String[] args) {
        CustomLinkedList cll = new CustomLinkedList();
        System.out.println("Head is :"+ cll.head);
        cll.append(5);
        cll.push(6);
        cll.push(10);
        cll.append(10);
        cll.push(11);
        cll.push(12);
        cll.append(100);
        cll.append(101);
        System.out.println("Head after list created : "+ cll.head.data);
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//
//        cll.head = node2;
//        cll.head.next = node1;
//        node1.next = node3;

        cll.printList();
        cll.head = cll.reverseList(cll.head);
        System.out.println("Head after reversed : "+ cll.head.data);
        cll.printList();
        System.out.println("size is --> " + cll.size(cll.head));
}
}
