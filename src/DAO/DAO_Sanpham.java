package DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import Beans.LoaiSanpham;
import Beans.NhaCungcap;
import Beans.Sanpham;
import connect.ConnectDatabase;


public class DAO_Sanpham {
	public DAO_Sanpham() {
	}
	public List<Sanpham> getSanpham(String name) throws SQLException{
		String sql = "Select * from sanpham sp inner join loaisanpham lsp "
				+ "On sp.MaLoaiSP = lsp.MaLoaiSP inner join nhacungcap ncc "
				+ "On ncc.MaNCC = sp.MaNCC where TenSP like '%"+name+"%'";
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
//			sanpham.setHinhanh();
			sanpham.setNhaXB(rs.getString("NXB"));
			sanpham.setSotrang(rs.getInt("Sotrang"));
			sanpham.setTenTacgia(rs.getString("TenTacGia"));
			dssp.add(sanpham);
		}
		return dssp;
	}
	public String getImg(String id) throws SQLException, IOException {
		 	InputStream in;
	        FileOutputStream out;
	        String path = "";
	        Connection con  = ConnectDatabase.getConnection();
	        String sql = "Select * from sanpham  where MaSP = "+id;
	        PreparedStatement stmt = con.prepareStatement(sql);
	        ResultSet rs = stmt.executeQuery();
	        File file = new File("brown_nhua.jpg");
	        out = new FileOutputStream(file);
	        if(rs.next()){
	            in = rs.getBinaryStream("HinhAnh");
	            byte[] buffer = new byte[1024];
	            while(in.read(buffer) >0){
	                out.write(buffer);
	            }
	            path = file.getAbsolutePath();
	        }
	        out.close();
	        return path;
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
	public boolean insertSanpham(Sanpham sanpham, String path) {
		String sql = "Insert into sanpham (TenSP, DonGia, SoLuongTon, TrangThai, HinhAnh, TenTacGia, SoTrang, NXB, MaLoaiSP, MaNCC) values (?,?,?,?,?,?,?,?,?,?)";
		Connection con = ConnectDatabase.getConnection();
		PreparedStatement stmt;
		try {
			FileInputStream in = new FileInputStream(path);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, sanpham.getTenSanpham());
			stmt.setDouble(2, sanpham.getDongia());
			stmt.setInt(3, sanpham.getSoluongton());
			stmt.setString(4,sanpham.getTrangthai());
			stmt.setBinaryStream(5, in);
			stmt.setString(6, sanpham.getTenTacgia());
			stmt.setInt(7,sanpham.getSotrang());
			stmt.setString(8, sanpham.getNhaXB());
			stmt.setString(9,sanpham.getLoaiSp().getMaLoaiSp());
			stmt.setString(10, sanpham.getNhaCC().getMaNCC());
			int n = stmt.executeUpdate();
			return n >0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateSanpham(Sanpham sanpham, String path)  {
		String sql = "UPDATE sanpham SET TenSP = ?, DonGia = ?, SoLuongTon = ?,TrangThai = ?,HinhAnh = ?,TenTacGia=?,SoTrang = ?,NXB=?,MaLoaiSP = ?, ManCC=?  WHERE MaSP = ?";
		Connection con = ConnectDatabase.getConnection();
		try {
			FileInputStream in = new FileInputStream(path);
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, sanpham.getTenSanpham());
			stmt.setDouble(2, sanpham.getDongia());
			stmt.setInt(3, sanpham.getSoluongton());
			stmt.setString(4, sanpham.getTrangthai());
			stmt.setBinaryStream(5, in);
			stmt.setString(6, sanpham.getTenTacgia());
			stmt.setInt(7, sanpham.getSotrang());
			stmt.setString(8, sanpham.getNhaXB());
			stmt.setString(9, sanpham.getLoaiSp().getMaLoaiSp());
			stmt.setString(10,sanpham.getNhaCC().getMaNCC());
			stmt.setInt(11, sanpham.getMaSanpham());
			int n = stmt.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
//	public List<Sanpham> findSanpham(String name){
//		String sql = "Select * from sanpham where TenSp like '%?%'";
//		List<Sanpham> listSanpham = new ArrayList<Sanpham>();
//		Connection con = ConnectDatabase.getConnection();
//		PreparedStatement stmt;
//		try {
//			stmt = con.prepareStatement(sql);
//			stmt.setString(1, name);
//			ResultSet rs = stmt.executeQuery();
//			while(rs.next()) {
//				Sanpham sanpham = new Sanpham();
//				sanpham.setMaSanpham(rs.getInt("MaSP"));
//				sanpham.setTenSanpham(rs.getString("TenSP"));
//				sanpham.setDon
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
}
