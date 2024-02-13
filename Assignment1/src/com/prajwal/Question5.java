package com.prajwal;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Frist Number");
        float num1=input.nextFloat();
        System.out.println("Enter Second Number");
        float num2= input.nextFloat();

        if(num1>num2){
            System.out.println(num1+"  is the Greater Number");
        }
        else{
            System.out.println(num2+" is the Greater Number");
        }
    }
}
