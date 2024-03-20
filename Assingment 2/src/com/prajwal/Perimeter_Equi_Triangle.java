package com.prajwal;

import java.util.Scanner;

public class Perimeter_Equi_Triangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the Side");

        float s=in.nextFloat();

        double p=3*s;
        System.out.println("The Perimeter of Equi Trianlge is  "+p);
    }
}
