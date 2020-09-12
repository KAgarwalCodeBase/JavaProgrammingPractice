/*TreeSet class which is implemented in the collections framework an implementation of the SortedSet Interface and SortedSet
extends Set Interface. It behaves like simple set with the exception that it stores elements in sorted format. TreeSet uses
 tree data structure for storage. Objects are stored in sorted, ascending order. But we can iterate in descending order using
  method TreeSet.descendingIterator(). Let's see how to create a set object using this class.
*/
package com.basicJava.Set;
import java.util.*;
import java.util.Set;

public class TreeSetImplementation {
    public static void main(String[] args)
    {
        Set<String> ts
                = new TreeSet<String>();

        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        // Adding the duplicate
        // element
        ts.add("India");

        // Displaying the TreeSet
        System.out.println(ts);

        // Removing items from TreeSet
        // using remove()
        ts.remove("Australia");
        System.out.println("Set after removing "
                + "Australia:" + ts);

        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
