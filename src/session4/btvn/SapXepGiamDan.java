package session4.btvn;
import java.util.Scanner;
public class SapXepGiamDan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int elementNumber = Integer.parseInt(input.nextLine());
        int[] numbers = new int[elementNumber];
        for (int i = 1; i <= elementNumber; i++ ) {
            System.out.print("Phần tử thứ " + i + ": ");
            numbers[i-1] = Integer.parseInt(input.nextLine());
        }
        BubbleSort(numbers);
        System.out.println("Mảng sau khi đã sắp xếp giảm dần:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
    public static void BubbleSort(int[] numbers) {
        int n = numbers.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}