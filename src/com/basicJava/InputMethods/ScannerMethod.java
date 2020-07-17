package com.basicJava.InputMethods;
import java.util.Scanner;

public class ScannerMethod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count  =0;
        while(n-- >0){
            int x = sc.nextInt();
            if (x%k==0)
                count+=1;
        }
        System.out.println(count);

    }
}
