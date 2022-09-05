import java.util.*;
import java.io.*;
import java.lang.*;


//Naive approach.
class Node 
{
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}
// class InsertB
// {
//     static Node Insert(Node head,int x)
//     {
//         Node temp= new Node(x);
//         if(head==null)
//         {
//             temp.next = temp;
//         }
//         else
//         {
//             Node curr = head;
//             while(curr.next!=head)
//             {
//                 curr = curr.next;
//             }
//             curr.next = temp;
//             temp.next = head;
//         }
//         return temp;
//     }
//     public static void main(String[] args)
//     {
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = head;
//         head = Insert(head,5);
//         printList(head);
       
//     }
//     public static void printList(Node head)
//     {
//        if(head==null)
//        {
//            return ;
//        }
//        System.out.print(head.data+" ");
//        for(Node curr=head.next;curr!=head;curr = curr.next)
//        {
//            System.out.print(curr.data+" ");
//        }
//     }
// }

//Efficient approach.

class InsertB
{
    static Node Insert(Node head,int x)
    {
        Node temp = new Node(x);
        if(head==null)
        {
            temp.next = temp;
            return temp;
        }
        else
        {
            temp.next = head.next;
            head.next = temp;
            int t = head.data; //swapping first and second element.
            head.data = temp.data;
            temp.data  = t;
            return head;
        }

    }
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        head = Insert(head,5);
        printList(head);

    }
    public static void printList(Node head)
    {
        if(head==null)
       {
           return ;
       }
       System.out.print(head.data+" ");
       for(Node curr=head.next;curr!=head;curr = curr.next)
       {
           System.out.print(curr.data+" ");
       }

    }
}