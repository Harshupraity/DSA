import java.util.*;
import java.io.*;
import java.lang.*;

// class MyStack
// {
//    int a[];
//    int cap;
//    int top;
//    MyStack(int c)
//    {
//        top=-1;
//        cap = c;
//        a = new int[cap];
//    }
//    void push(int x)
//    {
//        if(top==cap-1)
//        {
//            return;
//        }
//        top++;
//        a[top] = x;
//    }
//    int pop()
//    {
//        if(top==-1)
//        {
//            Integer.MIN_VALUE;
//        }
//        int res = a[top];
//        top--;
//        return res;
//    }
//    int size()
//    {
//        return top+1;
//    }
//    boolean isEmpty()
//    {
//        return (top==-1);
//    }
// }
// class Imple2
// {
//     public static void main(String[] bargs)
//     {
//         MyStack s = new MyStack(5);
//         s.push(10);
//         s.push(20);
//         System.out.println(s.pop());
//         s.push(30);
//         System.out.println(s.size());

//     }
// }
//Above function does not hold -:
//1.Overflow & underflow.
//2.No dynamic size.    

//ArrayList implementation.
class MyStack
{
    ArrayList<Integer> al = new ArrayList<>();
    void push(int x)
    {
        al.add(x);
    }
    int pop()
    {
        int res = al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }
    int peek()
    {
        return al.get(al.size()-1);
    }
    boolean isEmpty()
    {
        return al.isEmpty();
    }
    int size()
    {
        return al.size();
    }
}
class Imple2
{
    public static void main(String[] argts)
    {
        MyStack s= new MyStack();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());


    }
}