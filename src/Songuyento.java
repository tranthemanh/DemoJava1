import java.util.Scanner;

public class Songuyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a:");
        int a = sc.nextInt();

        if (a < 2){
            System.out.println(a + " không phải là số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(a)){
                if (a % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(a + " là 1 số nguyn tố");
            }else {
                System.out.println(a + " không phải là số nguyên tố");
            }
        }
    }
}
