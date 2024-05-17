package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide89chuong4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("QN", "Quang Nam");
        hashMap.put("QB", "Quang Binh");
        hashMap.put("TH", "Thanh Hoa");
        hashMap.put("HN", "Ha Noi");

        System.out.println("Danh sach cac thanh pho trong hashmap la: ");
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println(setHashMap);

        System.out.println("QN: " + hashMap.get("QN"));
        System.out.println("TH: " + hashMap.get("TH"));

        if (hashMap.containsValue("Quang Nam")) {
            System.out.println("Quang Nam co trong hashmap.");
        }
    }
}
