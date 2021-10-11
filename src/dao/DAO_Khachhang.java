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
	public boolean kiemtratontaiKhachhang(Khachhang khachhang) {
		List<Khachhang> dsKhachhang = new ArrayList<Khachhang>();
		Connection con = ConnectDatabase.getConnection();
		String sql = "Select * from khachhang where tenkh = N'"+khachhang.getTenKH()+"' and sodienthoai = '"+khachhang.getSodienthoai() +"' and diachi = '"+khachhang.getDiachi()+"' and email ='"+khachhang.getEmail()+"'";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Khachhang khachhang1 = new Khachhang();
				khachhang1.setMaKH(rs.getInt("ma_kh"));
				dsKhachhang.add(khachhang1);
			}
			if(dsKhachhang.size()==0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
