package session2.btvn;
import java.util.Scanner;
public class KiemTraTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập dộ dài cạnh thứ nhất: ");
        int edge1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập độ dài cạnh thứ hai: ");
        int edge2 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập độ dài cạnh thứ ba: ");
        int edge3 = Integer.parseInt(sc.nextLine());
        if (edge1 + edge2 <= edge3 || edge2 + edge3 <= edge1 || edge1 + edge3 <= edge2)  {
            System.out.print("Ba cạnh không tạo thành 1 tam giác");
        } else {
            if (edge1 == edge2  && edge1 == edge3 && edge2 == edge3) {
                System.out.print("Đây là tam giác đều");
            } else if (edge1 == edge2 || edge1 == edge3 || edge2 == edge3) {
                System.out.print("Đây là tam giác cân");
            } else if (Math.pow(edge1, 2) + Math.pow(edge2, 2) == Math.pow(edge3, 2) || Math.pow(edge1, 2) + Math.pow(edge3, 2) == Math.pow(edge2, 2) || Math.pow(edge2, 2) + Math.pow(edge3, 2) == Math.pow(edge1, 2) ) {
                System.out.print("Đây là tam giác vuông");
            } else {
                System.out.print("Đây là tam giác thường");
            }
        }

    }
}
