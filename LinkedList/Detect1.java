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
class Floyd's
{
    static boolean isLoop(Node head)
    {
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow = next;
            fast = next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] arsg)
    {
        Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;
        if (isLoop(head)) 
            System.out.print("Loop found"); 
        else
            System.out.print("No Loop"); 
            
    }
}