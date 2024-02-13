package com.prajwal;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Any Two Numbers :");
        int num1=input.nextInt();
        int num2= input.nextInt();
        System.out.println("Sum Of Two Numbers Is "+(num1+num2));
    }
}
