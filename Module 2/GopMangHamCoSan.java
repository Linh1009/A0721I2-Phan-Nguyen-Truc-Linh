package mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Arrays;
public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 9, 8};
        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];
        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);
        System.out.println(Arrays.toString(result));


    }
}
