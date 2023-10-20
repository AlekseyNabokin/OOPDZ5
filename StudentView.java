package view;

import model.Student;

public class StudentView {
    public void displayStudent(Student student) {
        System.out.println("Name: " + student.getFullName());
        System.out.println("Birth Year: " + student.getBirthYear());
        System.out.println("Student ID: " + student.getStudentId());
    }
}
