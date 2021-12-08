package entity;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Dondathang {
	private int maDonhang;
	private Khachhang khachHang;
	private Nhanvien nhanvien;
	private Date ngaydat;
	private Date ngaygiao;
	private double tongtien;
	private String thanhtoan;
	private TrangthaiDondathang trangthai;
	
	private List<ChitietDondathang> chitietDondathangs;
	public Dondathang() {
		// TODO Auto-generated constructor stub
		this.chitietDondathangs = new ArrayList<ChitietDondathang>();
		this.tongtien = 0;
	}

	
	public Dondathang(int maDonhang, Khachhang khachHang, Nhanvien nhanvien, Date ngaydat, Date ngaygiao,
		String thanhtoan,TrangthaiDondathang trangthai) {
		super();
		this.maDonhang = maDonhang;
		this.khachHang = khachHang;
		this.nhanvien = nhanvien;
		this.ngaydat = ngaydat;
		this.ngaygiao = ngaygiao;
		this.trangthai = trangthai;
		this.thanhtoan = thanhtoan;
		this.chitietDondathangs = new ArrayList<ChitietDondathang>();
		this.tongtien = 0;
	}
	
	public Dondathang(int maDonhang) {
		this.maDonhang = maDonhang;
	}
	public void addChitietdonhang(Dondathang donhang, Sanpham sanpham, int soluong, double thanhtien) {
		ChitietDondathang ctdh = new ChitietDondathang(donhang, sanpham, soluong, thanhtien);
		this.chitietDondathangs.add(ctdh);
		this.tongtien += ctdh.getSoluong() * ctdh.getDongia();
	}
	public void removeChitietdonhang(int i) {
		double tientru = chitietDondathangs.get(i).getDongia() * chitietDondathangs.get(i).getSoluong();
		chitietDondathangs.remove(i);
		this.tongtien = this.tongtien-tientru;
	}
	
	public void updateChitietdonhang(int i, int soluong) {
		double tientru = (chitietDondathangs.get(i).getDongia() * chitietDondathangs.get(i).getSoluong()) ;
		this.tongtien -= tientru;
		chitietDondathangs.get(i).setSoluong(soluong);
		this.tongtien += (chitietDondathangs.get(i).getDongia() * chitietDondathangs.get(i).getSoluong()) ;
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

	
	public TrangthaiDondathang getTrangthai() {
		return trangthai;
	}


	public void setTrangthai(TrangthaiDondathang trangthai) {
		this.trangthai = trangthai;
	}


	public String getThanhtoan() {
		return thanhtoan;
	}


	public void setThanhtoan(String thanhtoan) {
		this.thanhtoan = thanhtoan;
	}

	public void setTongtien(double tongtien) {
		this.tongtien = tongtien;
	}


	@Override
	public String toString() {
		return "Dondathang [maDonhang=" + maDonhang + ", khachHang=" + khachHang + ", nhanvien=" + nhanvien
				+ ", ngaydat=" + ngaydat + ", ngaygiao=" + ngaygiao + ", tongtien=" + tongtien + ", thanhtoan="
				+ thanhtoan + ", trangthai=" + trangthai + "]";
	}


	
}
