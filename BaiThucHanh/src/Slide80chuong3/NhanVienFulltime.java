package Slide80chuong3;

public class NhanVienFulltime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;

    
    public NhanVienFulltime(String ten) {
        this.ten = ten;
    }
    public NhanVienFulltime(String ten, int ngayLamThem) {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien Full Time";
    }

    public void tinhLuong() {
        if(loaiChucVu == Configs.NHAN_VIEN_SEP) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        } else {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}
