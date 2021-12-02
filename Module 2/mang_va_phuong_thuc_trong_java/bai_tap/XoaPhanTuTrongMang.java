package mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {1,2,3,4};
        int [] arrays  = new int[array.length - 1];
        System.out.println("Nhập phần tử cần xóa");
        int number = scanner.nextInt();
        int j = 0;
        for(int i = 0;i<array.length;i++){
            if(number != array[i]){
                arrays[j] = array[i];
                j++;
            }

        }
        System.out.println("Mang sau khi xoa la: ");
        for ( j = 0; j < arrays.length; j++) {
            System.out.print(arrays[j] + "\t");
        }
    }
}
