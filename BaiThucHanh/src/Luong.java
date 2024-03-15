import java.util.Scanner;


public class Luong {
    public static void main(String[] args) {
        Employee t = new Luong().new Employee();
        t.NhapThongTin();
        t.tinhLuong();
        t.InThongTin();
        
    }
    class Employee {
        Scanner sc = new Scanner(System.in);
        String Ten;
        int namSinh;
        int tienLuong;
        final float luong1h = 20000f;
        int soGioLam;

        void NhapThongTin() {
            System.out.println("Nhap thong tin: ");
            System.out.print("Nhap ten nhan vien: ");
            Ten = sc.nextLine();
            System.out.print("Nhap nam sinh: ");
            namSinh = sc.nextInt();
            System.out.print("So gio lam la: ");
            soGioLam = sc.nextInt();
        }
        void tinhLuong() {
            tienLuong = 20000 * soGioLam;
        }
        void InThongTin() {
          System.out.println("Thong tin nhan vien: ");
          System.out.println("Ten: " + Ten);
          System.out.println("Nam sinh: " + namSinh);
          System.out.println("Tien luong cua nhan vien la: " + tienLuong);
        }
    }
}
