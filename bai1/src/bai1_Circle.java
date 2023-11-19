import java.util.Scanner;

public class bai1_Circle {
    double banKinh;
    String mauSac;

    //    Khởi tạo hàm constructor = hàm khởi tạo
    public bai1_Circle() {
        this.banKinh = 0;
        this.mauSac = "";
    }

    public bai1_Circle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    //    Khởi tạo hàm getter
    public double getBanKinh() {
        return banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }
    //    Khởi tạo hàm setter
    public void setBanKinh(double banKinh){
        this.banKinh = banKinh;
    }
    public void setMauSac(String mauSac){
        this.mauSac = mauSac;
    }
    //    Khởi tạo hàm tính Chu vi
    public double Chuvi() {
        return 2 * Math.PI * this.banKinh;
    }

    //    Khởi tạo hàm tính Diện tích
    public double dienTich() {
        return Math.PI * Math.pow(this.banKinh, 2);
    }

    //    Khởi taọ hàm cho phép người dùng nhập vào toàn bộ thông tin của đối tượng
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ban kimnh");
        this.banKinh = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhap mau sac");
        this.mauSac = scanner.nextLine();
    }

    //    Khởi tạo hàm hiển thị toàn bộ thông tin các thuộc tính
    public void displayData() {
        System.out.println("bán Kính của hình tròn là : " + this.banKinh);
        System.out.println("màu sắc của hình tròn là : " + this.mauSac);
    }
}