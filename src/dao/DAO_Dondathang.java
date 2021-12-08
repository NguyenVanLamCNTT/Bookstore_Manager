package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDatabase;
import entity.ChitietDondathang;
import entity.Dondathang;
import entity.Khachhang;
import entity.Nhanvien;
import entity.Sanpham;
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
	
	public boolean updateChitietDH(ChitietDondathang chitietDondathang) {
		String sql = "update chitietdondathang\r\n"
				+ "set soluong = ?, dongia = ? \r\n"
				+ "where madon = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, chitietDondathang.getSoluong());
			stmt.setDouble(2, chitietDondathang.getDongia());
			stmt.setInt(3, chitietDondathang.getDondathang().getMaDonhang());
			int n = stmt.executeUpdate();
			return n>0;
		} catch (Exception e) {
			// TODO: handle exception
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
	
	public boolean updateDonhang(Dondathang dondathang) {
		String sql = "\r\n"
				+ "update dondathang\r\n"
				+ "set ma_trangthai = ?, ngaydat = ?, ngaygiao = ? , tongtien = ?, thanhtoan = ?\r\n"
				+ "where madon = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, dondathang.getTrangthai().getMaTrangthai());
			stmt.setDate(2, dondathang.getNgaydat());
			stmt.setDate(3, dondathang.getNgaygiao());
			stmt.setDouble(4, dondathang.getTongtien());
			stmt.setString(5, dondathang.getThanhtoan());
			stmt.setInt(6, dondathang.getMaDonhang());
			int n = stmt.executeUpdate();
			return n>0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	public Khachhang getKhachhang(int madonhang) {
		Khachhang khachhang = new Khachhang();
		String sql = "select * from khachhang kh join dondathang  dh\r\n"
				+ "on kh.ma_kh = dh.makh\r\n"
				+ "where madon = "+madonhang;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				khachhang.setDiachi(rs.getString("diachi"));
				khachhang.setEmail(rs.getString("email"));
				khachhang.setMaKH(rs.getInt("ma_kh"));
				khachhang.setSodienthoai(rs.getString("sodienthoai"));
				khachhang.setTenKH(rs.getString("tenkh"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return khachhang;
	}
	public Dondathang getDonhang(int madonhang) {
		Dondathang dondathang = new Dondathang();
		String sql = "select * from dondathang dh join trangthaidondathang tt\r\n"
				+ "on dh.ma_trangthai = tt.ma_trangthai\r\n"
				+ " where dh.madon = " + madonhang;
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				dondathang.setKhachHang(new Khachhang(rs.getInt("makh")));
				dondathang.setMaDonhang(madonhang);
				dondathang.setNgaydat(rs.getDate("ngaydat"));
				dondathang.setNgaygiao(rs.getDate("ngaygiao"));
				dondathang.setNhanvien(new Nhanvien(rs.getString("manv")));
				dondathang.setThanhtoan(rs.getString("thanhtoan"));
//				dondathang.setTongtien(rs.getDouble("tongtien"));
				dondathang.setTrangthai(new TrangthaiDondathang(rs.getString("ma_trangthai"), rs.getString("ten_trangthai")));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dondathang;
	}
	public List<ChitietDondathang> getChitietDondathang(int madonhang){
		List<ChitietDondathang> chitietDondathangs = new ArrayList<ChitietDondathang>();
		String sql = "select * from chitietdondathang ctdh join sanpham sp \n"
				+ "on ctdh.masp = sp.ma_sanpham \r\n"
				+ "where madon = "+madonhang;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Sanpham sanpham = new Sanpham(rs.getInt("masp"),rs.getString("ten_sp"));
				ChitietDondathang ctdh = new ChitietDondathang();
				ctdh.setDondathang(new Dondathang(madonhang));
				ctdh.setDongia(rs.getDouble("dongia"));
				ctdh.setSanpham(sanpham);
				ctdh.setSoluong(rs.getInt("soluong"));
				chitietDondathangs.add(ctdh);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return chitietDondathangs;
	}
}
