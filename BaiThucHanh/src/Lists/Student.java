package Lists;

import java.util.LinkedList;
import java.util.Scanner;

public class Student {
    private String fullName;
    private int age;

    // Constructor
    public Student() {}

    public Student(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to input student information
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        this.fullName = sc.nextLine();
        System.out.print("Enter age: ");
        this.age = sc.nextInt();
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Full Name: " + this.fullName);
        System.out.println("Age: " + this.age);
    }

    // Method to update student information
    public void updateInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new full name: ");
        this.fullName = sc.nextLine();
        System.out.print("Enter new age: ");
        this.age = sc.nextInt();
    }

    // Method to add a student to the list
    public static void addStudent(LinkedList<Student> students, int n) {
      for(int i = 0; i < n; i++) {
         Student newStudent = new Student();
         newStudent.inputInfo();
         students.add(newStudent);
      }    
    }

    // Method to update a student in the list
    public static void updateStudent(LinkedList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the information you want to update: ");
        String fName = sc.nextLine();
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).fullName.equals(fName)) {
               Student std = new Student();
               std.inputInfo();
               students.set(i, std);
            }
        }
    }

    // Method to delete a student from the list
    public static void deleteStudent(LinkedList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the information you want to delete: ");
        String fName = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).fullName.equals(fName)) {
               students.remove(i);
            }
        } 
    }

    // Method to display all students in the list
    public static void displayStudents(LinkedList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student " + (i + 1) + ":");
            students.get(i).displayInfo();
        }
    }
}
