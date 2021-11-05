/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Lenovo
 */
public class ProductFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */
    public ProductFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelQuanLySP = new javax.swing.JPanel();
        labelQLSP = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnThoat = new javax.swing.JButton();
        labelHinhAnh = new javax.swing.JLabel();
        labelMaSP = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        labelTenSP = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        labelDonGia = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        labelSoLuongTon = new javax.swing.JLabel();
        txtSoLuongTon = new javax.swing.JTextField();
        labelTrangThai = new javax.swing.JLabel();
        txtTrangThai = new javax.swing.JTextField();
        labelMaNCC = new javax.swing.JLabel();
        cbMaNCC = new javax.swing.JComboBox<>();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtTenSPTimKiem = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        labelTenSPTimKiem = new javax.swing.JLabel();
        labelLoaiSP = new javax.swing.JLabel();
        cbLoaiSP = new javax.swing.JComboBox<>();
        btnChonanh = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelQuanLySP.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelQLSP.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelQLSP.setText("QUẢN LÝ ĐỒ DÙNG HỌC TẬP");

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        labelHinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHinhAnh.setText("Ảnh");
        labelHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelMaSP.setText("Mã sản phẩm");

        labelTenSP.setText("Tên sản phẩm");

        labelDonGia.setText("Đơn giá");

        labelSoLuongTon.setText("Sô lượng tồn");

        labelTrangThai.setText("Trạng thái");

        labelMaNCC.setText("Mã nhà cung cấp");

        cbMaNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fix.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/printer.png"))); // NOI18N
        btnIn.setText("  In");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        btnReset.setText("Quay lại");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnTim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        labelTenSPTimKiem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTenSPTimKiem.setText("Tên Sản Phẩm");

        labelLoaiSP.setText("Loại sản phẩm");

        cbLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnChonanh.setText("Chọn ảnh");
        btnChonanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonanhActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelQuanLySPLayout = new javax.swing.GroupLayout(panelQuanLySP);
        panelQuanLySP.setLayout(panelQuanLySPLayout);
        panelQuanLySPLayout.setHorizontalGroup(
            panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addComponent(labelHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelQuanLySPLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addComponent(labelLoaiSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addComponent(labelDonGia)
                        .addGap(18, 18, 18)
                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addComponent(labelMaNCC)
                        .addGap(18, 18, 18)
                        .addComponent(cbMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addGap(18, 18, 18)
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                        .addComponent(labelMaSP)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                        .addComponent(labelSoLuongTon)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)))
                        .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLySPLayout.createSequentialGroup()
                                        .addComponent(labelTenSP)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLySPLayout.createSequentialGroup()
                                        .addComponent(labelTrangThai)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(75, 75, 75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLySPLayout.createSequentialGroup()
                                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelQuanLySPLayout.createSequentialGroup()
                                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(labelTenSPTimKiem)
                                        .addGap(0, 34, Short.MAX_VALUE))
                                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                        .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLySPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTenSPTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnThoat)
                        .addGap(310, 310, 310)
                        .addComponent(labelQLSP))
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnChonanh)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelQuanLySPLayout.setVerticalGroup(
            panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThoat)
                    .addComponent(labelQLSP))
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(labelMaSP)
                            .addComponent(txtMaSP)
                            .addComponent(labelTenSP)
                            .addComponent(txtTenSP)
                            .addComponent(labelLoaiSP)
                            .addComponent(cbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDonGia)
                            .addComponent(txtDonGia)
                            .addComponent(labelSoLuongTon)
                            .addComponent(txtSoLuongTon)
                            .addComponent(labelTrangThai)
                            .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaNCC)
                    .addComponent(cbMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnChonanh)
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTim))
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTenSPTimKiem)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenSPTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnLuu)
                    .addComponent(btnIn)
                    .addComponent(btnReset)
                    .addComponent(btnXoa)
                    .addComponent(btnThem))
                .addContainerGap())
        );

        tableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại sản phẩm", "Nhà cung cấp", "Mã sản phẩm", "Tên sản phẩm", "Đơn giá", "Số lượng tồn", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableSP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelQuanLySP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelQuanLySP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        dispose();
        new HomeFrame().setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed

    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed

    }//GEN-LAST:event_btnInActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnChonanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonanhActionPerformed
       
    }//GEN-LAST:event_btnChonanhActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
       
    }//GEN-LAST:event_btnThemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonanh;
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLoaiSP;
    private javax.swing.JComboBox<String> cbMaNCC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDonGia;
    private javax.swing.JLabel labelHinhAnh;
    private javax.swing.JLabel labelLoaiSP;
    private javax.swing.JLabel labelMaNCC;
    private javax.swing.JLabel labelMaSP;
    private javax.swing.JLabel labelQLSP;
    private javax.swing.JLabel labelSoLuongTon;
    private javax.swing.JLabel labelTenSP;
    private javax.swing.JLabel labelTenSPTimKiem;
    private javax.swing.JLabel labelTrangThai;
    private javax.swing.JPanel panelQuanLySP;
    private javax.swing.JTable tableSP;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSoLuongTon;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTenSPTimKiem;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}
