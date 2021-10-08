package entity;

public class ChitietDondathang {
	private Dondathang dondathang;
	private Sanpham sanpham;
	private int soluong;
	private double dongia;
	
	public ChitietDondathang() {
		// TODO Auto-generated constructor stub
	}
	
	public ChitietDondathang(Dondathang dondathang, Sanpham sanpham, int soluong, double dongia) {
		super();
		this.dondathang = dondathang;
		this.sanpham = sanpham;
		this.soluong = soluong;
		this.dongia = dongia;
	}

	public Dondathang getDondathang() {
		return dondathang;
	}

	public void setDondathang(Dondathang dondathang) {
		this.dondathang = dondathang;
	}

	public Sanpham getSanpham() {
		return sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	@Override
	public String toString() {
		return "ChitietDondathang [dondathang=" + dondathang + ", sanpham=" + sanpham + ", soluong=" + soluong
				+ ", dongia=" + dongia + "]";
	}
	
}
