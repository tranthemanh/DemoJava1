import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tien Dola: ");
        int dola = sc.nextInt();
        int tien = dola * 23000;
        System.out.println("So tien "+dola+ "$ đổi sang tiền việt là: "+tien+" VNĐ");
    }
}
