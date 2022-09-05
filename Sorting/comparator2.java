import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Point 
{
    int x,y;
    Point(int x,int y)
    {
        this.x = x;
        this.y = y;

    } 

}

//This class implements the comparator operator 
//creating seprate class 
class MyCmp implements Comparator<Point>
{
    public int compare(Point p1,Point p2)
    {
        return p1.x-p2.x;
    }
}
class comparator2
{
    public static void main(String[] args)
    {
        //creating the list of integers.
        List<Point> li = new Array
        List<Point>();
        li.add(new Point(5,10));
        li.add(new Point(3,12));
        li.add(new Point(12,12));

        Collections.sort(li,new MyCmp());
        for(Point p: li)
        {
             System.out.println(p.x+" "+p.y);
        }
    }

}