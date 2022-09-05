import java.util.*;
import java.io.*;
import java.lang.*;
//1. Naive approach

// class Binarysearch1
// {
//     static int Sortedarr(int arr[],int x,int n)
//      {
//         // int n = arr.length;
//         for(int i=0;i<=n-1;i++)
//         {
//             if(arr[i]==x)
            
//                 //System.out.println(i);
//                 return i;
//         }
//         return -1;
//     } 
//     public static void main(String[] args ){
//         int arr[]= {4,4};
//         int n = arr.length;
//         int x = 4;
//         System.out.println(Sortedarr(arr,x,n));
//     }
// }


//2. efficient approach.

class Binarysearch1
{
    static int sortedArr(int arr[],int n,int x)
    {
        int low = 0;
        int high = n-1;
       
       while(low<high)
       {
        int  mid = (low+high)/2; 
        if(x==arr[mid])
        
            return mid;
        
        else if(arr[mid]>x)
        
            high = mid-1;
        
        else
        
         
            low = mid+1;
        
       }
       return -1;
    }
    public static void main(String[] args){
        int arr[] = {2,8,9,45,63};
        int n = arr.length;
        int x = 9;
        System.out.println(sortedArr(arr,n,x))  ;     
    }
}
