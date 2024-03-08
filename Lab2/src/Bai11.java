import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();

        int[] A = new int[n];

        nhapMang(A, scanner);

        System.out.println("Mang ban dau: " + Arrays.toString(A));

        Arrays.sort(A);

        System.out.println("Mang da sap xep: " + Arrays.toString(A));
    }

    public static void nhapMang(int[] arr, Scanner scanner) {
        System.out.println("Nhap phan tu cho mang:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }
}
