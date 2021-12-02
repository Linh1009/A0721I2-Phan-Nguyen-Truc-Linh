package ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class Test {
    public static void main(String[] args) {
        Point2D p2a = new Point2D(1, 2);
        System.out.println(p2a);
        Point2D p2b = new Point2D();
        System.out.println(p2b);
        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a);
        System.out.println("x là:" + p2a.getX());
        System.out.println("x là:" + p2a.getY());

        Point3D p3a = new Point3D(1, 2, 3);
        System.out.println(p3a);
        Point2D p3b = new Point3D();
        System.out.println(p3b);
        p3a.setX(31);
        p3a.setY(32);
        p3a.setZ(33);
        System.out.println("x là: " + p3a.getX());
        System.out.println("y là: " + p3a.getY());
        System.out.println("z là: " + p3a.getZ());

    }
}
