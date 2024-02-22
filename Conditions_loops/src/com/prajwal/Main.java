package com.prajwal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Your Salary");
        float salary=input.nextFloat();

//        IF ELSE CONDITION

        if(salary>=10000){
            salary=salary+2000;
        }
        else {
            salary=salary+1000;
        }
        System.out.println("Your Bonus + Salary is: "+salary);

    }
}
