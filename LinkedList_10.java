public class LinkedList_10 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }
        size++;
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
    }
    public int search(int ele){
        int i=0;
        Node temp = head;
        if(head==null){
            System.out.println("ll is empty");
            return -1;
        }
        while(i<=size-1){
            if(temp.data== ele){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        //here we will search for an element in a linkedlist using iterative approach..
        LinkedList_10 ll = new LinkedList_10();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(ll.search(2));
        System.out.println(ll.search(5));
        System.out.println(ll.search(10));

    }
}
