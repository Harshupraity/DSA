import java.util.*;
import java.io.*;
import java.lang.*;

class Binarysearchrecursive1
{
    static int recursiveSearch(int arr[],int low,int high,int x)
    {
        
        if(low>high)
            return -1;
        int mid = (low+high)/2; 
        if(arr[mid] == x)
            return mid;
        else if(arr[mid]>x )
        
            return recursiveSearch(arr,low,mid-1,x);
        else

            return recursiveSearch(arr,mid+1,high,x); 

    }
    public static void main(String[] args){
        
        int arr[] = {2,8,16,17,19,54};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int x = 19;
        

        System.out.println(recursiveSearch(arr,low,high,x));
    }
}

