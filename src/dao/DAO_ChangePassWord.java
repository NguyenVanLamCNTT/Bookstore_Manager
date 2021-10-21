package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connect.ConnectDatabase;
import entity.Nhanvien;

public class DAO_ChangePassWord {
      ArrayList<Nhanvien> dsnv;
      
      public  DAO_ChangePassWord() {
		dsnv=new ArrayList<Nhanvien>();
	}
      
      public boolean changePass(Nhanvien nv) {
    	  Connection conn= ConnectDatabase.getConnection();
    	  int n = 0;
    	  try { 
    	  String sql="update [dbo].[nhanvien] set matkhau=? where ma_nv=?";
		  PreparedStatement ps=conn.prepareStatement(sql);
		  ps.setString(1, nv.getMatkhau());
		  ps.setString(2,nv.getMaNV());
		  n=ps.executeUpdate();
		  
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println(e);
		}
    	  return n>0;
      }
      public boolean checkLogin(String manv,String matkhau){
      	Connection conn=ConnectDatabase.getConnection();
      	int n=0;
      	try {
  			String sql="select * from nhanvien where ma_nv=? and matkhau=?";
  			PreparedStatement ps=conn.prepareStatement(sql);
  			ps.setString(1, manv);
  			ps.setString(2, matkhau);
  			ResultSet rs=ps.executeQuery();
  			if(rs.next()) {
  				return true;
  			}
  		} catch (SQLException e) {
  			// TODO: handle exception
  			System.err.println(e);
  			return false;
  		//	e.printStackTrace();
  		}
      	return n>0;
      }
}
