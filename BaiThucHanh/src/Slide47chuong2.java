import java.util.Scanner;

/**
 * Slide47chuong2
 */
public class Slide47chuong2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tong = 0;

        while (tong <= 100) {
            System.out.print("Nhap gia tri n: ");
            n = sc.nextInt();
            tong += n;
            System.out.println("Tong cac so da nhap la: " + tong);
        }
            System.out.println("Tong cac so da nhap sau vong lap la: " + tong);
    }
}
