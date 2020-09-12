package com.basicJava.Set;
import java.util.*;
public class HashSetImplementation {
    public static void main(String args[])
    {
        Set<String> hs = new  HashSet<String> ();
        //Elements are added using add method
        hs.add("D");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("E");
        hs.add("F");
        hs.add("A");
        //Iterating through set
        for(String value : hs)
            System.out.print(value +", ");
        System.out.println();
        hs.remove("A");
        System.out.println("Set after removing A "+ hs);
        //iterating over hash set items
        System.out.println("Iterating over hash set");
        Iterator<String> i = hs.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }

}