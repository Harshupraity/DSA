import java.util.*;
import java.io.*;
import java.lang.*;

class Hash
{
    int table[] = new int[1000];
    void insert(int i)
    {
        table[i] = 1;
    }
    int search(int i)
    {
        return table[i];
    }
    void del(int i){
         table[i]=0;
    }

}
class directinsert
{
    public static void main(String[] args)
    {
        Hash h = new Hash();
        h.insert(10);
        h.insert(20);
        System.out.println(h.search(10));
        System.out.println(h.search(20));
        h.del(10);
        System.out.println(h.search(10));   
    }
}//T.C O(1).

//The problems related to direct inerting the values in the array is that it works
//only when your keys are having small values .
//1. It does not work when the keys having big
//values like phone number of an employees. we cannot assign the index to it..
//2. It does not work for  floating values.
//3. It does not work for the String values we cannot asign index to string values.

//Hence we use hashing 

