import java.util.Scanner;

public class PTB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a và b:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        giai(a,b); // Gọi hàm giai
    }

    public static void giai(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
}
