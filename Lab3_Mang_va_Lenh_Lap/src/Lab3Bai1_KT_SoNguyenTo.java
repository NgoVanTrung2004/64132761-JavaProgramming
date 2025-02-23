/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab3Bai1_KT_SoNguyenTo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập một số nguyên: ");
		int N = scanner.nextInt();
		boolean ok = true;
		
		if(N<=1) {
			ok = false;
		} else {
			for(int i =2; i<N; i++) {
				if(N % i == 0){
					ok = false;
					break;
					}
					}
			}
		if(ok) {
			System.out.print(N + "là số nguyên tố.");
	} else {
		System.out.print(N + "Không phải số nguyên tố.");
	}
		scanner.close();
	}
}
