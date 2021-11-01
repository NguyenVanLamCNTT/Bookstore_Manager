package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDatabase;
import entity.Dondathang;
import entity.LoaiSanpham;
import entity.NhaCungcap;
import entity.Sanpham;

public class DAO_TimKiem {
	
	public DAO_TimKiem() {
		
	}
	public List<LoaiSanpham> searchLoaiSP(String thuocTinh, String tukhoa) throws SQLException{
		String sql = "Select * from loaisanpham where "+ thuocTinh +" like ?";
		List<LoaiSanpham> dslsp = new ArrayList<LoaiSanpham>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, "%"+tukhoa+"%");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			LoaiSanpham loaisp = new LoaiSanpham(rs.getString("ma_loaisp"), rs.getString("tenloaisp"));
			dslsp.add(loaisp);
		}
		return dslsp;
	}
	public List<NhaCungcap> searchNhaCC(String thuocTinh, String tukhoa) throws SQLException{
		String sql = "Select * from nhacungcap where "+ thuocTinh +" like ?";
		List<NhaCungcap> dsncc = new ArrayList<NhaCungcap>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, "%"+tukhoa+"%");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			NhaCungcap ncc = new NhaCungcap(rs.getString("ma_ncc"), rs.getString("ten_ncc"), rs.getString("diachi"));
			dsncc.add(ncc);
		}
		return dsncc;
	}
	public List<List<String>> searchHoaDon(String thuoctinh, String tukhoa) throws SQLException{
		String sql =  "select mahd,ten__nv,tenkh,tongtien,ngaylap_hd from nhanvien as nv join  hoadon as hd on hd.manv = nv.ma_nv join khachhang as kh on kh.ma_kh = hd.makh where ";
		if(thuoctinh.equals("mahd") || thuoctinh.equals("tongtien")) {
			sql = sql + thuoctinh + " = ?";
		}else {
			sql = sql + thuoctinh + " like ?";
		}
		List<List<String>> ds = new ArrayList<List<String>>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, tukhoa);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			List<String> item  = new ArrayList<String>();
			item.add(rs.getString("mahd"));
			item.add(rs.getString("ten__nv"));
			item.add(rs.getString("tenkh"));
			item.add(rs.getString("tongtien"));
			item.add(rs.getString("ngaylap_hd"));
			ds.add(item);
		}
		return ds;
	}
	public List<List<String>> getDanhSachSP(String mahd) throws SQLException{
		String sql = "select masp, ten_sp, sp.dongia, soluong from chitiethoadon as cthd join sanpham as sp on cthd.masp = sp.ma_sanpham where mahd = ?";
		List<List<String>> ds = new ArrayList<List<String>>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, mahd);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			List<String> item  = new ArrayList<String>();
			item.add(rs.getString("masp"));
			item.add(rs.getString("ten_sp"));
			item.add(rs.getString("dongia"));
			item.add(rs.getString("soluong"));
			ds.add(item);
		}
		return ds;
	}
	public List<List<String>> searchDonDatHang(String thuoctinh, String tukhoa) throws SQLException{
		String sql = "select madon,tenkh,ngaydat,ngaygiao,tongtien,ten_trangthai  from khachhang as kh join dondathang as d on d.makh = kh.ma_kh join trangthaidondathang as tt on tt.ma_trangthai = d.ma_trangthai where " + thuoctinh;
		if(thuoctinh.equals("madon") || thuoctinh.equals("tongtien")) {
			sql = sql + " = ?";
		}else {
			sql = sql + " like ?";
		}
		List<List<String>> ds = new ArrayList<List<String>>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, tukhoa);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			List<String> item  = new ArrayList<String>();
			item.add(rs.getString("madon"));
			item.add(rs.getString("tenkh"));
			item.add(rs.getString("ngaydat"));
			item.add(rs.getString("ngaygiao"));
			item.add(rs.getString("tongtien"));
			item.add(rs.getString("ten_trangthai"));
			ds.add(item);
		}
		return ds;
	}
	public List<List<String>> getDanhSachSPDDH(String mahd) throws SQLException{
		String sql = "select ten_sp,soluong,sp.dongia from sanpham as sp join chitietdondathang as ctdd on ctdd.masp = sp.ma_sanpham where madon = ?";
		List<List<String>> ds = new ArrayList<List<String>>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, mahd);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			List<String> item  = new ArrayList<String>();
			item.add(rs.getString("ten_sp"));
			item.add(rs.getString("dongia"));
			item.add(rs.getString("soluong"));
			ds.add(item);
		}
		return ds;
	}
	public List<List<String>> searchSanPham(String thuoctinh, String tukhoa) throws SQLException{
		String sql = "select ma_sanpham,ten_sp,dongia,soluongton,ten_tacgia,sotrang,nhaxuatban,trangthai from sanpham where ";
		if(thuoctinh.equals("ma_sanpham") || thuoctinh.equals("sotrang") || thuoctinh.equals("soluongton") || thuoctinh.equals("dongia")) {
			sql = sql + thuoctinh + " = ?";
		}else {
			sql = sql + thuoctinh + " like ?";
		}
		List<List<String>> dssp = new ArrayList<List<String>>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, tukhoa);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			List<String> item = new ArrayList<String>();
			item.add(rs.getString("ma_sanpham"));
			item.add(rs.getString("ten_sp"));
			item.add(rs.getString("dongia"));
			item.add(rs.getString("soluongton"));
			item.add(rs.getString("ten_tacgia"));
			item.add(rs.getString("sotrang"));
			item.add(rs.getString("nhaxuatban"));
			item.add(rs.getString("trangthai"));
			dssp.add(item);
		}
		return dssp;
	}
}
