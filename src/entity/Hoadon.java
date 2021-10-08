package entity;

import java.sql.Date;

public class Hoadon {
	private int mahoadon;
	private Khachhang khachhang;
	private Nhanvien nhanvien;
	private double tongtien;
	private Date ngaylapHd;
	
	public Hoadon() {
		// TODO Auto-generated constructor stub
	}

	public Hoadon(int mahoadon, Khachhang khachhang, Nhanvien nhanvien, double tongtien, Date ngaylapHd) {
		super();
		this.mahoadon = mahoadon;
		this.khachhang = khachhang;
		this.nhanvien = nhanvien;
		this.tongtien = tongtien;
		this.ngaylapHd = ngaylapHd;
	}

	public int getMahoadon() {
		return mahoadon;
	}

	public void setMahoadon(int mahoadon) {
		this.mahoadon = mahoadon;
	}

	public Khachhang getKhachhang() {
		return khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}

	public Nhanvien getNhanvien() {
		return nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

	public double getTongtien() {
		return tongtien;
	}

	public void setTongtien(double tongtien) {
		this.tongtien = tongtien;
	}

	public Date getNgaylapHd() {
		return ngaylapHd;
	}

	public void setNgaylapHd(Date ngaylapHd) {
		this.ngaylapHd = ngaylapHd;
	}

	@Override
	public String toString() {
		return "Hoadon [mahoadon=" + mahoadon + ", khachhang=" + khachhang + ", nhanvien=" + nhanvien + ", tongtien="
				+ tongtien + ", ngaylapHd=" + ngaylapHd + "]";
	}
	
	 
}
