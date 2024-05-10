package Set;

import java.util.LinkedHashSet;

public class Slide61chuong4 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSetString = new LinkedHashSet<>();
        linkedHashSetString.add("Java");
        linkedHashSetString.add("C++");
        linkedHashSetString.add("C#");
        linkedHashSetString.add("PHP");

        for (String str : linkedHashSetString) {
            System.out.println(str);
        }
    }
}
