import java.util.*;
import java.io.*;
import java.lang.*;

// class Node
// {
//     int data;
 
//     Node next,random;
//     Node(int d)
//     {
//         data = d;
   
//         next = random= null;
//     }
// }
// class clonelinked
// {
//     public static Node Clonecurr(Node head)
//     {
//         HashMap<Node,Node> hm = new HashMap<Node ,Node>();
//         for(Node curr = head;curr!=null;curr = curr.next)
//         {
//             hm.put(curr,new Node(curr.data));
//         }
//         for(Node curr = head;curr!=null;curr=curr.next)
//         {
//             Node clonecurr = hm.get(curr);
//             clonecurr.next = hm.get(curr.next);
//             clonecurr.random = hm.get(curr.random);
//         }
//         Node head2 = hm.get(head);
//         return head2;
//     }
//     public static void main(String[] args)
//     {
//         	Node head = new Node(10); 
//         head.next = new Node(5); 
//         head.next.next = new Node(20);      //These are the connected values.
//         head.next.next.next = new Node(15); 
//         head.next.next.next.next = new Node(20); 
        
//         head.random = head.next.next;
//         head.next.random=head.next.next.next;
//         head.next.next.random=head;                 //These are the random values
//         head.next.next.next.random=head.next.next;
//         head.next.next.next.next.random=head.next.next.next;

//         System.out.print("original head");
//         print(head);

//         System.out.print("Cloned list");
//         head = Clonecurr(head);
//         print(head);
//     }

//       public static void print(Node head) 
//     { 
//         Node curr = head; 
//         while (curr!=null) 
//         { 
//             System.out.println ( "Data = " + curr.data + ", Random  = "+ curr.random.data); 
//             curr = curr.next; 
//         } 
//     }
// }

class clonelinked
{
    static Node Clonecurr(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            Node temp = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = temp;
            curr = temp;
        }
        curr = head;
        while(curr!=null)
        {
            if(curr.next!=null)
            {
                curr.next.random = (curr.random!=null) ? curr.random.next:null;

            }
            curr = curr.next.next;
        }
        Node orig = head;
        Node copy = head.next;
        Node temp = copy;
        while(orig!=null)
        {
            orig.next = orig.next.next;
            copy.next = head.next.next.next;
            orig = orig.next;
            copy = copy.next;
        }
        return temp;
    }
      public static void main(String[] args)
    {
        	Node head = new Node(10); 
        head.next = new Node(5); 
        head.next.next = new Node(20);      //These are the connected values.
        head.next.next.next = new Node(15); 
        head.next.next.next.next = new Node(20); 
        
        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;                 //These are the random values
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;

        System.out.print("original head");
        print(head);

        System.out.print("Cloned list");
        head = Clonecurr(head);
        print(head);
    }

      public static void print(Node head) 
    { 
        Node curr = head; 
        while (curr!=null) 
        { 
            System.out.println ( "Data = " + curr.data + ", Random  = "+ curr.random.data); 
            curr = curr.next; 
        } 
    }

}