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
		String sql = "Select * from sanpham sp inner join loaisanpham lsp "
				+ "On sp.MaLoaiSP = lsp.MaLoaiSP inner join nhacungcap ncc "
				+ "On ncc.MaNCC = sp.MaNCC";
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
			sanpham.setLoaiSp(new LoaiSanpham(rs.getString("MaLoaiSP"),rs.getString("TenLoaiSP")));
			sanpham.setNhaCC(new NhaCungcap(rs.getString("MaNCC"),rs.getString("TenNCC"), rs.getString("DiaChi")));
			sanpham.setHinhanh(rs.getString("HinhAnh"));
			sanpham.setNhaXB(rs.getString("NXB"));
			sanpham.setSotrang(rs.getInt("Sotrang"));
			sanpham.setTenTacgia(rs.getString("TenTacGia"));
			dssp.add(sanpham);
		}
		return dssp;
	}
	public List<LoaiSanpham> getLoaiSanpham() throws SQLException{
		String sql = "Select * from loaisanpham";
		List<LoaiSanpham> dsLoaiSp = new ArrayList<LoaiSanpham>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			LoaiSanpham loaisp = new LoaiSanpham();
			loaisp.setMaLoaiSp(rs.getString("MaLoaiSP"));
			loaisp.setTenLoaiSp(rs.getString("TenLoaiSP"));
			dsLoaiSp.add(loaisp);
		}
		return dsLoaiSp;
	}
	public List<NhaCungcap> getNhacungcap () throws SQLException{
		String sql = "Select * from nhacungcap";
		List<NhaCungcap> dsNhacungcap = new ArrayList<NhaCungcap>();
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			NhaCungcap nhacungcap = new NhaCungcap();
			nhacungcap.setMaNCC(rs.getString("MaNCC"));
			nhacungcap.setTenNCC(rs.getString("TenNCC"));
			nhacungcap.setDiachi(rs.getString("DiaChi"));
			dsNhacungcap.add(nhacungcap);
		}
		return dsNhacungcap;
	}
	public boolean deleteSanpham(String id) throws SQLException {
		String sql = "Delete from sanpham where MaSP = "+id;
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		int n = stmt.executeUpdate();
		return n>0;	
	}
}
