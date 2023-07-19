import java.sql.SQLOutput;

public class LinkedList_5 {
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
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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
        LinkedList_5 ll = new LinkedList_5();
        ll.PrintLinkedList();

        ll.addfirst(2);
        ll.PrintLinkedList();

        ll.addfirst(1);
        ll.PrintLinkedList();

        ll.addlast(3);
        ll.PrintLinkedList();

        ll.addlast(4);
        ll.PrintLinkedList();

        LinkedList_5 ll1 = new LinkedList_5();
        ll1.addfirst(6);
        ll1.addfirst(5);
        ll1.addlast(7);
        ll1.addlast(8);
        //PrintLinkedList(ll1);
    }
}
