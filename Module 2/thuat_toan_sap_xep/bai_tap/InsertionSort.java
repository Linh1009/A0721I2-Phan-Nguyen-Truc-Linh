package thuat_toan_sap_xep.bai_tap;

public class InsertionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int lenght = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > lenght) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = lenght;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 6, 2, 7, 9 };
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

}
