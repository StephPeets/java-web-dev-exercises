package exercises.class3.school;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public void setName(String aName) {
        this.name = aName;
    }

    public void setStudentId(int aStudentId) {
        this.studentId = aStudentId;
    }

    private void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    public void setGpa(Double aGpa) {
        gpa = aGpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public Double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {

        Student steph = new Student();

        steph.setName("Steph");
        steph.setStudentId(123456);
        steph.setNumberOfCredits(1);
        steph.setGpa(4.0);

        System.out.println(steph.getNumberOfCredits());

    }
}