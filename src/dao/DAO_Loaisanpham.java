package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDatabase;
import entity.LoaiSanpham;
import entity.NhaCungcap;
import entity.Sanpham;

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
	 public static  boolean updateLoaiSanPham(String maLSP, String tenLoaiSP) {
		 String sql = "update loaisanpham set tenloaisp = ? where ma_loaisp = ?";
		 Connection con = ConnectDatabase.getConnection();
		 try {
			 PreparedStatement stmt = con.prepareStatement(sql);
			 stmt.setString(1, tenLoaiSP);
			 stmt.setString(2, maLSP);
			 stmt.executeUpdate();
			 return true;
		 }catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e);
			 return false;
		}
	 }
	 public List<Sanpham> getSanpham(String name){
		 List<Sanpham> dsSanpham = new ArrayList<Sanpham>();
		 Connection con = ConnectDatabase.getConnection();
		 String sql = "Select * from loaisanpham lsp Join sanpham sp On lsp.ma_loaisp = sp.ma_loaisp where tenloaisp = N'"+name+"'";
		 
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Sanpham sanpham = new Sanpham();
				sanpham.setMaSanpham(rs.getInt("ma_sanpham"));
				sanpham.setTenSanpham(rs.getString("ten_sp"));
				sanpham.setDongia(rs.getDouble("dongia"));
				sanpham.setSoluongton(rs.getInt("soluongton"));
				sanpham.setTrangthai(rs.getString("trangthai"));
				sanpham.setLoaiSp(new LoaiSanpham(rs.getString("ma_loaisp"),rs.getString("tenloaisp")));
//				sanpham.setHinhanh();
				sanpham.setNhaXB(rs.getString("nhaxuatban"));
				sanpham.setSotrang(rs.getInt("sotrang"));
				sanpham.setTenTacgia(rs.getString("ten_tacgia"));
				dsSanpham.add(sanpham);
			}
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		 return dsSanpham;
	 }
	 public List<LoaiSanpham> getLoaiDungcu() throws SQLException{
		 String sql = "Select * from loaisanpham where ma_loaisp != 'SA'";
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
}
