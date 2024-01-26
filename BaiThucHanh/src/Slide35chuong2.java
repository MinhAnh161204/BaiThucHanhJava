import java.util.Scanner;

public class Slide35chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        System.out.print("Nhap vao so thu nhat: ");
        n1 = sc.nextInt();
        System.out.print("Nhap vao so thu hai: ");
        n2 = sc.nextInt();
        int min = n1;
        if (n1 > n2){
            min = n2;
        }
        System.out.println("So nho nhat trong hai so " + n1 + " va " + n2 + " la " + min);
    }
}
