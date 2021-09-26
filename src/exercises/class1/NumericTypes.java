package exercises.class1;

import java.util.Scanner;

public class NumericTypes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Miles driven:  ");

        double milesDriven = input.nextDouble();

        System.out.println("Gallons of gas used:  ");

        double gasUsed = input.nextDouble();

        input.close();

        double milesPerGallon = milesDriven / gasUsed;

        System.out.printf("Miles driven: %s\nGallons of gas: %s\n\tMiles per gallon: %s", milesDriven, gasUsed, milesPerGallon);
    }
}
