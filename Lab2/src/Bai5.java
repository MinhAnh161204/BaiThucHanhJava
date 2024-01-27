import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, tong = 0;
        String str = "";
        while (tong <= 100) {
            System.out.print("Nhap gia tri n: ");
            n = sc.nextInt();
            tong += n;
            str = str + n + " + ";

        }
            str = str.substring(0,str.length()-2);
            System.out.println(str + "= " + tong);
    }
}
