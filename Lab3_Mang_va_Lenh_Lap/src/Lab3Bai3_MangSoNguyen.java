/**
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 */
public class Lab3Bai3_MangSoNguyen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Nhập mảng số nguyên từ bàn phím
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sắp xếp và xuất mảng
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        // Tìm phần tử có giá trị nhỏ nhất
        int min = array[0];
        System.out.println("Phần tử nhỏ nhất của mảng: " + min);

        // Tính trung bình cộng các phần tử chia hết cho 3
        int sum = 0;
        int count = 0;
        for (int num : array) {
        	 if (num % 3 == 0) {
                 sum += num;
                 count++;
             }
         }
         
         if (count > 0) {
             double average = (double) sum / count;
             System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + average);
         } else {
             System.out.println("Không có phần tử nào chia hết cho 3.");
         }

         scanner.close();
     }
 }