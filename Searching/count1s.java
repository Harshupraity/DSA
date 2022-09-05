import java.util.*;
import java.io.*;
import java.lang.*;


//Naive approach is to traverse through the whole array and then if that value is equal to to that 
//of one then return the given values as we have done...

//Efficient approach using iterative solution..
class count1s
{
    static int countones(int arr[],int n)
    {
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            // if(x<arr[mid])
            //     high = mid-1;
            // else if(x>arr[mid])
            //     low = mid+1;
            // else
            //     if()

            if(arr[mid] == 0)
                low = mid+1;
            else if(arr[mid]==1)
            {
                if(mid == 0 || arr[mid] != arr[mid-1])
                    return (n-mid);
                else
                    high = mid-1;
            }
            
        }
        return 0;
    }
    public static void main(String args[])
    {
        int arr[] = {0,0,1,1,1,1};
        int n = arr.length;
        System.out.println(countones(arr,n)); 
    }

}
