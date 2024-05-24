package Lists;


import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        Student.addStudent(students, n);
        System.out.println("Student list: ");
        Student.displayStudents(students);

        Student.updateStudent(students);
        System.out.println("Student list after updating: ");
        Student.displayStudents(students);

        Student.deleteStudent(students);
        System.out.println("List of students after deletion: ");
        Student.displayStudents(students);

    }   
}

