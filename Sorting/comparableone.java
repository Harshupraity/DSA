import java.util.*; 
import java.lang.*; 
import java.io.*; 
class Point implements Comparable<Point>
{
    int x,y;
    //creating constuctor
    Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point p)
    {
        return this.x - p.x ;   //substracting passed value from current value. 
    }
}
//main
class comparableone
{
    public static void main(String[] args)
    {
        List<Point> li = new ArrayList<Point>();
        li.add(new Point(10,20));
        li.add(new Point(9,10));
        li.add(new Point(12,19));

        Collections.sort(li);
        for(Point p : li)
        {
            System.out.println(p.x+" "+p.y);
        }    
    }
}