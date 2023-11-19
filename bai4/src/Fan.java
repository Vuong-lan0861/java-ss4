public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;

    public final int FAST = 3;

    private int speed = 1;
    private boolean on = false;
    private double radius = 5;

    private String color = "blue";

    //Khởi tạo phương thức contructer có và không có tham số
    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

//    Khởi tạo phương thức getter cho các thuộc tính


    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

//    Khởi tạo phương thức setter cho các thuộc tính


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    Phương thức toString() trả về chuỗi chứa thông tin của quạt.

    public String toString() {
        if (on) {
            return "toc do : "+ speed + ", Mau sac : "+ color+", Ban kinh : " + radius + ", Fan is on";
        } else {
            return "Mau sac : "+ color+", Bankinh : " + radius + ", Fan is off";
        }
    }
}
