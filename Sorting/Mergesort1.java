import java.util.*; 
import java.lang.*; 
import java.io.*;

//Naive solution.....

// class Mergesort1
// {
//     static void show(int a[],int b[],int m,int n )
//     {
//         int c[] = new int[m+n];
//         for(int i=0;i<m;i++)
//         {
//             c[i] = a[i];

//         }
//         for(int j=0;j<n;j++)
//         {
//             c[m+j]=b[j];
//         }
//         Arrays.sort(c);
//         for(int i=0;i<(m+n);i++)
//         {
//             System.out.print(c[i]+" ");
//         }

//     }
//     public static void main(String[] args)
//     {
//         int arr1[] = {10,15,20,20};
//         int arr2[] = {1,12};
//         int m1 = arr1.length;
//         int n1 = arr2.length;

//         show(arr1, arr2,m1,n1);  
       
//     }
// }

// Efficient solution..
class Mergesort1
{
    static void show(int a[],int b[],int n,int m)
    {
        int i =0,j=0;
        while(i<n && j<m)
        {
            if(a[i]<=b[j])
            {
                System.out.print(a[i++]+" ");
            }
            else
            {
                System.out.print(b[j++]+" ");
            }
        }
        while(i<m)
        {
            System.out.print(a[i++]+" ");
        }
        while(j<n)
        {
            System.out.print(b[j++]+" ");
        }
    }
    public static void main(String[] args)
    {
        int a[]={10,15,20,40};
        int b[] = {5,6,6,10,15};
        int n = a.length;
        int m = b.length;

        show(a,b,n,m);
    }
}