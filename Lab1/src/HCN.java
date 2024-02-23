import java.util.Scanner;
public class HCN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Nhap chieu dai va chieu rong nek
		System.out.println("Nhap chieu dai cua hcn:");
		Double dai = scanner.nextDouble();
		System.out.println("Nhap chieu rong cua hcn:");
		Double rong = scanner.nextDouble();	
		
		Double cv =(dai + rong)*2;
		System.out.printf("Chu vi cua hcn: %.2f \n",cv);
		Double dt = dai*rong;
		System.out.printf("Dien tich cua hcn: %.2f \n",dt);
		System.out.printf("canh nho cua hcn: %.2f",Math.min(dai, rong));
		scanner.close();
	}

}
