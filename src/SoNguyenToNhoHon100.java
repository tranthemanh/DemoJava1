import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 2; i <= 100; i++) {

            int j = 2;
            boolean check = true;
            while (j <= Math.sqrt(i)) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}
