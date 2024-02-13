package com.prajwal;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE RUPPES TO KNOW IN USD");
        double rs= input.nextFloat();
        double doll=rs/83.11;
        System.out.println("Value In Dollar is  "+doll);
    }
}
