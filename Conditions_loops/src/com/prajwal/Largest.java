package com.prajwal;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

//        Q- FInding The Greater NO from Three Number
        System.out.println("Enter Frist NUmber");
        int a= in.nextInt();
        System.out.println("Enter Second NUmber");
        int b= in.nextInt();
        System.out.println("Enter Third NUmber");
        int c= in.nextInt();
//        int max;
//        max=a;
//        if(max<b){
//            b=max;
//        }
//        if(max<c){
//            max=c;
//        }
//        System.out.println("The greater NUmber is " + max);
        int max=Math.min(c,Math.min(a,b));

        System.out.println("The Largest Number Is " +max);

    }
}
