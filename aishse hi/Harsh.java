class Harsh 
{
    static void show(int arr[],int n)
    {
        int res=0;
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            res=Math.max(res,arr[i]);
            // count=Math.min(count,arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.print(res + " "+min);
    }
    public static void main(String[] ar)
    {
        int arr[]={3,2,1,56,10000,167};
        int n=arr.length;
        show(arr,n);
    }
}