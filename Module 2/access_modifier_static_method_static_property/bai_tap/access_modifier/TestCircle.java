package access_modifier_static_method_static_property.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        System.out.println(c1);
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColor());
        System.out.printf("The area is: %.2f%n", c1.getArea());
    }

}


