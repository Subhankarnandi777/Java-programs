import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    String grade() {
        if(marks >= 90) return "A";
        else if(marks >= 80) return "B";
        else if(marks >= 70) return "C";
        else return "D";
    }

    void display() {
        System.out.println(id + " " + name + " " + marks + " Grade: " + grade());
    }
}

class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Rahul", 85));
        list.add(new Student(2, "Amit", 92));
        list.add(new Student(3, "Riya", 76));

        for(Student s : list) {
            s.display();
        }
    }
}
