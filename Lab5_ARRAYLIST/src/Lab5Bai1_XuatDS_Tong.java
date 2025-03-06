/**
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 * 
 */
public class Lab5Bai1_XuatDS_Tong {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.print("Nhập số thực: ");
			Double x = scanner.nextDouble();
			list.add(x);
			
			System.out.print("Nhập thêm (Y/N)?");
			if(scanner.nextLine().equals("N")){
				break;
			}
			
		}
		System.out.println("Danh sách các số đã nhập: ");
		double sum = 0;
		for(Double num : list) {
			System.out.println(num);
			sum += num;
		}
		System.out.println("Tổng của danh sách là: " + sum);
	}

}
