package com.prajwal;

import java.util.Scanner;

public class Area_of_equilateral_triangle {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Base of Triangle ");
        int b=input.nextInt();
        System.out.println("Enter The Height of Triagle");
        int h= input.nextInt();

        int a=(b*h)/2;
        System.out.println("The Area Of Triangle "+a);
    }
}
