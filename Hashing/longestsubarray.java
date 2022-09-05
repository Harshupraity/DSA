import java.util.*;
import java.io.*;
import java.lang.*;

// class longestsubarray
// {
//     static int show(int a[],int n,int sum)
//     {
//         int res=0;
//         for(int i=0;i<n;i++)
//         {
//             int curr_sum=0;
//             for(int j=i;j<n;j++)
//             {
//                 curr_sum+=a[j];
//                 if(curr_sum ==sum)
//                 {
//                     res = Math.max(res,j-i+1);//Here (j-i+1) is the length of the sub array.
//                 }
//             }
            
            
//         }
//         return res;
//     }
//     public static void main(String[] args)
//     {
//         int a[] = {5,2,3,4};
//         int n = a.length;
//         int sum = 5;
//         System.out.println(show(a,n,sum));
//     }
// }T.c O(n2)


//Efficient solution.
class longestsubarray
{
    static int LongestSum(int a[],int n,int sum)
    {
        HashSet<Integer> sc=new HashSet<>();
        int res=0;
        int pre_sum=0;
        for(int i=0;i<n;i++)
        {
            if(pre_sum==sum)
            {
                res++;
            }
            pre_sum+=a[i];
            if(sc.contains(pre_sum-sum)==true)
            {
                res++;
            }

        }
        return res;
    }
    public static void main(String[] args)
    {
        int a[] = {5,2,3,4};
        int n = a.length;
        int sum = 5;
        System.out.println(LongestSum(a,n,sum));
    }

}