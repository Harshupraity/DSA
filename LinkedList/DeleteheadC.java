import java.util.*;
import java.io.*;
import java.lang.*;

//Naive Solution.
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
// class DeleteheadC
// {
//     static Node DeleteHead(Node head)
//     {
//         if(head==null)
//         {
//            return null;
//         }
//         if(head.next==head)
//         {
//             return null;
//         }
//         Node curr = head;
//         while(curr.next!=head)
//         {
//             curr = curr.next;
//         }
//         curr.next = head.next;
//         return curr.next;
//     }
//     public static void main(String[] args)
//     {
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = head;
//         head = DeleteHead(head);
//         printList(head);
//     }
//     public static void printList(Node head)
//     {
//        if(head==null)
//        {
//            return ;
//        }
//        Node curr = head;
//        do{
//            System.out.print(curr.data+" ");
//            curr = curr.next;
//        }while(curr!=head);

//     }
// }

//Efficient Solution.
class DeleteheadC
{
     static Node delHead(Node head)
    {
        if(head==null)
        {
            return null;
        }
        if(head.next==head)
        {
            return null;
        }
       
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
      
    }
     public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
    	head.next.next.next.next=head;
    	head=delHead(head);
    	printlist(head);
    	
    } 
    
    public static void printlist(Node head){
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    } 
}