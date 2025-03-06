/**
 * 
 */

/**
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab5Bai2_THCac_Chuc_Nang {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nhập họ và tên:\n ");
                    String name = scanner.nextLine();
                    list.add(name);
                    break;
                case 2:
                    System.out.println("Danh sách vừa nhập:");
                    for (String s : list) {
                        System.out.println(s);
                    }
                    break;
                case 3:
                    Collections.shuffle(list);
                    System.out.println("Danh sách ngẫu nhiên:");
                    for (String s : list) {
                        System.out.println(s);
                    }
                    break;
                case 4:
                    Collections.sort(list);
                    Collections.reverse(list);
                    System.out.println("Danh sách sắp xếp giảm dần:");
                    for (String s : list) {
                        System.out.println(s);
                    }
                    break;
                case 5:
                    System.out.print("Nhập họ và tên cần xóa: ");
                    String toDelete = scanner.nextLine();
                    if (list.remove(toDelete)) {
                        System.out.println("Đã xóa " + toDelete + " khỏi danh sách.");
                    } else {
                        System.out.println("Không tìm thấy " + toDelete + " trong danh sách.");
                    }
                    break;
                case 6:
                    System.out.println("Chương trình kết thúc.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
                    break;
            }
        }
    }
}

