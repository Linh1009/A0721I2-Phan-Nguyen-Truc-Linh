package ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double heigth;
    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);
        this.heigth = heigth;
    }
    public double getHeigth() {
        return heigth;
    }
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getVolumer() {
        return super.getArea() * this.heigth;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "heigth=" + heigth +
                '}';
    }
}
