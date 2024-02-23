public class BangCuuChuong {
    public static void main(String[] args) {
        // Dùng hai vòng lặp lồng nhau để xuất bảng cửu chương
        for (int i = 1; i <= 9; i++) {
            // Xuất tiêu đề của bảng cửu chương
            System.out.printf("Bảng cửu chương của %d:\n", i);
            // Xuất từng dòng của bảng cửu chương
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            // Xuống dòng để phân biệt giữa các bảng cửu chương
            System.out.println();
        }
    }
}

