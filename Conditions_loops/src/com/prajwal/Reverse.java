package com.prajwal;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Any Number To get Reverse Of it");
        int a=input.nextInt();
        int b=0;

        while (a>0) {
            int rem=a%10;
            b=b*10+rem;
            a=a/10;


        }
        System.out.println(b);

    }
}
