package Beans;

public class Calam {
	private int maCalam;
	private String tenCalam;
	private Nhanvien nhanvien;
	public Calam() {
		// TODO Auto-generated constructor stub
	}
	public Calam(int maCalam, String tenCalam, Nhanvien nhanvien) {
		super();
		this.maCalam = maCalam;
		this.tenCalam = tenCalam;
		this.nhanvien = nhanvien;
	}
	public int getMaCalam() {
		return maCalam;
	}
	public void setMaCalam(int maCalam) {
		this.maCalam = maCalam;
	}
	public String getTenCalam() {
		return tenCalam;
	}
	public void setTenCalam(String tenCalam) {
		this.tenCalam = tenCalam;
	}
	public Nhanvien getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}
	
}
