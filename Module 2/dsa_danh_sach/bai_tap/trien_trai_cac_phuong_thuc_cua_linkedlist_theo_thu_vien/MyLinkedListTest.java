package dsa_danh_sach.bai_tap.trien_trai_cac_phuong_thuc_cua_linkedlist_theo_thu_vien;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.add(1, 2);
        list.add(2,"lala");
        list.add(3,4);
        list.add(4,5);
        list.addFirst(0);
        System.out.println(list.indexOf("lala"));
    }
}
