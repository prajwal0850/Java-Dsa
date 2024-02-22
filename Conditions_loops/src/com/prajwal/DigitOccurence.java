package com.prajwal;

import java.util.Scanner;

public class DigitOccurence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any Digit");
        int a=input.nextInt();
        System.out.println("Enter any Digit To Check Occurence of");
        int b=input.nextInt();
        int count=0;

        while (a>0) {
            int rem= a%10;
            if (rem==b){
                count++;
            }
            a=a/10;
        }
        System.out.println("Occurence of Number is  " + count);
    }
}

