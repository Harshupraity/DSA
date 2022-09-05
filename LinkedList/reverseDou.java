// import java.util.*;
// import java.io.*;
// import java.lang.*;

// class Node
// {
//     int data ;
//     Node prev ;
//     Node next;
//     Node(int d)
//     {
//         data = d;
//         prev = null;
//         next = null;
//     }
// }
// class reverseDou
// {
//     static Node Reverse(Node head)
//     {
//         if(head==null || head.next == null)
//         {
//             return head;
//         }
//         Node prev = null;
//         Node curr = head;
//         while(curr!=null)
//         {
//             prev = curr.prev;
//             curr.prev = curr.next;     //Swapping.
//             curr.next = prev;
//             curr=curr.prev;      //Since the value of next hasbeen change therefore we use temp which is the previous value instead of next.
//         }
//         return prev.prev;

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
        
//        // printList(head);
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


