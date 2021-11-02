package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDatabase;

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
}
