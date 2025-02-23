/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab4Bai4_Nhap2Mang_HoTen_DiemSV {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Bỏ qua ký tự xuống dòng sau khi nhập số

        String[] names = new String[n];
        float[] scores = new float[n];

        // Nhập họ tên và điểm của sinh viên
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên sinh viên " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Nhập điểm của sinh viên " + (i + 1) + ": ");
            scores[i] = scanner.nextFloat();
            scanner.nextLine(); // Bỏ qua ký tự xuống dòng sau khi nhập điểm
        }

        // Xuất thông tin sinh viên
        System.out.println("\nThông tin sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Họ tên: " + names[i] + ", Điểm: " + scores[i] + ", Học lực: ");
            if (scores[i] < 5) {
                System.out.println("Yếu");
            } else if (scores[i] < 6.5) {
                System.out.println("Trung bình");
            } else if (scores[i] < 7.5) {
                System.out.println("Khá");
            } else if (scores[i] < 9) {
            	 System.out.println("Giỏi");
            } else {
                System.out.println("Xuất sắc");
            }
        }

        // Sắp xếp sinh viên theo điểm tăng dần (thuật toán Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    // Hoán đổi điểm
                    float tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    // Hoán đổi tên
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        // Xuất danh sách sinh viên sau khi sắp xếp
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + names[i] + ", Điểm: " + scores[i]);
        }

        scanner.close();
    }
}
