/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai2_Phuongtrinhbac2 {

	public static void main(String[] args) {
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
                    System.out.println("Phương trình vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình bậc nhất là x = " + x);
            }
        } else {
            //Giải phương trình bậc hai
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

        scanner.close();
	}

}
