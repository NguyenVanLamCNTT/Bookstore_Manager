package Beans;

public class Nhanvien {
	private int maNV;
	private String tenNV;
	private String sodienthoai;
	private String chucvu;
	private String diachi;
	private String email;
	private Taikhoan taikhoan;
	public Nhanvien() {
		// TODO Auto-generated constructor stub
	}
	public Nhanvien(int maNV, String tenNV, String sodienthoai, String chucvu, String diachi, String email,
			Taikhoan taikhoan) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.sodienthoai = sodienthoai;
		this.chucvu = chucvu;
		this.diachi = diachi;
		this.email = email;
		this.taikhoan = taikhoan;
	}
	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Taikhoan getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(Taikhoan taikhoan) {
		this.taikhoan = taikhoan;
	}
	
}
