package com.prajwal;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Frist Number");
        float a= input.nextFloat();
        System.out.println("Enter Second Number");
        float b= input.nextFloat();
        System.out.println("Enter Operator (+ , - , / ,* ,%)");
        char op= input.next().charAt(0);

        if(op=='+'){
            System.out.println("Addition is "+ (a+b));
        }
        if(op=='-'){
            System.out.println("Substraction is "+ (a-b));
        }
        if(op=='*'){
            System.out.println("Multiplication is "+ (a*b));
        }
        if(op=='%'){
            System.out.println("Modulus is "+ (a%b));
        }
        if(op=='/'){
            System.out.println("Division is"+ (a/b));
        }
    }
}
