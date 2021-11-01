package dsa_danh_sach.thuc_hanh.trien_khai_lop_list_don_gian;

public class MyListText {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Danh sach integer da nhap la: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
