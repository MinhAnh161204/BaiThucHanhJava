import java.util.Scanner;

public class PhuongTrinhBacMot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap b: ");
        double b = sc.nextDouble();


        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Khong phai la phuong trinh bac nhat.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la x = " + x);
        }
        sc.close();
    }
}