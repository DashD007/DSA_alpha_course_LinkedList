public class LinkedList_14 {
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
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    //slow fast approach
    public Node FindMid(Node head){
        Node slow = head;
        Node fast = head;
        while((fast!=null)&&(fast.next!=null)){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean palindrome(){
        //step 1 find mid
        if(head==null|| head.next == null){
            return true;
        }
        Node midNode = FindMid(head);
        //step 2 : reverse the half list
        //same as we do normal reverse;
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //step 3: check the left and right part of linkedlist..
        Node right = prev;
        Node left = head;
        while(right!= null){
            if(right.data!= left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList_14 ll = new LinkedList_14();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        //System.out.println(ll.FindMid(head).data);
        //ll.add(5);
        //System.out.println(ll.FindMid(head).data);
        System.out.println(ll.palindrome());
    }
}
