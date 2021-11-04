package entity;

public class Calam {
	private String maCalam;
	private String tenCalam;
	public Calam() {
		// TODO Auto-generated constructor stub
	}
	public Calam(String maCalam, String tenCalam) {
		super();
		this.maCalam = maCalam;
		this.tenCalam = tenCalam;
	}
	public String getMaCalam() {
		return maCalam;
	}
	public void setMaCalam(String maCalam) {
		this.maCalam = maCalam;
	}
	public String getTenCalam() {
		return tenCalam;
	}
	public void setTenCalam(String tenCalam) {
		this.tenCalam = tenCalam;
	}
	public Calam(String maCalam) {
		super();
		this.maCalam = maCalam;
	}
	
}
