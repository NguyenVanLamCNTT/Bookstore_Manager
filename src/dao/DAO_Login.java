package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connect.ConnectDatabase;
import entity.Nhanvien;

public class DAO_Login {
	ArrayList<Nhanvien> dstk;
    public DAO_Login() {
		// TODO Auto-generated constructor stub
    	dstk=new ArrayList<Nhanvien>();
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
		//	e.printStackTrace();
		}
    	return n>0;
    }
}
