package LinkedList;

public class LinkedList_2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static void main(String[] args) {
        // in this we will learn about head and tail of linked list..
        // head is the first element of linkedlist..
        // tail is the last element of linkedlist

        // if the linkedlist has only one element then it will be both head and tail of linkedlist..
        LinkedList_2 ll = new LinkedList_2();
        ll.Head = new Node(1);
        ll.Tail = new Node(2);
    }
}
