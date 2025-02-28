/**
 * 
 */
package viduTL;

/**
 * 
 */
public class SanPham {
	
	// định nghĩa các thuộc tính
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP;
	// Hàm tạo
	public SanPham() {
		
	}
	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
		
		this. maSP = maSP;
		this. tenSP = tenSP;
		this. loaiSP = loaiSP;
		this. anhSP = anhSP;
	}
	
	public int getMaSP() {
		return maSP;
	}
	
	public void setMaSP(int MaSP) {
		
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getLoaiSP() {
		return loaiSP;
	}
	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}
	public String getAnhSP() {
		return anhSP;
	}
	public void setAnhSP(String anhSP) {
		this.anhSP = anhSP;
	}
		
	
	
}
