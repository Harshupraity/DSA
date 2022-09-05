import java.util.*;
import java.io.*;
import java.lang.*;

class rotateby90
{
    static int n = 4;
    static void show(int a[][])
    {
        // int temp[][]= new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j =i+1;j <n;  j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            int low = 0;
            int high = n-1;
            while(low<high)
            {
                // a[low][i] = a[n-1][i];
                int temp = a[low][i];
                a[low][i] = a[high][i];
                a[high][i] = temp;

                low++;
                high--; 
            }
        }
    }
    public static void main(String[] args)
    {
        int a[][] = {{1, 2, 3, 4},
    				    {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};

        show(a); 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }     
    }
}