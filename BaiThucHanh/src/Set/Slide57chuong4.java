package Set;

import java.util.HashSet;
import java.util.Scanner;

public class Slide57chuong4 {
    public static void main(String[] args) {
        HashSet<String> hashSetString = new HashSet<>();
        String name;
        Scanner sc = new Scanner(System.in);

        hashSetString.add("Wilson");
        hashSetString.add("MinhAnh");
        hashSetString.add("Phong");
        hashSetString.add("Chinh");
        hashSetString.add("Minh");
        hashSetString.remove("Wilson");
        hashSetString.contains("Vinh");

        System.out.println("Cac phan tu trong hashSetString la: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = sc.nextLine();

        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong hashSetString: ");
            System.out.println(hashSetString);
        } else {
            System.out.println("Xoa khong thanh cong!");
        }
    }
}
