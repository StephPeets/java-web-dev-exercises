package exercises;

import java.util.Arrays;

public class Ex3713SplitArray {

    static String saucy = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";

    static String[] saucyArray = saucy.split("\\. ");

    static String saucyString = Arrays.toString(saucyArray);

  public static void main(String[] args) {


    System.out.println(saucyString);
    
    for ( String sauce : saucyArray) {
        System.out.println(sauce + ".");

    }
  }
}
