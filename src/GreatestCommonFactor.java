import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("khong co UCLN.");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("UCLN la: "+ a);
    }
}
