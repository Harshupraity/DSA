import java.util.*;
import java.lang.*;
import java.io.*;
class Queue 
{
    int size,cap;
    int a[];
    Queue(int c)
    {
        cap=c;
        size=0;
        a= new int[cap];
    }
    boolean isFull()
    {
        return (size == cap);
    }
    boolean isEmpty()
    {
        return (size ==0);
    }
    void enque(int x)
    {
        if(isFull())
        {
            return ;
        }
        a[size]=x;
        size++;
    }
    void deque()
    {
        if(isEmpty())
        {
            return ;
        }
        for(int i=0;i<size-1;i++)
        {
            a[i]=a[i+1];
        }
        size--;
    }
    int getFront()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    int getRear()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return size-1;
        }
    }

}
class Queue
{
    public static void main(String[] at)
    {
        Queue  q=new Queue(1000);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.dequeue()+"dequed from queue\n");
        System.out.print("Front item is"+q.getFront());
        System.out.print("Rear item is"+q.getRear());

    }
}