package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import connect.ConnectDatabase;
import entity.Nhanvien;

public class DAO_ChangePassWord {
      ArrayList<Nhanvien> dsnv;
      
      public  DAO_ChangePassWord() {
		dsnv=new ArrayList<Nhanvien>();
	}
      
      public static boolean changePass(Nhanvien nv) {
    	  Connection conn= ConnectDatabase.getConnection();
    	  int n = 0;
    	  try { 
    	  String sql="update nhanvien set matkhau=? where ma_nv=?";
		  PreparedStatement ps=conn.prepareStatement(sql);
		  ps.setString(1, nv.getMatkhau());
		  n=ps.executeUpdate();
		  
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	  return n>0;
      }
}
