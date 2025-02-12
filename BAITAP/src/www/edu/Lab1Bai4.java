/**
 * 
 */
package www.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
    
        double canDelta = Math.sqrt(delta);

        System.out.printf("Delta của phương trình là: %.2f\n", delta);
        System.out.printf("Căn delta của phương trình là: %.2f\n", canDelta);
  

	}

}
