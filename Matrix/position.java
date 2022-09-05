import java.util.*;
import java.io.*;
import java.lang.*;


//Naive O(n*k).


// class position
// {
//      static int r = 4,c=4;
//     static void show(int a[][],int x)
//     {
//         for(int i=0;i<r;i++)
//         {
//             for(int j=0;j<c;j++)
//             {
//                 if(a[i][j]==x)
//                 {
//                     System.out.print(i+","+j);
//                     return ;  //to return
//                 }
                
//             }
//         }
//         System.out.print("NOT FOUND");
//     }
//     public static void main(String[] args)
//     {
//          int a[][] = {{10, 20, 30, 40},
//     				    {15, 25, 35, 45},
//     				   {27, 29, 37, 48},
//     				   {32, 33, 39, 50}};
//         int x = 29;
//         show(a,x);
        
//     }
// }

//Efficient Solution..
class position
{
    static int r=4,c=4;
    static void show(int a[][],int x)
    {
        int i=0,j=c-1;
        while(i<=r-1&&j>=0)
        {
            if(a[i][j]==x)
            {
                System.out.println(i+","+j);
                return ;
            }
            else if(a[i][j]>x)
            {
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not Found");
    }
    public static void main(String[] ars)
    {
         int a[][] = {{10, 20, 30, 40},
    				    {15, 25, 35, 45},
    				   {27, 29, 37, 48},
    				   {32, 33, 39, 50}};
        int x = 29;
        show(a,x);

    }
}