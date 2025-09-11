package se.jensen.niclas.lists.listapplication;

public class Student {
    private String name;
    private String studentId;


    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;

    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }


    public void printInfo() {
        System.out.println("Namn: " + name);
        System.out.println("Student id: " + studentId);
    }


}
