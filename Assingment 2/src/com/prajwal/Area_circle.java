package com.prajwal;

import java.util.Scanner;

public class Area_circle {
    public static void main(String[] args) {

//        Program to Calculate the  Area Of Circle Taking Input From User
        Scanner in=new Scanner(System.in);

        System.out.println("Enter The Radius of Circle To get Its Area");
        float r=in.nextFloat();

        double area=3.14*r*r;
        System.out.println("The Given Radius Area of Circle is "+ area);

    }
}