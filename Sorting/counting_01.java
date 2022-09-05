import java.util.*;
import java.lang.*;
import java.io.*;

////Efficient approach..

// class counting_01
// {
//     static void show(int a[],int n,int k)
//     {
//         int count[] = new int[k];
//         //Assingning no. of repetition..
//         for(int i=0;i<k;i++)
//         {
//              count[i] = 0;

//         }
//         for(int i=0;i<n;i++)
//         {
//             count[a[i]]++;
//         }
//         //cumlative addition
        
//         for(int i=1;i<k;i++)
//         {
//             count[i] = count[i]+count[i-1];
//         }
//         //output result.
//         int output[] = new int[n];
//         for(int i=n-1;i>=0;i--)
//         {
            
            
//                 output[count[a[i]]-1] = a[i];
//                 count[a[i]]--;
                
            
//         }
//         //putting array in original array.
//         for(int i=0;i<n;i++)
//         {
//             a[i] = output[i];
//         }
//     }
//     public static void main(String[] args)
//     {
//         int a[] = {5,6,5,2};
//         int n = a.length;
//         int k = 7;

//         show(a,n,k);

//        for(int i = 0;i<n;i++)
//        {
//            System.out.print(a[i]+" ");
//        }
//     }
// }T.C is O(n+k)..where k is the range of the element.

//Naive solution..

class counting_01
{
    static void show(int a[],int n,int k)
    {
        int count[] =  new int[k];
        for(int i=0;i<k;i++)
        {
            count[i] = 0;

        }
        for(int i = 0;i<n;i++)
        {
            count[a[i]]++;
        }
        int index = 0;
        for(int i = 0;i<k;i++)
        {
            for(int j = 0;j<count[i];j++)
            {
                 a[index] = i;
                 index++;
            }
        }
    }
    public static void main(String[] args)
    {
        int a[] = {1,4,4,1,0,1};
        int n = a.length;
        int k = 5;

        show(a,n,k);
        for(int x:a)
        {
            System.out.print(x+" ");
        }

    }
}

