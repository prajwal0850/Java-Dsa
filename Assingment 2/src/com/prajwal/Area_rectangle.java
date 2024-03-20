package com.prajwal;

import java.util.Scanner;

public class Area_rectangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter The Length of Rectangle");
        float l=in.nextFloat();
        System.out.println("Enter The Width of Rectangle");
        float w=in.nextFloat();

        double area=l*w;

        System.out.println("Area Of Rectangle is  "+ area);

    }
}
