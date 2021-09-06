package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.LoaiSanpham;
import Beans.NhaCungcap;
import Beans.Sanpham;
import connect.ConnectDatabase;

public class DAO_Sanpham {
	public DAO_Sanpham() {
	}
	public List<Sanpham> getSanpham() throws SQLException{
		String sql = "Select * from sanpham";
		List<Sanpham> dssp = new ArrayList<Sanpham>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			Sanpham sanpham = new Sanpham();
			sanpham.setMaSanpham(rs.getInt("MaSP"));
			sanpham.setTenSanpham(rs.getString("TenSP"));
			sanpham.setDongia(rs.getDouble("DonGia"));
			sanpham.setSoluongton(rs.getInt("SoLuongTon"));
			sanpham.setTrangthai(rs.getString("TrangThai"));
			sanpham.setLoaiSp(new LoaiSanpham(rs.getString("MaLoaiSP")));
			sanpham.setNhaCC(new NhaCungcap(rs.getString("maNCC")));
			sanpham.setHinhanh(rs.getString("HinhAnh"));
			dssp.add(sanpham);
		}
		return dssp;
	}
}
