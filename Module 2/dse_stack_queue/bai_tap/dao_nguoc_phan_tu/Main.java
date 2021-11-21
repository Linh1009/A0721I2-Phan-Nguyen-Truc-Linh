package dse_stack_queue.bai_tap.dao_nguoc_phan_tu;

import static dse_stack_queue.bai_tap.dao_nguoc_phan_tu.Stack.reverse;

public class Main {
    public static void main(String args[])
    {
        StringBuffer s= new StringBuffer("Cafedev.vn");

        reverse(s);

        System.out.println("Chuoi sau dao nguoc la: " + s);
    }
}


