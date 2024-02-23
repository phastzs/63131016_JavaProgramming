import java.util.Scanner;
public class KLP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap canh cua klp:");
		double canh = scanner.nextDouble();
		System.out.printf("The tich khoi lap phuong: %.2f",Math.pow(canh, 3));
	}

}
