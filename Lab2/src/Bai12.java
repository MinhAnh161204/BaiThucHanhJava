import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran: ");
        int soHang = scanner.nextInt();

        System.out.print("Nhap so cot cua ma tran: ");
        int soCot = scanner.nextInt();

        int[][] maTran = new int[soHang][soCot];

        nhapMaTran(maTran, scanner);

        int[] viTriMax = timPhanTuLonNhat(maTran);
        System.out.println("Phan tu lon nhat trong ma tran la: " + maTran[viTriMax[0]][viTriMax[1]] +
                " tai vi tri [" + viTriMax[0] + "][" + viTriMax[1] + "]");
    }

    public static void nhapMaTran(int[][] maTran, Scanner scanner) {
        System.out.println("Nhap cac phan tu cho ma tran:");
        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[0].length; j++) {
                System.out.print("Nhap phan tu [" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextInt();
            }
            scanner.close();
        }
    }

    public static int[] timPhanTuLonNhat(int[][] maTran) {
        int[] viTriMax = {0, 0};
        int max = maTran[0][0];

        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[0].length; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                    viTriMax[0] = i;
                    viTriMax[1] = j;
                }
            }
        }

        return viTriMax;
    }
}
