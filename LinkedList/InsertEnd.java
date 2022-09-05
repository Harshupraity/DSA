// import java.util.*;
// import java.io.*;
// import java.lang.*;

// class Node
// {
//     int data;
//     Node prev;
//     Node next;
//     Node(int d)
//     {
//         data=d;
//         prev = null;
//         next = null;
//     }
// }
// class InsertEnd

// {
//     static Node InsertE(Node head,int x)
//     {
//        Node temp = new Node(x);
//        if(head == null)
//        {
//            return temp;
//        }
//        Node curr = head;
//        while(curr.next!=null)
//        {
//            curr = curr.next;
//        }
//         curr.next = temp;
//         temp.prev = curr;
//         return head;
//     }
//     public static void main(String[] args)
//     {
//         Node head = new Node(10);
//         Node temp1 = new Node(20);
//         Node temp2 = new Node(30);
//        // Node temp3 = new Node(40);
//         head.next = temp1;
//         temp1.prev = head;
//         temp1.next = temp2;
        
//         temp2.prev = temp1;
//         //temp3.prev = temp2;
//         printList(head);
//         head = InsertE(head,50);
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
