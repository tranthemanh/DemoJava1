import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong so nguyen to can hien ra: ");
        number = sc.nextInt();
        int dem = 0;
        for(int i = 2; ; i++) {
            if (dem <= number) {
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
                    dem++;
                }
            }else {
                break;
            }

        }
    }
}
