package com.prajwal;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        while(true){
            System.out.println("Enter Operator or enter 'x' or 'X' to exit " );
            char op=input.next().trim().charAt(0);
            int ans=0;


            if (op=='+' || op=='-'|| op=='*' || op=='/' || op=='%'){
                System.out.println("Enter Two Numbers ");

                int a=input.nextInt();
                int b=input.nextInt();

                if (op=='+'){
                    ans=a+b;
                }

                if (op=='-'){
                    ans=a-b;
                }

                if (op=='*'){
                    ans=a*b;
                }

                if (op=='/'){
                    if(b!=0) {
                        ans = a/b;
                    }
                }

                if (op=='%'){
                    ans=a%b;
                }
            }else if(op=='X' || op=='x'){
                break;
            }else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }


    }
}
