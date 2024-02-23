import java.util.Scanner;
import java.util.Arrays;

public class NhapMSN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Nhap so luong phan tu cua mang
		System.out.println("Hay nhap so luong phan tu co trong mang");
		int n = scanner.nextInt();
		//Khởi tạo mạng với kích thước n
		int[] array = new int[n];
		//Nhập các phần tử cho mảng trong bàn phím
		System.out.println("Hay nhap cac phan tu cua mang");
		for(int i=0 ; i<n;i++) {
			System.out.printf("phần tử thứ a[%d]: ",i);
			array[i] = scanner.nextInt();
		}
		//Sắp xếp
		Arrays.sort(array);
		
		//Mảng sau khi sắp xếp
		System.out.println("Mảng sau khi đã sắp xếp : ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+"");
		}
		System.out.println();
		// Tìm và xuất phần tử nhỏ nhất của mảng
        int min = array[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Phần tử nhỏ nhất của mảng là: " + min);

        // Tính và xuất trung bình cộng các phần tử chia hết cho 3
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 3 == 0) {
                sum += array[i];
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("Trung bình cộng các phần tử chia hết cho 3 là: " + average);

        scanner.close();
    }
	}

