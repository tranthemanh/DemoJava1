import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int luachon = -1;
        Scanner sc = new Scanner(System.in);
        while (luachon != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle ");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Nhap lua chon: ");
            luachon = sc.nextInt();

            switch (luachon) {
                case 1:
                    System.out.print("Nhap chieu dai: ");
                    int chieudai = sc.nextInt();
                    System.out.print("Nhap chieu rong: ");
                    int chieurong = sc.nextInt();
                    for (int i = 0; i < chieurong; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < chieudai; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(" ");
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        System.out.println(" ");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println(" ");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Khong co lua chon dung.");
            }
        }
    }
}
