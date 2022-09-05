import java.util.*;
import java.lang.*;
import java.io.*;


// // //Naive Approach.


// class kthsmallest
// {
//     static int show(int a[],int n,int k)
//     {
//         Arrays.sort(a);
//          return a[k-1];
//     }
   

//     public static void main(String[] args)
//     {
//         int a[] = {10,5,30,12};
//         int n = a.length;
//         int k=2;
        
        
//         System.out.print(show(a,n,k));
//     }

// }

//Efficient approach.

class kthsmallest
{
    static int Smallest(int a[],int l,int h)
    {
        int i = l-1;
        int pivot = a[h];
        for(int j = l;j<=h-1;j++)
        {
            if(a[j]<pivot)
            {
                i++;                                                        
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }
        }
        int key = a[i+1];
        a[i+1]  = a[h];
        a[h] = key;

        return i+1; 
    }
    static int kth(int a[],int n,int k)
    {
        int l=0;
        int h = n-1;
        while(l<=h)
        {
            int p = Smallest(a,l,h);
            if(p==k-1)
                return  p;
            else if(p>k-1)
                h = p-1;
            else
                l = p+1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int a[] = {10,4,5,8,11,6,26};
      
        int n = a.length;
        
        int k = 5;

       int index =  kth(a,n,k);

        System.out.print(a[index]);
       
    }
}

