package com.prajwal;

import java.util.Scanner;

public class Perimerter_of_circle {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter radius of Circle");
        float r=in.nextFloat();

        double p=2*(3.14)*r;
        System.out.println("Perimeter of Circle is  "+p);

    }
}
