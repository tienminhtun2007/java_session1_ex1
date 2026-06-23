package session1.btvn;
import java.util.Scanner;
public class Bai4_DienTichChuViHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        float width = sc.nextFloat();
        System.out.print("Nhập chiều dài: ");
        float height = sc.nextFloat();
        float area = width * height;
        float chuVi = (width + height) * 2;
        System.out.printf("Diện tích: %.2f%n", area);
        System.out.printf("Chu vi: %.2f", chuVi);
    }
}
