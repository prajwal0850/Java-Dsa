package com.prajwal;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

//        System.out.println("Enter a Fruit");
//        String fruit=in.next();
//
//        switch (fruit){
//
//            case "Mango":
//                System.out.println("King Of Fruits");
//                break;
//            case "Apple":
//                System.out.println("Are Red Fruit");
//                break;
//            case "Orange":
//                System.out.println("A Round Fruit");
//                break;
//            case "Grapes":
//                System.out.println("A sour Fruit");
//                break;
//            default:
//                System.out.println("Please Enter A Valid Fruit");
//        }

//            Enhanced Switch Case Statement
//        switch (fruit) {
//            case "Mango" -> System.out.println("King Of Fruits");
//            case "Apple" -> System.out.println("Are Red Fruit");
//            case "Orange" -> System.out.println("A Round Fruit");
//            case "Grapes" -> System.out.println("A sour Fruit");
//            default -> System.out.println("Please Enter A Valid Fruit");
//        }

        System.out.println("Enter Any no 1 to 7");
        int day=in.nextInt();

//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Enter Valid Number");
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Its WeekDays");
            case 6, 7 -> System.out.println("Its Weekend");
            default -> System.out.println("Enter Valid Number");
        }

    }
}