import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int sum = 0;
        do {
            System.out.println("Nhap a");
            a = sc.nextInt();
            System.out.println("Nhap b");
            b = sc.nextInt();

        } while (a > b);
        for ( ; a < b; a++) {
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
