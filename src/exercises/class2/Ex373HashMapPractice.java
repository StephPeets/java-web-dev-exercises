package exercises.class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// import java.util.Set;

public class Ex373HashMapPractice {

   public static HashMap<String, Integer> students = new HashMap<>();
   public static Scanner input = new Scanner(System.in);
   public static String newStudent;

    // Get student names and grades
  public static String getNamesAndIDs() {
        do {
      System.out.print("Student: ");
      newStudent = input.nextLine();

      if (!newStudent.equals("")) {
        System.out.print("Student ID: ");
        Integer studentID = input.nextInt();
        students.put(newStudent, studentID);

        // Read in the newline before looping back
        input.nextLine();
        
      }

    } while (!newStudent.equals(""));
      input.close();
      return newStudent;
  }


  public static void main(String[] args) {

    System.out.println("Enter your students (or ENTER to finish):");
    
    getNamesAndIDs();


    // Print class roster
    System.out.println("\n*************");
    System.out.println("Class roster:");

 

    for (Map.Entry<String, Integer> student : students.entrySet()) {
      System.out.println("Name: " + student.getKey() + "  Student ID: " + student.getValue());
  
    }
		

    System.out.println("*************\n");

  }
}
