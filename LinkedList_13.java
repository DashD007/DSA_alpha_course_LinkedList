public class LinkedList_13 {
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
        size++;
        if(head==null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void removeNth(int n){
        if(n>size){
            System.out.println("index is out of bound");
            return;
        }
        int idx = size-n;
        int i=1;
        if(n == size){
            head = head.next; // removeFirst;
            return;
        }
        Node prev = head;
        while(i<idx){
            prev = prev.next;
            i++;
        }
        size--;
        prev.next = prev.next.next;
        return;
    }
    public void print(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList_13 ll = new LinkedList_13();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
        ll.removeNth(1);
        ll.print();
    }
}
