import java.util.Scanner;

public class SanPham {
    public String tenSp;
    public double donGia;
    public double giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public double getThueNhapKhau() {
        return this.donGia * 0.10; // Tính thuế nhập khẩu là 10% giá sản phẩm
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + this.tenSp);
        System.out.println("Đơn giá: " + this.donGia);
        System.out.println("Giảm giá: " + this.giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        this.tenSp = scanner.nextLine();

        System.out.print("Nhập đơn giá: ");
        this.donGia = scanner.nextDouble();

        System.out.print("Nhập giảm giá: ");
        this.giamGia = scanner.nextDouble();
    }

    public static void main(String[] args) {
        // Tạo đối tượng SanPham và nhập thông tin từ bàn phím
        SanPham sp = new SanPham("", 0, 0);
        sp.nhap();

        // Xuất thông tin sản phẩm ra màn hình
        sp.xuat();
    }
}
