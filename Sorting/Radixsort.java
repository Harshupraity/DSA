//It is not the comparison based algorithm like counting sort cause if you have that algo then you cannot solve
//that problem in time complexity less then O(nlogn).. but it sort in T.C which is linear..
//stable algo.

import java.util.*;
import java.lang.*;
import java.io.*;

class Radixsort
{
    static void show(int a[],int n)
    {
        int max = a[0];
        for(int i = 1;i<n;i++)
        {
            if(max>a[i])
            {
                max = a[i];
            }
        }
        for(int exp=1;max/exp>0;exp=exp*10)
        {
            countingSort(a,n,exp);
        }
    }
        static void countingSort(int a[],int n,int exp)
        {
            int count[] = new int[10];
            for(int i=0;i<10;i++)
            {
                count[i] = 0;
            }

            for(int i=0;i<n;i++)
            {
               count[(a[i]/exp)%10]++; 
            }
            for(int i=1;i<n;i++)
            {
                count[i]+=count[i-1];
            }
            int output[] = new int[n];
            for(int i=n-1;i>=0;i++)
            {
                output[count[(a[i]/exp)%10]-1]=a[i];
                count[(a[i]/exp)%10]--;
            }
            for(int i = 0;i<n;i++)
            {
                a[i] = output[i];
            }
        }
        public static void main(String[] args)
        {
            int a[] = {319,212,6,8,100,50};
            int n = a.length;

            show(a,n);

            for(int x:a)
            {
                System.out.print(x+" ");
            }
        }
   
}