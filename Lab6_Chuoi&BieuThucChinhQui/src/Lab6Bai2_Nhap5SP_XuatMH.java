 
import java.util.ArrayList;
import java.util.Scanner;

class SanPham {
    String tenSp;
    double donGia;
    String hang;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        donGia = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập hãng sản phẩm: ");
        hang = scanner.nextLine();
    }

     public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp + ", Giá: " + donGia + ", Hãng: " + hang);
    }
}

public class Lab6Bai2_Nhap5SP_XuatMH {
    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập danh sách 5 sản phẩm
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }

        System.out.println("\nCác sản phẩm có hãng là Nokia:");
        for (SanPham sp : list) {
            if ("Nokia".equalsIgnoreCase(sp.hang)) {
                sp.xuat();
            }
        }
    }
}

