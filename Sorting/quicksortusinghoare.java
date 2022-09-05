import java.util.*;
import java.lang.*;
import java.io.*;
class quicksortusinghoare
{
    static int Hoare(int a[],int l,int h)
    {
        int i = l-1;
        int j = h+1;
        int pivot = a[l];
        while(true)
        {
            do{
                i++;
            }while(a[i]<pivot);
            do{
                j--;
            }while(a[j]>pivot);
            if(i>=j)
            {
                return i;
            }
            else
            {
                int temp = a[i];
                a[i] = a[j]; 
                a[j] = temp;
            }
        }

    }
    static void Qs(int a[],int l,int h)
    {
        int p = Hoare(a,l,h);
        Qs(a,l,p-1);
        Qs(a,p+1,h);

    } 
    
    public static void main(String[] args)
    {
        int a[] = {8,4,7,9,3,10,5};
        int l = 0;
        int h = a.length-1;
        Hoare(a,l,h);
        
        for(int x:a)
        {
            System.out.print(x+" ");
        }
      //  System.out.println(Hoare(a,l,h));
        
    }

}
