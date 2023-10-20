package model;

public class Student extends User {
    private int studentId;

    public Student(String fullName, int birthYear, int studentId) {
        super(fullName, birthYear);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}
