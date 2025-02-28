public class SanPham {
    public String Ten;
    public double Gia;
    public double GiamGia;
    
    // Phương thức tính thuế nhập khẩu (10% giá sản phẩm)
    public double ThueNhapKhau() {
        return this.Gia * 0.10;
    }

    // Phương thức xuất thông tin ra màn hình
    public void xuat() {
        System.out.println("Tên sản phẩm: " + this.Ten);
        System.out.println("Đơn giá: " + this.Gia);
        System.out.println("Giảm giá: " + this.GiamGia);
        System.out.println("Thuế nhập khẩu: " + ThueNhapKhau());
    }
    
    // Phương thức nhập thông tin sản phẩm
    public void nhap(String Ten, double Gia, double GiamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public static void main(String[] args) {
        SanPham sp = new SanPham();
        sp.nhap("Bánh Quy", 20000, 500);
        sp.xuat("Nước Coca", 11000, 1000);
    }
}
