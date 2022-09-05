import java.util.*; 
import java.lang.*; 
import java.io.*;

class unionof2sortedarray
{
    static void Sorted(int a[],int b[],int n,int m)
    {
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(i>0 && a[i-1]==a[i])
            {
                i++;
                continue;
            }
            if(j>0 && b[j-1]==b[j])
            {
                j++;
                continue;
            }
            if(a[i]<b[j])
            {
                System.out.print(a[i]+" ");
                i++;
            }
            else if(a[i]>b[j])
            {
                System.out.print(b[j]+" ");
                j++;
            }
            else
            {
                System.out.print(a[i]+" ");
                i++;
                j++; 
            }
        }
        while(i<n)
        {
            if(i==0 || a[i]!=a[i-1])
                System.out.print(a[i]+" ");
                i++;
        }
        while(j<m)
        {
            if(j==0 || b[j]!=b[j-1])
                System.out.print(b[j]+" ");
                j++;
        }
    }       
    public static void main(String[] args)
    {
        int a[] = {3,8,8};
        int b[] = {2,8,8,10,15};
        int n = a.length;
        int m = b.length;

        Sorted(a,b,n,m);
    }
    
}