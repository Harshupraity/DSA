//selection sort has an advantage that it has less memory diet as compare to other sort how
//ever it is not the only sort which have less memorydiet we also have another algo which is cycle sort.  


//Naive
// class selectionsort1
// {
//     static void selectionSort(int arr[],int n)
//     {
//         int temp[] = new int[n];
//         for(int i=0;i<n;i++)
//         {
//             int min_ind = 0;
//             for(int j=1;j<n;j++)
//             {
//                 if(arr[j]<arr[min_ind])
//                     min_ind = j;
//             }
//             temp[i] = arr[min_ind];
//             arr[min_ind]= Integer.MAX_VALUE;

//         }
//         for(int i=0;i<n;i++)
//             arr[i] = temp[i];
//     }
//     public static void main(String[] args)
//     {
//         int a[]= {2,8,1,4,6,7};
//         int n = a.length;

//         selectionSort(a,n);
//         for(int i =0;i<n;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//     }
// }


// Efficient solution...

class selectionsort1
{
    static void selectionSort(int arr[],int n)
        {
            for(int i=0;i<n-1;i++)
            {
                int min_ind = i;
                for(int j=i+1;j<n;j++)
                {
                    if(arr[min_ind]>arr[j])
                    {
                        min_ind = j;
                    }
                }
                int temp= arr[min_ind];
                arr[min_ind] = arr[i];
                arr[i]=temp;
                
            
            }
        }
        public static void main(String[] args)
        {
            int a[]={2,8,1,4,6,7};
            int n1= a.length;
            selectionSort(a,n1);

            for(int i=0;i<n1;i++)
            {
                System.out.print(a[i]+" ");
            }
        }

}
//T.C is theta(n2);