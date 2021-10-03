package exercises.class3.school;

import java.util.ArrayList;

public class Course {

  private String courseTitle;
  private Double averageGpa;
  private Teacher teacher;
  private ArrayList<Student> students;

  public Double getAverageGpa() {
    return this.averageGpa;
  }

  public void setAverageGpa(Double averageGpa) {
    this.averageGpa = averageGpa;
  }

  public ArrayList<Student> getStudents() {
    return this.students;
  }

  public void setStudents(ArrayList<Student> students) {
    this.students = students;
  }

  String getCourseTitle() {
    return courseTitle;
  }

  public void setCourseTitle(String aCourseTitle) {
    this.courseTitle = aCourseTitle;
  }

  public String getTeacher() {
    return teacher.getFullName();
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public static void main(String[] args) {
    Course coding = new Course();
    coding.courseTitle = "Coding";
    System.out.println(coding.getCourseTitle());

    Student steph = new Student("Steph", 123456, 4.0);
    steph.setStudentId(4);
    System.out.println(steph.getStudentId());

    Teacher jodie = new Teacher();
    jodie.setFullName("Jodie", "Longacre");
    coding.setTeacher(jodie);
    System.out.println(coding.getTeacher());
  }

}
