//A sample java programme to implementing comparable alongside Arrays.sort().
import java.util.*;
import java.lang.*;
import java.io.*;

//A user defined class which is Point and it  implements Comparable interface..
class Point implements Comparable<Point>
{
    int x,y;

    // Constructor initialising x & y
    Point (int x,int y)
    {
        this.x = x;
        this.y = y;

    }
    //compareTo() function defining the nature of sorting i.e ,acc to x-coordinate..
    public int compareTo(Point p)
    {
        //Comparing two objects by substracting the passed object from current object
        return this.x-p.x;   //Sorting order can be changed from here. we can short acc to y corrdinate as well
    }
}


//Main class 
class sortinginnonprimitive
{
    public static void main(String[] args)
    {
        //creating Arrays of 3 objects
        Point arr[] = {
            new Point(10,20),
            new Point(3,12),
            new Point(5,7)
        };
        //Sorting  the object containing array
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(
                arr[i].x + " " + arr[i].y
            );
        }
    }
}
//Sorting is done acc. to x coordinate form coordinates(x,y)...

