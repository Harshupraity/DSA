import java.util.*;
import java.lang.*;
import java.io.*;

class minimumpage
{
    static int minPages(int arr[],int n,int k)
    {
        int sum=0;
        int mx=0;
        for(int i=0;i<n;i++)
        {
            sum= sum+arr[i];
            mx = Math.max(mx,arr[i]);
        }
        int low = mx;
        int high = sum; 
        int res= 0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(isValid(arr,n,k,mid) == true)
            {
                res = mid;
                high = mid-1;
            }
            else
                low=mid+1;
        }
        return res;

    }
    static boolean isValid(int arr[],int n,int k,int mid)
    {
        int student=1;
        int sum=0;
        for(int i=0;i<n;i++)
        {

            sum=sum+arr[i];
            if(sum>mid)
            {
                student++;
                sum = arr[i];
            }
        
        if(student > k)
            return false; 
        }
        return true;
    }
    public static void main (String[] args)
    {
        int arr[] ={10,20,30,40};
        int n =arr.length;
        int k=2;
        System.out.println(minPages(arr,n,k));
    }

}