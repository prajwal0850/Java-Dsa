package com.prajwal;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Principal");
        float p=input.nextFloat();
        System.out.println("Enter time");
        float t=input.nextFloat();
        System.out.println("Enter Rate");
        float r=input.nextFloat();

        float interest=p*1+r*t;
        System.out.println("Simple Interest is  " +interest);
    }
}