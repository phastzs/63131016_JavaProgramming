import java.util.Scanner;

public class TienDien {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Hãy nhập số tiền điện mà bạn muốn tính: ");
    	double soDien = scanner.nextDouble();
    	TienDien(soDien);
    	
    }
    public static void TienDien(double soDien) {
    	if(soDien<50)
    	{
    		System.out.printf("Tien dien cua ban la: %.2f",(soDien*1000));
    		
    	}else {
    		System.out.printf("Tien dien cua ban la: %.2f",(50*1000+(soDien-50)*1200));
    	}
    }
}
