package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import connect.ConnectDatabase;
import entity.Hoadon;

public class DAO_Hoadon {
	
	public boolean insertHoadon(Hoadon hoadon) {
		Connection con = ConnectDatabase.getConnection();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
 	   	LocalDateTime now = LocalDateTime.now();  
		String sql = "Insert into hoadon (makh,manv, ngaylap_hd, sotiennhan, sotientralai) values(?,?,?,?,?) ";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, hoadon.getKhachhang().getMaKH());
			stmt.setString(2, hoadon.getNhanvien().getMaNV());
			stmt.setString(3, dtf.format(now));
			stmt.setDouble(4, hoadon.getSotiennhan());
			stmt.setDouble(5, hoadon.getSotientralai());
			int n = stmt.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public int getMahoadon() {
		int mahd = 0;
		Connection con = ConnectDatabase.getConnection();
		String sql = "SELECT IDENT_CURRENT('hoadon')";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				mahd = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mahd;
		
	}
	public double getTongtien() {
		double tongtien = 0;
		Connection con = ConnectDatabase.getConnection();
		String sql = "select * from chitiethoadon\r\n"
				+ "select makh, hd.mahd, SUM(dongia * soluong) as tongtien  from hoadon hd join chitiethoadon cthd \r\n"
				+ "On hd.mahd = cthd.mahd \r\n"
				+ "where hd.mahd =  (SELECT IDENT_CURRENT('hoadon'))\r\n"
				+ "group by makh, hd.mahd";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				tongtien = rs.getDouble(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tongtien;
	}
	public boolean capnhatTongtien(double tongtien) {
		Connection con = ConnectDatabase.getConnection();
		String sql = "update hoadon \r\n"
				+ "set tongtien = "+tongtien
				+ "where mahd = (SELECT IDENT_CURRENT('hoadon'))";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			int n = stmt.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return false;
	}
}
