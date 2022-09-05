import java.util.*;
import java.io.*;
import java.lang.*;


class Node
{
    int data;
 //   Node prev;
    Node next;
    Node(int d)
    {
        data = d;
   //     prev = null;
        next = null;
    }
}
class Removedupli 
{
    static void show(Node head)
    {
        Node curr = head;
        while(curr!=null&&curr.next!=null)
        {
            if(curr.data==curr.next.data)
            {
                curr.next=curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        
    }
    public static void main(String[] args)
    {
         Node head = new Node(10);
        head.next = new Node(20);

        head.next.next = new Node(30);
         head.next.next.next = new Node(30);
         show(head);
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

