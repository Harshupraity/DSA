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
// class Intersection
// {
//     static int show(Node head1,Node head2)
//     {
//         HashSet<Integer> hs = new HashSet<Integer>();
//         for(Node curr = head1;curr!=null;curr=curr.next)
//         {
//             hs.add(curr.data);
//         }
//         for(Node curr=head2;curr!=null;curr=curr.next)
//         {
//             if(hs.contains(curr.data))
//             {
//                 return curr.data;
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args)
//     {
//         Node head1 = new Node(3);
//         head1.next = new Node(6);
//         head1.next.next = new Node(9);
//         head1.next.next.next = new Node(15);
//         Node head2 = new Node(6);
//         head2.next = new Node(45);
//         head2.next.next = new Node(4);

//         System.out.print(show(head1,head2));
//     }
// }


//Second solution.
class Intersection
{

}