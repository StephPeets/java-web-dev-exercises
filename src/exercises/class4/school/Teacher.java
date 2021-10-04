package exercises.class4.school;

import java.util.Objects;

public class Teacher {

  private String firstName;
  private String lastName;
  private String subject;
  private int yearsTeaching;
  private String fullName;

  public Teacher() {

  }

  public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.subject = subject;
    this.yearsTeaching = yearsTeaching;
    this.fullName = firstName + " " + lastName;
  }

  public String getFullName() {
    return this.fullName;
  }

  public void setFullName(String firstName, String lastName) {
    this.fullName = firstName + " " + lastName;
  }

  public String getFirstName() {
    if (this.fullName != null) {
      firstName = this.getFullName().split(" ")[0];
      return firstName;
    } else {
      return this.firstName;
    }
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    if (this.fullName != null) {
      lastName = this.getFullName().split(" ")[1];
      return lastName;
    } else {
      return this.lastName;
    }
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public int getYearsTeaching() {
    return this.yearsTeaching;
  }

  public void setYearsTeaching(int yearsTeaching) {
    this.yearsTeaching = yearsTeaching;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this)
      return true;
    if (!(obj instanceof Teacher)) {
      return false;
    }
    Teacher teacher = (Teacher) obj;
    return Objects.equals(firstName, teacher.firstName) && Objects.equals(lastName, teacher.lastName)
        && Objects.equals(subject, teacher.subject) && Objects.equals(yearsTeaching, teacher.yearsTeaching)
        && Objects.equals(fullName, teacher.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, subject, yearsTeaching, fullName);
  }

  @Override
  public String toString() {
    return "{" + " firstName='" + getFirstName() + "'" + ", lastName='" + getLastName() + "'" + ", subject='"
        + getSubject() + "'" + ", yearsTeaching='" + getYearsTeaching() + "'" + ", fullName='" + getFullName() + "'"
        + "}";
  }

  public static void main(String[] args) {
    Teacher teach = new Teacher("Teach", "McTeacher", "Math", 5);
    System.out.println(teach.toString());

  }

}
