package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		String sql = "Insert into hoadon (makh,manv, ngaylap_hd, tongtien) values(?,?,?,?) ";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, hoadon.getKhachhang().getMaKH());
			stmt.setString(2, hoadon.getNhanvien().getMaNV());
			stmt.setString(3, dtf.format(now));
			stmt.setDouble(4, hoadon.getTongtien());
			int n = stmt.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
