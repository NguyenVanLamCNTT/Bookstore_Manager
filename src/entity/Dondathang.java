package entity;

import java.sql.Date;

public class Dondathang {
	private int maDonhang;
	private Khachhang khachHang;
	private Nhanvien nhanvien;
	private Date ngaydat;
	private Date ngaygiao;
	private double tongtien;
	private TrangthaiDondathang trangthai;
	
	public Dondathang() {
		// TODO Auto-generated constructor stub
	}

	
	public Dondathang(int maDonhang, Khachhang khachHang, Nhanvien nhanvien, Date ngaydat, Date ngaygiao,
			double tongtien, TrangthaiDondathang trangthai) {
		super();
		this.maDonhang = maDonhang;
		this.khachHang = khachHang;
		this.nhanvien = nhanvien;
		this.ngaydat = ngaydat;
		this.ngaygiao = ngaygiao;
		this.tongtien = tongtien;
		this.trangthai = trangthai;
	}


	public int getMaDonhang() {
		return maDonhang;
	}

	public void setMaDonhang(int maDonhang) {
		this.maDonhang = maDonhang;
	}

	public Khachhang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(Khachhang khachHang) {
		this.khachHang = khachHang;
	}

	public Nhanvien getNhanvien() {
		return nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

	public Date getNgaydat() {
		return ngaydat;
	}

	public void setNgaydat(Date ngaydat) {
		this.ngaydat = ngaydat;
	}

	public Date getNgaygiao() {
		return ngaygiao;
	}

	public void setNgaygiao(Date ngaygiao) {
		this.ngaygiao = ngaygiao;
	}

	public double getTongtien() {
		return tongtien;
	}

	public void setTongtien(double tongtien) {
		this.tongtien = tongtien;
	}

	
	public TrangthaiDondathang getTrangthai() {
		return trangthai;
	}


	public void setTrangthai(TrangthaiDondathang trangthai) {
		this.trangthai = trangthai;
	}


	@Override
	public String toString() {
		return "Dondathang [maDonhang=" + maDonhang + ", khachHang=" + khachHang + ", nhanvien=" + nhanvien
				+ ", ngaydat=" + ngaydat + ", ngaygiao=" + ngaygiao + ", tongtien=" + tongtien + "]";
	}
	
	
	
}
