package Beans;

public class NhaCungcap {
	private String maNCC;
	private String tenNCC;
	private String diachi;
	
	public NhaCungcap(String maNCC) {
		this.maNCC = maNCC;
	}
	public NhaCungcap(String maNCC, String tenNCC, String diachi) {
		super();
		this.maNCC = maNCC;
		this.tenNCC = tenNCC;
		this.diachi = diachi;
	}
	public String getMaNCC() {
		return maNCC;
	}
	public void setMaNCC(String maNCC) {
		this.maNCC = maNCC;
	}
	public String getTenNCC() {
		return tenNCC;
	}
	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
}
