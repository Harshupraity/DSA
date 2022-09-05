import java.util.*;
import java.io.*;
import java.lang.*;

class Hashset
{
    public static void main(String[] args)
    {
        HashSet<String> h = new HashSet<String>();//here in "()" constructor we can specify
                                                    // the size of the HashMap as well.

        h.add("gfg");
        h.add("courses");
        h.add("ide");
        System.out.println(h);
        System.out.println(h.contains("ide"));

        // Iterator<String> i = h.iterator();  //This iterator() calls the element one by one.
        // while(i.hasNext())                  //hasnext() calls the next item.
        // {
        //     System.out.print(i.next()+" ");
        // }
        System.out.println(h.size());  // Prints the size of the function.
        h.remove("ide");                //removes the string "ide" . 
        System.out.println(h);
        System.out.println(h.size());
        for(String str : h)
        {
            System.out.print(str+" ");
        }
        System.out.println(h.isEmpty());//empty function will return false if it contains any value or item. 



    }
}


//On adding already present element it does not allow it and returns false. 
//T.complexity
//add().
//remove().
//contains().
//The above functions has time complexity to be O(1) on an average.

//The following function has O(1)
//size.
//isEmpty().