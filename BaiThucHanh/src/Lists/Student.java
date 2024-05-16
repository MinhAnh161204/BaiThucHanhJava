package Lists;

import java.util.Scanner;

public class Student {
   String FullName;
   int Age;
   public Student(String FullName, int Age)
   {
    this.FullName = FullName;
    this.Age = Age;
   }

   public void NhapThongTin()
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("FullName: ");
    FullName = sc.nextLine();
    System.out.println("Age: ");
    Age = sc.nextInt();
   }
   public void InThongTin()
   {
    System.out.println(FullName + " - " + Age);
   }
   public void ThemThongTin(String FullName, int Age)
   {
    this.FullName = FullName;
    this.Age = Age;
   }
   public void SuaThongTin(String FullName, int Age)
   {
    this.FullName = FullName;
    this.Age = Age;
   }
   public String getFullName()
   {
    return FullName;
   }
   public void setFullName(String FullName)
   {
    this.FullName = FullName;
   }
   public int getAge()
   {
    return Age;
   }
   public void setAge(int Age)
   {
    this.Age = Age;
   }
}