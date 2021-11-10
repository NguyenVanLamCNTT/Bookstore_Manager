package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connect.ConnectDatabase;
import entity.Nhanvien;

public class DAO_NhanVien {
      public boolean updateTK(Nhanvien nv) {
    	  String sql="update nhanvien set matkhau=? where ma_nv=?";
    	  int n=0;
    	  try {
    		  Connection conn=ConnectDatabase.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, nv.getMatkhau());
			ps.setString(2, nv.getMaNV());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	  return n>0;
      }
      public ArrayList<Nhanvien> getDSNV(){
    	  String sql="select * from nhanvien";
    	  ArrayList<Nhanvien> dsnv=new ArrayList<Nhanvien>();
    	  try {
			Connection connection=ConnectDatabase.getConnection();
			PreparedStatement ps=connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Nhanvien nv= new Nhanvien();
				nv.setMaNV(rs.getString("ma_nv"));
				nv.setTenNV(rs.getString("ten__NV"));
				nv.setSodienthoai(rs.getString("sodienthoai"));
				nv.setChucvu(rs.getString("chucvu"));
				nv.setDiachi(rs.getString("diachi"));
				nv.setEmail(rs.getString("email"));
				nv.setMatkhau(rs.getString("matkhau"));
				dsnv.add(nv);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	  return dsnv;
    			  
      }
      public boolean insert(Nhanvien nv) {
    	  String sql="insert into nhanvien (ma_nv,ten__nv,sodienthoai,chucvu,diachi,email,matkhau) values (?,?,?,?,?,?,?) ";
    	  Connection conn=ConnectDatabase.getConnection();
    	  int n = 0;
    	  try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, nv.getMaNV());
			ps.setString(2, nv.getTenNV());
			ps.setString(3, nv.getSodienthoai());
			ps.setString(4, nv.getChucvu());
			ps.setString(5, nv.getDiachi());
			ps.setString(6, nv.getEmail());
			ps.setString(7, nv.getMatkhau());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	  return n>0;
      }
      public boolean delete(String manv) {
    	  String sql="delete from nhanvien where ma_nv=?";
    	  Connection conn=ConnectDatabase.getConnection();
    	  int n=0;
    	  try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, manv);
			n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	  return n>0;
      }
      public boolean update(Nhanvien nv) {
    	  String sql="update nhanvien set ten__nv=?, sodienthoai=?,chucvu=?,diachi=?,email=? where ma_nv=? ";
    	  Connection conn=ConnectDatabase.getConnection();
    	  int n=0;
    	  try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, nv.getTenNV());
			ps.setString(2, nv.getSodienthoai());
			ps.setString(3, nv.getChucvu());
			ps.setString(4, nv.getDiachi());
			ps.setString(5, nv.getEmail());
			ps.setString(6, nv.getMaNV());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	  return n>0;
      }
      public int getNgayDiTre(String manv) {
    	  String sql="select songayditre=count(trangthai) from chitietcalam where manv='"+manv+"' and trangthai='Tre gio'";
    	  Connection conn=ConnectDatabase.getConnection();
    	  int ngaydilamtre=0;
    	  try {
			  PreparedStatement ps=conn.prepareStatement(sql);
			  ResultSet rs=ps.executeQuery();
			  while(rs.next()) {
				  ngaydilamtre=rs.getInt("songayditre");
			  }
					return ngaydilamtre;  
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
    	
      }
      public int getNgayDungGio(String manv) {
    	  String sql="select songaydunggio=count(trangthai) from chitietcalam where manv='"+manv+"' and trangthai='Dung gio'";
    	  Connection conn=ConnectDatabase.getConnection();
    	  int ngaydidunggio=0;
    	  try {
			  PreparedStatement ps=conn.prepareStatement(sql);
			  ResultSet rs=ps.executeQuery();
			  while(rs.next()) {
				  ngaydidunggio=rs.getInt("songaydunggio");
			  }
					return ngaydidunggio;  
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
    	
      }
      public String getMK(String manv) {
    	  String sql="select matkhau from nhanvien where ma_nv='"+manv+"'";
    	  Connection conn=ConnectDatabase.getConnection();
    	  String mk = null;
    	  try {
			  PreparedStatement ps=conn.prepareStatement(sql);
			  ResultSet rs=ps.executeQuery();
			  while(rs.next()) {
				  mk=rs.getString("matkhau");
			  }
					return mk;  
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
    	
      }
      public int getMonth(String manv) {
    	  String sql="select top 1 thang=MONTH(ngaylam) from chitietcalam where manv='"+manv+"'";
    	  Connection conn=ConnectDatabase.getConnection();
    	  int month=0;
    	  try {
			  PreparedStatement ps=conn.prepareStatement(sql);
			  ResultSet rs=ps.executeQuery();
			  while(rs.next()) {
				  month=rs.getInt("thang");
			  }
					return month;  
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
    	
      }
      
      
}
