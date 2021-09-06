package Beans;

public class LoaiSanpham {
	private String maLoaiSp;
	private String tenLoaiSp;
	
	public LoaiSanpham(String maLoaiSp) {
		this.maLoaiSp = maLoaiSp;
	}
	public LoaiSanpham(String maLoaiSp, String tenLoaiSp) {
		super();
		this.maLoaiSp = maLoaiSp;
		this.tenLoaiSp = tenLoaiSp;
	}
	public String getMaLoaiSp() {
		return maLoaiSp;
	}
	public void setMaLoaiSp(String maLoaiSp) {
		this.maLoaiSp = maLoaiSp;
	}
	public String getTenLoaiSp() {
		return tenLoaiSp;
	}
	public void setTenLoaiSp(String tenLoaiSp) {
		this.tenLoaiSp = tenLoaiSp;
	}
}
