import java.util.Scanner;
public class NhapSN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hay nhap so can kiem tra co phai la so nguyen to hay khong : ");
		int n = scanner.nextInt();
		KTNT(n);
	}
	public static void KTNT(int n) {
		boolean ok = true;
		for(int i=2;i<n-1;i++) {
			if(n%i==0) {
				ok = false;
				break;
			}i++;
			
		}
		if(ok && n >1) {
			System.out.println(n + " là một số nguyên tố.");
		}else {
			System.out.println(n + " không phải là một số nguyên tố");
		}
		
	}

}
