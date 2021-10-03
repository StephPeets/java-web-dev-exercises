package exercises.class3.school;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, double gpa){
        this.gpa = gpa;
        this.studentId = studentId;
    }

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
        this.gpa = aGpa;
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

        Student steph = new Student("Steph", 123456, 4.0);
        steph.setNumberOfCredits(5);
        steph.gpa = 2.0;
        // steph.numberOfCredits = 2;
        // steph.name = "john";
        System.out.println(steph.getNumberOfCredits());
        System.out.println(steph.getName());

    }
}