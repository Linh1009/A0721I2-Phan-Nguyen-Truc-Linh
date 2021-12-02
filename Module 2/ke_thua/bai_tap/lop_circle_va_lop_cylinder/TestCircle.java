package ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.5);
        System.out.println(circle);
        circle = new Circle(1.5, "yellow");
        System.out.println(circle);

    }
}

