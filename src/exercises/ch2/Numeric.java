package exercises.ch2;

import java.util.Scanner;

public class Numeric {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Rectangle Length:  ");

        double recLength = input.nextDouble();

        System.out.println("Rectangle Width:  ");

        double recWidth = input.nextDouble();

        input.close();

        double recArea = recLength * recWidth;

        System.out.printf("Rectangle\n\tLength: %s\n\tWidth: %s\n\tArea: %s", recLength, recWidth, recArea);
    }
}
