import java.util.*; 
import java.lang.*; 
import java.io.*; 

class bubblesort1
{
    static void bubbleSort(int[] arr,int n)
    {
       
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<n-i-1;j++)
                {
                    int temp=0;
                    if(arr[j]>arr[j+1])
                    { 
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
        }
    }
    public static void main(String[] args)
    {
       int[] a= {2,1,4,3};
       int n1 = a.length;

       //System.out.println( bubbleSort(a,n1)); This procedure is allowed by int type.
       bubbleSort(a,n1);

       for(int i=0;i<n1;i++)
       {
           System.out.println(a[i]+" ");
       }
    }
}


// //Efficient solution..
// class bubblesort1
// {
//     static void bubbleSort(int arr[],int n)
//     {
//          boolean swapped;
//         for(int i=0;i<n;i++)
//         {
//             int temp = 0;
//             swapped = false;
//             for(int j = 0;j<n-i-1;j++)
//             {
//                 if(arr[j]>arr[j+1])
//                 {
//                     temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swapped= true;
//                 }
//     //         }
    //          if(swapped == false)
    //                 break;
    //     }
       
    // }
   // public static void main(String[] args)
   // {
        // int a[] = {2,1,4,3};
        // bubbleSort(a,4);

        // for(int i=0;i<4;i++)
        // {
        //     System.out.print(a[i]+" ");
//         }
//     }
// }
/*package whatever //do not write package name here */

// import java.io.*;

// class bubblesort1 {
    
//     static void bubbleSort(int arr[], int n){
//         boolean swapped;
        
//         for(int i = 0; i < n; i++){
            
//             swapped = false;
            
//             for(int j = 0; j < n - i - 1; j++){
//                 if( arr[j] > arr[j + 1]){
                    
//                     // swapping
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
                    
//                     swapped = true;
                    
//                 }
//             }
//             if(swapped == false)
//             break;
//         }
//     }
    
// 	public static void main (String[] args) {
// 	    int a[] = {2, 1, 4, 3};
// 	    bubbleSort(a, 4);
	    
// 	    for(int i = 0; i < 4; i++){
// 	        System.out.print(a[i] + " ");
// 	    }
// 	}
// }