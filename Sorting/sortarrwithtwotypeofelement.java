import java.util.*;
import java.lang.*;
import java.io.*;

//Naive solution..
// class sortarrwithtwotypeofelement
// {
   
//     static void show(int a[],int n)
//     {
//         int temp[] = new int[n]; 
//         int i = 0;
//         for(int j=0;j<n;j++)
//         {
//             if(a[j]<0)
//             {
//                 temp[i]= a[j];
//                 i++;
//             }
//         }
//         for(int j=0;j<n;j++)
//         {
//             if(a[i]>=0)
//             {
//                 temp[i] = a[j];
//                 i++;
//             }
//         }
//         for(int j = 0;j<n;j++)
//         {
//             a[j] = temp[j];
//         }
       
//     }
    
//     public static void main(String[] args)
//     {
//         int a[]={13,-12,18,-10};
//         int n = a.length;

//         show(a,n);
//         for(int x : a)
//         {
//             System.out.print(x+" ");
//         }
//     }
// }T.C is O(n)   &&  A.S  is O(n)..


//Effective solution.. is done by hoare or by lumoto method
//1. By Lomuto. 
class sortarrwithtwotypeofelement
{
    static void Hoare(int a[],int l,int h)
    {
        //BELOW CODE IS LUMOTO.
        // int i=l-1;
        // int pivot = a[h];
        // for(int j= l;j<h;j++)
        // {
        //     if(a[j]<pivot)
        //     {
        //         int temp = a[i];
        //         a[i] = a[j];
        //         a[j] = temp;
        //     }
        // }
        //BELOW CODE IS HOARES
        int i = l-1;
        int j = h+1;
        int pivot = a[l];
        while(true)
        {
        do{
            i++;
        }while(a[i]<pivot);
        do{
            j--;
        }while(a[j]>pivot);
        if(i>=j)
        {
            return ;
        }
        else
        {
           int temp  = a[i];
           a[i] = a[j];
           a[j] = temp; 
        }

    }

    }
    public static void main(String[] args)
    {
        int a[]={13,-12,18,-10,-7,};
        int l = 0;
        int h = a.length-1;
        
// Values added must be according to descending and ascending order..means array of both side remains sorted..



        Hoare(a,l,h);
        for(int x : a)
        {
            System.out.print(x+" ");
         }
    }
}