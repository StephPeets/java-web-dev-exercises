package exercises;

import java.util.Arrays;

public class Ex3713SplitArray {

  public static void main(String[] args) {
    String saucy =
      "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";

    String[] saucyArray = saucy.split("\\. ");

    System.out.println(Arrays.toString(saucyArray));
    
    for ( String sauce : saucyArray) {
        System.out.println(sauce + ".");

    }
  }
}
