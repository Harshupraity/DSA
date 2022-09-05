import java.util.*;
import java.io.*;
import java.lang.*;

// class rev1
// {
//     static int show(int x)
//     {
//         int i=1;
//        while(i*i<x)
//        {
//            i++;

//        }
//        return (i-1);
//     }
//     public static void main(String[] args){
//         int x= 26;
//         System.out.println(show(x));
//     }
//}T.C = O(n)....

//Efficient solution .....

class rev1
{
    static int show(int x)
    {
        int low = 1;
        int high = x;
        while(low<high)
        {
            int mid = (low+high)/2;
            if(mid*mid == x)
                return mid;
            else if(mid*mid>x)
                high = mid-1;
            else
                low = mid+1;
            low++;
        }
        return (high-1);
    }
    public static void main(String[] args)
    {
        int x = 26;

        System.out.println(show(x));
    }
}


