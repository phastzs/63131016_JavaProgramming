import java.util.Scanner;
public class Lab1Bai1 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		//Nhap ho ten sinh vien
		System.out.print("Hay nhap ho ten cua sinh vien: ");
		String hoTen = scanner.nextLine();
		//Nhap diem trung binh của sinh vien
		System.out.println("Hay nhap diem trung binh cua sinh vien: ");
		Double diem = scanner.nextDouble();
		//Hien thi thong tin va dinh dang da yeu cau
		System.out.printf("%s %.2f điểm%n", hoTen, diem);

		scanner.close();
		//dong scanner
	}

}
