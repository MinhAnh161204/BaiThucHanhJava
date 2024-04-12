package Slide80chuong3;

public class NhanVien {
    protected String ten;
    protected long luong;

    
    public NhanVien() {
        ten = "";
        luong = 0;
    }
    public NhanVien(String ten) {
        ten = "";
    }

    protected String loaiNhanVien() {
        return "";
    }

    public void xuatThongTin() {
        System.out.println();
        System.out.println("Name : " + ten);
        System.out.println("Position : " + loaiNhanVien());
        System.out.println("Salary : " + luong + "$");
        System.out.println();
    }
}
