package Hinhhoc;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {
     public float chieuCao;
    Scanner sc = new Scanner(System.in);
    
    public Hinhtru()
    {
        ten = "Hinh Tru";
    }
    public void nhapChieuCao()
    {
        super.nhapBanKinh();
        System.out.print("Nhap chieu cao: ");
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTich()
    {
        theTich = PI * banKinh * banKinh * chieuCao;
    }
}
