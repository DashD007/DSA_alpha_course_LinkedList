package LinkedList;

public class LinkedList_practice_2 {
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
        if(head==null){
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    public void Print(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void DeleteNodes(Node head,int m ,int n){
        Node temp = head;
        int i = 0;
        //m = m+1;
        while(temp!=null ){
            if(i%m ==m-1){
                Node dele = temp;
                int j =0;
                while(j<=n && dele!=null){
                    dele = dele.next;
                    j++;
                }
                temp.next = dele;
            }
            i++;
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        // here we will built a function in which which we delete n node after every m nodes..
        LinkedList_practice_2 ll = new LinkedList_practice_2();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.Print(head);
        ll.DeleteNodes(head,2,2);
        ll.Print(head);

    }
}
