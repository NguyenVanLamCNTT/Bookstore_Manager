package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connect.ConnectDatabase;
import entity.ChitietHoadon;

public class DAO_ChitietHoadon {
	
	public boolean	themSanphamvaoCTHD(ChitietHoadon cthoadon) {
		Connection con = ConnectDatabase.getConnection();
		
		String sql = "Insert into chitiethoadon (mahd, masp, dongia, soluong) values (?,?,?,?) ";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, cthoadon.getHoadon().getMahoadon());
			stmt.setInt(2, cthoadon.getSanpham().getMaSanpham());
			stmt.setDouble(3, cthoadon.getDongia());
			stmt.setInt(4, cthoadon.getSoluong());
			int n = stmt.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
