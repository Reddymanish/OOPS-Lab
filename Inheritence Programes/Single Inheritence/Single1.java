class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    int studentId;

    void showStudentInfo() {
        System.out.println("Student ID: " + studentId);
    }
}

public class Single1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Alice";
        s.age = 20;
        s.studentId = 101;
        s.display();
        s.showStudentInfo();
    }
}