import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        SinhVien Tinh = new Student().new SinhVien();
        Tinh.NhapThongTin();
        Tinh.tinhDiemTongKet();
        Tinh.InThongTin();
    }
    class SinhVien {
        Scanner sc = new Scanner(System.in);
         String Ten;
         String Lop;
         double Diem;
         double diemA, diemB, diemC;
        
        void NhapThongTin() {
            System.out.println("Nhap thong tin sinh vien: ");
            System.out.println("Nhap ten sinh vien: ");
             Ten = sc.nextLine();
            System.out.println("Lop : ");
             Lop = sc.nextLine();
            System.out.print("Nhap diemA: ");
             diemA = sc.nextDouble();
            System.out.print("Nhap diemB: ");
             diemB = sc.nextDouble();
            System.out.print("Nhap diemC: ");
             diemC = sc.nextDouble();
    }
   
    void tinhDiemTongKet() {
         Diem = (diemA + diemB + diemC) / 3;
    }
    void InThongTin() {
        System.out.println("Thong tin sinh vien: ");
        System.out.println("Ten sinh vien" + Ten);
        System.out.println("Lop " + Lop);
        System.out.println("Diem tong ket cua sinh vien la : " +Diem);

    } 
}
}
