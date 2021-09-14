package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.LoaiSanpham;
import connect.ConnectDatabase;

public class DAO_Loaisanpham {
	 public DAO_Loaisanpham() {
		// TODO Auto-generated constructor stub
	}
	 public static List<LoaiSanpham> getLoaiSanPham() throws SQLException{
		 String sql = "Select * from loaisanpham";
		 List<LoaiSanpham> dslsp = new ArrayList<LoaiSanpham>();
		 Connection con = ConnectDatabase.getConnection();
		 PreparedStatement stmt = con.prepareStatement(sql);
		 ResultSet rs = stmt.executeQuery();
		 while(rs.next()) {
			 LoaiSanpham loaisp = new LoaiSanpham(rs.getString("MaLoaiSP"), rs.getString("TenLoaiSP"));
			 dslsp.add(loaisp); 
		 }
		 return dslsp;
	 }
}
