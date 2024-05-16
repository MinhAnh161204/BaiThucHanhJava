package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberStudent;
        System.out.println("Type number student: ");
        numberStudent = sc.nextInt();
        ArrayList<Student> arrListSt = new ArrayList<>(numberStudent);
    }
}
