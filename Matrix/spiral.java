import java.util.*;
import java.io.*;
import java.lang.*;

class spiral
{
        
    
    static void SpiraL(int a[][],int r,int c)
    {
        int top = 0,right = c-1,bottom = r-1,left = 0;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.print(a[top][i]+" ");
                
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                System.out.print(a[i][right]+" ");
               
            }
            right--;
            if(top<=bottom)
                for(int i=right;i>=left;i--)
                {
                    System.out.print(a[bottom][i]+" ");
                    
                }
                bottom--;
            if(left<=right)
                for(int i=bottom;i>=top;i--)
                {
                    System.out.print(a[i][left]+" ");
                    
                }
                left++;
        }
    }
    public static void main(String[] args)
    {
        int a[][] = {{1, 2, 3, 4},
    				    {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};
        

        SpiraL(a,4,4); 
        // for(int i=0;i<r;i++)
        // {
        //     for(int j=0;j<c;j++)
        //     {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        //}
    }
}