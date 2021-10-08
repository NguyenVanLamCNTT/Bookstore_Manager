package entity;

public class TrangthaiDondathang {
	private String maTrangthai;
	private String tenTrangthai;
	private Dondathang dondathang;
	
	
	public TrangthaiDondathang() {
		
	}
	public TrangthaiDondathang(String maTrangthai, String tenTrangthai, Dondathang dondathang) {
		super();
		this.maTrangthai = maTrangthai;
		this.tenTrangthai = tenTrangthai;
		this.dondathang = dondathang;
	}

	public String getMaTrangthai() {
		return maTrangthai;
	}


	public void setMaTrangthai(String maTrangthai) {
		this.maTrangthai = maTrangthai;
	}


	public String getTenTrangthai() {
		return tenTrangthai;
	}


	public void setTenTrangthai(String tenTrangthai) {
		this.tenTrangthai = tenTrangthai;
	}


	public Dondathang getDondathang() {
		return dondathang;
	}


	public void setDondathang(Dondathang dondathang) {
		this.dondathang = dondathang;
	}


	@Override
	public String toString() {
		return "TrangthaiDondathang [maTrangthai=" + maTrangthai + ", tenTrangthai=" + tenTrangthai + ", dondathang="
				+ dondathang + "]";
	}
	
	
	
	
}
