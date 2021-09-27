package org.launchcode.java.class2studio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


// import java.util.Set;

public class countingCharacters {

  public static Scanner input = new Scanner(System.in);

  // public static 

  public static String hiddenFiguresStr =
      "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

    public static char[] strToChArr(String str) {
      char[] chArr = str.toCharArray();
      return chArr;
    } 

    public static HashMap<Character, Integer> userHMap = new HashMap<>();

  public static void main(String[] args) {

    System.out.println("Enter a phrase: ");

    String userString = input.nextLine();
    input.close();
    userString = userString.toLowerCase();

    userString = userString.replaceAll("[^a-z]", "");

    iterateCharacters.iterateThroughCharArray(strToChArr(userString), userHMap);

    for (Map.Entry<Character, Integer> entry : userHMap.entrySet()) {
      System.out.println(entry);
    };
  }
}
