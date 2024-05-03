package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        ArrayList<Person> arrListPerson = new ArrayList<>();
        Person ps = new Person();
        ps.NhapThongTin();
        arrListPerson.add(ps);
        arrListPerson.get(0).InThongTin();
    }
    public String ID;
    public String FullName;

    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID = ");
        ID = sc.nextLine();
        System.out.println("FullName = ");
        FullName = sc.nextLine();
    }
    public void InThongTin()
    {
        System.out.println(ID + "-" + FullName);
    } 
}


