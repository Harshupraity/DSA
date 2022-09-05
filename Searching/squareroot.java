import java.util.*;
import java.io.*;
import java.lang.*;


// Naive soln
// class squareroot
// {
//     static int root(int x)
//     {   
//         int i=1;
//         while(i*i<=x)
//             i++;
//         return (i-1);
//     }

//     public static void main(String[] args)
//     {
//         int x= 15;
//         System.out.println(root(x));
//     }
// }

//Efficient solution...

class squareroot
{
    static int root(int x)
    {
        int low = 1,high = x,ans  = -1;
        while(low<=high){
        int mid = (low+high)/2;
        int midsqr = mid*mid;
        if(midsqr == x)
            return mid;
        else if(midsqr>x)
            high = mid-1;
        else
        {
            low = mid+1;
             ans = mid;
        }


        }
        return ans;

    }
    public static void main(String[] args){
        int x = 26;
        System.out.println(root(x));
    }
}