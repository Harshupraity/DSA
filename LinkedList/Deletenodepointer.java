import java.util.*;
import java.io.*;
import java.lang.*;

//This code does not work for deleting the last element.

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
class Deletenodepointer
{
    static void delete(Node ptr)
    {
        Node temp = ptr.next;
        ptr.data = temp.data;
        ptr.next = temp.next;
    }
    public static void main(String[] args)
    {
        Node head=new Node(10);
    	head.next=new Node(20);
    	Node ptr=new Node(30);
	    head.next.next=ptr;
    	head.next.next.next=new Node(40);
    	head.next.next.next.next=new Node(25);
    	printlist(head);
	    delete(ptr);
    	printlist(head);
    }
    public static void printlist(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}