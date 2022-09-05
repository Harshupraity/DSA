// import java.util.*;
// import java.io.*;
// import java.lang.*;

// class Transpose
// {
//     static int n=4;
//     static void show(int mat[][])
//     {
//         int temp[][] = new int[n][n];
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                  temp[i][j]= mat[j][i];
//             }
//         }
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 mat[i][j] = temp[i][j];
//             }
//         }
//     }
//     public static void main(String[] args)
//     {
//         int mat[][] = {{1, 2, 3, 4},
//     				    {5, 6, 7, 8},
//     				   {9, 10, 11, 12},
//     				   {13, 14, 15, 16}};

//         show(mat); 
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 System.out.print(mat[i][j]+" ");
//             }
//             System.out.println();
//         }   
//     }
// }

//Efficient solution 
// 1.In-place theorem
// 2.One-Traversal.

// class Transpose
// {
//     static int n=4;
//     static void show(int a[][])
//     {
//         for(int i = 0;i<n;i++)
//         {
//             for(int j=i+1;j<n;j++)
//             {
//                 int temp = a[i][j];
//                 a[i][j] = a[j][i];
//                 a[j][i] = temp;
//             }
//         }
//     }
//     public static void main(String[] args)
//     {
//          int a[][] = {{1, 2, 3, 4},
//     				    {5, 6, 7, 8},
//     				   {9, 10, 11, 12},
//     				   {13, 14, 15, 16}};

//         show(a);
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 System.out.print(a[i][j]+" ");
//             }
//             System.out.println();
//         } 
//     }
// }
class Transpose
{
    static int n=4;
    static void show(int mat[][])
    {
        int temp[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[n-j-1][i] = mat[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j] = temp[i][j];
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