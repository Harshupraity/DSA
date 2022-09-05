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
    int a[];
    int size;
    int rear =-1;
    Queue(int n)
    {
        a= new int[size];
        this.size = n;
    }
    boolean isEmpty()
    {
        return rear == -1;
    }
    void enqueue(int x)
    {
        if(rear == size-1) 
        {
            System.out.println("Queue is full");
            return ;
        }
        rear++;
        a[rear]= x;
    }
    int dequeue()
    {
        if(isEmpty()) //size = 0
        {
            System.out.println("queue is empty");
            return -1;
        }
        int front = a[0];
        for(int i=0;i<size;i++)
        {
            a[i]=a[i+1];

        }
        rear--;
        return front;
    }
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("empty q");
            return -1;
        }
        return  a[0];
    }
 
     public static void main(String[] a)
    {
        
   
        Queue q= new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
    
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
        // System.out.println(q.dequeue() 
		// 				+ " dequeued from queue\n"); 
  
    }
}
