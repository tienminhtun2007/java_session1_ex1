package bai1.btvn;
import java.net.StandardSocketOptions;
import java.util.Scanner;
public class Bai1_DienTichHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        int n = sc.nextInt();
        double pi = Math.PI;
        double area = pi * Math.pow(n, 2);
        System.out.printf("Diện tích hình tròn là: %.2f", area);
    }
}
