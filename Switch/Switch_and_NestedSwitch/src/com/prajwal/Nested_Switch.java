package com.prajwal;

import java.util.Scanner;

public class Nested_Switch {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        System.out.println("Enter EmpID");
        int EmpID=in.nextInt();
        String Department=in.next();


        switch (EmpID) {
            case 1 -> System.out.println("Prajwal Patil");
            case 2 -> System.out.println("Atharav Kharade");
            case 3 -> {
                System.out.println("Employee No 3");
                switch (Department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Enter Valid Department");
                }
            }
            default -> System.out.println("Enter Valid EmpID");
        }

    }
}
