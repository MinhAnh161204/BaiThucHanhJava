import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua day so: ");
        int n = scanner.nextInt();
        int[] daySo = new int[n];
        nhapDaySo(daySo, scanner);

        double trungBinhCong = tinhTrungBinhCong(daySo);
        System.out.println("Trung binh cong cua day so la: " + trungBinhCong);
    }

    public static void nhapDaySo(int[] daySo, Scanner scanner) {
        System.out.println("Nhap day so:");
        for (int i = 0; i < daySo.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            daySo[i] = scanner.nextInt();
        }
    }

    public static double tinhTrungBinhCong(int[] daySo) {
        int tong = 0;

        for (int i = 0; i < daySo.length; i++) {
            tong += daySo[i];
        }

        return (double) tong / daySo.length;
    }
}
