package lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;
public class Fan {
     final int SLOW = 1;
     final int  MEDIUM = 2;
     final int  FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double  radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        speed = 0;
        on = false;
        radius = 0;
        color = "none";

    }
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
                if (on) {
                    return "Fan is on " + getSpeed() + "\nFan Color: " + getColor() + "\nFan Radius: " + getRadius();
                } else
                    return "Fan is off" + "\nFan Color: " + getColor() + "\nFan Radius: " + getRadius();
            }
}
