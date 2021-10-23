package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDatabase;
import entity.Khachhang;

public class DAO_Khachhang {
	
	public boolean insertKhachhang(Khachhang khachhang) {
		Connection con = ConnectDatabase.getConnection();
		String sql = "Insert into khachhang (tenkh, sodienthoai, diachi, email) values (?,?,?,?) ";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, khachhang.getTenKH());
			stmt.setString(2, khachhang.getSodienthoai());
			stmt.setString(3, khachhang.getDiachi());
			stmt.setString(4, khachhang.getEmail());
			int n = stmt.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	public List<Khachhang> kiemtratontaiKhachhang(Khachhang khachhang) {
		List<Khachhang> dsKhachhang = new ArrayList<Khachhang>();
		Connection con = ConnectDatabase.getConnection();
		String sql = "Select * from khachhang where tenkh = N'"+khachhang.getTenKH()+"' and sodienthoai = '"+khachhang.getSodienthoai() +"' and diachi = '"+khachhang.getDiachi()+"' and email ='"+khachhang.getEmail()+"'";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				khachhang.setMaKH(rs.getInt("ma_kh"));
				dsKhachhang.add(khachhang);
			}
			return dsKhachhang;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public Khachhang getKhachhang(String sodienthoai) {
		Khachhang khachhang = new Khachhang();
		Connection con = ConnectDatabase.getConnection();
		String sql = "Select * from khachhang where sodienthoai = '"+sodienthoai+"'";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				khachhang.setTenKH(rs.getString("tenkh"));
				khachhang.setSodienthoai(rs.getString("sodienthoai"));
				khachhang.setDiachi(rs.getString("diachi"));
				khachhang.setEmail(rs.getString("email"));
				khachhang.setMaKH(rs.getInt("ma_kh"));
			}
			return khachhang;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
