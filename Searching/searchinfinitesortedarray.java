import java.util.*;
import java.io.*;
import java.lang.*;

// Naive solution for finding the element in a given infinite array.

// class searchinfinitesortedarray
// {
//     static int sortedArr(int arr[],int x)
//     {
//         int i=0;
//         while(true)
//         {
//             if(arr[i]==x)
//                 return i;
//             if(arr[i]>x)
//                 return -1;

//             i++;
//         }
//     }
//     public static void main(String[] args)
//     {
//         int arr[]= {1,10,200};
//         int x = 10;
//         System.out.println(sortedArr(arr,x));       
//     }
// }
//  T.C = O(pos) && AUX = O(1).

//efficient solution ...

class searchinfinitesortedarray
{
    static int  bsearch(int arr[],int low,int high,int x)
    {
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid]==x)
            return mid;
        else if(arr[mid]>x)
            return bsearch(arr,low,mid-1,x);
        else
            return bsearch(arr,mid+1,high,x);

        

    }
    static int show(int arr[],int x)
    {
        if(arr[0]==x)
            return 0;
        int i=1;
        while(arr[i]<x)
        {
            i*=2;
            if(arr[i]==x)
                return i;
                
             
        }
        return bsearch(arr,i/2+1,i-1,x);
        
    }
    public static void main(String[] args)
    {
        int arr[] = {1,10,15,20,40,60,80,100,200};
        int x= 100;

        System.out.println(show(arr,x));
    }

    
}

// import java.util.*;
// import java.io.*;
// import java.lang.*;



// class searchinfinitesortedarray 
// { 
// 		static int bSearch(int arr[], int low, int high, int x)
// 		{
// 			if(low > high)
// 				return -1;

// 			int mid = (low + high) / 2;

// 			if(arr[mid] == x)
// 				return mid;

// 			else if(arr[mid] > x)
// 				return bSearch(arr, low, mid - 1, x);

// 			else
// 				return bSearch(arr, mid + 1, high, x);
// 		}

// 	static int search(int arr[], int x)
// 	{
// 		if(arr[0] == x) return 0;

// 		int i = 1;

// 		while(arr[i] < x)
// 			i = i * 2;

// 		if(arr[i] == x) return i;


// 		return bSearch(arr, i / 2 + 1, i - 1, x);
// 	}

// 	public static void main(String args[]) 
//     {

// 		int arr[] = {1,10,15,20,40,60,80,100,200};
//          int x= 100;

// //		int x = 4;

//         System.out.println(search(arr, x));


//     } 

// }