package session4.btvn;
import java.util.Scanner;
public class TongChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số cột của mảng: ");
        int col = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][col];
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                arr[i][j] = Integer.parseInt(sc.nextLine());
                if (arr[i][j] % 2 == 0) {
                    evenCount += arr[i][j];
                } else {
                    oddCount  += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các số chẵn: " + evenCount);
        System.out.print("Tổng các số lẻ: " + oddCount);
    }
}
