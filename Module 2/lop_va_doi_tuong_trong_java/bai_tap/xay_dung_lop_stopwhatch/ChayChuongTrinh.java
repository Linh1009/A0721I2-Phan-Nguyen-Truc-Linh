package lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stopwhatch;

public class ChayChuongTrinh {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long total = 0;
        for (int i = 0; i < 10000000; i++) {
            total += i;
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

}
