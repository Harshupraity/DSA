import java.util.*;
import java.lang.*;
import java.io.*;


// By using Naive partition approach 
// class sortarrwith3typeofelement
// {
//     // static void sort(int a[],int n)
//     // { 
//     //        int temp[] = new int[n];
//     // int i = 0;
//     // for(int j = 0;j<n;j++)
//     // {
//     //     if(a[j]==0)
//     //     {
//     //         temp[i] = a[j];
//     //         i++;
//     //     }
//     // }
//     //     for(int j=0;j<n;j++)
//     //     {
//     //         if(a[j]==1)
//     //         {
//     //             temp[i]= a[j];
//     //             i++;
//     //         }
//     //     }
//     //     for(int j=0;j<n;j++)
//     //     {
//     //         if(a[j] == 2)
//     //         {
//     //             temp[i]==a[j];
//     //             i++;
//     //         } 
//     //     }
//     //     for(int j=0;j<n;j++)
//     //     {
//     //         a[j]=temp[j];
//     //     }


//     // }
//     // //create main class..

// }

class sortarrwith3typeofelement
{
    static void Hoare(int a[],int n)
    {
        int l = 0,h=n-1,mid=0;
        
        
        while(mid<=h)
        {
            if(a[mid]==0)
            {
                int temp = a[l];
                a[l]= a[mid];
                a[mid] = temp;
                l++;
                mid++;
            }
            else if(a[mid]==1)
            {
                mid++;
            }
            else
            {
                int key = a[h];
                a[h] =a[mid];
                a[mid] = key;
                h--;
            }
        }


            
        
    }
    public static void main(String[] args)
    {
        int a[] = {0,1,1,2,0,1,1,2};
        int n = a.length;
        // int l = 0;
        // int h = n-1;
         Hoare(a,n);

        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
}