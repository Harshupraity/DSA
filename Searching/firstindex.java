import java.util.*;
import java.io.*;
import java.lang.*;

//Naive method.....

// class firstindex
// {
//     static int firstIndex(int arr[],int n,int x)
//     {
//         for (int i=0;i<=n-1;i++)
//         {
//             if(arr[i]==x)
//                 return i;
//         }
//         return -1;
//     }
//     public static void main(String[] args)
//     {
//         int arr[] = {5,8,9,15,8,20};
//         int n = arr.length;
//         int x = 8;
//         System.out.println(firstIndex(arr,n,x));

//     }
// }

//Efficient Recursive Method.

// class firstindex
// {
//     static int firstIndex(int arr[],int low,int high,int x)
//     {
//         if(low>high)
//             return -1;
//         int mid = (low+high)/2;
        // if(arr[mid]==x)
        //     return mid;
//         if(arr[mid]<x)
//             return firstIndex(arr,mid+1,high,x);
//         else if(arr[mid]>x)
//             return firstIndex(arr,low,mid-1,x);

//         else
//         {
//             if(mid==0 || arr[mid]!=arr[mid-1])
//                 return mid;
//             else
//                 return firstIndex(arr,low,mid-1,x);

//         }       
//         }
//         public static void main(String[] args)
//         {
//             int arr[] = {5,10,10,15,20,20,20};
//             int low = arr[0];
//             int n = arr.length - 1;
//             int high = n;
            
//             int x = 20;

//             System.out.println(firstIndex(arr,low,high,x));
//     }

// }



// Efficient iterative Method

class firstindex
{
    static int show(int arr[],int n,int x)
    {
        int low = 0;
        int high = n;
          
        while(low<=high)
        {
              int mid = (low+high)/2;
            if(arr[mid]>x)
                high = mid-1;
            else if(arr[mid]<x)
                low = mid+1;
            else{
                if(mid==0 || arr[mid]!=arr[mid-1])
                    return mid;
                else
                    high = mid-1;
            }
        }
        return -1;

    } 
    public static void main(String[] args)
    {
        int arr[] = {5,10,10,20,20};
        int n = arr.length-1;
        int x = 20;

        System.out.println(show(arr,n,x));

    }
}

