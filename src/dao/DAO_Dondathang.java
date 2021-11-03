package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connect.ConnectDatabase;
import entity.ChitietDondathang;
import entity.ChitietHoadon;
import entity.Dondathang;
import entity.Khachhang;
import entity.TrangthaiDondathang;

public class DAO_Dondathang {
	private Connection con;
	public DAO_Dondathang() {
		// TODO Auto-generated constructor stub
		this.con = ConnectDatabase.getConnection();
	}
	public TrangthaiDondathang getTrangthai(String tenTT) {
		TrangthaiDondathang trangthai = new TrangthaiDondathang();
		String sql = "select * from trangthaidondathang where ten_trangthai = N'"+tenTT+"'";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				trangthai.setMaTrangthai(rs.getString("ma_trangthai"));
				trangthai.setTenTrangthai(rs.getString("ten_trangthai"));
			}
			return trangthai;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	
	}

	public boolean insertDonhang(Dondathang donhang) {
		String sql = "insert into dondathang (makh, manv, ngaydat, ngaygiao,ma_trangthai, thanhtoan) values (?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, donhang.getKhachHang().getMaKH());
			stmt.setString(2, donhang.getNhanvien().getMaNV());
			stmt.setDate(3, (Date) donhang.getNgaydat());
			stmt.setDate(4, (Date) donhang.getNgaygiao());
			stmt.setString(5, donhang.getTrangthai().getMaTrangthai());
			stmt.setString(6, donhang.getThanhtoan());
			int n = stmt.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	public int getMadonhang() {
		int mahd = 0;
		String sql = "SELECT IDENT_CURRENT('dondathang')";
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
	public boolean themSanphamvaoCTHD(ChitietDondathang chitietdonhang) {		
		String sql = "insert into chitietdondathang (madon,masp,soluong,dongia) values (?,?,?,?) ";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, chitietdonhang.getDondathang().getMaDonhang());
			stmt.setInt(2, chitietdonhang.getSanpham().getMaSanpham());
			stmt.setDouble(4, chitietdonhang.getDongia());
			stmt.setInt(3, chitietdonhang.getSoluong());
			int n = stmt.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean capnhatTongtien(double tongtien) {
		String sql = "update dondathang\r\n"
				+ "set tongtien = "+tongtien
				+ "where madon = (SELECT IDENT_CURRENT('dondathang'))";
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
	
}
