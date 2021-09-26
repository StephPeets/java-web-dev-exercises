package exercises.class3;

import java.util.Arrays;

public class Ex371ArrayPractice {

  public static void main(String[] args) {
    int[] arrayOne = new int[6];

    arrayOne[0] = 1;
    arrayOne[1] = 1;
    arrayOne[2] = 2;
    arrayOne[3] = 3;
    arrayOne[4] = 5;
    arrayOne[5] = 8;

    System.out.println(Arrays.toString(arrayOne));

    for (int num : arrayOne) {
      if (num % 2 != 0) {
        System.out.println(num);
      }
    }
    // int[] arrayInputAsSet = { 1, 1, 2, 3, 5, 8 };

    // justOddNums(arrayOne);

    // System.out.println(Arrays.toString(arrayInputAsSet));

    // System.out.println(arrayOne.length);
  }
}
