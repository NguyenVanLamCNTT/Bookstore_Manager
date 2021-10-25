package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connect.ConnectDatabase;
import entity.Nhanvien;

public class DAO_HomeFrame {
     public String getTenNV(String manv) {
    	 Connection con=ConnectDatabase.getConnection();
    	 String sql="select ten__nv from nhanvien where ma_nv='"+manv+"'";
    	 String tennv=null;
    	 
    	 try {
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			    tennv=rs.getString("ten__nv");
			}
			return tennv;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
    	 
     }
     public String getChucVu(String manv) {
    	 Connection con=ConnectDatabase.getConnection();
    	 String sql="select chucvu from nhanvien where ma_nv='"+manv+"'";
    	 PreparedStatement ps=null;
    	 String chucvu=null;
    	 try {
			ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				chucvu=rs.getString("chucvu");
			}
			return chucvu;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
     }
}
