package session2.btvn;
import java.net.StandardSocketOptions;
import java.util.Scanner;
public class TinhTongTu1denN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
        int n = Integer.parseInt(input.nextLine());
        if (n <= 0) {
            System.out.print("Số nhập vào không hợp lệ");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print("Tổng: " + sum);
    }
}
