package entity;

public class Nhanvien {
	private String maNV;
	private String tenNV;
	private String sodienthoai;
	private String chucvu;
	private String diachi;
	private String email;
	private String matkhau;
	private double luongcoban;

	public Nhanvien(String maNV, String matkhau) {
		super();
		this.maNV = maNV;
		this.matkhau = matkhau;
	}
	public Nhanvien(String maNV, String tenNV, String sodienthoai, String chucvu, String diachi, String email, String matkhau, double luongcoban) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.sodienthoai = sodienthoai;
		this.chucvu = chucvu;
		this.diachi = diachi;
		this.email = email;
		this.matkhau = matkhau;
		this.luongcoban = luongcoban;
	}
	
	
	public Nhanvien(String maNV) {
		super();
		this.maNV = maNV;
	}
	public Nhanvien() {
		
	}

	public Nhanvien(String maNV, String tenNV, String sodienthoai, String chucvu, String diachi, String email,
			String matkhau) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.sodienthoai = sodienthoai;
		this.chucvu = chucvu;
		this.diachi = diachi;
		this.email = email;
		this.matkhau = matkhau;
	}
	
	public Nhanvien(String maNV, String tenNV, String sodienthoai, String chucvu, String diachi, String email) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.sodienthoai = sodienthoai;
		this.chucvu = chucvu;
		this.diachi = diachi;
		this.email = email;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
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

	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	
	public double getLuongcoban() {
		return luongcoban;
	}
	public void setLuongcoban(double luongcoban) {
		this.luongcoban = luongcoban;
	}
	@Override
	public String toString() {
		return "Nhanvien [maNV=" + maNV + ", tenNV=" + tenNV + ", sodienthoai=" + sodienthoai + ", chucvu=" + chucvu
				+ ", diachi=" + diachi + ", email=" + email + ", taikhoan=" + ", matkhau=" + matkhau + "]";
	}
	

	
}
