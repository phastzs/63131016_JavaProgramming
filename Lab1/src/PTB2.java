import java.util.Scanner;
public class PTB2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap he so a:");
		double a = scanner.nextDouble();
		System.out.println("Nhap he so b:");
		double b = scanner.nextDouble();
		System.out.println("Nhap he so c:");
		double c = scanner.nextDouble();
		
		double Delta =Math.pow(b, 2) - 4*a*c;
		double canDelta = Math.sqrt(Math.abs(Delta));
		
		System.out.printf("%.2f ",canDelta);
		
		scanner.close();
	}

}
