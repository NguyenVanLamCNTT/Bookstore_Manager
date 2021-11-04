package entity;

import java.util.Date;

public class ChitietCalam {
	private Calam calam;
	private Nhanvien nhanvien;
	private Date ngaylam;
	private String trangthai;
	public ChitietCalam() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	
	public ChitietCalam(Calam calam, Nhanvien nhanvien, Date ngaylam, String trangthai) {
		super();
		this.calam = calam;
		this.nhanvien = nhanvien;
		this.ngaylam = ngaylam;
		this.trangthai = trangthai;
	}

	public Calam getCalam() {
		return calam;
	}
	public void setCalam(Calam calam) {
		this.calam = calam;
	}
	public Nhanvien getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}
	public Date getNgaylam() {
		return  ngaylam;
	}
	public void setNgaylam(Date ngaylam) {
		this.ngaylam = ngaylam;
	}
	
	
}
