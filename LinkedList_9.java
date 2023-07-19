import java.sql.SQLOutput;

public class LinkedList_9 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void add(int data){
        Node newNode = new Node(data);
        size++;
        if(head ==null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int removelast(){
        if(size==0){
            System.out.println("ll is empty");
            return -1;
        }
        else if(size==1){
            head = tail = null;
        }
        int i=0;
        Node temp = head;
        while(i<size-2){
            temp= temp.next;
            i++;
        }
        //now temp is at previous node..
        int k = temp.next.data;
        temp.next = null;
        tail = temp;
        return k;
    }

    public void printLinkedList(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // here we will learn about removing an element or a node from the end of linkedlist..
        LinkedList_9 ll = new LinkedList_9();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.printLinkedList();
        ll.removelast();
        ll.printLinkedList();
    }
}
