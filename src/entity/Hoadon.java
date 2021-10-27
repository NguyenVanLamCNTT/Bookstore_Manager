package entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Hoadon {
	private int mahoadon;
	private Khachhang khachhang;
	private Nhanvien nhanvien;
	private double tongtien;
	private Date ngaylapHd;
	private double sotiennhan;
	private double sotientralai;
	private List<ChitietHoadon> chitietHoadon;
	
	public Hoadon() {
		// TODO Auto-generated constructor stub
		this.chitietHoadon = new ArrayList<ChitietHoadon>();
	}

	public Hoadon(int mahoadon, Khachhang khachhang, Nhanvien nhanvien, Date ngaylapHd, double sotiennhan, double sotientralai) {
		super();
		this.mahoadon = mahoadon;
		this.khachhang = khachhang;
		this.nhanvien = nhanvien;
		this.chitietHoadon = new ArrayList<ChitietHoadon>();
		this.ngaylapHd = ngaylapHd;
		this.sotiennhan = sotiennhan;
		this.sotientralai = sotientralai;
	}
	
	public void addChitietHoadon(Hoadon hoadon, Sanpham sanpham, double dongia, int soluong) {
		ChitietHoadon cthd = new ChitietHoadon(hoadon, sanpham, dongia, soluong);
		chitietHoadon.add(cthd);
		this.tongtien += (cthd.getDongia()*cthd.getSoluong());
	}
	public void removeChitietHoadon(int i) {
		double tientru = (chitietHoadon.get(i).getDongia() * chitietHoadon.get(i).getSoluong()) ;
		chitietHoadon.remove(i);
		this.tongtien -= tientru;
	}
	public void updateChitietHoadon(int i, int soluong) {
		double tientru = (chitietHoadon.get(i).getDongia() * chitietHoadon.get(i).getSoluong()) ;
		this.tongtien -= tientru;
		chitietHoadon.get(i).setSoluong(soluong);
		this.tongtien += (chitietHoadon.get(i).getDongia() * chitietHoadon.get(i).getSoluong()) ;
	}
	public Hoadon(int mahoadon) {
		super();
		this.mahoadon = mahoadon;
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

	public List<ChitietHoadon> getChitietHoadon() {
		return chitietHoadon;
	}

	
	public double getSotiennhan() {
		return sotiennhan;
	}

	public void setSotiennhan(double sotiennhan) {
		this.sotiennhan = sotiennhan;
	}

	public double getSotientralai() {
		return sotientralai;
	}

	public void setSotientralai(double sotientralai) {
		this.sotientralai = sotientralai;
	}

	@Override
	public String toString() {
		return "Hoadon [mahoadon=" + mahoadon + ", khachhang=" + khachhang + ", nhanvien=" + nhanvien + ", tongtien="
				+ tongtien + ", ngaylapHd=" + ngaylapHd + "]";
	}
	
	 
}
