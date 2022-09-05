import java.util.*;
import java.io.*;
import java.lang.*;

// class sumzero
// {
//     static boolean show(int a[])
//     {
//         for(int i=0;i<a.length;i++)
//         {
//             int currsum=0;
//             for(int j=i;j<a.length;j++)
//             {
//                 currsum+=a[j];
//                 if(currsum==0)
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args)
//     {
//         int a[] = {-3,4,-3,-1,1};
//         System.out.print(show(a));

//     }
// }

// class sumzero
// {
//     static boolean isosubarray(int []arr)
//     {
//         HashSet<Integer> h = new HashSet<>();
//         int pre_sum=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             pre_sum+=arr[i];
//             if(h.contains(pre_sum))
//             {
//                 return true;
//             }
//             if(pre_sum==0)
//             {
//                 return true;
//             }
//             h.add(pre_sum);
//         }
//         return false;
//     }
//     public static void main(String[] args)
//     {
//         int a[] = {3,4,3,-1,1};
//         System.out.println(isosubarray(a));
//     }
// }

//Efficient solution for sum of subarray...
// class sumzero
// {
//     static boolean show(int a[],int sum)
//     {
//         HashSet<Integer> s = new HashSet<Integer>();
//         for(int i=0;i<a.length;i++)
//         {
//             int pre_sum = 0;
//             if(pre_sum==sum)
//             {
//                 return true;
//             }
//             pre_sum+=a[i];
//             if(s.contains(pre_sum-sum)==true)
//                 return true;
            
//             s.add(pre_sum);
//         }
//         return false;
//     }

// }

