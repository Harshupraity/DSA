import java.util.*;
import java.lang.*;
import java.io.*;

class Choclateproblem
{
    static int minDiff(int a[],int n,int m)
    {
        if(m>n)
        {
            return -1;
        }
        Arrays.sort(a);
        int res = a[m-1]-a[0];
        for(int i = 1;(i+m-1)<n;i++)
        {
            res = Math.min(res,(a[i+m-1] - a[i]));
        }
        return res;
    }
    public static void main(String[] args)
    {
        int a[] = {7,3,2,4,9,12,56};
        int n = a.length;
        int m = 3;

        System.out.print(minDiff(a,n,m));
    }
}