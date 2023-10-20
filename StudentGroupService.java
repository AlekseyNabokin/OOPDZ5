package service;

import model.Student;
import model.StudentGroup;
import model.Teacher;

import java.util.List;

public class StudentGroupService {
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return new StudentGroup(teacher, students);
    }
}
