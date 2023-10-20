package controller;

import model.Student;
import model.StudentGroup;
import model.Teacher;
import model.User;
import service.DataService;
import service.StudentGroupService;
import view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private DataService dataService;
    private StudentView studentView;
    private StudentGroupService studentGroupService;

    public Controller() {
        dataService = new DataService();
        studentView = new StudentView();
        studentGroupService = new StudentGroupService();
    }

    public void createStudent(String fullName, int birthYear) {
        int studentId = generateStudentId();
        Student student = new Student(fullName, birthYear, studentId);
        dataService.createUser(student);
    }

    public List<Student> getAllStudents() {
        List<User> users = dataService.getAllUsers();
        List<Student> students = new ArrayList<>();

        for (User user : users) {
            if (user instanceof Student) {
                students.add((Student) user);
            }
        }

        return students;
    }

    public void displayStudents(List<Student> students) {
        for (Student student : students) {
            studentView.displayStudent(student);
        }
    }

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return studentGroupService.createStudentGroup(teacher, students);
    }

    private int generateStudentId() {
        List<User> users = dataService.getAllUsers();
        int maxId = 0;

        for (User user : users) {
            if (user instanceof Student) {
                int studentId = ((Student) user).getStudentId();
                if (studentId > maxId) {
                    maxId = studentId;
                }
            }
        }

        return maxId + 1;
    }
}