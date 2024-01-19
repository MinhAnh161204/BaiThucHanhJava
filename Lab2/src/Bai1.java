/**
 * Bai1
 */
import java.util.Scanner;
public class Bai1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Nhap a =");
    double a = sc.nextDouble();
    System.out.print("Nhap b =");
    double b = sc.nextDouble();


    double Tong = a + b;
    System.out.println("Tong cua hai so la Tong =" + Tong);
    double Hieu = a - b;
    System.out.println("Hieu cua hai so la Hieu =" + Hieu);
    double Tich = a * b;
    System.out.println("Tich cua hai so la Tich =" + Tich);
    double Thuong = a / b;
    System.out.println("Thuong cua hai so la Thuong =" + Thuong);
    double Chia = a % b;
    System.out.println("Chia lay du cua hai so la Chia =" + Chia);
     
    if (a > b){
        System.out.println("a lon hon b.");
    } else if (a < b){
        System.out.println("a be hon b.");
    } else {
        System.out.println("a bang b.");
    }
    sc.close();
}
}
