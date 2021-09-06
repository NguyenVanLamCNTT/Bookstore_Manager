package Beans;

public class Sanpham {
	private int maSanpham;
	private String tenSanpham;
	private double dongia;
	private int soluongton;
	private String trangthai;
	private String hinhanh;
	private LoaiSanpham loaiSp;
	private NhaCungcap nhaCC;
	public Sanpham() {
		// TODO Auto-generated constructor stub
	}
	
	public Sanpham(int maSanpham, String tenSanpham, double dongia, int soluongton, String trangthai, String hinhanh,
			LoaiSanpham loaiSp, NhaCungcap nhaCC) {
		super();
		this.maSanpham = maSanpham;
		this.tenSanpham = tenSanpham;
		this.dongia = dongia;
		this.soluongton = soluongton;
		this.trangthai = trangthai;
		this.hinhanh = hinhanh;
		this.loaiSp = loaiSp;
		this.nhaCC = nhaCC;
	}

	public int getMaSanpham() {
		return maSanpham;
	}
	public void setMaSanpham(int maSanpham) {
		this.maSanpham = maSanpham;
	}
	public String getTenSanpham() {
		return tenSanpham;
	}
	public void setTenSanpham(String tenSanpham) {
		this.tenSanpham = tenSanpham;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public int getSoluongton() {
		return soluongton;
	}
	public void setSoluongton(int soluongton) {
		this.soluongton = soluongton;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public LoaiSanpham getLoaiSp() {
		return loaiSp;
	}

	public void setLoaiSp(LoaiSanpham loaiSp) {
		this.loaiSp = loaiSp;
	}

	public NhaCungcap getNhaCC() {
		return nhaCC;
	}

	public void setNhaCC(NhaCungcap nhaCC) {
		this.nhaCC = nhaCC;
	}
	
}
