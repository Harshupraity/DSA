import java.util.*;
import java.lang.*;
import java.io.*;

// class arrayrev
// {
//     static int presum(int a[],int n)
//     {
//         int prefixsum[]=new int[n];
//         prefixsum[0]=a[0];
//         for(int i=1;i<n;i++)
//         {
//             prefixsum[i]=prefixsum[i-1]+a[i];
//         }
//         return prefixsum;
//     }

//     static int getsum(int a[],int l,int r)
//     {
        
//         if(l!=0)
//         {
//             return a[r]-a[l-1];

//         }
//         else
//         {
//             return a[r];
//         }
//         //return x;
//     }
//     public static void main(String[] a)
//     {
//         int arr[]= {2,8,3,9,6,5,4};
//         int n=arr.length;
//         int prefixsum[]=new presum(arr,n);


//         int l=1;
//         int r=3;
//         System.out.println(show(arr,l,r));
//     }
// }
// class arrayrev
// {
//     static boolean show(int a[],int n)
//     {
//         int sum=0;

//         for(int i=0;i<n;i++)
//         {
//             sum+=a[i];
        
//             int leftsum=0;
//             for(int j=0;j<n;j++)
//             {
//                 if(leftsum==sum-a[i])
//                 {
//                     return true;
//                 }
//                 leftsum+=a[i];
//             }
//         }
//         return false;
//     }
//     public static  void main(String[] at)
//     {
//         int a[] = {3,4,8,-9,20,6};
//         int n=a.length;

//         System.out.println(show(a,n));
//     }
// }
// class arrayrev
// {
//     static int max(int l[],int r[],int n)
//     {
//        int a[]=new int[1000];
//         for(int i=0;i<n;i++)
//         {
//             a[l[i]]++;

//             a[r[i]+1]--;
//         }
//         int max=a[0],res=0;
//         for(int i=1;i<1000;i++)
//         {
//             a[i]+=a[i-1];
//             if(max<a[i])
//             {
//                 max = a[i];
//                 res=i;
//             }
//         }
//         return res;
//     }
//     public static void main(String[] at)
//     {
//         int l[]= {1,2,3};
//         int r[]={3,5,7};
//         int n=3;

//         System.out.println(max(l,r,n));
//     }
// }
// class arrayrev
// {
//     static int show(int a[],int n)
//     {
//         int res=a[0];
//         for(int i=0;i<n;i++)
//         {
//             int currsum=a[i];
//             int currmax=a[i];
//             for(int j=1;j<n;j++)
//             {
//                 int index= (i+j)%n;
//                 currsum+=a[index];
//                 currmax = Math.max(currmax,currsum);
                
//             }
//             res = Math.max(res,currmax);
//         }
//         return res;
//     }
//     public static void main(String[] at)
//     {
//         int a[] = {5,-2,3,4};
//         int n=a.length;

//         System.out.println(show(a,n));

//     }
// }

class arrayrev
{
    static void show()
}