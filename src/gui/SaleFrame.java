/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.SQLException;
import java.util.List;

import dao.DAO_Hoadon;
import dao.DAO_Khachhang;
import dao.DAO_Loaisanpham;
import entity.Hoadon;
import entity.Khachhang;
import entity.LoaiSanpham;
import entity.Sanpham;

/**
 *
 * @author Lenovo
 */
public class SaleFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public SaleFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        disabled();
        loadCbxLoaiSanpham();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnThoat = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        labelBanHang = new javax.swing.JLabel();
        labelTenNV = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelNhapKH = new javax.swing.JPanel();
        labelTenKH = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        labelDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        labelSDT = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelLoaiSanPham = new javax.swing.JLabel();
        cbLoaiSP = new javax.swing.JComboBox<>();
        labelTenSP = new javax.swing.JLabel();
        cbTenSP = new javax.swing.JComboBox<>();
        labelDonGia = new javax.swing.JLabel();
        labelSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        labelThanhTien = new javax.swing.JLabel();
        btnThemSP = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        btnHoaDonMoi = new javax.swing.JButton();
        btnInHoaDon = new javax.swing.JButton();
        labelTongTienHD = new javax.swing.JLabel();
        labelTienNhanTuKH = new javax.swing.JLabel();
        txtTienNhanTuKH = new javax.swing.JTextField();
        labelTienDu = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        txtMaTimKiem = new javax.swing.JTextField();
        labelMaHD = new javax.swing.JLabel();
        valueTienDu = new javax.swing.JLabel();
        valueTongTien = new javax.swing.JLabel();
        valueDonGia = new javax.swing.JLabel();
        valueThanhTien = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBanHang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        labelBanHang.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelBanHang.setText("BÁN HÀNG");

        labelTenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenNV.setText("Họ tên nhân viên: ");

        panelNhapKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenKH.setText("Tên khách hàng");

        labelDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDiaChi.setText("Địa chỉ");

        labelSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSDT.setText("Số điện thoại");

        labelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEmail.setText("Email");

        javax.swing.GroupLayout panelNhapKHLayout = new javax.swing.GroupLayout(panelNhapKH);
        panelNhapKH.setLayout(panelNhapKHLayout);
        panelNhapKHLayout.setHorizontalGroup(
            panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNhapKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNhapKHLayout.createSequentialGroup()
                        .addGap(0, 59, Short.MAX_VALUE)
                        .addComponent(labelDiaChi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(labelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(panelNhapKHLayout.createSequentialGroup()
                        .addComponent(labelTenKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenKH)
                        .addGap(20, 20, 20)
                        .addComponent(labelSDT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelNhapKHLayout.setVerticalGroup(
            panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNhapKHLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTenKH)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSDT)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDiaChi)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        labelLoaiSanPham.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLoaiSanPham.setText("Loại sản phẩm");

        cbLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLoaiSP.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbLoaiSPPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        labelTenSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenSP.setText("Tên sản phẩm");

        cbTenSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelDonGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDonGia.setText("Đơn giá");

        labelSoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSoLuong.setText("Số lượng");

        labelThanhTien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelThanhTien.setText("Thành tiền");

        btnThemSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThemSP.setText("Thêm sản phẩm");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        btnLuu.setText("Lưiu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        btnQuayLai.setText("Quay Lại");

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fix.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");

        btnThanhToan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pay.png"))); // NOI18N
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnHoaDonMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHoaDonMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/receipt.png"))); // NOI18N
        btnHoaDonMoi.setText("Hóa đơn mới");
        btnHoaDonMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonMoiActionPerformed(evt);
            }
        });

        btnInHoaDon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/printer.png"))); // NOI18N
        btnInHoaDon.setText("In hóa đơn");
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        labelTongTienHD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTongTienHD.setText("Tổng tiền hóa đơn:");

        labelTienNhanTuKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTienNhanTuKH.setText("Tiền nhận từ khách hàng");

        txtTienNhanTuKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienNhanTuKHActionPerformed(evt);
            }
        });

        labelTienDu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTienDu.setText("Tiền dư:");

        btnTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnTimKiem.setText("Tìm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        labelMaHD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelMaHD.setText("Mã Hóa đơn");

        valueTienDu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueTienDu.setText("value Tien Du");

        valueTongTien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueTongTien.setText("value tổng tiền");

        valueDonGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueDonGia.setText("0");
        valueDonGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        valueThanhTien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueThanhTien.setText("0");
        valueThanhTien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTenNV))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnThoat)
                                .addGap(503, 503, 503)
                                .addComponent(labelBanHang))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnThemSP, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(btnHoaDonMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(165, 165, 165)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(119, 119, 119)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73)
                                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(99, 99, 99)
                                                .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTongTienHD)
                        .addGap(18, 18, 18)
                        .addComponent(valueTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(labelTienNhanTuKH)
                        .addGap(18, 18, 18)
                        .addComponent(txtTienNhanTuKH, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(labelTienDu)
                        .addGap(18, 18, 18)
                        .addComponent(valueTienDu, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(txtMaTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelMaHD)
                                .addGap(67, 67, 67))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelThanhTien)
                                .addGap(18, 18, 18)
                                .addComponent(valueThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelLoaiSanPham)
                                .addGap(18, 18, 18)
                                .addComponent(cbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelDonGia)
                                .addGap(18, 18, 18)
                                .addComponent(valueDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTenSP)
                                .addGap(18, 18, 18)
                                .addComponent(cbTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelSoLuong)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(125, 125, 125)
                        .addComponent(panelNhapKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBanHang)
                    .addComponent(btnThoat))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTenNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(panelNhapKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLoaiSanPham)
                            .addComponent(cbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTenSP)
                            .addComponent(cbTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDonGia)
                            .addComponent(labelSoLuong)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueDonGia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelThanhTien)
                            .addComponent(valueThanhTien))
                        .addGap(54, 54, 54)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnQuayLai)
                    .addComponent(btnHoaDonMoi))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnThanhToan)
                    .addComponent(btnInHoaDon)
                    .addComponent(btnThemSP)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMaHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTongTienHD)
                    .addComponent(labelTienNhanTuKH)
                    .addComponent(txtMaTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTienDu)
                    .addComponent(btnTimKiem)
                    .addComponent(txtTienNhanTuKH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueTienDu)
                    .addComponent(valueTongTien))
                .addGap(18, 18, Short.MAX_VALUE))
        );

        tableBanHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại sản phẩm", "Tên sản phẩm", "Số lượng", "Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBanHang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        btnLuu.setEnabled(true);
        
    	
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
    	insertKhachhang();
    	
    	
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnHoaDonMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonMoiActionPerformed
        // TODO add your handling code here:
    	enabled();
    }//GEN-LAST:event_btnHoaDonMoiActionPerformed

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void txtTienNhanTuKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienNhanTuKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienNhanTuKHActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void cbLoaiSPPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbLoaiSPPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    	String name = cbLoaiSP.getSelectedItem().toString();
    	loadSanphamByName(name);
    }//GEN-LAST:event_cbLoaiSPPopupMenuWillBecomeInvisible

    private void disabled() {
    	btnLuu.setEnabled(false);
    	btnXoa.setEnabled(false);
    	btnThanhToan.setEnabled(false);
    	btnThemSP.setEnabled(false);
    	btnInHoaDon.setEnabled(false);
    	btnSua.setEnabled(false);
    	txtTienNhanTuKH.setEnabled(false);
    	txtDiaChi.setEnabled(false);
    	txtEmail.setEnabled(false);
    	txtMaTimKiem.setEnabled(false);
    	txtSDT.setEnabled(false);
    	txtSoLuong.setEnabled(false);
    	txtTenKH.setEnabled(false);
    	cbLoaiSP.setEnabled(false);
    	cbTenSP.setEnabled(false);
    }
    
    private void enabled(){
    	txtTienNhanTuKH.setEnabled(true);
    	txtDiaChi.setEnabled(true);
    	txtEmail.setEnabled(true);
    	txtMaTimKiem.setEnabled(true);
    	txtSDT.setEnabled(true);
    	txtSoLuong.setEnabled(true);
    	txtTenKH.setEnabled(true);
    	cbLoaiSP.setEnabled(true);
    	cbTenSP.setEnabled(true);
    	btnThemSP.setEnabled(true);
    }
    
    private void loadCbxLoaiSanpham() {
    	cbLoaiSP.removeAllItems();
    	DAO_Loaisanpham dao_loaisanpham = new DAO_Loaisanpham();
    	try {
			List<LoaiSanpham> dsLoaiSP = dao_loaisanpham.getLoaiSanPham();
			for(LoaiSanpham loaisp : dsLoaiSP) {
				cbLoaiSP.addItem(loaisp.getTenLoaiSp());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    private void loadSanphamByName(String name) {
    	cbTenSP.removeAllItems();
    	DAO_Loaisanpham dao_Loaisanpham = new DAO_Loaisanpham();
    	List<Sanpham> dsSanpham = dao_Loaisanpham.getSanpham(name);
    	for(Sanpham sanpham : dsSanpham) {
    		cbTenSP.addItem(sanpham.getTenSanpham());
    	}
    }
    
    private void insertKhachhang() {
    	DAO_Khachhang dao_khachhang = new DAO_Khachhang();
    	Khachhang khachhang = new Khachhang();
    	khachhang.setTenKH(txtTenKH.getText());
    	khachhang.setSodienthoai(txtSDT.getText());
    	khachhang.setEmail(txtEmail.getText());
    	khachhang.setDiachi(txtDiaChi.getText());
    	dao_khachhang.insertKhachhang(khachhang);
    }
    private void insertHoadon(Hoadon hoadon) {
    	DAO_Hoadon dao_Hoadon = new DAO_Hoadon();
    	dao_Hoadon.insertHoadon(hoadon);
    	
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SaleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHoaDonMoi;
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLoaiSP;
    private javax.swing.JComboBox<String> cbTenSP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelBanHang;
    private javax.swing.JLabel labelDiaChi;
    private javax.swing.JLabel labelDonGia;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLoaiSanPham;
    private javax.swing.JLabel labelMaHD;
    private javax.swing.JLabel labelSDT;
    private javax.swing.JLabel labelSoLuong;
    private javax.swing.JLabel labelTenKH;
    private javax.swing.JLabel labelTenNV;
    private javax.swing.JLabel labelTenSP;
    private javax.swing.JLabel labelThanhTien;
    private javax.swing.JLabel labelTienDu;
    private javax.swing.JLabel labelTienNhanTuKH;
    private javax.swing.JLabel labelTongTienHD;
    private javax.swing.JPanel panelNhapKH;
    private javax.swing.JTable tableBanHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaTimKiem;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTienNhanTuKH;
    private javax.swing.JLabel valueDonGia;
    private javax.swing.JLabel valueThanhTien;
    private javax.swing.JLabel valueTienDu;
    private javax.swing.JLabel valueTongTien;
    // End of variables declaration//GEN-END:variables
}
