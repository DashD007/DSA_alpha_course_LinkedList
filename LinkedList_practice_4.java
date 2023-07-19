package LinkedList;

import LinkedList_part2.LinkedList_4;

public class LinkedList_practice_4 {
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
        if(head==null){
            head = tail = newNode;
            return;
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
    public Node EvenOdd(Node head){
        Node even = new Node(-1);
        Node tempeven = even;
        Node odd = new Node(-1);
        Node tempOdd = odd;
        Node temp = head;
        while(temp!= null){
            if(temp.data%2==0){
                tempeven.next = temp;
                tempeven = tempeven.next;
            }
            else if(temp.data%2 != 0){
                tempOdd.next = temp;
                tempOdd = tempOdd.next;
            }
            temp = temp.next;
        }
        tempOdd.next = null;
        tempeven.next = odd.next;
        return even.next;
    }
    public static void main(String[] args) {
        // here we will learn how to build a function that arrange the given linkedlist in a fashion such that all even elements of linked list come first and then all odd elements come..
        LinkedList_practice_4 ll = new LinkedList_practice_4();
        ll.add(8);
        ll.add(12);
        ll.add(10);
        ll.add(5);
        ll.add(4);
        ll.add(1);
        ll.add(6);
        ll.print(head);
        ll.print(ll.EvenOdd(head));
    }
}
