import java.util.*;
import java.lang.*;
import java.io.*;

//naive solution.
// class Minimumdiffinarray
// {
//      static int show(int a[],int n);
//     {
//         int res=Integer.MAX_VALUE;
//         for(int i = 1;i<n;i++)
//         {
//             for(int j =0;j<i;j++)
//             {
//                 res = Math.min(res,Math.abs(a[i]-a[j]));
//             }
//         }
//         return res;
//     }
//     public static void main(String[] are)
//     {
//         int a[] = {8,5,12,32,2};
//         int n = a.length;


//        // Minimumdiffinarray  min= new Minimumdiffinarray(); 
//         System.out.println(show(a,n));

//     }
// }

class Minimumdiffinarray
{
    static int Show(int a, int n)
    {
        Arrays.sort(a);
        int res = Integer.MAX_VALUE;
        for(int i= 1;i<n;i++ )
        {
             res = Math.min(res,(a[i]-a[i-1]));
        }
        return res;
    }
    public static void main(String[] args)
    {
        int a[] = {10,3,20,12};
        int n = a.length;
        Minimumdiffinarray m = new Minimumdiffinarray();

        System.out.print(m.Show(a,n));
    }
}