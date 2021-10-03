package exercises.class3.school;

public class Teacher {

  private String firstName;
  private String lastName;
  private String subject;
  private String yearsTeaching;
  private String fullName;

  public Teacher() {

  }

  public Teacher(String firstName, String lastName, String subject, String yearsTeaching) {
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

  public String getYearsTeaching() {
    return this.yearsTeaching;
  }

  public void setYearsTeaching(String yearsTeaching) {
    this.yearsTeaching = yearsTeaching;
  }

  public static void main(String[] args) {

  }

}
