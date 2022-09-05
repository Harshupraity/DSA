// A sample Java program to implementing
// Comparator alongside Arrays.sort(). 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

// // Point class which does not implement
// // Comparable interface. Thus the objects
// // of this class are not comparable.
// class Point
// {
//     int x, y;
//     Point(int x, int y)
//     {
//         this.x = x;
//         this.y = y;
//     }
// }

// // This class implements 
// // Comparator interface to compare 
// class MyCmp implements Comparator<Point>
// {
//     // Sorts the Point objects according
//     // to x-coordinates in natural order
//     public int compare(Point p1, Point p2)
//     {
//         return p1.x - p2.x;
//     }
// }

// // Main class
// class comparator1 
// { 
//     public static void main(String[] args) 
//     { 
//         // Array of 3 objects
//         Point arr[] = {
//             new Point(10, 20), 
//             new Point(3, 12), 
//             new Point(5, 7) };
                
//         // Sorting the object containing the array 
//         // by passing the array and object MyCmp
//         Arrays.sort(arr, new MyCmp());
        
//         // Displaying the sorted array
//         for(int i = 0; i < arr.length; i++)
//             System.out.println(
//                 arr[i].x + " " + arr[i].y);
//     } 
// }

//A sample program to sort a non primitive subarray in descending order using Arrays.sort()..
//import java.util.Arrays;
//import java.util.Collections;
//class comparator1
// {
//     public static void main(String[] args){
//         Integer[] arr = {5,20,10,12};
//         //Note that we have Integer here instead of int[] as collections.reverseOrder 
//         // does not work for primitive types.
//         Arrays.sort(arr,Collections.reverseOrder());

//         System.out.println(Arrays.toString(arr));
//     }
//}

class MyCmp implements Comparator<Integer>
{
    // Sorts the Integer
    public int compare(Integer a,Integer b)
    {
        return a%2 - b%2;
    }
}
//Main class 
class comparator1
{
    public static void main(String[] args)
    {
        Integer arr[] = {5,20,10,3,12};
        //Sorting arrays by passing 
        //arr and MyCmp object

        Arrays.sort(arr,new MyCmp());
        //Displaying the sorted array

        System.out.println(Arrays.toString(arr));
    }
}