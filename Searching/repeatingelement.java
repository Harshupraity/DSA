import java.util.*;


import java.io.*;
import java.lang.*;

//Super naive solution.  T.C = O(n2)


// class repeatingelement
// {
//     static int show(int arr[],int n)
//     {
//         for(int i = 0;i<n;i++)
//         {
//             for(int j=i+1;j<n;j++)
//             {
//                 if(arr[i]==arr[j])
//                     return arr[i];
//             }
//         }
//         return 0;
//     }
//     public static void main(String[] args)
//     {
//         int arr[] = {0,0,0};
//         int n = arr.length;
//         System.out.println(show(arr,n));
//     }
// }

//Naive solution.. T.C = O(n)

//class repeatingelement
// {
//     static int show(int arr[],int n)
//     {
//         int res=0;
//         for(int i= 1;i<n;i++)
//         {
//             if(arr[res]==arr[i])
//                 return arr[res];
//                 res=i;
//         }
//         return 0;
//     }
//     public static void main(String[] args)
//     {
//         int arr[] = {0,2,1,3,2,2};
//         int n = arr.length;

//         System.out.println(show(arr,n));

//     }
// }

//Efficient soln when array starts from 1.

// class repeatingelement
// {
//     static int show(int arr[],int n)
//     {
//         int slow = arr[0];
//         int fast = arr[0];
//         do{
//             slow = arr[slow];
        //     fast = arr[arr[fast]];

        // }while(slow!=fast);
            
        // slow = arr[0];
        // while(slow!=fast)
        // {
        //     slow = arr[slow];
        //     fast = arr[fast];


//         }
//         return slow;
//     }
//     public static void main(String[] args)
//     {
//         int arr[] = {1,3,2,4,6,5,7,3};
//         int n= arr.length;
//         System.out.println(show(arr,n));
//     }
// }
   
// efficient solution when array starts from 0.. in this nothing but increase each element by 1.

class repeatingelement
{
    static int sj(int arr[],int n)
    {
        int slow = arr[0]+1;
        int fast = arr[0] +1;
        do{
            slow= arr[slow]+1;
            fast = arr[arr[fast]+1] +1;
        }while(slow!=fast);

        slow = arr[0];
        while(slow!=fast)
        {
            slow = arr[slow]+1;
            fast = arr[fast]+1;

        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {0,2,1,3,5,4,6,2};
        int n = arr.length;
        System.out.println(sj(arr,n));  
    }
}