package relationships;

import java.util.ArrayList;
import java.util.List;

class Teacher {
    String name;
    List<Student> students;

    Teacher(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
        student.setTeacher(this); // Setting bidirectional link
    }

    void displayStudents() {
        System.out.println("Teacher: " + name);
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
}

class Student {
    String name;
    Teacher teacher;

    Student(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    void displayTeacher() {
        System.out.println("Student: " + name + ", Teacher: " + teacher.name);
    }
}

public class BiDirectionalAssociationExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        teacher.addStudent(student1);
        teacher.addStudent(student2);

        teacher.displayStudents();      // Teacher knows about students
        student1.displayTeacher();      // Students know about the teacher
        student2.displayTeacher();
    }
}
