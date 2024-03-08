import java.util.Scanner;

public class Slide16chuong3 {
   public class HinhTron {
        float r;
    float cv;
    float dt;
    final float PI = 3.14f;
    void nhapBanKinh() {
        System.out.print("Nhap ban kinh cua hinh tron: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }
    void tinhChuVi() {
        cv = 2 * PI * r;
    }
    void tinhDienTich() {
        dt = PI * r * r;
    }
    void inChuVi() {
        System.out.println("Chu vi cua hinh tron la: "+ cv);
    }
    void inDienTich() {
        System.out.println("Dien tich cua hinh tron la: "+ dt);
    }
}
    public static void main(String[] args) {
        HinhTron Tinh = new Slide16chuong3().new HinhTron();
        Tinh.nhapBanKinh();
        Tinh.tinhChuVi();
        Tinh.tinhDienTich();
        Tinh.inChuVi();
        Tinh.inDienTich();
    
}
    }
