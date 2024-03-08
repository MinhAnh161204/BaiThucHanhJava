import java.util.Scanner;

public class Slide90chuong2 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ky: ");
        chuoi =  sc.nextLine();
        System.out.println("Cac ky tu co trong chuoi la: ");
        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }
    }
}
