package session1.btvn;
import java.util.Scanner;
public class Bai3_TinhTongHaiPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tử số thứ nhất: " );
        int a = sc.nextInt();
        System.out.print("Mẫu số thứ nhất: ");
        int b = sc.nextInt();
        System.out.print("Tử số thứ 2: ");
        int c = sc.nextInt();
        System.out.print("Mẫu số thứ 2: ");
        int d = sc.nextInt();
        int tuSoChung = a * d + b * c;
        int mauSoChung = b * d;
        System.out.printf("Kết quả: %d/%d", tuSoChung, mauSoChung);
    }
}
