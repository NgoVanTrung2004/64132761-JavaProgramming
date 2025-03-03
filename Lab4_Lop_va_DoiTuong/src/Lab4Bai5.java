import java.util.Scanner;

class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    private double getThueNhapKhau() {
        return this.donGia * 0.10;
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

     public String getTenSp() {
        return this.tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

      public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

      public double getGiamGia() {
        return this.giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Bánh ngọt", 50000, 5000);
        SanPham sp2 = new SanPham("Nước khoáng", 70000);

        System.out.println("Thông tin sản phẩm thứ nhất:");
        sp1.xuat();

        System.out.println("Thông tin sản phẩm thứ hai:");
        sp2.xuat();
    }
}
