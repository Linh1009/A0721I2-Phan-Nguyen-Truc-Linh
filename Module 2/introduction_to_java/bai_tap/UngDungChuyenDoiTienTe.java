package introduction_to_java.bai_tap;
import java.util.Scanner;
public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền : ");
        usd = scanner.nextDouble();
        double quyDoi = usd * 23000;
        System.out.println("Giá trị VND là: " + quyDoi);

    }
}
