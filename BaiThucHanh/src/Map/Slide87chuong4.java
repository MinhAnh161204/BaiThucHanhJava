package Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Slide87chuong4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("CSDL","Co so du lieu");
        hashMap.put("C++","C++");
        hashMap.put("Java","Java");
        hashMap.put("PHP","PHP");

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac entry co trong hashmap la: ");
        System.out.println(setHashMap); 
    }
}