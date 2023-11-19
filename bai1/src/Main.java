
public class Main {
    public static void main(String[] args) {
        bai1_Circle circle = new bai1_Circle();
        double banKinh;
        String mauSac;
        // Nhap thong tin
        circle.inputData();
        // Hien thi thong tin
        circle.displayData();
        //Hiển thị chu vi + diện tích
        System.out.printf("Chu vi là %.2f \n",circle.Chuvi());
        System.out.printf("Diện tích là %.2f ",circle.dienTich());

    }
}