package exercises.class3.school;

import java.util.ArrayList;

public class Course {

  private String courseTitle;
  private Double averageGpa;
  private ArrayList<Student> students;

 

  String getCourseTitle() {
    return courseTitle;
  }

  public void setCourseTitle(String aCourseTitle) {
    this.courseTitle = aCourseTitle;
  }

  public static void main(String[] args) {
    Course coding = new Course();
    System.out.println(coding.getCourseTitle());
  }

}
