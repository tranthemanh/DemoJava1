import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double tien = 1.0;
        int thang = 1;
        double laixuat = 1.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so tien muon gui: ");
        tien = sc.nextDouble();

        System.out.print("Nhap so thang muon gui: ");
        thang = sc.nextInt();

        System.out.print("So lai xuat: ");
        laixuat = sc.nextDouble();

        double tiennhanduoc = 0;
        for (int i = 0; i < thang; i++) {
            tiennhanduoc += tien * (laixuat / 100) / 12 * thang;
        }
        System.out.println("Tong tien lai nhan duoc la: " + tiennhanduoc);
    }
}
