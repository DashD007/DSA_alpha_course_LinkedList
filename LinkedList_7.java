import java.sql.SQLOutput;

public class LinkedList_7 {
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

    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail=null;
        }
        tail.next= newNode;
        tail =newNode;
    }
    public void add(int index,int data){
        if(index ==0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        if(head==null){
            System.out.println("LL is empty");
        }
        int count =0;
        while(count<index-1 && temp != null){
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int size(){
        int size1=0;
        Node temp = head;
        while(temp!=null){
            size1++;
            temp = temp.next;
        }
        return size1;
    }
    public static void main(String[] args) {
        //here we will find the size of linkedlist..
        LinkedList_7 ll = new LinkedList_7();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);
        ll.add(2,3);
        System.out.println(size);
         System.out.println(ll.size());
    }
}
