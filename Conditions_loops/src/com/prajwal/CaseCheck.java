package com.prajwal;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Any Character to Know it is Upper Or Lowercase");
        char a=in.next().trim().charAt(0);

        if(a>='a' && a<='z'){
            System.out.println("It is LowerCase");
        }
        else {
            System.out.println("It is UpperCase");
        }
    }
}
