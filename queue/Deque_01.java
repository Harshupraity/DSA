import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayDeque;
//In this simple implementation insert rear and delete rear is O(1).but insert front and delete front is O(n).
// class Deque21
// {
//     static int size,cap;
//     static int a[];
//     static int front,rear;
//     Deque21(int c)
//     {
//         size=0;
//         cap=c;
//         a=new int[cap];

//     }
//     static boolean isEmpty()
//     {
//         return (size==0);
//     }
//     static boolean isFull()
//     {
//         return (size==cap);
//     }
//     static void insertRear(int x)
//     {
//         if(isFull())
//         { 
//             System.out.println("size is full");
//             return ;
//         }
//         a[size]=x;
//         size++;
//     }
//     static void deleteRear()
//     {
//         if(isEmpty())
//         {
//             return ;
//         }
//         size--;
//     }
//     static int getRear()
//     {
//         if(isEmpty())
//         {
//             return -1;
//         }
//         else 
//         {
//             return a[size-1];
//         }
//     }
//     static void insertFront(int x)
//     {
//         if(isFull())
//         {
//             System.out.println("Size is full");
//             return ;
//         }
//         for(int i=size-1;i>=0;i--)

//         {
//             a[i+1]=a[i];
//         }
//         a[0]=x;
//         size++;
//     }
//     static void deletefront()
//     {
//         if(isEmpty())
//         {
//             return ;
//         }
//         for(int i=0;i<a.length-1;i++)
//         {
//             a[i]=a[i+1];

//         }
//         size--;
//     }
//     static int getFront()
//     {
//         if(isEmpty())
//         {
//             return -1;
//         }
//         else 
//         {
//             return a[0];
//         }
//     }
    
// }
// class Deque_01
// {
//     public static void main(String[] ata)
//     {
//         // Deque21 x = new Deque21(5);
//         // System.out.println(x.isFull());
//         // x.insertFront(10);
//         // System.out.println(x.getFront());


//         Deque21 y = new Deque21(5);
//         y.insertFront(10);
//         y.insertFront(20);
//         y.insertFront(30);
//         y.insertFront(40);

//         y.deletefront();

//         y.insertRear(50);
//        // y.deleteRear();
//         System.out.println(y.getFront());
//         // System.out.println(dq+" "); 
//          System.out.println(y.getRear()+" ");
// }
// // Java program to demonstrate working of
// // ArrayDeque in Java
// // import java.util.ArrayDeque;

// // class Deque_01{
// //     public static void main(String args[])
// //     {
// //         // Creating empty ArrayDeque as Queue
// //         ArrayDeque<Integer> ad  = new ArrayDeque<Integer>();

// //         // Add items to the ad using offer() at last
// //         ad.offer(10);
// //         ad.offer(20);
        
// //         // Returns the front of queue, 10
// //         System.out.println(ad.peek());
        
// //         // Returns and Removes the front of queue, 10
// //         System.out.println(ad.poll());
        
// //         // Returns the front of queue, 20
// //         System.out.println(ad.peek());
        
// //         // Adds 40 to last of queue
// //         ad.offer(40);
        
// //         // Returns the front of queue, 20
// //         System.out.println(ad.peek());
// //     }
//  }
class Dq
{
    int a[];
    int front,cap,size,rear;
    Dq(int c)
    {
        cap=c;
        a=new int[cap];
        front=0;
        rear=0;
        size=0;

    }
    boolean isEmpty()
    {
        return size==0;
    }
    boolean isFull()
    {
        return size==cap-1;
    }
    void insertFront(int x)
    {
        if(isFull())
        {
            System.out.println("size is full");
            return ;
        }   
        front= (front-1+cap)%cap;
        size++;
    }
    void deleteRear()
    {
        if(isEmpty())
        {
            System.out.println("empty");
            return ;
        }
        rear= (rear-1+cap)%cap;
        size--;
    }
    void insertRear(int x)
    {
        if(isFull())
        {
            System.out.println("full");
        }
        rear=(rear+1)%cap;
        size++;
    }
    void deleteFront(int x)
    {
        if(isEmpty())
        {
            System.out.println("em");
        }
        front=(front+1)%cap;
        size--;
    }
    int Getf()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return a[front];
        }
    }

}
class Deque_01
{
    public static void main(String[] at)
    {
        Dq x=new Dq(5);
        x.insertFront(10);
        System.out.println(x.Getf());
    }
}