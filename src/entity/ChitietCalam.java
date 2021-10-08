package entity;

import java.sql.Date;

public class ChitietCalam {
	private Calam calam;
	private Nhanvien nhanvien;
	private Date ngaylam;
	
	public ChitietCalam() {
		// TODO Auto-generated constructor stub
	}
	
	public ChitietCalam(Calam calam, Nhanvien nhanvien, Date ngaylam) {
		super();
		this.calam = calam;
		this.nhanvien = nhanvien;
		this.ngaylam = ngaylam;
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
		return ngaylam;
	}
	public void setNgaylam(Date ngaylam) {
		this.ngaylam = ngaylam;
	}
	
	
}
