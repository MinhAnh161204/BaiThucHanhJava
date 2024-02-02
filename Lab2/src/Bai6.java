import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soNguyenDuong;

        do {
            System.out.print("Nhap vao mot so nguyen duong: ");
            while (!sc.hasNextInt()) {
                System.out.println("Nhap so nguyen duong.");
                System.out.print("Nhap lai: ");
                sc.next();
            }
            soNguyenDuong = sc.nextInt();
        } while (soNguyenDuong <= 0);

        long giaiThua = tinhGiaiThua(soNguyenDuong);

        System.out.println("Giai thua cua " + soNguyenDuong + " la: " + giaiThua);
    }

    private static long tinhGiaiThua(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
