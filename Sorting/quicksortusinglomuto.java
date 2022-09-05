import java.util.*;
import java.lang.*;
import java.io.*;

class quicksortusinglomuto
{
    static int Lomuto(int a[],int l,int h)
    {
        int  i = l-1;
        int pivot = a[h];
        for(int j = l;j<h;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int key = a[i+1];
        a[i+1] = pivot;
        pivot = key;
        
        return i+1;
    }

    static void Qs(int a[], int l,int h)
        {
            int  p = Lomuto(a,l,h);
            Qs(a,l,p-1);
            Qs(a,p+1,h);
        }
    
    public static void main(String[] args)
    {
        int a[] = {8,4,7,9,3,10,5};
        int l = 0;
        int h = a.length-1;

      //  System.out.print(Lomuto(a,l,h));
      for(int x : a)
      {
          System.out.print(x + " ");
      }
    }
}