import java.util.Scanner;
class ok 
{
    public static void main(String[] a)
    {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int s=sc.nextInt();

            if(s<=n)
            {
                System.out.println(s);
            }
            else
            {
                System.out.println(2*n-s);
            }
        }
    }
}