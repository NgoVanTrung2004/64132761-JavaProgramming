import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            menu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc hai");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Chọn chức năng: ");
    }

    public static void giaiPTB1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập giá trị của a:");
        double a = scanner.nextDouble();

        System.out.println("Nhập giá trị của b:");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
    }

    public static void giaiPTB2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập giá trị của a:");
        double a = scanner.nextDouble();

        System.out.println("Nhập giá trị của b:");
        double b = scanner.nextDouble();

        System.out.println("Nhập giá trị của c:");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình bậc nhất là x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt x1 = " + x1 + " và x2 = " + x2);
            }
        }
    }

    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số điện sử dụng trong tháng:");
        int soDien = scanner.nextInt();

        int tien;

        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.println("Tiền điện của tháng là: " + tien + " VND");
    }
}
