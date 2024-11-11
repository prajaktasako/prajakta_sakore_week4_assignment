package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(int id, String name) {
        students.add(new Student(id, name));
        System.out.println("Student added: " + name);
    }

    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
        System.out.println("Student with ID " + id + " removed.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            students.forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        manager.addStudent(1, "Prajakta");
        manager.addStudent(2, "Divya");

        System.out.println("Displaying students:");
        manager.displayStudents();

        manager.removeStudent(1);
        System.out.println("Displaying students after removal:");
        manager.displayStudents();
    }

}
