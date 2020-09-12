//java program to demonstrate working of comprator interface
package com.basicJava.Sorting;
import java.sql.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

class Student {
    int rollno;
    String name,address;
    //Constructor
    public Student (int rollno , String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address= address;
    }
    public String toString(){
        return this.rollno + " " + this.name + " " + this.address;
    }
}

class SortbyRoll implements Comparator<Student>{
    public int compare(Student a,Student b)
    {
        return a.rollno - b.rollno;
    }
}

public class UserDefindedCriteria {
    public static void main(String args[])
    {
        Student [] arr = { new Student(111,"kaushal Agarwal","Allahabad"),
                           new Student ( 110,"Ritesh kumar Pandey","Ranchi"),
                           new Student ( 113,"Nishant Chaddha","Mera pur Allahabad")

                         };
        System.out.println("Unsorted");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        Arrays.sort(arr,new SortbyRoll());
        System.out.println("sorted");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);



    }

}
