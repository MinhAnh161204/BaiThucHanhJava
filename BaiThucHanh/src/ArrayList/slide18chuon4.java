package ArrayList;

import java.util.ArrayList;

import javax.sound.midi.Soundbank;

public class slide18chuon4 {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayListInteger = new ArrayList<>(null);

        arrayListInteger.add(0);
        arrayListInteger.add(7);
        arrayListInteger.add(1);
        arrayListInteger.add(9);

        System.out.println("Cac phan tu co trong arrListInteger la: ");
        for (int number : arrayListInteger)
        {
            System.out.println(number + "\t");
        }
    }
}
