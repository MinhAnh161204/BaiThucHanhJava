package Slide80chuong3;

public class NhanVienParttime extends NhanVien {
    private int gioLamViec;

    public NhanVienParttime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien Part Time";
    }

    public void tinhLuong() {
        luong = gioLamViec * Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO;
    }
}
