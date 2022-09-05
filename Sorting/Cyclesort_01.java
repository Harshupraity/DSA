//1.A worst case O(n2) sorting algorithm.
//2.Does minimum memory writes and can be useful for cases where memory write is costly.
//3.In- place  and Not stable.
//4.Useful to solve Q like find minimum swaps required to short an array.

import java.util.*;
import java.lang.*;
import java.io.*;

// class Cyclesort_01
// {
//     static void CycleDist(int a[],int n)
//     {
    
//         for(int cs = 0;cs<n-1;cs++)
//         {
//             int item = a[cs];
//             int pos = cs;
//             for(int i=cs+1;i<n;i++)
//             {
//                 if(a[i]<item)
//                 {
//                     pos++;
//                 }
               
//             }
//              int temp = item;
//                 item = a[pos];
//                 a[pos] = temp;
//             while(pos!=cs)
//             {
//                 pos = cs;
//                 for(int i = cs+1;i<n;i++)
//                 {
//                     if(a[i]<item)
//                     {
//                         pos++;
//                     }
//                 }
//                 int key = item;
//                 item = a[pos];
//                 a[pos] = key;
//             }
//         }
//     }
//     public static void main(String[] args)
//     {
//         int a[] = {10,20,50,40,30};
//         int n = a.length;

//         CycleDist(a,n);
//         for(int i = 0;i<n;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//     }
// }
class Cyclesort_01
{
    static int void(int a[],int n)
    {
        
        
        for(int ele = 0;ele<n-1;ele++)
        {
            int item= a[ele];
            int pos = ele;
            for(int i = ele+1;i<n;i++)
            {
                if(a[i]<a[ele])
                {
                    pos++;
                }
            }
            int temp = a[pos];
            a[pos] = a[item];
            a[item]= temp;

            while(pos!=ele)
            {
                pos =ele
            }
        }
    }
}