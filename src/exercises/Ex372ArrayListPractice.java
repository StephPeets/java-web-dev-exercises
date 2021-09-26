package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex372ArrayListPractice {


  // "I would not, could not, in a box. I would not, could not with a fox.
  // I will not eat them in a house. I will not eat them with a mouse";

  public static int addNums(ArrayList<Integer> practiceList) {
    int total = 0;
    for (int integer : practiceList) {
      if (integer % 2 == 0) {
        total += integer;
      }
    }
    return total;
  }

  public static ArrayList<String> fiveLetters(ArrayList<String> arr) {
    ArrayList<String> fiveLetterWords = new ArrayList<>();
    for (String word : arr) {
      if (word.length() == 5) {
        fiveLetterWords.add(word);
      }
    }
    return fiveLetterWords;
  }

  public static ArrayList<String> userPicksLetters(ArrayList<String> arr) {
    ArrayList<String> userMatch = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    System.out.println("Number of letters:  ");
    double userChoice = input.nextDouble();
    input.close();
    for (String word : arr) {
      if (word.length() == userChoice) {
        userMatch.add(word);
      }
    }
    return userMatch;
  }

  public static void main(String[] args) {
    

    String practiceString = exercises.Ex3713SplitArray.saucy;

    String splitStr[] = practiceString.split(" ");
    ArrayList<String> stringToAL = new ArrayList<String>(Arrays.asList(splitStr));
    
    System.out.print(stringToAL);
    System.out.print(userPicksLetters(stringToAL));


  
    // System.out.print(stringToAL);
    // ArrayList<String> wordArray = new ArrayList<>();
    // wordArray.add("1");
    // wordArray.add("12");
    // wordArray.add("123");
    // wordArray.add("1234");
    // wordArray.add("12345");
    // wordArray.add("123456");
    // wordArray.add("niner");
    // wordArray.add("nty");
    // wordArray.add("ve");
    // wordArray.add("abcde");

    // System.out.print(userPicksLetters(wordArray));

    // ArrayList<Integer> practiceList = new ArrayList<>();

    // practiceList.add(1);
    // practiceList.add(2);
    // practiceList.add(3);
    // practiceList.add(4);
    // practiceList.add(5);
    // practiceList.add(6);
    // practiceList.add(7);
    // practiceList.add(8);
    // practiceList.add(9);
    // practiceList.add(10);

    // System.out.println(practiceList);

    // int totalNums = addNums(practiceList);

    // System.out.println(totalNums);
  }
}
