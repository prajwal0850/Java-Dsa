package com.prajwal;

import java.util.Scanner;

public class Febonnaci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number To Get Febonnaci Series of");
        int n=input.nextInt();
        int a=0;
        int b=1;
        int count=2;

        while (count<=n) {
            int temp = b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println("Febonnaci Series of "+n+" is  " +b);
    }
}