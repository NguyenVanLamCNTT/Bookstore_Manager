package entity;

public class TrangthaiDondathang {
	private String maTrangthai;
	private String tenTrangthai;

	public TrangthaiDondathang() {
		
	}
	public TrangthaiDondathang(String maTrangthai, String tenTrangthai) {
		super();
		this.maTrangthai = maTrangthai;
		this.tenTrangthai = tenTrangthai;

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
	@Override
	public String toString() {
		return "TrangthaiDondathang [maTrangthai=" + maTrangthai + ", tenTrangthai=" + tenTrangthai + "]";
	}
	
}
