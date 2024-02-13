package com.prajwal;

import java.util.Scanner;

public class Tempreature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        float tempC=input.nextFloat();

        float Fahre=(tempC * 9/5) + 32;
        System.out.println(Fahre);
    }
}
