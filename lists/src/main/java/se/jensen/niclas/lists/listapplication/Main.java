package se.jensen.niclas.lists.listapplication;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Javautvecklare");
        Student student1 = new Student("Niclas", "13");
        Student student2 = new Student("Ida", "20");
        Student student3 = new Student("Hannah", "26");
        Student student4 = new Student("Lars", "28");
        Student student5 = new Student("Hasse", "33");

        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);
        course.addStudent(student5);


        course.printStudents();

//        course.printStudent("33");


    }
}
