import java.util.*;
import java.lang.*;
import java.io.*;

//In lomuto partition pivot value is always the last value.
//In case the pivot value is the middle value the swap it with the last value. So that pivot comes to last.

class Lomutopartition
{
    static int Lpartition(int a[],int l,int h)
    {
      
        int i=l-1;
        int pivot = a[h];
        for(int j=l;j<h;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = a[i];
            }
        }
        int key = a[i+1];
        a[i+1] = a[h];
        a[h] = key;
        return i+1;
    }
    public static void main(String[] args)
    {
        int a[] ={10,80,30,90,40,50,70};
        int l = 0;
        int h = a.length-1;
        System.out.print(Lpartition(a,l,h));
    }
}