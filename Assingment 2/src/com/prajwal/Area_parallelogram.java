package com.prajwal;

import java.util.Scanner;

public class Area_parallelogram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the Base of Parallelogram");
        float b=in.nextFloat();
        System.out.println("Enter the Height of Parallelogram");
        float h=in.nextFloat();

        double area= b*h;

        System.out.println("Area of Given Parallelogram is  "+ area);
    }
}
