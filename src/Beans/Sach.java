package Beans;

public class Sach extends Sanpham{
	private String tenTacgia;
	private int sotrang;
	private String nhaXB;
	public Sach() {
		// TODO Auto-generated constructor stub
	}
	public Sach(int maSanpham, String tenSanpham, double dongia, int soluongton, String trangthai, String hinhanh,
			LoaiSanpham loaiSp, NhaCungcap nhaCC, String tenTacgia, int sotrang, String nhaXB) {
		super(maSanpham, tenSanpham, dongia, soluongton, trangthai, hinhanh, loaiSp, nhaCC);
		this.tenTacgia = tenTacgia;
		this.sotrang = sotrang;
		this.nhaXB = nhaXB;
	}
	public String getTenTacgia() {
		return tenTacgia;
	}
	public void setTenTacgia(String tenTacgia) {
		this.tenTacgia = tenTacgia;
	}
	public int getSotrang() {
		return sotrang;
	}
	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}
	public String getNhaXB() {
		return nhaXB;
	}
	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}
	
}
