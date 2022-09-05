import java.util.*;
import java.lang.*;
import java.io.*;

class meetingguest
{
    static int maxGuest(int arrival[],int departure[],int n)
    {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 1,j=0,res=1,currGuest=1;
        while(i<n && j<n)
        {
            if(arrival[i]<=departure[0])
            {
                i++;
                currGuest++;
                res++;
            }
            else
            {
                j++;
                currGuest--;

            }
            res= Math.max(res,currGuest);    
        }
        return res;
        
    }
    public static void main(String[] args)
    {
        int arrival[] = {900,600,700};
        int departure[] = {1000,800,730};
        int n  = arrival.length;

        System.out.print(maxGuest(arrival,departure,n));
    }
}

//T.C = O(nlogn)+O(nlogn)+O(n+m)// sorting + sorting + merging........