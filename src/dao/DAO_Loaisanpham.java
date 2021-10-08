package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDatabase;
import entity.LoaiSanpham;

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
			 LoaiSanpham loaisp = new LoaiSanpham(rs.getString("ma_loaisp"), rs.getString("tenloaisp"));
			 dslsp.add(loaisp); 
		 }
		 return dslsp;
	 }
	 public static boolean insert(String maLoaiSP, String tenLoaiSP) {
		 try {
			 Connection con = ConnectDatabase.getConnection();
			 String sql = "insert into loaisanpham values(?,?)";
			 PreparedStatement stmt = con.prepareStatement(sql);
			 stmt.setString(1, maLoaiSP);
			 stmt.setString(2, tenLoaiSP);
			 stmt.executeUpdate();
			 return true;
		 }catch (SQLException err) {
			// TODO: handle exception
			 System.out.println(err);
			 return false;
		}
	 }
	 public static boolean delete(String maLoaiSP) {
		 try {
			 Connection con = ConnectDatabase.getConnection();
			 String sql = "delete from loaisanpham where ma_loaisp=?";
			 PreparedStatement stmt = con.prepareStatement(sql);
			 stmt.setString(1, maLoaiSP);
			 stmt.executeUpdate();
			 return true;
		 }catch (SQLException e) {
			// TODO: handle exception
			 System.out.println(e);
			 return false;
		}
	 }
}
