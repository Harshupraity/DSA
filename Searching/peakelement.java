import java.util.*;
import java.io.*;
import java.lang.*;

//1. Naive approach...


// // class peakelement
// // {
// //     static int peak(int arr[],int n)
// //     {
// //         // int n= arr.length;
// //         if(n==1)
// //             return arr[0];
      
// //         for(int i=1;i<n-1;i++)
//         {
//             if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
//                 return arr[i];
//         }

//     return -1;
       
//     }
//     public static void main(String[] args){
//         int arr[]= {10,7,8,20,12};
//         int n = arr.length;
//         System.out.println(peak(arr,n));
//     }
// }        T.C = O(n)..


//Efficient Solution..Here the arr is not sorted therefore it is a slightly different problem..

class peakelement 
{
    static int peak(int arr,int n)
    {
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if((mid==0 || arr[mid]>=arr[mid-1]) && (mid==n-1 || arr[mid]>=arr[mid+1]))
            
                return mid;
            
            if( mid>0 && arr[mid-1]>=arr[mid])
            
                high = mid-1;
            
            
            else
            
                low = mid+1;
            
        }
        return -1;


    }
    public static void main(String[] args)
    {
        int arr[] = {5,20,40,30,20,50,60};
        int n = arr.length;
        System.out.println(peak(arr,n));
    }
}


