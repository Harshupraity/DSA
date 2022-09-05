import java.util.*;
import java.io.*;
import java.lang.*;

class medianmatrix
{
    // static int n = 3;
    static void show(int a[][])
    {
       Arrays.sort(a);
       int n = a.length;
       n = n/2;
       System.out.print(n);
    }
    public static void main(String[] args)
    {
      	int a[][]= { {5,10,20,30,40}, {1,2,3,4,6}, {11,13,15,17,19} };
        show(a);
        //   int r =3,c=5;
        
        // for(int i=0;i<r;i++)
        // {
        //     for(int j=0;j<c;j++)
        //     {
        //         System.out.print(a[i][j]+" ");   
        //     }
        // }
        
    }
}