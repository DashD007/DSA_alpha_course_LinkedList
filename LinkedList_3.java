public class LinkedList_3 {
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

    //add first
    public void addfirst(int data){
        //step 1 : create a newNode;
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        //step 2 : assign its next to head..
        newNode.next = head;

        //step 3 : assign newNode to head..
        head = newNode;
    }
    public static void main(String[] args) {
        // in this lecture we will learn how to create "Add first()" method in linked list..
        //Add first method is used to add element at the first index of a linked list..
        LinkedList_3 ll = new LinkedList_3();
        ll.addfirst(2);
        ll.addfirst(3);
    }
}
