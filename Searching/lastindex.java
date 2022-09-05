import java.util.*;
import java.io.*;
import java.lang.*;

//1. Naive approach to find the index of last occuring element.

// class lastindex
// {
//     static int show(int arr[],int n,int x)
//     {
//         for(int i=n;i>=0;i--)
//         {
//             if(arr[i]==x)
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int arr[] = {2,7,9,19,19,25};
//         int n = arr.length - 1;
//         int x = 19;

//         System.out.println(show(arr,n,x));
//     }
// }

//Recursive soln

class lastindex
{
  static int lastocc(int arr[],int low,int high,int x,int n)
  {
     // int n = arr.length-1;
     if(low>high)
        return -1;
      int mid = (low+high)/2;
      if(arr[mid]>x)
      {
        //high = mid-1;
        return lastocc(arr,low,mid-1,x,n);
      }
      else if(arr[mid]<x)
       // low = mid+1;
       {
        return lastocc(arr,mid+1,high,x,n);
       }
      else
      {
        if(mid == n || arr[mid]!=arr[mid+1])
        {
            return mid;
        }
        else
        {
            return lastocc(arr,mid+1,high,x,n);
        }
      }
 
  }   
     public static void main(String[] args)
    {
        int arr[] = {5,10,10,10,20,20};
        int low = 0;
        int n = arr.length-1;
        int high = n;

        int x = 10;

        System.out.println(lastocc(arr,low,high,x,n));
    }
  
}