package com.prajwal;

import java.util.Scanner;

public class Area_rhombus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

//        This is Program to find the area of rhombus using the daigonal

        System.out.println("Enter the Value of Diagonal one");
        float d1=in.nextFloat();
        System.out.println("Enter The Value of Diagonal two");
        float d2=in.nextFloat();

        double area =0.5*d1*d2;

        System.out.println("Area of Given Rhombus is "+ area);

    }
}
