//The diffrence bw HashSet And HashMap is that HashSet stores only keys.
//However HashMap is used to store Key value pairs.
import java.util.*;
import java.io.*;
import java.lang.*;

class HashMap_01//class name should be different from HashMap. 
{
    public static void main(String[] args)
    {
          HashMap<String, Integer> m  = new HashMap<>(); 
        m.put("gfg",10);
        m.put("ide",15);
        m.put("courses",20);
        // System.out.println(m);
        // System.out.println(m.size());
        // for(Map.Entry<String,Integer> e: m.entrySet())
        // {
        //     System.out.println(e.getKey()+" "+e.getValue());
        // }

        //more function of HashMap

        //m.remove("ide");   Remove function will remove the "ide"
        // if(m.containsKey("ide"))
        //     System.out.println("Yes");
        // else
        //     System.out.println("No");
        

        // System.out.println(m.size());
        //  System.out.println(m.get("ide"));// returns the given function if it is present.
        //  System.out.println(m.get("practice"));//returns null if the value is not present. 
        if(m.containsValue(15))
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(m.get("ide"));
        System.out.println(m.get("practice"));

    }
}
//most of the operations takes O(1) time.

