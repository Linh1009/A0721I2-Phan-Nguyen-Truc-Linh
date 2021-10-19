package mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Arrays;
public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 9, 8, 10};
        int[] array3 = new int[array1.length + array2.length];
        int pos = 0;
        for(int i : array1){
            array3[pos] = i;
            pos++;
        }
        for (int i : array2){
            array3[pos] = i;
            pos++;
        }
        for(int i = 0;i<array3.length;i++){
            System.out.print(array3[i] + "\t");
        }

    }
}
