package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Slide25chuong4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu cua ArrayList: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            arrayListInteger.add(number);
        }
        int max = arrayListInteger.get(0);

        for (int i = 1; i < arrayListInteger.size(); i++)
        {
            if (arrayListInteger.get(i).compareTo(max) > 0)
            {
                max = arrayListInteger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrListInteger la: " + max);

    }
}
