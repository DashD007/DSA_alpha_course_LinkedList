public class LinkedList_12 {
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
        size++;
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        int i =0;
        while(i<size){
            System.out.print(temp.data+"->");
            temp = temp.next;
            i++;
        }
        System.out.println("null");
    }

    public void reverse(){
       Node prev = null;
       Node curr = tail = head;
       Node next;
       while(curr!= null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       head = prev;
    }
    public static void main(String[] args) {
        // here we will learn how to reverse a linkedlist..
        LinkedList_12 ll = new LinkedList_12();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
