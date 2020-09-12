package com.basicJava.Set;
import java.util.*;
enum Gfg{
    CODE,
    LEARN,
    CONTRIBUTE,
    QUIZ,
    MCQ
};
public class EnumSetImplementation {
    public static void main(String args[])
    {
        Set<Gfg> set1;
        set1 = EnumSet.of(Gfg.CODE,
                        Gfg.CONTRIBUTE,
                        Gfg.LEARN,
                        Gfg.QUIZ);
        System.out.println("Set1: "+set1);
    }
}
