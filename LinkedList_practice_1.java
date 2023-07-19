package LinkedList;

public class LinkedList_practice_1 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head1;
    public static Node tail;
    public static Node head2;

    public void Print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node intersection(Node head1,Node head2){
        Node temp1 = head1;
        Node temp2;
        while(temp1!= null){
            temp2 = head2;
            while(temp2!= null){
                if(temp1 == temp2){
                    return temp2;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return null;
    }
    public static void main(String[] args) {
        LinkedList_practice_1 ll = new LinkedList_practice_1();
        ll.head1 = new Node(1);
        ll.head1.next = new Node(2);
        ll.head1.next.next = new Node(3);
        Node temp = new Node(6);
        ll.head1.next.next.next = temp;
        ll.head1.next.next.next.next = new Node(7);

        ll.head2 = new Node(4);
        ll.head2.next = new Node(5);
        ll.head2.next.next = temp;

        ll.Print(head1);
        ll.Print(head2);
        System.out.println(ll.intersection(head1,head2).data);

    }
}
