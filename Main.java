import controller.Controller;
import model.Student;
import model.StudentGroup;
import model.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("John Smith", 1999);
        controller.createStudent("Emma Johnson", 2001);
        controller.createStudent("Michael Brown", 2000);

        List<Student> allStudents = controller.getAllStudents();

        controller.displayStudents(allStudents);

        Teacher teacher = new Teacher("Jane Doe", 1985, 1);

        StudentGroup studentGroup = controller.createStudentGroup(teacher, allStudents);

    }

}