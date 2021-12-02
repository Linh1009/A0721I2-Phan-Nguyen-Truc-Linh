package vong_lap_trong_java.bai_tap;
public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = 7; i >= 1; i--) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
