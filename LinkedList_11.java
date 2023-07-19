public class LinkedList_11 {
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
        }
        tail.next = newNode;
        tail = newNode;
    }
    public int Search(int ele,int i,Node temp){
        if(i==size){
            return -1;
        }
        if(temp.data == ele){
            return i;
        }
        return Search(ele,i+1,temp.next);
    }
    public static void main(String[] args) {
        // here we will learn how to find the element in given linked list using Recusrive approach;
        LinkedList_11 ll = new LinkedList_11();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(ll.Search(2,0,head));
        System.out.println(ll.Search(5,0,head));
    }
}
