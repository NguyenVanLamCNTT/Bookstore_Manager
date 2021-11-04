package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDatabase;
import entity.NhaCungcap;

public class DAO_NhaCungCap {

	public DAO_NhaCungCap() {
		
	}
	public List<NhaCungcap> getNhaCungCap() throws SQLException{
		String sql = "Select * from nhacungcap";
		List<NhaCungcap> dsncc = new ArrayList<NhaCungcap>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			NhaCungcap ncc = new NhaCungcap(rs.getString("ma_ncc"),rs.getString("ten_ncc"),rs.getString("diachi"));
			dsncc.add(ncc);
		}
		return dsncc;
	}
	
	public boolean insert(String mancc, String tenncc,String diachi) throws SQLException {
		String sql = "insert into nhacungcap values(?,?,?)";
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, mancc);
		stmt.setString(2, tenncc);
		stmt.setString(3, diachi);
		stmt.executeUpdate();
		return true;
	}
	public boolean delete(String mancc) throws SQLException {
		String sql = "delete from nhacungcap where ma_ncc = ?";
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, mancc);
		stmt.executeUpdate();
		return true;
	}
	public boolean update(String mancc,String tenncc,String diachi) throws SQLException {
		String sql = "update nhacungcap set ten_ncc = ?, diachi = ? where ma_ncc = ?";
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, tenncc);
		stmt.setString(2, diachi);
		stmt.setString(3, mancc);
		stmt.executeUpdate();
		return true;
	}
}
