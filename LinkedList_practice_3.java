package LinkedList;

public class LinkedList_practice_3 {
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
    public void print(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void SwapKey(Node head,int key1,int key2){
        Node prev1 = null;
        Node curr1 = head;
        while(curr1.data!=key1){
            prev1 = curr1;
            curr1 = curr1.next;
        }
        Node prev2 = null;
        Node curr2 = head;
        while(curr2.data!=key2){
            prev2 = curr2;
            curr2 = curr2.next;
        }
        Node next = curr1.next;
        curr1.next = curr2.next;
        prev2.next = curr1;
        curr1 = curr1.next;
        prev1.next = curr2;
        curr2.next = next;

    }
    public static void main(String[] args) {
        // in this question we will build a function which will swap two keys in linked list..
        LinkedList_practice_3 ll = new LinkedList_practice_3();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.print(head);
        ll.SwapKey(head,2,4);
        ll.print(head);
    }
}
