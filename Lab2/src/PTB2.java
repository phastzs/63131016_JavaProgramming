import java.util.Scanner;
public class PTB2 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Hay nhap lan luot a b c: ");
    	double a = scanner.nextDouble();
    	double b = scanner.nextDouble();
    	double c = scanner.nextDouble();
    	giai(a,b,c);
    }
    public static void giai(double a, double b, double c) {
    	if(a == 0) {
    		PTB1.giai(a, b);
    	}
    	else{
    		if((Math.pow(b, 2)-4*a*c)<0) {
    			System.out.println("PTVN");
    			}
    		else {
    			if((Math.pow(b, 2)-4*a*c)==0) {
    				System.out.printf("Nghiem kep x = ",+ -b/(2*a));
    			}else {
    				System.out.printf("X1 = %.2f , X2 = %.2f",((-b+Math.sqrt((Math.pow(b, 2)-4*a*c)))/(2*a)),((-b-Math.sqrt((Math.pow(b, 2)-4*a*c)))/(2*a)));
    			}
    		}
    		}
    	}
    }
