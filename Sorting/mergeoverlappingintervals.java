
//IMPORTANT ..............


import java.util.*;
import java.lang.*;
import java.io.*;

//Sorting array by using comparator function, Since it contains pairs like(x,y).... 

class Interval 
{
    int s,e;
   
    Interval(int s,int e)
    {
        this.s=  s;
        this.e = e;
    }
}
class MyCmp implements Comparator<Interval>
{
    public int compare(Interval p1,Interval p2)
    {
        return p1.s - p2.s;   
    }

}
//Using main class
class mergeoverlappingintervals
{
    static void Merge(Interval a[],int n)
    {
        Arrays.sort(a,new MyCmp());
        int res = 0;
        for(int i=1;i<n;i++)
        {
           if(a[res].e>=a[i].s)
           {
               a[res].s = Math.min(a[res].s,a[i].s);
               a[res].e = Math.max(a[res].e,a[i].e);
           } 
           else
           {
               res++;
               a[res] = a[i];
           }
        }
        for(int i=0;i<=res;i++)
        {
            System.out.print("["+a[i].s+","+a[i].e+"]");
        }
    }
    public static void main(String[] args)
    {
        Interval a[]= {new Interval(5,10),new Interval(3,15),new Interval(18,30),new Interval(2,7)};
        //  List<Integer> a = new ArrayList<Integer>();
        // a.add(new Point(5,10));
        // a.add(new Point(3,15));                  //THIS LIST IS NOT APPLY SINCE IT IS NOT A ARRAY/LINKED LIST.
        // a.add(new Point(18,30));
        // a.add(new Point(2,7));
        int n = a.length;
        Merge(a,n);


    }
}