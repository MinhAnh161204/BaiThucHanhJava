package Slide80chuong3;


public class testChuong80 {
    public static void main(String[] args) {
        NhanVienFulltime sep = new NhanVienFulltime("Hoang Van Sep", 4);
        NhanVienFulltime nhanvien = new NhanVienFulltime("Tran Thi Nhan Vien"); 
        NhanVienFulltime nhanvien2 = new NhanVienFulltime("Nguyen Thi Vien Nhan", 2); 
        NhanVienParttime nhanvien3 = new NhanVienParttime("Nguyen Thi Pat Tham", 150); 

        
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        nhanvien.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        nhanvien2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        
        
        sep.tinhLuong();
        nhanvien.tinhLuong();
        nhanvien2.tinhLuong();
        nhanvien3.tinhLuong();

       
        sep.xuatThongTin();
        nhanvien.xuatThongTin();
        nhanvien2.xuatThongTin();
        nhanvien3.xuatThongTin();
    
    }
}
