import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi khong qua 80 ky tu: ");
        String chuoi = scanner.nextLine();

        if (chuoi.length() > 80) {
            System.out.println("Khong hop le.");
            return;
        }

        System.out.print("Nhap mot ky tu can dem: ");
        char kyTuCanDem = scanner.next().charAt(0);

        int soLanXuatHien = demSoLanXuatHien(chuoi, kyTuCanDem);
        System.out.println("So lan xuat hien cua ky tu '" + kyTuCanDem + "' trong chuoi la: " + soLanXuatHien);
    }

    public static int demSoLanXuatHien(String chuoi, char kyTuCanDem) {
        int dem = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTuCanDem) {
                dem++;
            }
        }

        return dem;
    }
}
