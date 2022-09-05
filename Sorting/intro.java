//Sorting of arrays using Arrays.sort()...
import java.util.Arrays;
class intro
{
    public static void main(String[] args)
    {
        // int arr1[] = {5,20,12,30};
        // char arr2[] = {'B','B','A','C','A'};
        // Arrays.sort(arr1);
        // System.out.println(Arrays.toString(arr1));//y jo argument h brackets k andar us ko ratta marlena...
        // Arrays.sort(arr2);
        // System.out.println(Arrays.toString(arr2));  // "


        //Code to sort the subarray o an array..
        
        int arr[] = {5,30,20,10,8};
        Arrays.sort(arr,1,4);  //Syntax is (arr,start,end-1) It will sort acc to the syntax..
        System.out.println(Arrays.toString(arr));
        
    }
}