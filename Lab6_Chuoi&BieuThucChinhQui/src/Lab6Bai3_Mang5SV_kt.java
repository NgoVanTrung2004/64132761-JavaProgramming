 
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

class SinhVien {
    String hoTen;
    String email;
    String soDienThoai;
    String cmnd;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập họ và tên: ");
        hoTen = scanner.nextLine();
        
        // Nhập và kiểm tra email
        while (true) {
            System.out.print("Nhập email: ");
            email = scanner.nextLine();
            if (Pattern.matches("^[\\w-\\.]+@[\\w-\\.]+\\.[a-z]{2,4}$", email)) {
                break;
            } else {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
            }
        }
        
        // Nhập và kiểm tra số điện thoại
        while (true) {
            System.out.print("Nhập số điện thoại: ");
            soDienThoai = scanner.nextLine();
            if (Pattern.matches("^\\d{10,11}$", soDienThoai)) {
                break;
            } else {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }
        }
        
        // Nhập và kiểm tra CMND
        while (true) {
            System.out.print("Nhập CMND: ");
            cmnd = scanner.nextLine();
            if (Pattern.matches("^\\d{9}|\\d{12}$", cmnd)) {
                break;
            } else {
                System.out.println("CMND không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen + ", Email: " + email + ", Số điện thoại: " + soDienThoai + ", CMND: " + cmnd);
    }
}

public class Lab6Bai3_Mang5SV_kt {
    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();

         for (int i = 0; i < 5; i++) {
            System.out.println("\nNhập thông tin sinh viên thứ " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);
        }

        System.out.println("\nDanh sách sinh viên đã nhập:");
        for (SinhVien sv : list) {
            sv.xuat();
        }
    }
}

