//Count digits
// class Arrays_01 
// {
//     static int show(int x)
//     {
//         int count = 0;
//         while(x>0)
//         {
//             count++;
//             x=x/10;
//         }
//           return count;
//     }
//     public static void main(String[] args)
//     {
//         int x= 45644;
//         System.out.print(x);
//     }
// }
class Arrays_01
{
    static int show(String str , int start,int end)
    {
        if(start>=end)
        {
            return true;
        }
        return (str.charAt(start)==str.charAt(end));
    }
    public static void main(String[] ara)
    {
        String str = "ana";
        int len = str.length();
        System.out.print(show(str,0,len-1));
    }
}