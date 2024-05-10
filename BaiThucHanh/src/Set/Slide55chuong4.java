package Set;

import java.util.HashSet;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Slide55chuong4 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInt = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetInt.add(0);
        hashSetInt.add(4);
        hashSetInt.add(5);
        hashSetInt.add(7);
        hashSetInt.add(8);
        hashSetInt.add(9);
        hashSetInt.remove(4);
        hashSetInt.contains(7);
        
        System.out.println("Cac phan tu trong hashSetInt la: ");
        System.out.println(hashSetInt);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();
        if (hashSetInt.contains(number))
        {
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong hashSetInt sau khi them: ");
            System.out.println(hashSetInt);
        } else {
            System.out.println("Phan tu " + number + " da ton tai!");
        }
    }
}
