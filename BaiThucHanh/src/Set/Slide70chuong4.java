package Set;

import java.util.Scanner;
import java.util.TreeSet;

public class Slide70chuong4 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInt = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        treeSetInt.add(0);
        treeSetInt.add(2);
        treeSetInt.add(3);
        treeSetInt.add(4);
        treeSetInt.add(5);
        treeSetInt.remove(0);

        System.out.println("Cac phan tu co trong treeSetInt la: ");
        System.out.println(treeSetInt);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();

        if (!treeSetInt.contains(number)) {
            treeSetInt.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong treeSetInt sau khi them la: ");
            System.out.println(treeSetInt);
        } else {
            System.out.println("Phan tu " + number + " da ton tai!");
        }
    }
}
