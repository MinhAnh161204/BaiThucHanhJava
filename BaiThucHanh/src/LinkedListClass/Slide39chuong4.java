package LinkedListClass;

import java.util.LinkedList;

public class Slide39chuong4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Java");
        list.add("C++");
        list.add("C#");
        list.remove(2);
        list.add("JavaScript");
        list.getFirst();

        System.out.println("Vi du su dung phuong thuc addAll: ");
        System.out.println("-------------------------------");

        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA: ");
        showlist(listA);

        System.out.println("Vi du su dung phuong thuc retainAll: ");
        System.out.println("--------------------------------------");

        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.println("listA: ");
        showlist(listA);

        System.out.println("Vi du su dung phuong thuc removeAll");
        System.out.println("-------------------------------------");

        list.removeAll(listB);
        System.out.println("list: ");
        showlist(list);
    }
    public static void showlist(LinkedList<String> list)
    {
        for (String obj : list )
        {
            System.out.println("\t" + obj + ", ");
        }
        System.out.println();
    }
}
