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
// class DetectLoopko
// {
//     static boolean isLoop(Node head)
//     {
//         Node slow=head,fast=head;
//         while(fast!=null&&fast.next!=null)
//         {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow==fast)
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] arsg)
//     {
//         Node head=new Node(15);
//     	head.next=new Node(10);
//     	head.next.next=new Node(12);
//     	head.next.next.next=new Node(20);
//     	head.next.next.next.next=head.next;
//         if (isLoop(head)) 
//             System.out.print("Loop found"); 
//         else
//             System.out.print("No Loop"); 
            
//     }
// }

//Delete Loop
class DetectLoopko
{
    public static void isLoop(Node head)
    {
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        if(slow!=fast)
        {
            return ;
        }
        slow=head;
        while(slow.next!=fast.next)   //It will broke loop one position before and hence we get hold on last pos and then 
                                        // we can break the loop.
        {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
         
    }
  

    public static void main(String[] arsg)
    {
        Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;
        isLoop(head);
        printList(head);
            
    }
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
    
    
}