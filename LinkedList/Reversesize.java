import java.util.*;
import java.io.*;
import java.lang.*;

//Iterative solution.
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
// class Reversesize
// {
//     static Node show(Node head,int k)
//     {
//         Node curr = head;
//         Node prevFirst = null;
//         boolean isFirstPass = true;
//         while(curr!=null)
//         {
//             int count = 0;

//             Node first = curr,prev = null;
//             while(curr!=null && count<k)
//             {
//                 Node next = curr.next;
//                 curr.next = prev;
//                 prev =  curr;
//                 curr = next;
//                 count++;

//             }
//           if(isFirstPass)
                {
                    head = prev;
                    isFirstPass(false)

                }
                else
                {
                    preFirst.next = prev;
                }
                prevFirst = first;
//         }
//         return head;
//     }
//     public static void main(String[] args)
//     {
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next=new Node(40);
//     	head.next.next.next.next=new Node(50);
//     	head.next.next.next.next.next=new Node(60);
//     	head.next.next.next.next.next.next=new Node(70);
//         head = show(head,4);
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

//Recursive solution.
class Reversesize
{
    static Node Reverse(Node head,int k)
    {
        Node prev = null; 
        Node curr = head;
        Node next = null;
        int count=0;
        while(count <k&&curr!=null)
        {
             next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
            count++;
        }
        if(next!=null)
        {
            Node rest_head = Reverse(next,k);
            head.next = rest_head;

        }
        return prev;
    }
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next=new Node(40);
    	head.next.next.next.next=new Node(50);
    	head.next.next.next.next.next=new Node(60);
    	head.next.next.next.next.next.next=new Node(70);
        head = Reverse(head,4);
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