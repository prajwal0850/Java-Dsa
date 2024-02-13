package com.prajwal;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//        float a=input.nextFloat();
//        System.out.println(a);


//        Typecasting
//        int b=(int)(56.25f);
//        System.out.println(b);
//        int c=(int)(input.nextFloat());
//        System.out.println(c);

//        Typecasting Promotion

        int i=5000;
        byte b=42;
        char c='A';
        short s=1024;
        float f=10.2f;
        double d=21554.2554;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println((f*b)+ " "+ (i/c)+ " " +(d*s));
        System.out.println(result);
    }
}
