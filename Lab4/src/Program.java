import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo 2 đối tượng sản phẩm
        SanPham sp1 = new SanPham("", 0, 0);
        SanPham sp2 = new SanPham("", 0, 0);

        // Nhập thông tin cho sản phẩm 1
        System.out.println("Nhập thông tin cho sản phẩm 1:");
        sp1.nhap();

        // Nhập thông tin cho sản phẩm 2
        System.out.println("Nhập thông tin cho sản phẩm 2:");
        sp2.nhap();

        // Xuất thông tin sản phẩm 1
        System.out.println("\nThông tin sản phẩm 1:");
        sp1.xuat();

        // Xuất thông tin sản phẩm 2
        System.out.println("\nThông tin sản phẩm 2:");
        sp2.xuat();

        scanner.close();
    }
}
