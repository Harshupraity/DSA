import java.util.*; 
import java.lang.*; 
import java.io.*; 


class Insertionsort1
{
    static void insertionSort(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }

            //placement of array..
            arr[j+1] = current;
        }
        
    }
    public static void main(String[] args)
    {
        int a[] = {2,8,6,1,9};
        int n = a.length;
        insertionSort(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

//
