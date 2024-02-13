package com.prajwal;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Any Number");

        int num=input.nextInt();

        if(num%2==0)
        {
            System.out.println(num + " Is a Even Number");
        }
        else {
            System.out.println(num + " Is a Odd Number ");
        }

    }
}
