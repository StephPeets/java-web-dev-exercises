package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

//        double radius = -1;
//
//        double PI = 3.14;

//        Scanner input = new Scanner(System.in);
//
//        do {
//            System.out.println("Enter a radius:");
//
//            if (!input.hasNextDouble()) {
//
//                String val = input.nextLine();
//                System.out.println("Invalid Input:  " + val);
//            }
//
//        }
//        while (radius <= 0);
//
//
//        radius = input.nextDouble();
//        input.close();
//        double area = Circle.getArea(radius);
//
//        System.out.println("The area of a circle " + radius + " is " + area);
//    }
//}

        Scanner input = new Scanner(System.in);
        double r = 0;
        do {
            System.out.println("Enter circle radius: ");
            if (input.hasNextDouble()) {
                r = input.nextDouble();
                if (r <= 0) {
                    System.out.println("Please choose a positive number");
                }
            } else {
                String stringValue = input.next();
                System.out.println(stringValue + " is not a valid radius");
            }
        } while (r <= 0);
        double area = Circle.getArea(r);
        System.out.println("Area is " + area);
    }
}