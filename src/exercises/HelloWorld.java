package exercises;

import java.util.Scanner;

public class HelloWorld {

    public static void main() {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println("Hello, what is your name:  ");

        System.out.println("Hello " + name);
    }
}
