package Beans;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;

import javax.swing.ImageIcon;

public class Sanpham {
	private int maSanpham;
	private String tenSanpham;
	private double dongia;
	private int soluongton;
	private String trangthai;
	private ImageIcon hinhanh;
	private LoaiSanpham loaiSp;
	private NhaCungcap nhaCC;
	private String tenTacgia;
	private int sotrang;
	private String nhaXB;
	public Sanpham() {
		// TODO Auto-generated constructor stub
	}
	

	public Sanpham(int maSanpham, String tenSanpham, double dongia, int soluongton, String trangthai, ImageIcon hinhanh,
			LoaiSanpham loaiSp, NhaCungcap nhaCC, String tenTacgia, int sotrang, String nhaXB) {
		super();
		this.maSanpham = maSanpham;
		this.tenSanpham = tenSanpham;
		this.dongia = dongia;
		this.soluongton = soluongton;
		this.trangthai = trangthai;
		this.hinhanh = hinhanh;
		this.loaiSp = loaiSp;
		this.nhaCC = nhaCC;
		this.tenTacgia = tenTacgia;
		this.sotrang = sotrang;
		this.nhaXB = nhaXB;
	}

	public int getMaSanpham() {
		return maSanpham;
	}
	public void setMaSanpham(int maSanpham) {
		this.maSanpham = maSanpham;
	}
	public String getTenSanpham() {
		return tenSanpham;
	}
	public void setTenSanpham(String tenSanpham) {
		this.tenSanpham = tenSanpham;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public int getSoluongton() {
		return soluongton;
	}
	public void setSoluongton(int soluongton) {
		this.soluongton = soluongton;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public ImageIcon getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(ImageIcon hinhanh) {
		this.hinhanh = hinhanh;
	}

	public LoaiSanpham getLoaiSp() {
		return loaiSp;
	}

	public void setLoaiSp(LoaiSanpham loaiSp) {
		this.loaiSp = loaiSp;
	}

	public NhaCungcap getNhaCC() {
		return nhaCC;
	}

	public void setNhaCC(NhaCungcap nhaCC) {
		this.nhaCC = nhaCC;
	}

	public String getTenTacgia() {
		return tenTacgia;
	}

	public void setTenTacgia(String tenTacgia) {
		this.tenTacgia = tenTacgia;
	}

	public int getSotrang() {
		return sotrang;
	}

	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}

	public String getNhaXB() {
		return nhaXB;
	}

	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}
	
}
