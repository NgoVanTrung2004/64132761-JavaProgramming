/**
 * 
 */

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.Scanner;

	class SanPham {
	    String tenSanPham;
	    Double donGia;

	    public SanPham(String tenSanPham, Double donGia) {
	        this.tenSanPham = tenSanPham;
	        this.donGia = donGia;
	    }

	    
	    public String toString() {
	        return "Tên: " + tenSanPham + ", Giá: " + donGia;
	    }
	}

	public class Lab5Bai3_UngDung_QLSP {
	    public static void main(String[] args) {
	        ArrayList<SanPham> list = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nChọn chức năng:");
	            System.out.println("1. Nhập danh sách sản phẩm");
	            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
	            System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
	            System.out.println("4. Xuất giá trung bình của các sản phẩm");
	            System.out.println("5. Kết thúc");
	            System.out.print("Lựa chọn của bạn: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Xử lý dòng trống

	            switch (choice) {
	                case 1:
	                    System.out.print("Nhập tên sản phẩm: ");
	                    String ten = scanner.nextLine();
	                    System.out.print("Nhập giá sản phẩm: ");
	                    double gia = scanner.nextDouble();
	                    scanner.nextLine(); // Xử lý dòng thừa
	                    list.add(new SanPham(ten, gia));
	                    break;
	                case 2:
	                    Collections.sort(list, new Comparator<SanPham>() {
	                        @Override
	                        public int compare(SanPham o1, SanPham o2) {
	                            return o2.donGia.compareTo(o1.donGia); // Sắp xếp giảm dần
	                        }
	                    });
	                    System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần:");
	                    for (SanPham sp : list) {
	                        System.out.println(sp);
	                    }
	                    break;
	                case 3:
	                    System.out.print("Nhập tên sản phẩm cần xóa: ");
	                    String tenXoa = scanner.nextLine();
	                    boolean removed = false;
	                    for (SanPham sp : list) {
	                        if (sp.tenSanPham.equalsIgnoreCase(tenXoa)) {
	                            list.remove(sp);
	                            removed = true;
	                            System.out.println("Đã xóa sản phẩm: " + tenXoa);
	                            break;
	                        }
	                    }
	                    if (!removed) {
	                        System.out.println("Không tìm thấy sản phẩm có tên: " + tenXoa);
	                    }
	                    break;
	                case 4:
	                    if (list.isEmpty()) {
	                        System.out.println("Danh sách sản phẩm trống!");
	                    } else {
	                        double tongGia = 0;
	                        for (SanPham sp : list) {
	                            tongGia += sp.donGia;
	                        }
	                        double giaTrungBinh = tongGia / list.size();
	                        System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
	                    }
	                    break;
	                case 5:
	                    System.out.println("Chương trình kết thúc.");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	                    break;
	            }
	        }
	    }
	}
