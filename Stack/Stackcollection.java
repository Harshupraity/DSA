import java.util.*;
import java.io.*;
import java.lang.*;

class Stackcollection
{
    public static void main(String[] arsg)
    {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());//Peek fuction gives the top item and it returns the top items

    }
}