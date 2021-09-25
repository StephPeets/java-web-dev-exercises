package exercises;

import java.util.ArrayList;

public class tenNumsMethod {

  public static int addNums(ArrayList<Integer> practiceList) {
    int total = 0;
    for (int integer : practiceList) {
      if (integer % 2 == 0) {
        total += integer;
      }
    }
    return total;
  }
}
