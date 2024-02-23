import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        // Tạo các đối tượng từ các class tương ứng
        PTB1 ptb1 = new PTB1();
        PTB2 ptb2 = new PTB2();
        TienDien tienDien = new TienDien();

        while (true) {
        	System.out.println("\n\n");
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
	            case 1:
	                System.out.println("Nhập hệ số a và b:");
	                double a1 = scanner.nextDouble();
	                double b1 = scanner.nextDouble();
	                ptb1.giai(a1, b1);
	                break;

                case 2:
                	System.out.println("Nhập hệ số a và b và c: ");
	                double a2 = scanner.nextDouble();
	                double b2 = scanner.nextDouble();
	                double c2 = scanner.nextDouble();
                    ptb2.giai(a2, b2, c2);
                    break;
                case 3:
                    System.out.println("Nhập số điện sử dụng: ");
                    double soDien = scanner.nextDouble();
                    tienDien.TienDien(soDien);
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
