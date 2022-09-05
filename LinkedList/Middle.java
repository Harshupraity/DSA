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

class Middle
{
    // static void ReturnM(Node head)
    // {
    //     if(head==null)
    //     {
    //         return ;
    //     }
    //     int count=0;
    //     for(Node curr = head;curr!=null;curr = curr.next)
    //     {
    //         count++;
    //     }
    //     Node curr = head;
    //     for(int i=0;i<count/2;i++)       Naive Approach...
    //     {
    //         curr = curr.next;
    //     }
    //     System.out.print(curr.data);
    //}  
    static void ReturnM(Node head)
    {
        if(head==null)
        {
            return ;
        }
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)        //Efficient Approach...
        {
            slow = slow.next;
            fast = fast.next.next;
        } 
        System.out.print(slow.data);

    }

    public static void main(String[] arsg)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        ReturnM(head);

        // printList(head);
    } 
    // public static void printList(Node head)
    // {
    //     Node curr = head;
    //     while(curr!=null)
    //     {
    //         System.out.print(curr.data+" ");
    //         curr = curr.next;
    //     }
    // }

    
}