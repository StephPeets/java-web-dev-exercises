package exercises;

import java.util.ArrayList;

public class Ex372ArrayListPractice {

  public static void main(String[] args) {
    ArrayList<Integer> practiceList = new ArrayList<>();
    practiceList.add(1);
    practiceList.add(2);
    practiceList.add(3);
    practiceList.add(4);
    practiceList.add(5);
    practiceList.add(6);
    practiceList.add(7);
    practiceList.add(8);
    practiceList.add(9);
    practiceList.add(10);

    System.out.println(practiceList);

    int totalNums = tenNumsMethod.addNums(practiceList);

    System.out.println(totalNums);

    

  }
}
