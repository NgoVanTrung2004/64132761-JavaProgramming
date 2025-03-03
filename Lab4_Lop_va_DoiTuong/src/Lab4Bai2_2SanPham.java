import java.util.Scanner;

class SP {
    String ten;
    double gia;
    double giamGia;

    void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        ten = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        gia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }

    void xuat() {
        double thueNhapKhau = gia * 0.1;
        System.out.println("Tên sản phẩm: " + ten);
        System.out.println("Đơn giá: " + gia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + thueNhapKhau);
    }
}

public class Lab4Bai2_2SanPham {
    public static void main(String[] args) {
        SP sp1 = new SP(); 
        SP sp2 = new SP(); 

        System.out.println("Nhập thông tin sản phẩm thứ nhất:");
        sp1.nhap();

        System.out.println("Nhập thông tin sản phẩm thứ hai:");
        sp2.nhap();

        System.out.println("Thông tin sản phẩm thứ nhất:");
        sp1.xuat();

        System.out.println("Thông tin sản phẩm thứ hai:");
        sp2.xuat();
    }
}
