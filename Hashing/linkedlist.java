//Java program to demonstrate implementation of our 
//own hash table with chaining for collision detection.
import java.util.*;
import java.io.*;
import java.lang.*;

class MyHash
{
    int bucket;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int b)
    {
        bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i = 0;i<b;i++)
        {
            table.add(new LinkedList<Integer>());
        }
    }
        void insert(Integer k)
        {
            int i = k%bucket;
            table.get(i).add(k);
        }
        boolean search(Integer k)
        {
            int i= k%bucket;
            return table.get(i).contains(k);
        }
        void delete(Integer k)
        {
            int i = k%bucket;
            table.get(i).remove(k);
        }
   

}
class linkedlist
{
    public static void main(String[] args)
    {
        MyHash h = new MyHash(7);
        h.insert(10);
        h.insert(20);
        h.insert(7);
        System.out.println(h.search(10));
        h.delete(20);
        System.out.println(h.search(20));
    }
}