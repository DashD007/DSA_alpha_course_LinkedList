import java.sql.SQLOutput;

public class LinkedList_6 {
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
    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = null;
            return;
        }
        tail.next  =  newNode;
        tail = newNode;
    }

    public void add(int index,int data){
        if(index==0) {
            addfirst(data);
            return;
        }
        int count=0;
        Node newNode = new Node(data);
        Node temp = head;
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        while(count<index-1){
            if(temp.next == null){
                System.out.println("index is out of bound");
                return;
            }
            temp = temp.next;
            count++;
        }

        //means temp is currently at prev..
        //so
        newNode.next  = temp.next;
        temp.next = newNode;
    }

    public void PrintLinkedList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
        //System.out.print(temp.data);
    }


    public static void main(String[] args) {
        LinkedList_6 ll = new LinkedList_6();
        ll.PrintLinkedList();

        ll.addfirst(2);
        ll.PrintLinkedList();

        ll.addfirst(1);
        ll.PrintLinkedList();

        ll.addlast(3);
        ll.PrintLinkedList();

        ll.addlast(4);
        ll.PrintLinkedList();

        ll.add(0,8);
        ll.PrintLinkedList();
    }
}
