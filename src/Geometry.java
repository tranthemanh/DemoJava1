import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Vẽ Hình Tam Giác");
            System.out.println("2. Vẽ Hình Vuông");
            System.out.println("3. Vẽ Hình Chữ Nhật");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hình tam giác");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Hình vuông");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 3:
                    System.out.println("Hình chữ nhật");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Khong co lua chon");
            }
        }

    }
}
