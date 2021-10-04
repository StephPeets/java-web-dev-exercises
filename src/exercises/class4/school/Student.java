package exercises.class4.school;

import java.util.Objects;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Student))
            return false;

        Student student = (Student) obj;
        return Objects.equals(name, student.name) && studentId == student.studentId
                && numberOfCredits == student.numberOfCredits && gpa == student.gpa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa);
    }

    @Override
    public String toString() {
        String credits = this.numberOfCredits == 1 ? "credit" : "credits";

        String studentReport = String.format("%s is a %s with %d %s and a GPA of %.2f", this.name, this.getGradeLevel(),
                this.getNumberOfCredits(), credits, this.getGpa());

        return studentReport;
    }

    public String getGradeLevel() {

        String gradeLevel = 
        numberOfCredits < 0 ? "Please enter valid number of credits." : numberOfCredits <= 29 ? "Freshman" : 
        numberOfCredits <= 59 ? "Sophomore" : 
        numberOfCredits <= 89 ? "Junior" : 
        "Senior";

        return gradeLevel;
    }

    public void addGrade(double classGrade, int classCredits) {
        double initialQualityScore = this.getGpa() * this.getNumberOfCredits();
        double qualityScore = classGrade * classCredits;
        double totalQualityScore = initialQualityScore + qualityScore;
        double totalCredits = this.getNumberOfCredits() + classCredits;
        double newGpa = totalQualityScore / totalCredits;
        this.setGpa(newGpa);
        this.setNumberOfCredits(classCredits);

    }

    public static void main(String[] args) {

        Student steph = new Student("Steph", 123456, 1, 4.0);
        Student steph2 = new Student("Steph", 123456, 2, 4.0);

        System.out.println(steph2.getNumberOfCredits());
        System.out.println(steph2);
        steph2.addGrade(2.0, 4);
        System.out.println(steph2);

    }
}