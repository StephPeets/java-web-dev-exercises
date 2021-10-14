package exercises.class7;

import java.io.PrintStream;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Toppings> toppings = menu.getToppings();
        PrintStream output = System.out;


        output.println("\nBefore:");
        for (Cone cone : cones) {
            output.println(cone.getName() + ": $" + cone.getCost());
        }

        cones.sort(new ConeComparator());

        output.println("\nAfter:");
        for (Cone cone : cones) {
            output.println(cone.getName() + ": $" + cone.getCost());
        }


        output.println("\nBefore:");

        for (Flavor item : flavors) {
            output.println(item.getName());
        }

        flavors.sort(new FlavorComparator());

        output.println("\nAfter:");
        for (Flavor item : flavors) {
            System.out.println(item.getName());
        }

        System.out.println("\nBefore:");

        for (Flavor item : flavors) {
            output.println(item.getName() + " Allergens: " + item.getAllergens());
        }

        flavors.sort(new AllergenComparator());

        output.println("\nAfter:");
        for (Flavor item : flavors) {
            output.println(item.getName() + " Allergens: " + item.getAllergens());
        }

        System.out.println("\nBefore:");

        for (Toppings item : toppings) {
            output.println(item.getName());
        }

        toppings.sort(new ToppingsComparator());

        output.println("\nAfter:");
        for (Toppings item : toppings) {
            output.println(item.getName());
        }
    }




    }



