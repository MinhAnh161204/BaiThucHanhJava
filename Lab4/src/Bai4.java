import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        HashSet<String> fruitHashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String nameFruit;
            System.out.print("Ten loai trai cay: ");
            nameFruit = sc.nextLine();
            if (nameFruit.isEmpty()) {
                break;
            }
            fruitHashSet.add(nameFruit);
        }

        sizeList(fruitHashSet);
        checkFruit(fruitHashSet);
        deletedFruit(fruitHashSet);
        showSet(fruitHashSet);


        ArrayList<String> fruitArrayList = new ArrayList<>();
        fruitArrayList.add("Tao");
        fruitArrayList.add("Xoai");
        fruitArrayList.add("Buoi");
        fruitArrayList.add("DuaHau");
        fruitArrayList.add("Oi");
        fruitArrayList.add("Nho");

        for(String x : fruitArrayList) {
            fruitHashSet.add(x);
        }

        Iterator<String> fruitIterator = fruitHashSet.iterator();
        System.out.println();
        System.out.println("Danh sach loai trai cay: ");
        while (fruitIterator.hasNext()) {
            System.out.print(fruitIterator.next() + " ");
        }
        System.out.println();

        fruitHashSet.removeAll(fruitArrayList);
        System.out.println();
        showSet(fruitHashSet);
    }

    public static void showSet(HashSet<String> hashSet) {
        System.out.println("Danh sach loai trai cay: ");
        for(String x : hashSet) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void sizeList(HashSet<String> hashSet) {
        System.out.println("So luong trai cay co trong danh sach: " + hashSet.size());
        System.out.println();
    }

    public static void checkFruit(HashSet<String> hashSet) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten loai trai cay can tim: ");
        String nameFruit = sc.next();
        if (hashSet.contains(nameFruit)) {
            System.out.println(nameFruit + " co trong danh sach!");
        } else {
            System.out.println(nameFruit + " khong co trong danh sach!");
        }
        System.out.println();
    }

    public static void deletedFruit(HashSet<String> hashSet) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten loai trai cay can xoa: ");
        String nameFruit = sc.next();
        
        if (hashSet.contains(nameFruit)) {
            hashSet.remove(nameFruit);
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong ton tai loai trai cay nay!");
        }
        System.out.println();
    }
}