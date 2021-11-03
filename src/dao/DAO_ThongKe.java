package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import connect.ConnectDatabase;
import entity.Sanpham;

public class DAO_ThongKe {

	public DAO_ThongKe() {
		
	}
	public List<List<String>> searchHDTheoNgay(String ngaybatdau,String ngayketthuc) throws SQLException{
		String sql = "select mahd, ten__nv,tenkh,kh.sodienthoai, kh.diachi,kh.email,ngaylap_hd,tongtien from hoadon as hd join nhanvien as nv on hd.manv = nv.ma_nv join khachhang as kh on hd.makh = kh.ma_kh where ngaylap_hd  between ? and ?";
		List<List<String>> list = new ArrayList<List<String>>();
		Connection con  = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, ngaybatdau);
		stmt.setString(2, ngayketthuc);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			List<String> item = new ArrayList<String>();
			item.add(rs.getString("mahd"));
			item.add(rs.getString("ten__nv"));
			item.add(rs.getString("tenkh"));
			item.add(rs.getString("sodienthoai"));
			item.add(rs.getString("diachi"));
			item.add(rs.getString("email"));
			item.add(rs.getString("ngaylap_hd"));
			item.add(rs.getString("tongtien"));
			list.add(item);
		}
		return list;
	}
	public List<Sanpham> getSanpham() throws SQLException{
		String sql = "select ma_sanpham,ten_sp,dongia,soluongton,trangthai,ten_tacgia,sotrang,nhaxuatban from sanpham";
		List<Sanpham> list =  new ArrayList<Sanpham>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			Sanpham sp = new Sanpham(Integer.parseInt(rs.getString("ma_sanpham")),rs.getString("ten_sp") , Double.parseDouble(rs.getString("dongia")),Integer.parseInt(rs.getString("soluongton")), rs.getString("trangthai"), rs.getString("ten_tacgia"), Integer.parseInt(rs.getString("sotrang")), rs.getString("nhaxuatban"));
			list.add(sp);
		}
		return list;
	}
	public Map<Integer, Integer> getCountSP(List<String> list,String datebatdau,String dateketthuc) throws SQLException{
		String sql = "select sum(soluong) as tong from sanpham as sp join chitiethoadon as cthd on sp.ma_sanpham = cthd.masp join hoadon as hd on hd.mahd= cthd.mahd where sp.ma_sanpham = ? and (ngaylap_hd between ? and ?)";
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt  = con.prepareStatement(sql);
		stmt.setString(2, datebatdau);
		stmt.setString(3, dateketthuc);
		for(String i: list) {
			stmt.setString(1, i);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				if(rs.getString("tong") == null) {
					map.put(Integer.parseInt(i), 0);
				}else {
					map.put(Integer.parseInt(i), Integer.parseInt(rs.getString("tong")));
				}
			}
		}
		return map;
	}
}
