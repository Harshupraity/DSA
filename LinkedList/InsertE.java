import java.util.*;
import java.io.*;
import java.lang.*;
//naive
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
// class InsertE
// {
//     static Node Insert(Node head,int x)
//     {
//         Node temp = new Node(x);
//         if(head==null)
//         {
//             temp.next = temp;
//             return temp;
//         }
//         else{
//         Node curr = head;
//         while(curr.next!=head)
//         {
//             curr = curr.next;
//         }
//         curr.next = temp;
//         temp.next = head;
//         return head;
//         }
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
//         if(head==null)
//         {
//             return;
//         }
//         Node curr = head;
//         do{
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }while(curr!=head);
//     }
// }

//Efficient
class InsertE
{
    public static Node InsertEnd(Node head,int x)
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
            int t = temp.data;
            temp.data = head.data;
            head.data = t;
            return temp;    //We are returning temp insted of head because now we traverse from temp asuuming temp is to be first element.  

        }
    }
    public static void main(String[] args)
    {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        head = InsertEnd(head,5);
        printList(head);
        
    }
    public static void printList(Node head)
    {
        if(head== null)
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