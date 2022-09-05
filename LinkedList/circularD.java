import java.util.*;
import java.io.*;
import java.lang.*;


//Circular doubly linked list. We cannot traverse through circuar doubly linkedlist.
//Insert at the begning .
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
// class circularD
// {
//     static Node InsertB(Node head,int x)
//     {
//         Node temp = new Node(x);
//         if(head==null)
//         {
//             temp.prev=temp;
//             temp.next=temp;
//             return temp;
//         }
//         temp.prev = head.prev;
//         temp.next = head;
//         head.prev.next = temp;
//         head.prev = temp;
//         return temp;

//     }
//     public static void main(String[] args)
//     {
//         Node head = new Node(10);
//         Node temp1 = new Node(20);
//         Node temp2 = new Node(30);
//         // temp2 = head;
//         head.next = temp1;
//         temp1.prev = head;
//         temp1.next = temp2;
//         temp2.prev = temp1;
//         temp2.next = head;
//         head.prev = temp2;
        
       
//         head = InsertB(head,5); 
//         printList(head);    
//     }
//     public static void printList(Node head)
//     {
//         if(head==null)
//         {
//             return ;
//         }
//         System.out.print(head.data+" ");
//         for(Node curr = head.next;curr!=head;curr=curr.next)
//         {
//             System.out.print(curr.data+" ");
//         }
//     }
// }

//Insert at the end.
//In line 35 it returns the same head.

class circularD
{
    public static Node sortedInsert(Node head,int x)
    {
        Node temp = new Node(x);
        if(head==null)
        {
            return temp;
        }
        if(x<head.data)
        {
            temp.next = head;
            return temp;
        }        
        Node curr = head;
        while(curr.next!=null && curr.next.data<x)
        {
            curr=curr.next;
        } 
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
    public static void main(String[] args)
    {
        Node head= new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = sortedInsert(head,25);
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