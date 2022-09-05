// THIS CODE IS FOR TO FIND THE SUM BY USING PAIR.. MEANS BY USIN TWO ELEMENT..
import java.util.*;
import java.io.*;
import java.lang.*;

//Naive solution to find the sum of an unsorted element.. 


// class Twopointer
// {
//     static int show(int arr[],int n,int x)
//     {
//         int count=0;
//         for(int i=0; i<n;i++)
//         {
//             for(int j=1+i;j<n;j++)
//             {
//                 if(arr[i]+arr[j]==x)
//                     count++;
                    // else
                    //     return 0;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args)
//     {
//         int arr[] = {12,5,9,2,8,10,11};
//         int n = arr.length;
//         int x = 17;

//         System.out.println(show(arr,n,x));

//     }
// }



//Efficient solution is Hashing which I will learn later....

// Efficient solution to find sum of an element in Sorted array is TWO POINTER approach.

// class Twopointer
// {
//     static int show(int arr[],int n,int x)
//     {
//         int count = 0;
//         int left = 0;
//         int right = n;
//         while(left<right)
//         {
            
//             if(arr[left]+arr[right]==x)
//                 count++;
//             else if(arr[left]+arr[right]>x)
//                  right--;
//             else
//                 left++;

//           left++;
//         }
        
//         return count;
//     }
//     public static void main(String[] args){
//         int arr[] = {2,4,8,9,11,12,20,30};
//         int n = arr.length-1;
//         int x = 23;

//         System.out.println(show(arr,n,x));
//     }
// }

// NOTE - : IF WE AN UNSHORTED ARRAY SO IN THAT ARRAY AS WELL WE CAN USE TWO POINTER APPROACH BY FIRST
// MAKING THAT ARRAY SHORTED AND USE THIS APPROACH BUT IT TAKES EXTRA TIME AS WELL AS EXTRA SPACE
//HENCE FOR UNSORTED ARRAY WE APPROACH NAIVE SOLUTION AND FOR SORTED ARRAY WE APPROACH TWO POINTER 
//METHOD. 

// class rev
// {
//     static int show(int a[],int n,int x)
//     {
//         int left= 0,right= n-1;
//         int count= 0;
//         while(left<right)
//         {
//             if((a[left]+a[right])==x)
//             {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] ate)
//     {
//         int a[] = {2,4,8,9,11,12,20,30};
//         int n= a.length;
//         int x= 32;
//         System.out.print(show(a,n,x));
//     }
// }
// class Twopointer 
// { 

// 	static double getMed(int a1[], int a2[], int n1, int n2)
// 	{
// 		int begin1 = 0, end1 = n1;

// 		while(begin1 < end1)
// 		{
// 			int i1 = (begin1 + end1) / 2;
// 			int i2 = ((n1 + n2 + 1) / 2 )- i1;

// 			int min1 = (i1 == n1)?Integer.MAX_VALUE:a1[i1];
// 			int max1 = (i1 == 0)?Integer.MIN_VALUE:a1[i1 - 1];
			
// 			int min2 = (i2 == n2)?Integer.MAX_VALUE:a2[i2];
// 			int max2 = (i2 == 0)?Integer.MIN_VALUE:a2[i2 - 1];

// 			if(max1 <= min2 && max2 <= min1)
// 			{
// 				if((n1 + n2) % 2 == 0)
//                 return ((double)Math.max(max1, max2) + Math.min(min1, min2)) / 2;
// 				else
// 					return (double) Math.max(max1, max2);
// 			}
// 			else if(max1 > min2)
// 				end1 = i1 - 1;
// 			else 
// 				begin1 = i1 + 1;
// 		}
		
// 		return -1;
// 	}

// 	public static void main(String args[]) 
//     {

// 		int a1[] = {10, 20, 30, 40, 50}, n1 = 5, a2[] = {5, 15, 25, 35, 45}, n2 = 5;
		
//         System.out.println(getMed(a1, a2, n1, n2));


//     } 

// }

// class Twopointer
// { 

// 	static int repeat(int arr[], int n)
// 	{
// 		boolean visit[] = new boolean[n];

// 		for(int i = 0; i < n; i++)
// 		{
// 			if(visit[arr[i]])
// 				return arr[i];
// 			visit[arr[i]] = true;
// 		}

// 		return -1;
// 	}

// 	public static void main(String args[]) 
//     {

// 		int arr[] = {0, 2, 1, 3, 2, 2}, n= 6;

//         System.out.println(repeat(arr, n));

//     } 

// }   
import java.util.*;
import java.lang.*;
import java.io.*;

class Twopointer
{
    public static void main (String[] args) 
    {
        int a[] = new int[]{3,8,8};
        int b[] = new int[]{2,8,8,10,15};
        
        int m = a.length;
        int n = b.length;
	    printUnion(a,b,m,n);
        
    }
    
    static void printUnion(int a[], int b[], int m, int n){
    
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i-1]==a[i]){i++;continue;}
            if(j>0 && b[j-1]==b[j]){j++;continue;}
            if(a[i]<b[j]){System.out.print(a[i]+" ");i++;}
            else if(a[i]>b[j]){System.out.print(b[j]+" ");j++;}
            else{System.out.print(a[i]+" ");i++;j++;}
        }
            while(i<m){if(i==0||a[i]!=a[i-1])System.out.print(a[i]+" ");i++;}
            while(j<n){if(j==0||b[j]!=b[j-1])System.out.print(b[j]+" ");j++;}
    }
}
