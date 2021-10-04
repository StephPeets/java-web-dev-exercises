package exercises.class4.school;

import java.util.ArrayList;
import java.util.Objects;

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

  @Override
  public String toString() {
    return "{" +
      " courseTitle='" + getCourseTitle() + "'" +
      ", averageGpa='" + getAverageGpa() + "'" +
      ", teacher='" + getTeacher() + "'" +
      ", students='" + getStudents() + "'" +
      "}";
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Course)) {
            return false;
        }
        Course course = (Course) o;
        return Objects.equals(courseTitle, course.courseTitle) && Objects.equals(averageGpa, course.averageGpa) && Objects.equals(teacher, course.teacher) && Objects.equals(students, course.students);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseTitle, averageGpa, teacher, students);
  }

  public static void main(String[] args) {
    Course coding = new Course();
    coding.courseTitle = "Coding";
    System.out.println(coding.getCourseTitle());

    Student steph = new Student("Steph", 123456, 1, 4.0);
    steph.setStudentId(456789);
    System.out.println(steph.getStudentId());

    Teacher jodie = new Teacher();
    jodie.setFullName("Jodie", "Longacre");
    coding.setTeacher(jodie);
    System.out.println(coding.getTeacher());
  }

}
