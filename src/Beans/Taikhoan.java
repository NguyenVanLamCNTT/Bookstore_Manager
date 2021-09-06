package Beans;

public class Taikhoan {
	private String taikhoan;
	private String password;
	public Taikhoan() {
		// TODO Auto-generated constructor stub
	}
	public Taikhoan(String taikhoan, String password) {
		super();
		this.taikhoan = taikhoan;
		this.password = password;
	}
	public String getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
