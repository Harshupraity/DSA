import java.util.*;
import java.io.*;
import java.lang.*;
// class pairSum
// {
//     static boolean show(int a[],int sum)
//     {
//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=1;j<a.length;j++)
//             {
//                 if((a[i]+a[j])==sum)
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args)
//     {
//         int a[] = {8,4,3,9};
//         int sum = 13;
//         System.out.println(show(a,sum));
        
//     }
// }//T.C isO(n2).

//We also have two pointer approach which we have already done in sorting.
//And that approach is better in case if we have two sorted array.But
//In case of of unsorted array Hashing is the best option.

//Concept for efficient solution is that if (Sum-A[i]) is present then we return true & else we return false.
class pairSum
{
    static boolean show(int a[],int sum)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            if(hs.contains(sum-a[i]))
                return true;
            hs.add(a[i]);
        }
        return false;
    }
     public static void main(String[] args)
    {
        int a[] = {8,4,3,9};
        int sum = 13;
        System.out.println(show(a,sum));
        
    }
}