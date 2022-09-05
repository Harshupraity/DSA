import java.util.*;
import java.lang.*;
import java.io.*;



class Heapsort
{
    void sort(int a[])
    {
        int n = a.length;
        for(int i = n/2-1;i>=0;i--)
        {
            heapify(a,n,i);
        }

        //Swap the last element with first  element and heapify it again..
        for(int i =n-1;i>=0;i--)
        {
            int key = a[0];
            a[0]=a[i];
            a[i] = key;

            heapify(a,i,0);
        }
    }
    void heapify(int a[],int n,int i)
    {
        int largest = i;   //Parent index.
        int li = 2*i+1;     //left child index.
        int ri = 2*i+2;     //right child index.
        if(li<n  && a[li]>a[largest])
        {
            largest = li;
        }
        if(ri<n && a[ri]>a[largest])
        {
            largest = ri;
        }
        if(largest!=i)
        {
            int temp = a[largest];
            a[largest] = a[i];
            a[i] = temp;
            heapify(a,n,largest);
        }

       
    }
    public static void main(String[] args)
    {
        int a[] = {12,11,13,5,6,7};
        int n = a.length;

        Heapsort ob = new Heapsort();
        ob.sort(a);
    
      

        for(int i = 0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}