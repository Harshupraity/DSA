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
class evenodd
{
    public static Node show(Node head)
    {
        Node es=null,ee=null,os=null,oe=null;
        for(Node curr = head;curr!=null;curr=curr.next)
        {
            int x = curr.data;
            if(x%2==0)
            {
                if(es==null)
                {
                    es = curr;
                    ee = es;
                }
                else
                {
                    ee.next = curr;
                    ee = ee.next;

                }
            }
            else
            {
                if(os==null)
                {
                    os = curr;
                    oe = os;
                }
                else
                {
                    oe.next  =curr;
                    oe = oe.next;
                }
            }
         
        }
           if(os==null||es==null)
            {
                return head;
            }
            ee.next = os;
            oe.next = null;
            return es;
        
    }
     public static void main(String[] arsg)
    {
        Node head=new Node(10);
    	head.next=new Node(15);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	
        show(head);
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