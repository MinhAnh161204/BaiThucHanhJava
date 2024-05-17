package Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slide109chuong4 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMAp = new TreeMap<>();

        treeMAp.put(1, 9d);
        treeMAp.put(2, 10d);
        treeMAp.put(3, 11d);
        treeMAp.put(4, 22d);

        System.out.println("Cac phan tu co trong treemap la: ");
        Set<Map.Entry<Integer, Double>> setTreeMap = treeMAp.entrySet();
        System.out.println(setTreeMap);
        treeMAp.replace(3, 12d);
        System.out.println("Cac phan tu co trong treemap sau khi thay the: ");
        setTreeMap = treeMAp.entrySet();
        System.out.println(setTreeMap);
    }
}
