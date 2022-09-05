import java.util.*;
import java.lang.*;
import java.io.*;

// class Queue  
// {
//     int front,rear,size,cap;
//     int a[];
//     public Queue(int capicity)
//     {
//         this.capicity = cap;
//         front= this.size =0;
//         rear= capicity-1;
//         a= new int[this.capicity];

//     }
//     int getfront()
//     {
//         if(size==0)
//         {
//             return -1;
//         }
//         else
//         {
//             return front;   
//         }
//     }
//     int getrear()
//     {
//         if(size==0)
//         {
//             return -1;
//         }
//         else
//         {
//             return (front+size-1)%cap;
//         }
//     }
//     void enqueue(int x)
//     {
//         if(size==cap)
//         {
//             return ;
//         }
//         int rear = getrear();
//         rear= (rear+1)%cap;
//         a[rear]= x;
//         size++;
//     }
//     int deque()
//     {
//         if(size==0)
//         {
//             return Integer.MIN_VALUE ;
//         }
//         front=(front+1)%cap;
//         size--;
//     }
    
// }
class Queue
{
    static int a[] = new int[3];
    static int size = 3;
    static int rear =-1;
    // Queue(int n)
    // {
    //     a= new int[size];
    //     this.size = n;
    // }
    static boolean isEmpty()
    {
        return rear == -1;
    }
    static void add(int x)
    {
        if(rear == size-1) 
        {
            System.out.println("Queue is full");
            return ;
        }
        else
        {
            rear++;
            a[rear]= x;
        }
    }
    static int dequeue()
    {
        if(isEmpty()) //size = 0
        {
            System.out.println("queue is empty");
            return -1;
        }
        int front = a[0];
        for(int i=0;i<size-1;i++)
        {
            a[i]=a[i+1];

        }
        rear--;
        return front;
    }
    static int peek()
    {
        if(isEmpty())
        {
            System.out.println("empty q");
            return -1;
        }
        return a[0];
    }
 
     public static void main(String[] a)
    {
        
   
        //  Queue q= new Queue(3);
        //  q.enqueue(5);
        add(10);
        add(20);
        add(30);
    
        while(!isEmpty())
        {
            // System.out.println(peek());
            // int top = dequeue();
            // q.remove();
        
        System.out.println(dequeue() 
						+ " dequeued from queue\n"); 
        }
    }
}
