import java.util.*;
import java.io.*;
import java.lang.*;

//Naive solution.....T.C O(n2). & Aux space O(1).
// class countdistinct
// {
//     static int shoe(int a[],int n)
//     {
//             int count=0;
//             for(int i=0;i<n;i++)
//             {
//                 boolean flag = false;
//                 for(int j=0;j<i;j++)
//                 {
//                     if(a[i]==a[j])
//                     {
//                         flag=true;
//                         break;
//                     }
//                 }
//                 if(flag==false)
//                 count++;
                  
//             }
//             return count;
               
//     }
    

//     public static void main(String[] args)
//     {
//         int a[] = {15,12,13,12,13,13,18};
//         int n = a.length;
//         System.out.println(shoe(a,n));
//     }
// }


// class countdistinct
// {
//     static int count(int a[],int n)
//     {
//         HashSet<Integer> s= new HashSet<>();
//         for(int i=0;i<n;i++)
//         {
//             s.add(a[i]);//HashSet adds only distinct element  

//         }
//         return s.size();
//     }
//     public static void main(String[] args)
//     {
//         int a[]  ={10,20,10,20,30};
//         int n  = a.length;
//         System.out.println(count(a,n));
//     }
// }
//T.c of above method is O(n) & Aux space O(n)

//further improved code although its time complexity remains the same.
class countdistinct
{
    static int count(Integer a[])
    {
        HashSet<Integer> s = new HashSet<>(Arrays.asList(a));//aslist method will 
                                                                //automatically convert list
                                                                //to Arrayslist.
        return s.size();
    }
    public static void main(String[] args)
    {
        int a[]  ={10,20,10,20,30};
        //int n  = a.length;
       // System.out.println(String.valueOf(a));
    }
}
//checks the system.out.print element. method Its time complexity remains same O(N) && AuxO(n).
