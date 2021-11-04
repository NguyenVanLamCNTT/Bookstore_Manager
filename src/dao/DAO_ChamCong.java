package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import connect.ConnectDatabase;
import entity.Calam;
import entity.ChitietCalam;
import entity.Nhanvien;

public class DAO_ChamCong {
     public boolean insertCongLam(ChitietCalam chitiet) throws SQLException {
    	 String sql= "insert into chitietcalam values (?,?,?,?)";
    	 Connection conn=ConnectDatabase.getConnection();
    	 PreparedStatement ps=conn.prepareStatement(sql);
    	 int n=0;
    	 try {
			ps.setString(1, chitiet.getCalam().getMaCalam());
			ps.setString(2, chitiet.getNhanvien().getMaNV());
			ps.setDate(3,  new java.sql.Date(chitiet.getNgaylam().getTime()));
			ps.setString(4, chitiet.getTrangthai());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println(e);
		}
    	 return n>0;
     }
     public ArrayList<ChitietCalam> getValues(String manv) throws SQLException{
    	 String sql="select ngaylam,trangthai from chitietcalam where manv='"+manv+"'";
    	 Connection conn=ConnectDatabase.getConnection();
    	 PreparedStatement ps=conn.prepareStatement(sql);
    	 ArrayList<ChitietCalam> chitiet=new ArrayList<ChitietCalam>();
    	 try {
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ChitietCalam ctcl=new ChitietCalam();
				ctcl.setNgaylam(rs.getDate("ngaylam"));
				ctcl.setTrangthai(rs.getString("trangthai"));
				
				chitiet.add(ctcl);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	 return chitiet;
     }
     public ArrayList<ChitietCalam> getValuesByMonth(int thang,String manv){
    	 String sql="select * from chitietcalam where month(ngaylam)='"+thang+"' and manv='"+manv+"'";
    	 Connection conn=ConnectDatabase.getConnection();
    	 PreparedStatement ps;
    	 ArrayList<ChitietCalam> chitiet=new ArrayList<ChitietCalam>();
		try {
			ps = conn.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ChitietCalam ctcl=new ChitietCalam();
				ctcl.setNgaylam(rs.getDate("ngaylam"));
				ctcl.setTrangthai(rs.getString("trangthai"));
				ctcl.setCalam(new Calam(rs.getString("macalam")));
				ctcl.setNhanvien(new Nhanvien(rs.getString("manv")));
				chitiet.add(ctcl);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	 
    	 return chitiet;	
     }
     
}
