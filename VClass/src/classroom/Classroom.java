package classroom;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private List<Student> students;
    private List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignAssignment(Assignment assignment) {
        assignments.add(assignment);
        for (Student student : students) {
            student.receiveAssignment(assignment);
        }
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
