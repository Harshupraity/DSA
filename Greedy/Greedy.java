import java.util.*;
import java.io.*;
import java.lang.*;

class Greedy 
{
    static int mincoin(int coin[],int n,int amount)
    {
        Arrays.sort(coin);
        int res=0;
        for(int i=n-1;i>=0;i--)
        {
            if(coin[i]<=amount)
            {
                int c=(int)Math.floor(amount/coin[i]);
                res+=c;
                amount = amount-c*coin[i];

            }
            if(amount==0)
            {
                break;
            }
        }
        return res;
    }
    public static void main(String[] at) 
    {
        int coin[]={5,10,2,1};
        int n=coin.length;
        int amount = 57;

        System.out.println(mincoin(coin,n,amount));
    }
}