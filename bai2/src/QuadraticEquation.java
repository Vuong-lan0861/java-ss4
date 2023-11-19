import java.util.Scanner;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //    Khởi tạo hàm getter
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //    Khởi tạo hàm setter


    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    //    Khởi tạo hàm getDiscriminant()
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }


    //    Khởi tạo hàm getRoot1()
    public double getRoot1() {
        double rate = (-b + Math.pow((b * b - 4 * a * b), 0.5) / (2 * a));
        return (double) Math.round(rate * 10) / 10;
    }

    public double getRoot2() {
        double rate = (-b - Math.pow((b * b - 4 * a * b), 0.5) / (2 * a));
        return (double) Math.round(rate * 10) / 10;
    }

    // Khởi taọ hàm inputData() yêu cầu người dùng nhập dữ liệu từ bàn phím
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        this.a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        this.b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        this.c = scanner.nextDouble();
    }

    //    Khởi tạo hàm hiển thị toàn bộ thông tin các thuộc tính
    public void displayData() {
        if (getDiscriminant() > 0) {
            System.out.println("phuong trinh co hai nghiem");
            System.out.println("nghiem thu nhat la: " + getRoot1());
            System.out.println("nghiem thu hai la: " + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("phuong trinh co 1 nghiem");
            System.out.println("nghiem la:" + getRoot1());
        } else System.out.println("The equation has no roots");
    }

}