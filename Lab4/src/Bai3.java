import java.util.LinkedList;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> listStudent = new LinkedList<>();

        while (true) {
            Student newStudent = new Student(null, 0);
            System.out.print("Nhap ten sinh vien: ");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Nhap diem cua sinh vien: ");
            double score = sc.nextDouble();
            listStudent.add(newStudent);
            
        }
        int countRetake = 0;
        for (Student st : listStudent) {
            if (st.score <= 5) {
                System.out.println(st);
                countRetake++;
            }
        }
        System.out.println("So sinh vien thi lai: " + countRetake);

        if (!listStudent.isEmpty()) {
            double maxScore = listStudent.getFirst().score;
            for (Student st : listStudent) {
                if (st.score > maxScore) {
                    maxScore = st.score;
                }
            }
            System.out.println("Sinh vien co diem cao nhat la: " + maxScore);
            for (Student st : listStudent) {
                if (st.score == maxScore) {
                    System.out.println(st);
                }
            }
        }
        System.out.println("Nhap ten sinh vien can tim: ");
        String searchName = sc.nextLine();
        boolean found = false;
        for (Student st : listStudent) {
            if (st.name.equalsIgnoreCase(searchName)) {
                System.out.println("Thong tin sinh vien tim thay: " + st);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co ten: " + searchName);
        }
    }
    public static class Student {
        String name;
        double score;
    
        public Student (String name, double score) {
            this.name = name;
            this.score = score;
        }
    }
}

