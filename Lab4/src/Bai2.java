import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> listInt = new LinkedList<>();
        int count = 0;
        int sum = 0;
        System.out.println("Nhap so luong phan tu n: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++)
        {
            System.out.println("Nhap gia tri phan tu thu " + (i+1) + " :");
            listInt.add(sc.nextInt());
        }
        for (int x : listInt)
        {
            if (x % 2 == 0)
            {
                sum += x;
                count ++;
            }
        }
        System.out.println("Trung binh cong cua cac so chan la:" + (double) sum/count);
    }
}
