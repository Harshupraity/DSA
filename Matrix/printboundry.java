import java.util.*;
import java.io.*;
import java.lang.*;

class printboundry
{
    static int R=4,C =4;
     
    static void show(int a[][])
    {
        if(R==1)
        {
            for(int i =0;i<C;i++)
            {
                System.out.print(a[0][i]+" ");
            }
        }
        else if(C==1)
        {
            for(int i=0;i<R;i++)
            {
                System.out.print(a[i][0]+" ");
            }
        } 
        else
        { 
            for(int i=0;i<C;i++)
            {
                System.out.print(a[0][i]+" ");
            }
            for(int i=1;i<R;i++)
            {
                System.out.print(a[i][C-1]+" ");
            }
            for(int i=C-2;i>=0;i--)
            {
                System.out.print(a[R-1][i]+" ");
            }
            for(int i=R-2;i>=1;i--)
            {
                System.out.print(a[i][0]+" ");
            }
        }
    }



    public static void main(String args[])
    {
        int a[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};

        show(a);
    }
}

