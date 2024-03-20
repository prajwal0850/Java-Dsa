package com.prajwal;

import java.util.Scanner;

public class Sum_of_int {
    public static void main(String[] args) {

//        22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)


        Scanner in=new Scanner(System.in);

        System.out.println("Enter Any Number");
            float a=in.nextFloat();
            double product=0;
            double sum=0;

            while (a>0) {
                double rem=a%10;
                product=product*rem;
                sum=sum+rem;
                a=a/10;
            }
        System.out.println(product);
        System.out.println(sum);
    }
}
