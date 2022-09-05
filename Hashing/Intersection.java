import java.util.*;
import java.io.*;
import java.lang.*;

// class Intersection
// {
//     static int show(int a[],int b[],int n,int m)
//     {
//         int res=0;
//         for(int i=0;i<n;i++)
//         {
//             boolean flag = false;
//             for(int j=0;j<i;j++)
//             {

//                 if(a[i]==a[j])
//                 {
//                     flag = true;
//                     break;
//                 }
//             }
//             if(flag==true)
//             {
//                 continue;
//             }
//             //Above loop will check that if the element is already present or not.
//             for(int j=0;j<m;j++)
//             {
//                 if(a[i]==b[j])
//                 {
//                     res++;
//                     break;
//                 }
//             }
//         }
//         return res;
        
//     }
//     public static void main(String[] args)
//     {
//         int a[] = {10,20,10,30,20};
//         int b[] = {20,10,10,40};
//         int n = a.length;
//         int m = b.length;

//         System.out.println(show(a,b,n,m));

//     }
// }
//Time complexity for above naive solution is O(m*(n+m)).
//Aux space is O(1).

//Efficient solution..
class Intersection
{
    static int show(int a1[],int a2[],int n,int m)
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0;i<n;i++)
        {
            hs.add(a1[i]);
        }
        int res=0;
        for(int j=0;j<n;j++)
        {
            if(hs.contains(a2[j]))
            {
                res++;
                hs.remove(a2[j]);
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        int a1[] = {15,17,27,27,28,15};
        int a2[]  = {16,17,28,17,31,17};
        int n = a1.length;
        int m = a2.length;

        System.out.println(show(a1,a2,n,m));
    }
} //T.C is O(n+m)...
