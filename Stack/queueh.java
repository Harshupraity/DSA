import java.util.*;
import java.lang.*;
import java.io.*;
// class Queue
// {
//     int size,cap;
//     int a[];
//    Queue(int c)
//     {
//         cap=c;
//         size=0;
//         a= new int[cap];
//     }
//     boolean isFull()
//     {
//         return (size == cap);
//     }
//     boolean isEmpty()
//     {
//         return (size ==0);
//     }
//     void enque(int x)
//     {
//         if(isFull())
//         {
//             return ;
//         }
//         a[size]=x;
//         size++;
//     }
//     void deque()
//     {
//         if(isEmpty())
//         {
//             return ;
//         }
//         for(int i=0;i<size-1;i++)
//         {
//             a[i]=a[i+1];
//         }
//         size--;
//     }
//     int getFront()
//     {
//         if(isEmpty())
//         {
//             return -1;
//         }
//         else
//         {
//             return 0;
//         }
//     }
//     int getRear()
//     {
//         if(isEmpty())
//         {
//             return -1;
//         }
//         else
//         {
//             return size-1;
//         }
//     }

// }
// class  queueh 
// {
//     public static void main(String[] at)
//     {
//        Queue  q=new Queue(1000);
//         q.enque(10);
//         q.enque(20);
//         q.enque(30);
//         q.enque(40);
//         //System.out.println(q.deque);
//         System.out.println("Front item is"+q.getFront());
//         System.out.println("Rear item is"+q.getRear());

//     }
// }

// //efficient method.
class Queue
{
    boolean isFull()
    {
        return (cap==size);
    }
    boolean isEmpty()
    {
        return (size==0);
    }
    int getfront()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return front;   
        }
    }
    int getRear()
    {
        if(isEmpty())
        {
            return -1
        }
        else
        {
            return (front+size-1)%cap;
        }
    }
    void enque(int x)
    {
        if(isfull())
        {
            return ;
        }
        int rear= getRear();
        rear=(rear+1)%cap;
        a[rear]=x;
        size++;
    }
    void deque()
    {
        if(isEmpty())
        {
            return ;
        }
        front= (front+1)%cap;
        size--  ;
    }
}
//same.