package com.prajwal;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        FOR LOOP
//        PRINT 1 to 10 Numbers Using Loops
//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//        }
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Any Number ");
//        int n=input.nextInt();

//        for (int i = 1; i <=n ; i++) {
////            System.out.println(i);
//            System.out.println("Hello World");
//        }

//            While Loop
//        int num=1;
//        while(num<=n){
//            System.out.println(num);
//            num++;
//        }

//        Do While Loop

//
//        int i=1;
//        do{
//            System.out.println("Hello World");
//            i++;
//        } while(i!=1);
        char a;
        int j=1;

        do {
            System.out.println("Enter Number You Want Table of ");
            int num=input.nextInt();
            for (int i = 1; i <=10; i++) {

                System.out.println(num*i);

            }
            System.out.println("Do you Want To Continue(Y/N)");
            a=input.next().trim().charAt(0);
            j++;
        }while(a=='Y' || a=='y');
    }
}