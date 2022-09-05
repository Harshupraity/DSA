// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Queue
// {
//     int a[];
//     int size;
//     int rear;
//     Queue(int size)
//     {
//         this.size= size;
//         a=new int[size];
//         rear=-1;
//     }
//     boolean isEmpty()
//     {
//         return rear==-1;
//     }
//     void add(int x)
//     {
//         if(rear == size-1)
//         {
//             return ;
//         }
//         rear++;
//         a[rear]=x;

//     }
//     int remove()
//     {
//         if(isEmpty())
//         {
//             return -1;
//         }
//         int front = a[0];
//         for(int i=0;i<rear;i++)
//         {
//             a[i]=a[i+1];
//         }
//         rear--;
//         return front;
//     }
//     int peek()
//     {
//         if(isEmpty())
//         {
//             return -1;
//         }
//         return a[0];
//     }
    
// }
// class implementation 
// {
//     public static void main(String[] at)
//     {
//         Queue q= new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//         System.out.println(q.remove());
       
//         }
//     }
// }

//circular implementation.
// class Queue
// {
//     int a[];
//     int size;
//     int rear;
//     int front;
//     Queue(int n)
//     {
//         this.size=n;
//         a=new int[n];
//         rear=-1;
//         front=-1;
//     }
//     boolean isEmpty()
//     {
//         return rear==-1 && front == -1;
//     }
//     boolean isFull()
//     {
//         return (rear+1)%size==front;
//     } 


//     void add(int x)
//     {
//         if(isFull())
//         {
//             System.out.print("full");
//             return ;
//         }
//         //add firstelement.
//         if(front == -1)
//         {
//             front=0;
//         }
//        rear= (rear+1)%size;
//        a[rear]= x;
   
//     } 
//     int remove()
//     {
//         if(isEmpty())
//         {
//             return -1;
//         }
//         int res=a[front];
//         if(rear==front)         //condition that if one element is only present.
//         {
//             rear=front=-1;
//         }
//         else 
//         {
//             front= (front+1)%size;
//         }
//         return res;
//     }
//     int peek()
//     {
//         if(isEmpty())
//         {
//             System.out.print("empty queue");
//             return -1;
//         }
//         else
//         {
//             return a[front];
//         }
//     }

// }
// class implementation
// {
//     public static void main(String[] st)
//     {
//         Queue q= new Queue(5);
//         q.add(1);
//          q.add(2);
//           q.add(3);
//            q.add(4);
//             q.add(5);
//             System.out.println(q.remove());
//             q.add(6);
//             System.out.println(q.remove());
//             q.add(7);
//         while(!q.isEmpty())
//         {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

//linked list implementation.
// class Node
// {
//     int data;
//     Node next;
//     Node(int data)
//     {
//         this.data= data;
//         next=null;
//     }
// }
// class Queue
// {
//     Node head= null;
//     Node tail=null;

//     boolean isEmpty()
//     {
//         return head==null && tail==null;
//     }

//     //variable size data structure is full only when memory of the system is get full .


//     void add(int x)
//     {
//         Node newnode= new Node(x);
//         //if tail is the first element. then in that case head == tail == null.
//         if(isEmpty())
//         {
//             tail=head=newnode;
//         }
   
//         else
//         {
//             tail.next= newnode;
//             tail= newnode;
//         }
//     }
//     int remove()
//     {
//         if(isEmpty())
//         {
//             System.out.println("empty queue");
//             return -1;
//         }
        
//         int front = head.data;
//         if(head==tail)
//         {
//             tail=null;
//         }
//         head= head.next;

//         return front;
//     }
//     int peek()
//     {
//         if(isEmpty())
//         {
//             System.out.println("empty queue");
//             return -1;
//         }
//         return head.data;
//     }
// }
// class implementation
// {
//     public static void main(String[] st)
//     {
//         Queue q= new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
    
//         while(!q.isEmpty())
//         {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

//java collectionframework

// import java.util.*;
 
// class implementation {
//    public static void main(String args[]) {
//        //Queue<Integer> q = new LinkedList();
//        Queue<Integer> q = new ArrayDeque<Integer>(); 
        
//         q.offer(10); 
//         q.offer(20); 
//         q.offer(30); 
        
//         System.out.println(q.peek()); 
//         System.out.println(q.poll()); 
//         System.out.println(q.peek()); 
//    }
// }
// import java.util.*;
// class Queue
// {
//     Queue<Integer> q1= new LinkedList<Integer>();
//     Queue<Integer> q2 = new LinkedList<Integer>();

//     static int curr_size;
//     stack()
//     {
//         curr_size = 0;
//     }
//     static void push(int x)
//     {
//         curr_size++;
//         q2.add(x);
//         while(!q1.isEmpty())
//         {
//             q2.add(q1.peek());
//             q1.remove();
//         }
//     }
// }

//creating queue with help of two stack .
// class Queue
// {
//     Stack<Integer> s1 = new Stack<>();  
//     Stack<Integer> s2= new Stack<>();
     
//     boolean isEmpty()
//     {
//         return s1.isEmpty();
//     }
//     void add(int x)
//     {
//         while(!s1.isEmpty())
//         {
//             s2.push(s1.pop());
//         }
//         s1.push(x);
//         while(!s2.isEmpty())
//         {
//             s1.push(s2.pop());
//         }
//     }
//     int remove(){
//         if(isEmpty())
//         {
//             System.out.println("q is empty");
//             return -1;
//         }
//         return s1.pop();
//     }
     
//     int peek() 
//     {
//         if(isEmpty())
//         {
//             System.out.println("q is empty");
//             return -1;
//         }
//         return s1.peek(); 
//     }
   
// }
// class implementation
// {
//      public static void main(String[] at)
//     {
//         Queue q= new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while(!q.isEmpty())
//         {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }
// import java.util.LinkedList; 
// import java.util.Queue; 
// import java.util.Stack; 
// import java.util.*;
// class Queue
// {
//     static Queue<Integer> q; 
//     static void reverse()
//     {
//         Stack<Integer> s= new Stack<>();
//         while(!q.isEmpty())
//         {
//            s.add(q.peek());
//            q.remove();
//         }
//         while(!s.isEmpty())
//         {
//             q.add(s.peek());
//             s.pop();
//         }
//     }
//      public static void main(String[] at)
//     {
//         q= new LinkedList<Integer>();
//         q.add(12); 
// 		q.add(5); 
// 		q.add(15); 
// 		q.add(20);

//         reverse() ;
//         for(Integer x:q)
//         {
//             System.out.print(x+" ");
//         }
//     }
// }


class Queue
{
    static void printfirst(int n)
    {
       Queue q= new Queue(3);
        q.push("5");
        q.push("6");
        for(int i=0;i<n;i++)
        {
            String curr= q.pop();
            System.out.println(curr+" ");
            //q.pop();
            q.push(curr+"5");
            q.push(curr+"6");
        }

    }
}