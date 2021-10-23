package entity;

public class ChitietHoadon {
	private Hoadon hoadon;
	private Sanpham sanpham;
	private double dongia;
	private int soluong;
	
	public ChitietHoadon() {
		// TODO Auto-generated constructor stub
	}

	public ChitietHoadon(Hoadon hoadon, Sanpham sanpham, double dongia, int soluong) {
		super();
		this.hoadon = hoadon;
		this.sanpham = sanpham;
		this.dongia = dongia;
		this.soluong = soluong;
	}

	public Hoadon getHoadon() {
		return hoadon;
	}

	public void setHoadon(Hoadon hoadon) {
		this.hoadon = hoadon;
	}

	public Sanpham getSanpham() {
		return sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	@Override
	public String toString() {
		return "ChitietHoadon [hoadon=" + hoadon + ", sanpham=" + sanpham + ", dongia=" + dongia + ", soluong="
				+ soluong + "]";
	}

	
	
}
