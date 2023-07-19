public class LinkedList_8 {
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
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
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
    public int removefirst(){
        if(size()==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size()==1) {
            int val=head.data;
            head = tail = null;
            return val;
        }
        int val =head.data;
        head = head.next;
        return val;
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
    }

    public static void main(String[] args) {
        //here we will learn how to remove an first element or a first node from a linkedlist..
        LinkedList_8 ll = new LinkedList_8();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.PrintLinkedList();
        int k = ll.removefirst();
        System.out.println(k);
        ll.PrintLinkedList();
        System.out.println(ll.size());
    }
}
