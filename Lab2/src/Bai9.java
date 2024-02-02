import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        String chuoi = sc.nextLine();

        int soKyTuThuong = 0;
        int soKyTuHoa = 0;
        int soChuSo = 0;

        for (char kyTu : chuoi.toCharArray()) {
            if (Character.isLowerCase(kyTu)) {
                soKyTuThuong++;
            } else if (Character.isUpperCase(kyTu)) {
                soKyTuHoa++;
            } else if (Character.isDigit(kyTu)) {
                soChuSo++;
            }
        }

        System.out.println("So ky tu thuong: " + soKyTuThuong);
        System.out.println("So ky tu hoa: " + soKyTuHoa);
        System.out.println("So chu so: " + soChuSo);
    }
}
