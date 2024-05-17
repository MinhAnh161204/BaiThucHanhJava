package Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class Slide96chuong4 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

        lhm.put(1, "Java");
        lhm.put(2, "C++");
        lhm.put(3, "PHP");
        lhm.put(4, "C#");

        System.out.println("Before remove: ");
        show(lhm);

        lhm.remove(2);

        System.out.println("After remove: ");
        show(lhm);
    }
    public static void show(LinkedHashMap<Integer, String> lhm) {
        Set<Integer> keySet = lhm.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + lhm.get(key));
        }
    }
}
