package access_modifier_static_method_static_property.thuc_hanh.static_method;

public class ChayChuongTrinh {
    public static void main(String args[]) {
        Student.change(); //calling change method

        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }

}
