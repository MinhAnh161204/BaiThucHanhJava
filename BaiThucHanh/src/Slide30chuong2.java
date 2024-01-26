import java.util.Scanner;

public class Slide30chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, soDu, tong = 0;
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu; 
        }
        System.out.print("Tong cac chu so la: "+ tong);
    }
}
