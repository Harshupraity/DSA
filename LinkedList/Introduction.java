import java.util.*;
import java.io.*;
import java.lang.*;

// class Introduction
// {
//     static int show(int x)
//     {
      
//        int count=0;
//         while(x>0)
//         {
//             x=x/10;
//             count++;
//         }
//         return count;
//     }
//     public static void main(String[] arsg)
//     {
//         int x = 1003654;
//         System.out.print(show(x));
//     }
// }
// class Introduction
// {
//     static void show(int x)
//     {
//         int rem,rev=0;
//         int temp=x;
//         while(temp!=0)
//         {
//             rem= temp%10;
//             rev = rev*10+rem;
//             temp=temp/10;
//         }
        
//         if(rev==x)
//         {
//             System.out.print("Yes");
//         } 
//         else
//         {
//             System.out.print("No");
//         }

//     }
//     public static void main(String[] args)
//     {
//         int x=121;
//         show(x);
//     }
// }


//Iterative solution.

// class Introduction
// {
//     static int show(int n)
//     {
//         int res=1;
//         for(int i=1;i<n;i++)
//         {
//             res=i*res;
//         }
//         return res;
//     }
//     public static void main(String[] arsg)
//     {
//         int n=6;
//         System.out.print(show(n));       
//     }
// }

//Recursive solution.
// class Introduction
// {
//     static int show(int n)
//     {
//         if(n==0)
//         {
//             return 1;
//         }
//         return n*show(n-1);
//     }
//     public static void main(String[] arsg)
//     {
//         int n= 6;
//         System.out.print(show(n));
//     }
// }


//Trailing zeroes.
// class Introduction
// {
//     static int show(int x)
//     {
//         int res=1;
//         for(int i=2;i<=x;i++)
//         {
//             res=res*i;
//         }
//         //int rem;
//         int count=0;
//         while(res%10==0)
//         {
//              count++;
//             res=res/10;
//         }
//         return count;
//     }
//     public static void main(String[] artgs)
//     {
//         int x = 10;
//         System.out.print(show(x)); 
//     }
// }

//Efficient. 
// class Introduction
// {
//     static int countTrailingZero(int n)
//     {
//         int res = 0;
//         for(int i=5;i<=n;i=i*5)
//         {
//             res= res+n/i;

//         }
//         return res;
//     }
//      public static void main(String[] artgs)
//     {
//         int x = 10;
//         System.out.print(countTrailingZero(x)); 
//     }
// // }


// //Time complexity for gcd is O(min(a,b)).
// class Introduction
// {
//     static int gcd(int a,int b)
//     {
//         int res = Math.min(a,b);
//         while(res>0)
//         {
//             if(a%res==0 && b%res==0)
//             {
//                 break;
//             }
//             res--;

//         }
//         return res;

//     }
//     public static void main(String[] arsg)
//     {
//         int a=7;
//         int b=20;
//         System.out.print(gcd(a,b));
//     }

// }


//Euclidean algorithm.......
// class Introduction
// {
//     static int gcd(int a,int b)
//     {
//         while(a!=b)
//         {
//             if(a>b)
//             {
//                 a=a-b;
//             }
//             else
//             {
//                 b=b-a;
//             }
//         }
//         return b;
//     }
//     public static void main(String[] arsg)
//     {
//         int a=10;
//         int b=20;
//         System.out.print(gcd(a,b));
//     }
// }
//Optimized version of Euclidean .
// class Introduction
// {
//     static int gcd(int a,int b)
//     {
//         if(b==0)
//         {
//             return a;
//         }
//         else
//         {
//             return gcd(b,a%b);
//         }
//     }
//     public static void main(String[] arsg)
//     {
//         int a=15;
//         int b = 12;
//         System.out.print(gcd(a,b));
//     }

// }

//NAive approach..
// class Introduction
// {
//     static int LCM(int a,int b)
//     {
//         int res = Math.max(a,b);
//         while(true)
//         {
//             if(res%a==0 && res%b==0)
//             {
//                 break;
//             }
//             res++;
//         }
//         return res;
//     }
//     public static void main(String[] arsg)
//     {
//         int a=4,b=6;
//         System.out.print(LCM(a,b));
//     }
// }

// //Efficient approach..
// //first we have to find the HCF of two number.
// class Introduction
// {
//     static int gcd(int a,int b)
//     {
//         if(b==0)
//         {
//             return a;
//         }
//         return gcd(b,a%b);
//     }
//     static int LCM(int a,int b)
//     {
//         return (a*b)/gcd(a,b);
//     }
//     public static void main(String[] arsg)
//     {
//         int a=4,b=6;
//         System.out.print(LCM(4,6));
//     }
// }

//Check for prime.
// class Introduction
// {
//     static boolean isprime(int n)
//     {
//         if(n==0 || n==1)
//         {
//             return false;
//         }
//         for(int i=2;i*i<n;i++)
//         {
//             if(n%i==0)
//             {
//                 return false;
//             }
       
//         }
//         return true;
//     }
//     public static void main(String[] arsg)
//     {
//         int n = 5;
//         System.out.print(isprime(n));
//     }
// }//t.c is O(sqr(n)).

//More efficient method

// class Introduction
// {
//     static boolean isPrime(int n)
//     {
//         if(n==1)
//         {
//             return false;
//         }
//         if(n%2==0||n%3==0)
//         {
//             return false;
//         }
//         for(int i=5;i*i<n;i=i+6)
//         {
//             if(n%i==0||n%(i+2)==0)
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] arsg)
//     {
//         int n=7;
//         System.out.print(isPrime(n));
//     }
// }

// class Introduction
// {
//     static void printPrime(int n)
//     {
//         if(n<=1)
//         {
//             return ;
//         }
//         for(int i=2;i*i<n;i++)
//         {
//             while(n%i==0)
//             {
//                 System.out.print(i+" , ");
//                 n=n/i;
//             }
//         }
//         if(n>1)
//         {
//             System.out.print(n);
//         }
//     }
//     public static void main(String[] arsg)
//     {
//         int n = 84;
//         printPrime(n);
//     }
// }
//More efficient solution.
// class Introduction
// {
//     static void primeFactor(int n)
//     {
//         if(n<=1)
//         {
//             return;
//         }
//         while(n%2==0)
//         {
//             System.out.print(2+" , ");
//             n=n/2;

//         }
//         while(n%3==0)
//         {
//             System.out.print(3+" , ");
//             n=n/3;
//         }
//         for(int i=5;i*i<n;i+=6)
//         {
//             while(n%i==0)
//             {
//                 System.out.print(i+" , ");
//                 n=n/i;
//             }
//             while(n%(i+2)==0)
//             {
//                 System.out.print((i+2)+" , ");
//                 n=n/(i+2);
//             }
//         }
//         if(n>3)
//         {
//             System.out.print(n+" , ");
//         }
//     }
//     public static void main(String[] arsg)
//     {
//         int n = 84;
//         primeFactor(n);
//     }
// }

//Naive solution.
// class Introduction
// {
//     static void Divisor(int n)
//     {
//         for(int i=1;i<=n;i++)
//         {
//             if(n%i==0)
//             {
//                 System.out.print(i+" ");
//             }
//         }
           
//     }
//     public static void main(String[] arsg)
//     {
//         int n = 7;
//         Divisor(n);
//     }
// }

//Answers are in Sorted way. 
// class Introduction
// {
//     static void printDivisor(int n)
//     {
//         int i;
//         for(i=1;i*i<n;i++)
//         {
//             if(n%i==0)
//             {
//                 System.out.print(i+" ");
//             }
//         }
//         for(;i>=1;i--)
//         {
//             if(n%i==0)
//             {
//                 System.out.print(n/i+" ");
//             }
//         }
//     }
//     public static void main(String[] arsg)
//     {
//         int n = 15;
//         printDivisor(n);
//     }
// }T.C for this q is theta(sqr(n)).


//Naive
// class Introduction
// {
//     static int show(int x,int n)
//     {
//         int res=1;
//         for(int i=1;i<=n;i++)
    //     {
    //         res= res*x;
    //     }
    //     return res;
    // }
    // public static void main(String[] arsg)
    // {
        // int x=2;
        // int n = 3;
        // System.out.print(show(x,n));

//    }
    
//}

// class Introduction
// {
//     static int show(int x,int n)
//     {
//         if(n==0)
//         {
//             return 1;
//         }
//         int temp = show(x,n/2);
//         temp = temp*temp;
//         if(n%2==0)
//         {
//             return temp;
//         }
//         else
//         {
//             return temp*x;
//         }
//     }
//     public static void main(String[] arsg)
//     {
//         int x = 2;
//         int n= 3;
//         System.out.print(show(x,n));
//     }
// }

//Iterative solution.
class Introduction
{
    static int show(int x,int n)
    {
        int res = 1;
        while(n>0)
        {
            if(n%2!=0)
            {
                res=res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
    public static void main(String[] arsg)
    {
        int x=4;
        int n=5;

        System.out.print(show(x,n));
    }
}