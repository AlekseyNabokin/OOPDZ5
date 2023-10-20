package model;

public class Teacher extends User {
    private int teacherId;

    public Teacher(String fullName, int birthYear, int teacherId) {
        super(fullName, birthYear);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }
}