import java.util.*;
import java.lang.*;
import java.io.*;

class Hoarespartition
{
    static int Hoare(int a[],int l,int h)
    {
        
        int i = l-1;
        int j = h+1;
        int pivot = a[l];
        while(true)
        {
            
            do
            {
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
    public static void main(String[] args)
    {
        int a[] = {5,3,8,4,2,7,1,10};
        int l = 0;
        int h = a.length - 1;

        System.out.print(Hoare(a,l,h));
    }
}