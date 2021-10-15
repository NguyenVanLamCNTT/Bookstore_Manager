package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDatabase;
import entity.ChitietHoadon;
import entity.Hoadon;
import entity.Sanpham;

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
	public List<ChitietHoadon> getDsChitietHoadon(){
		List<ChitietHoadon> dsCTHD = new ArrayList<ChitietHoadon>();
		Connection con = ConnectDatabase.getConnection();
		String sql = "select * from chitiethoadon cthd join sanpham sp\r\n"
				+ "On cthd.masp = sp.ma_sanpham\r\n"
				+ "where mahd =  (SELECT IDENT_CURRENT('hoadon'))";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				ChitietHoadon chitiethoadon = new ChitietHoadon();
				chitiethoadon.setHoadon(new Hoadon(rs.getInt("mahd")));
				chitiethoadon.setSanpham(new Sanpham(rs.getInt("masp"), rs.getString("ten_sp")));
				chitiethoadon.setDongia(rs.getDouble("dongia"));
				chitiethoadon.setSoluong(rs.getInt("soluong"));
				dsCTHD.add(chitiethoadon);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsCTHD;
	}
	public boolean xoaSanpham(int masanpham) {
		Connection con = ConnectDatabase.getConnection();
		String sql = "delete from chitiethoadon where mahd = (SELECT IDENT_CURRENT('hoadon')) and masp = "+masanpham; 
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			int n = stmt.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean capnhatChitietHD(ChitietHoadon cthd) {
		Connection con = ConnectDatabase.getConnection();
		String sql = "update chitiethoadon set masp = ?, dongia = ?, soluong = ?  where mahd = ? and masp = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, cthd.getSanpham().getMaSanpham());
			stmt.setDouble(2, cthd.getDongia());
			stmt.setInt(3, cthd.getSoluong());
			stmt.setInt(4, cthd.getHoadon().getMahoadon());
			stmt.setInt(5, cthd.getSanpham().getMaSanpham());
			int n = stmt.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
