/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai1_Phuongtrinhbac1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập giá trị cua a: ");
		double a = scanner.nextDouble();
		System.out.println("Nhập giá trị cua b: ");
		double b = scanner.nextDouble();
		
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình vô số nghiệm.");
			} else {
				System.out.println("Phương trình vô nghiệm.");
			}
		} else {
			double x = -b/a;
			System.out.println("Phương trình có nghiệm x = " + x);
		}
		scanner.close();
	}

}
