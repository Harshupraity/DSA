import java.util.*;
import java.io.*;
import java.lang.*;


class Node 
{
    int data;
    Node prev;
    Node next;
    Node(int d)
    {
        data = d;
        prev = null;
        next = null;

    }
    
}
class insertDou
{
    static Node Insert(Node head,int x)
    {
        Node temp = new Node(x);
        temp.next = head;
        head.prev = temp;
        return temp;
    }
    public static void main(String[] args)
    {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.next = temp3;
        temp2.prev = temp1;
        temp3.prev = temp2;
        printList(head);

        head  = Insert(head,5);
        printList(head);
        
    }
    public static void printList(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}