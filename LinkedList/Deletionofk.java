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

class Deletionofk
{
    public static Node deletekth(Node head,int k)
    {
        if(head==null)
        {
            return head;
        }
        if(k==1)
        {
            return deleteHead(head);
        }
        Node curr = head;
        for(int i=0;i<k-2;i++)
        {
            curr = curr.next;

        } 
        curr.next = curr.next.next;
        return head;
        

    }
    static Node deleteHead(Node head)
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
    public static void main(String[] args)
    {
        Node head= new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        printList(head);
        head = deletekth(head,3);
        printList(head);
    }

        public static void printList(Node head)
        {
            if(head==null)
            {
                return ;
            }
            Node curr = head;
            do{
                System.out.print(curr.data+" ");
                curr = curr.next;
            }while(curr!=head);
        }
    
}