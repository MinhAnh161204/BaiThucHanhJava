package Person;

import java.util.Scanner;

public class Person {
    public String FullName;
    public int Age;
    public String Sex;
    public String Address;
    public int SDT;

    Scanner sc = new Scanner(System.in);

    public Person()
    {
        FullName = "";
        Age = 0;
        Address = "";
        SDT = 0;
    }
    public void EnterData()
    {
        System.out.print("FullName = ");
        FullName = sc.nextLine();
        System.out.print("Age = ");
        Age = sc.nextInt();
        sc.nextLine();
        System.out.print("Address = ");
        Address = sc.nextLine();
        System.out.print("So dien thoai = ");
        SDT = sc.nextInt();
    }
    public void Display()
    {
        System.out.println(FullName + " - " + Age + " - " + Sex + " - " + Address);
    } 
}
