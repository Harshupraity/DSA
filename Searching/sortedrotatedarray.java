import java.util.*;
import java.io.*;
import java.lang.*;

//1.Naive solution. of T.C = O(n) && aux = O(1)

// class sortedrotatedarray
// {
//     static int srArr(int arr[],int x)
//     {
//          int n = arr.length;
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]==x)
//                 return i;
            
//         }
//         return -1;
 
//     }
//     public static void main(String[] args)
//     {
//         int arr[]={10,20,30,40,50,8,9};
//         int x = 30;
       

//         System.out.println(srArr(arr,x));
//     }
// }

//Efficient Method...
class sortedrotatedarray
{
    static int show(int arr[],int n,int x)
    {
        int low=0;
        int high = n-1;
        if(low>high)
            return -1; 
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==x)
                return mid;
            if(arr[mid]>arr[low])
                {
                    if(x>=arr[low] && x<arr[mid])
                         high = mid-1;
                    else                                //Sorting left half of an array.
                         low = mid+1;
                }
            else 
                {
                    if(x>arr[mid] && x<=arr[high])
                        low = mid+1;
                    else                                //Sorting right half of an array.
                        high = mid-1;
                }
            

        }
        return -1;

    }
    public static void main(String[] args){
        int arr[] = {10,20,40,60,5,8};
        int n = arr.length;
        int x = 5;

        System.out.println(show(arr,n,x));
    }
}