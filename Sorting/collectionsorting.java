// import java.util.ArrayList;
// import java.util.*;
// public class collectionsorting
// {
//     ArrayList<Integer> li = new ArrayList<Integer>();
//     li.add(10); 
//     li.add(15); 
//     li.add(6); 
//     li.add(12);

//     Collections.sort(li);
//     System.out.println(li);
//     Collections.sort(li,Collections.reverseOrder());
//     System.out.println(li); 
// }
// Java program to demonstrate 
// working of Collections.sort() 
import java.util.*; 

public class collectionsorting 
{ 
    public static void main(String[] args) 
    { 
        // Create a list of strings 
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(10); 
        list.add(5); 
        list.add(20); 
        
        // List is sorted in the natural order
        Collections.sort(list);
        
        // Displaying the sorted list
        System.out.println(list);
        
        // Sorting the list in reverse order
        Collections.sort(list, Collections.reverseOrder()); 

        // Let us print the sorted list 
        System.out.println(list); 
    } 
} 
