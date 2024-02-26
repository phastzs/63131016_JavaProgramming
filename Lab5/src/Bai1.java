import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Nhập số thực (nhập 'N' để kết thúc): ");
        while(true) {
            double x = scanner.nextDouble();
            list.add(x);
            System.out.print("Nhập thêm (Y/N)? ");
            scanner.nextLine(); // Đọc dòng trống sau khi nhập số double trước đó
            if(scanner.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("Danh sách số thực vừa nhập:");
        for(double num : list) {
            System.out.println(num);
        }

        double sum = 0;
        for(double num : list) {
            sum += num;
        }
        System.out.println("Tổng của danh sách: " + sum);

        scanner.close();
    }
}
