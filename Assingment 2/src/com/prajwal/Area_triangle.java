package com.prajwal;

import java.util.Scanner;

public class Area_triangle {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

//    Program to find Area Of Triangle
        System.out.println("Enter the Base of Triangle ");
        float b=in.nextFloat();
        System.out.println("Enter The Height Of Triangle");
        float h=in.nextFloat();

        double area=0.5*b*h;

        System.out.println("The Area of Given Triangle is  "+area);


    }
}
