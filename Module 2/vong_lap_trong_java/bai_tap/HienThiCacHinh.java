package vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class HienThiCacHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hình bạn muốn in");
        // 1 Hình chữ nhật
        // 2 Hình tam giác vuông
        // 3 Hình tam giác vuông ngược
        int number = scanner.nextInt();
        switch (number){
            case 1:
                for (int i = 1; i < 4; i++) {
                    for (int j = 1; j < 6; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                for (int i = 7; i >= 1; i--) {
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
        }
    }
}
