package se.jensen.niclas.lists.listapplication;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students) {
            student.printInfo();

        }
    }

    public void printStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.printInfo();
                break;
            }


        }
    }
}
