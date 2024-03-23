package Hinhhoc;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc {
     public float dai;
    public float rong;
    Scanner sc = new Scanner(System.in);

    public Hinhchunhat()
    {
        ten = "Hinh Chu Nhat";
    }
    public void nhapChieuDai()
    {
        System.out.print("Nhap chieu dai: ");
        dai = sc.nextFloat();
    }
    public void nhapChieurong()
    {
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextFloat();
    }
    public void tinhChuVi()
    {
        chuVi = (dai + rong) * 2;
    }
    public void tinhDienTich()
    {
        dienTich = dai * rong;
    }

}
