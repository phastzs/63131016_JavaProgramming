import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Hàm tạo có 3 tham số
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Hàm tạo có 2 tham số
    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0); // Gọi lại hàm tạo có 3 tham số với giảm giá mặc định là 0
    }

    // Phương thức tính thuế nhập khẩu (private)
    private double getThueNhapKhau() {
        return 0.1 * donGia; // Thuế nhập khẩu là 10% giá sản phẩm
    }

    // Phương thức xuất thông tin ra màn hình (public)
    public void xuat() {
        System.out.println("Tên sản phẩm: " + getTenSp());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("Giảm giá: " + getGiamGia());
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    // Phương thức nhập thông tin từ người dùng
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }

    // Getter và setter cho tenSp
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    // Getter và setter cho donGia
    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    // Getter và setter cho giamGia
    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public static void main(String[] args) {
        // Tạo sản phẩm có giảm giá
        SanPham sp1 = new SanPham("Áo thun", 100, 20);
        // Tạo sản phẩm không có giảm giá
        SanPham sp2 = new SanPham("Quần jeans", 200);

        // Xuất thông tin sản phẩm có giảm giá
        System.out.println("Thông tin sản phẩm có giảm giá:");
        sp1.xuat();

        // Xuất thông tin sản phẩm không có giảm giá
        System.out.println("\nThông tin sản phẩm không có giảm giá:");
        sp2.xuat();
    }
}
