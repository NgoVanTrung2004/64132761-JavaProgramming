/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
	public class Lab6Bai1_NhapHoTen_XuatMH {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập họ và tên: ");
	        String fullName = scanner.nextLine();

	        // Tách họ
	        int firstSpace = fullName.indexOf(" ");
	        String ho = fullName.substring(0, firstSpace).toUpperCase();

	        // Tách tên
	        int lastSpace = fullName.lastIndexOf(" ");
	        String ten = fullName.substring(lastSpace + 1).toUpperCase();

	        // Tách tên đệm
	        String tenDem = fullName.substring(firstSpace + 1, lastSpace);

	        // Xuất kết quả
	        System.out.println("Họ: " + ho);
	        System.out.println("Tên đệm: " + tenDem);
	        System.out.println("Tên: " + ten);
	    }
	}

