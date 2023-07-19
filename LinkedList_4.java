public class LinkedList_4 {
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
        newNode.next = head;
        head = newNode;
    }

    //addlast method..
    public void addlast(int data){
        //step 1: create newNode
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
        }
        //step 2: assign previous node's next to newNode
        tail.next = newNode;
        //step 3: assign newNode's next to null
        newNode.next = null;
        tail = newNode;
    }
    public static void main(String[] args) {
        // in this lecture we will learn about addlast function in linkedlist..
        LinkedList_4 ll = new LinkedList_4();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);

        //1-2-3-4;
    }
}
