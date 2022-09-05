import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
 
    Node next;
    Node(int d)
    {
        data = d;
   
        next = null;
    }
}

// class pairwiseswap
// {
//     static void show(Node head)
//     {
//         Node curr = head;
//         while(curr!=null && curr.next!=null)
//         {
//             int temp = curr.data;
//             curr.data = curr.next.data;
//             curr.next.data = temp;
//             curr = curr.next.next;
//         }
//     }
//     public static void main(String[] args)
//     {
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = new Node(40);
//         show(head);
//         printList(head);
//     }
//     public static void printList(Node head)
//     {
//         Node curr=head;
//         while(curr!=null){
//         System.out.print(curr.data+" ");
//         curr=curr.next;
//     }System.out.println();
//     }
// }
class pairwiseswap
{
    static Node show(Node head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }

    
        Node curr = head.next.next;
        Node prev = head;
        head = head.next;           //For handling first two nodes.
        head.next = prev;
        while(curr!=null && curr.next!=null)
        {
            prev.next= curr.next;
            prev = curr;
            Node next = curr.next.next;
            curr.next.next = curr;
            curr = next;

        }
        prev.next = curr;
        return head;
    }
    public static void main(String[] args)
    {
       Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head = show(head);
        printList(head);  
    }
    public static void printList(Node head)
    {
      Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();  
    }
}