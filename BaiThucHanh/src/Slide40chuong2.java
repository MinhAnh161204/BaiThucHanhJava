import java.util.Scanner;

public class Slide40chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ngay = sc.nextInt();
        switch (ngay){
            case 1: System.out.println("Chu nhat"); break;
            case 2: System.out.println("Thu hai"); break;
            case 3: System.out.println("Thu ba"); break;
            case 4: System.out.println("Thu tu"); break;
            case 5: System.out.println("Thu nam"); break;
            case 6: System.out.println("Thu sau"); break;
            case 7: System.out.println("Thu bay"); break;
            default : System.out.println("Khong phai ngay trong tuan.");
        }
        sc.close();
    }
}
