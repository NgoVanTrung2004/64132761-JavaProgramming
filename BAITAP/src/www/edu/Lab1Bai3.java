package www.edu;
import java.util.Scanner;
public class Lab1Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập cạnh khối lập phương: ");
		double canh = scanner.nextDouble();
		
		double thetich = Math.pow(canh, 3);
		
		System.out.printf("Thể tích của khối lập phương là: %.2f\n", thetich);
	}
}
