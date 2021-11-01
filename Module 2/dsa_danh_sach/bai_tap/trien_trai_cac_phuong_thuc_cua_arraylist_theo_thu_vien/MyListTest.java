package dsa_danh_sach.bai_tap.trien_trai_cac_phuong_thuc_cua_arraylist_theo_thu_vien;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Ly");
        list.add("Như");
        list.add("Hoa");
        list.add("Phương");

        print(list.getData());
        System.out.println(list.indexOf("Ngọc"));
        System.out.println(list.indexOf("Sương"));
        list.remove(3);
        list.add("Hạ",1);
        print(list.getData());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("toàn"));
        System.out.println(clone.contains("Ngọc"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }

}
