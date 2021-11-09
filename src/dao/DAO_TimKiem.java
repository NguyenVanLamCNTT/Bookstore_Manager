package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import connect.ConnectDatabase;
import entity.Dondathang;
import entity.LoaiSanpham;
import entity.NhaCungcap;
import entity.Sanpham;

public class DAO_TimKiem {
	
	public DAO_TimKiem() {
		
	}
	public List<LoaiSanpham> searchLoaiSP(Map<String, String> mapTK) throws SQLException{
		String sql = "Select * from loaisanpham where ";
		ArrayList<String> list= new ArrayList<>();
		Set<String> set = mapTK.keySet();
		for(String key: set) {
			list.add(" " + key + " like ?");
		}
		String[] arr = new String[list.size()];
		list.toArray(arr);
		sql = sql + String.join(" and ", arr);
		List<LoaiSanpham> dslsp = new ArrayList<LoaiSanpham>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		int j = 1;
		for(String key: set) {
			stmt.setString(j, mapTK.get(key));
			j++;
		}
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			LoaiSanpham loaisp = new LoaiSanpham(rs.getString("ma_loaisp"), rs.getString("tenloaisp"));
			dslsp.add(loaisp);
		}
		return dslsp;
	}
	public List<NhaCungcap> searchNhaCC(Map<String, String> mapTK) throws SQLException{
		String sql = "Select * from nhacungcap where ";
		ArrayList<String> list= new ArrayList<>();
		Set<String> set = mapTK.keySet();
		for(String key: set) {
			list.add(" " + key + " like ?");
		}
		String[] arr = new String[list.size()];
		list.toArray(arr);
		sql = sql + String.join(" and ", arr);
		List<NhaCungcap> dsncc = new ArrayList<NhaCungcap>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		int j = 1;
		for(String key: set) {
			stmt.setString(j, mapTK.get(key));
			j++;
		}
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			NhaCungcap ncc = new NhaCungcap(rs.getString("ma_ncc"), rs.getString("ten_ncc"), rs.getString("diachi"));
			dsncc.add(ncc);
		}
		return dsncc;
	}
	public List<List<String>> searchHoaDon(Map<String, String> mapTK) throws SQLException{
		ArrayList<String> list= new ArrayList<>();
		String sql =  "select mahd,ten__nv,tenkh,tongtien,ngaylap_hd from nhanvien as nv join  hoadon as hd on hd.manv = nv.ma_nv join khachhang as kh on kh.ma_kh = hd.makh where ";
		Set<String> set = mapTK.keySet();
		for(String key: set) {
			if(key.equals("mahd") || key.equals("sodienthoai")) {
				list.add(" " + key + " = ?");
			}else {
				list.add(" " + key + " like ?");
			}
		}
		String[] arr = new String[list.size()];
		list.toArray(arr);
		sql = sql + String.join(" and ", arr);
		List<List<String>> ds = new ArrayList<List<String>>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		int j = 1;
		for(String key: set) {
			stmt.setString(j, mapTK.get(key));
			j++;
		}
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
	public List<List<String>> searchDonDatHang(Map<String, String> mapTK) throws SQLException{
		String sql = "select madon,tenkh,ngaydat,ngaygiao,tongtien,ten_trangthai  from khachhang as kh join dondathang as d on d.makh = kh.ma_kh join trangthaidondathang as tt on tt.ma_trangthai = d.ma_trangthai where ";
		ArrayList<String> list= new ArrayList<>();
		Set<String> set = mapTK.keySet();
		for(String key: set) {
			if(key.equals("madon") || key.equals("kh.sodienthoai")) {
				list.add(" " + key + " = ?");
			}else {
				list.add(" " + key + " like ?");
			}
		}
		String[] arr = new String[list.size()];
		list.toArray(arr);
		sql = sql + String.join(" and ", arr);
		List<List<String>> ds = new ArrayList<List<String>>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		int j = 1;
		for(String key: set) {
			stmt.setString(j, mapTK.get(key));
			j++;
		}
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
	public List<List<String>> searchSanPhamSach(Map<String, String> mapTK) throws SQLException{
		String sql = "select ma_sanpham,ten_sp,dongia,soluongton,ten_tacgia,sotrang,nhaxuatban,trangthai from sanpham as sp join nhacungcap as ncc on sp.ma_ncc = ncc.ma_ncc  where ma_loaisp = 'SA' and ";
		ArrayList<String> list= new ArrayList<>();
		Set<String> set = mapTK.keySet();
		for(String key: set) {
			if(key.equals("ma_sanpham")) {
				list.add(" " + key + " = ?");
			}else {
				list.add(" " + key + " like ?");
			}
		}
		String[] arr = new String[list.size()];
		list.toArray(arr);
		sql = sql + String.join(" and ", arr);
		List<List<String>> dssp = new ArrayList<List<String>>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		int j = 1;
		for(String key: set) {
			stmt.setString(j, mapTK.get(key));
			j++;
		}
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			List<String> item = new ArrayList<String>();
			item.add(rs.getString("ma_sanpham"));
			item.add(rs.getString("ten_sp"));
			item.add(rs.getString("dongia"));
			item.add(rs.getString("soluongton"));
			item.add(rs.getString("ten_tacgia"));
			item.add(rs.getString("nhaxuatban"));
			item.add(rs.getString("sotrang"));
			item.add(rs.getString("trangthai"));
			dssp.add(item);
		}
		return dssp;
	}
	
	public List<List<String>> searchSanPham(Map<String, String> mapTK) throws SQLException{
		String sql = "select ma_sanpham,ten_sp,dongia,soluongton,trangthai from sanpham as sp join nhacungcap as ncc on sp.ma_ncc = ncc.ma_ncc  where ma_loaisp != 'SA' and ";
		ArrayList<String> list= new ArrayList<>();
		Set<String> set = mapTK.keySet();
		for(String key: set) {
			if(key.equals("ma_sanpham")) {
				list.add(" " + key + " = ?");
			}else {
				list.add(" " + key + " like ?");
			}
		}
		String[] arr = new String[list.size()];
		list.toArray(arr);
		sql = sql + String.join(" and ", arr);
		List<List<String>> dssp = new ArrayList<List<String>>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		int j = 1;
		for(String key: set) {
			stmt.setString(j, mapTK.get(key));
			j++;
		}
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			List<String> item = new ArrayList<String>();
			item.add(rs.getString("ma_sanpham"));
			item.add(rs.getString("ten_sp"));
			item.add(rs.getString("dongia"));
			item.add(rs.getString("soluongton"));
			item.add(rs.getString("trangthai"));
			dssp.add(item);
		}
		return dssp;
	}
}
