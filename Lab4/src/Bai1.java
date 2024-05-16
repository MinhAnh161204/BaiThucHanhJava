import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayListInt = new ArrayList<>(10);

        System.out.println("Nhap so phan tu: ");
        int number;
        while (true) {
            number = sc.nextInt();
            if (number == -1) {
                break;
            }
            arrayListInt.add(number);
        }
        if (!arrayListInt.isEmpty()) {
            int max = Collections.max(arrayListInt);
            System.out.println("So nguyen lon nhat la: " + max);
        } else {
            System.out.println("Day so rong.");
        }
        System.out.print("Nhap so nguyen can xoa: ");
        int numberToRemove = sc.nextInt();
        arrayListInt.removeIf(n -> n == numberToRemove);

        Collections.sort(arrayListInt);
        System.out.println("Day so sau khi sap xep la: " + arrayListInt);
    }
}