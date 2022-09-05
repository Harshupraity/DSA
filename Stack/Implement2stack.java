import java.util.*;
import java.io.*;
import java.lang.*;

// class Twostacks
// {
//     int a[];
//     int cap ;
//     int top1,top2;
//     Twostacks(int n)
//     {
//         cap = n;
//         a = new int[n]; 
//         top1 = n/2+1;
//         top2 = n/2;
//     }
//     void push1(int x)
//     {
//         if(top1>0)
//         {
//             top1--;
//             a[top1]=x;
//         }       
//         else
//         {
//             System.out.println("Stackover flow by element:" +x);
//             return ;
//         }
//     }
//     void push2(int x)
//     {
//         if(top2<cap-1)
//         {
//             top2++;
//             a[top2] = x;
//         }
//         else{
//             System.out.print("stack overflow by element :"+x);
//             return ;
//         }

//     }
//     int pop1()
//     {
//         if(top1<=cap/2)
//         {
//             int x = a[top1];
//             top1++;
//             return x;
//         }
//         else
//         {
//             System.out.println("Stack UnderFlow");
//             System.exit(1);
//         }
//         return 0;
//     }
//     int pop2()
//     {
//         if(top2>=cap/2+1)
//         {
//             int x = a[top2];
//             top2--;
//             return x;
//         }
//         else
//         {
//             System.out.println("Stack UnderFlow");
//             System.exit(1);
//         }
//         return 0;
//     }
// }
// class Implement2stack
// {
//     public static void main(String[] args)
//     {
//         Twostacks ts = new Twostacks(5);
//         ts.push1(5); 
//         ts.push2(10); 
//         ts.push2(15); 
//         ts.push1(11); 
//         ts.push2(7); 
//         System.out.println("popped element from stack1 is "+ ts.pop1());
//         ts.push2(40); 
//         System.out.println("popped element from stack2 is " + ts.pop2());

//     }

// }

class Twostacks
{
    int a[],cap,top1,top2;
    Twostacks(int n)
    {
        cap=n;
        top1 = -1;
        top2 = cap;
        a = new int[n];
    }
    void push1(int x)
    {
        if(top1<top2-1)
        {
            top1++;
            a[top1]=x;
        }
    }
    void push2(int x)
    {
        if(top1<top2-1)
        {
            top2--;
            a[top2]=x;  
        }
    }
    int pop1()
    {
        if(top1>=0)
        {
            int x = a[top1];
            top1--;
            return x;
        }
        else
        {
            System.exit(1);
        }
        return 0;
    }
    int pop2()
    {
        if(top2<cap)
        {
            int x =a[top2];
            top2++;
            return x;
        }
        else
        {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        return 0;
    }

}
class Implement2stack
{
    public static void main(String[] args)
    {
        Twostacks ts = new Twostacks(5);
        ts.push1(5);
        ts.push2(10);
         ts.push2(15); 
        ts.push1(11); 
        ts.push2(7); 

          System.out.println("Popped element from stack1 is: " + ts.pop1()); 
        ts.push2(40); 
        System.out.println("Popped element from stack2 is: " + ts.pop2());  
	  
    }
}