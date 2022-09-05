import java.util.*;
import java.io.*;
import java.lang.*;


//Naive Approach.....
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
// class nthend 
// {
//     static void End(Node head,int n)
//     {
     
//        int count=0;
//        for(Node curr=head;curr!=null;curr = curr.next)
//        {
//            count++;
//        }
//        if(count<n)
//        {
//            return ;
//        }
//        Node  curr=head;
//        for(int i= 1; i<count-n+1;i++)
//        {
//            curr = curr.next;
//        }
//        System.out.print(curr.data+" ");
//     }
//      public static void main(String[] arsg)
//     {
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = new Node(40);
//         head.next.next.next.next = new Node(50);
//         head.next.next.next.next.next = new Node(60);
//         End(head,2);

//         // printList(head);
//     } 
// }
class nthend
{
    static void printnth(Node head,int n)
    {
        if(head==null)
        {
            return;
        }
        Node first = head;
        for(int i=0;i<n;i++)
        {
            first = first.next;
        }
        Node sec = head;
        while(first!=null)
        {
            sec = sec.next;
            first = first.next;
        }
        System.out.print(sec.data+" ");

    }
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printnth(head,2);
    }
}