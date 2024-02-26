import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        // Nhập danh sách họ và tên
        System.out.println("Nhập danh sách họ và tên (Nhập 'done' để kết thúc): ");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            nameList.add(name);
        }

        // Xuất danh sách vừa nhập
        System.out.println("Danh sách họ và tên vừa nhập:");
        for (String name : nameList) {
            System.out.println(name);
        }

        // Xuất danh sách ngẫu nhiên
        System.out.println("Danh sách ngẫu nhiên:");
        Collections.shuffle(nameList);
        for (String name : nameList) {
            System.out.println(name);
        }

        // Sắp xếp giảm dần và xuất danh sách
        System.out.println("Danh sách sau khi sắp xếp giảm dần:");
        Collections.sort(nameList, Collections.reverseOrder());
        for (String name : nameList) {
            System.out.println(name);
        }

        // Tìm và xóa họ tên nhập từ bàn phím
        System.out.print("Nhập họ tên cần xóa: ");
        String nameToDelete = scanner.nextLine();
        nameList.remove(nameToDelete);

        // Xuất danh sách sau khi xóa
        System.out.println("Danh sách sau khi xóa:");
        for (String name : nameList) {
            System.out.println(name);
        }

        // Kết thúc
        scanner.close();
    }
}
