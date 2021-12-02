package dsa_danh_sach.thuc_hanh.trien_khai_lop_linked_list_don_gian;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(7);
        ll.addFirst(2);
        ll.addFirst(6);

        ll.add(2,4);
        ll.add(8,7);
        ll.printList();
    }

}
