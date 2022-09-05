import java.util.*;
import java.io.*;
import java.lang.*;

//Efficient solution...
class Union
{
    static int Show(int a[],int b[],int n,int m)
    {
        HashSet<Integer> hs= new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            hs.add(a[i]);
        }
        
        for(int j = 0;j<m;j++)
        {
            // if(hs.contains(b[j]))
            // {                            
            //     continue;
            // }                               By deafault this condition is true.
            // else                            Hence we can directly add the item.
            // {
            //     hs.add(b[j]);
                
            // }
            hs.add(b[j]);
        }
        return hs.size();
    }
    public static void main(String[] args)
    {
        int a[] = {15,20,5,15};
        int b[] = {15,15,15,20,10};
        int n = a.length;
        int m = b.length;

        System.out.println(Show(a,b,n,m));
    }
}//T.C for efficient solution is O(m+n).


//Naive solution ???