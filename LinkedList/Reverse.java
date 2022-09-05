import java.util.*;
import java.io.*;
import java.lang.*;


//Naive Approach.....
//Can't understand


//Itereative reverse
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

// class Reverse
// {
//     static Node Reverse(Node head)
//     {
//         Node curr = head;
//         Node prev = null;
//         while(curr!=null)
//         {
//             Node next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;

//         }
//         return prev;
//     }
//     public static void main(String[] args)
//     {
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head = Reverse(head);
//         printList(head);
//     }
//     public static void printList(Node head)
//     {
//         Node curr = head;
//         while(curr!=null)
//         {
//             System.out.print(curr.data+" ");
//             curr = curr.next;
//         }
//     }

// }


//recursive first...
// class Reverse
// {
//     static Node recRev(Node head)
//     {
//         if(head==null||head.next==null)
//         {
//             return head;
//         }

//        Node resthead = recRev(head.next);
//        Node rest_tail = head.next;
//        rest_tail.next = head;
//        head.next = null;
//        return resthead; 
//     }
//     public static void main(String[] args)
//     {
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head = recRev(head);
//         printList(head);


//     }
//     public static void printList(Node head)
//     {
//         Node curr = head;
//         while(curr!=null)
//         {
//             System.out.print(curr.data+" ");
//             curr = curr.next;
//         }
//     }
// }

//recursive 2nd

class Reverse
{
    public static Node recRev(Node curr,Node prev)
    {
        if(curr==null)
        {
            return prev;
        }
        Node next = curr.next;
        curr.next = prev;
        return recRev(next,curr);
    } 
     public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        
        head = recRev(head,null);
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