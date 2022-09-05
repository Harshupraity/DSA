import java.util.*;
import java.io.*;
import java.lang.*;

//Time complexity for below solution is O(n2) and aux space O(1).
// class frequenciesofelement
// {
//     static void show(int a[],int n)
//     {
        
//         for(int i = 0;i<n;i++)
//         {
//             boolean flag = false;
//             for(int j=0;j<i;j++)
//             {
//                 if(a[i]==a[j])
//                 {
//                     flag = true;
//                     break;
//                 }
//             }
//             if(flag==true)
//             {
//                 continue;
//             }
        
//             int freq=1;
//             for(int j=i+1;j<n;j++)
//             {
//                 if(a[i]==a[j])
//                 {
//                     freq++;
//                 }
//             }
//             System.out.println(a[i]+" "+freq);
//         }
//     }
//     public static void main(String[] args)
//     {
//         int a[] = {10,12,10,15,10,20,12,12};
//         int n = a.length;
//         show(a,n);

//     }
// }

//Efficient solution..
class frequenciesofelement
{
    static void countFreq(int a[],int n)
    {
        HashMap<Integer,Integer> h = new HashMap<>(); //creating empty HashMap.
        for(int i=0;i<n;i++)
        {
            int key = a[i];
            if(h.containsKey(a[i])==true)
            {
               h.put(a[i],h.get(a[i])+1);//if the key is already present then it replace that kay value with this new one.
            }
            else
            {
                h.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> itr: h.entrySet())
        {
            System.out.println(itr.getKey()+" "+itr.getValue());
        }
    }
    public static void main(String[] args)
    {
        int a[] = {15,16,27,27,28,15};
        int n = a.length;

        countFreq(a,n);
    }
    
}