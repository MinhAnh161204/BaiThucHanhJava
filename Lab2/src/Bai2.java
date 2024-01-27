import java.util.Scanner;

/**
 * Bai2
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println( n + " La so chan.");
        }else{
            System.out.println( n + " La so le.");
        }
        sc.close();
    }
}