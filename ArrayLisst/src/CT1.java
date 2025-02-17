/**
 * 
 */

/**
 * 
 */

import java.util.ArrayList;

public class CT1 {

	public static void main(String[] args) {
		
		// Khai báo danh sách sản phẩm
		ArrayList<SanPham1> dsSanPham;
		//Xin mới
		dsSanPham = new ArrayList<SanPham1>();
		
		// Nhập 3 sản phẩm
		SanPham1 sp1 = new SanPham1(0, "Kem", "Giải khát", null);
		SanPham1 sp2 = new SanPham1(1, "Cơm", "Đồ ăn", null);
		SanPham1 sp3 = new SanPham1(2, "Phở", "Đồ ăn", null);
	
		//Thêm vào ArrayList
		dsSanPham.add(new SanPham1(0, "Kem", "Giải khát", null));
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
		// for(SanPham x: dsSanPham)
		// System.out.Println(x.toString());
		
		for (int i=0; i<dsSanPham.size(); i++) {
			SanPham1 sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
	}
}
