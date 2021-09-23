package exercises;

import java.util.Arrays;

public class Ex371ArrayPractice {

  public static void main(String[] args) {
    int[] arr371 = new int[6];

    arr371[0] = 1;
    arr371[1] = 1;
    arr371[2] = 2;
    arr371[3] = 3;
    arr371[4] = 5;
    arr371[5] = 8;

    int[] arr3711 = { 1, 1, 2, 3, 5, 8 };

    for (int num : arr371) {
      System.out.println(num);
    }

    System.out.println(Arrays.toString(arr371));
    
    System.out.println(Arrays.toString(arr3711));

    System.out.println(arr371.length);

    System.out.println(arr371.length);
  }
}
