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
public class DetailBill extends javax.swing.JFrame {

    /**
     * Creates new form DetailBill
     */
    public DetailBill() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChiTietHD = new javax.swing.JPanel();
        labelCTHD = new javax.swing.JLabel();
        labelMaHD = new javax.swing.JLabel();
        labelTenNV = new javax.swing.JLabel();
        labelTenKH = new javax.swing.JLabel();
        labelDSSP = new javax.swing.JLabel();
        labelNgayLHD = new javax.swing.JLabel();
        labelTongTien = new javax.swing.JLabel();
        valueMaHD = new javax.swing.JLabel();
        valueTenNV = new javax.swing.JLabel();
        valueTenKH = new javax.swing.JLabel();
        valueNgayLHD = new javax.swing.JLabel();
        valueTongTien = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDanhSachSP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelChiTietHD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCTHD.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCTHD.setText("CHI TIẾT HÓA ĐƠN");

        labelMaHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMaHD.setText("Mã Hóa đơn: ");

        labelTenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenNV.setText("Tên nhân viên:");

        labelTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenKH.setText("Tên khách hàng: ");

        labelDSSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDSSP.setText("Danh sách sản phẩm:");

        labelNgayLHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNgayLHD.setText("Ngày lập hóa đơn:");

        labelTongTien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTongTien.setText("Tổng tiền: ");

        valueMaHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueMaHD.setText("value_MHD");

        valueTenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueTenNV.setText("value_TNV");

        valueTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueTenKH.setText("value_TKH");

        valueNgayLHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueNgayLHD.setText("value_NgayLHD");

        valueTongTien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueTongTien.setText("value_TongTien");

        tableDanhSachSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Số lượng", "Đơn giá ", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDanhSachSP);

        javax.swing.GroupLayout panelChiTietHDLayout = new javax.swing.GroupLayout(panelChiTietHD);
        panelChiTietHD.setLayout(panelChiTietHDLayout);
        panelChiTietHDLayout.setHorizontalGroup(
            panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChiTietHDLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChiTietHDLayout.createSequentialGroup()
                        .addGroup(panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelChiTietHDLayout.createSequentialGroup()
                                .addComponent(labelMaHD)
                                .addGap(18, 18, 18)
                                .addComponent(valueMaHD))
                            .addGroup(panelChiTietHDLayout.createSequentialGroup()
                                .addComponent(labelTenKH)
                                .addGap(18, 18, 18)
                                .addComponent(valueTenKH)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTongTien, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNgayLHD, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(64, 64, 64)
                        .addGroup(panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valueTongTien)
                            .addComponent(valueNgayLHD))
                        .addGap(26, 26, 26))
                    .addGroup(panelChiTietHDLayout.createSequentialGroup()
                        .addGroup(panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelChiTietHDLayout.createSequentialGroup()
                                .addComponent(labelTenNV)
                                .addGap(18, 18, 18)
                                .addComponent(valueTenNV))
                            .addComponent(labelDSSP))
                        .addGap(157, 157, 157))))
            .addGroup(panelChiTietHDLayout.createSequentialGroup()
                .addGroup(panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChiTietHDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelChiTietHDLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(labelCTHD)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChiTietHDLayout.setVerticalGroup(
            panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChiTietHDLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelCTHD)
                .addGap(37, 37, 37)
                .addGroup(panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChiTietHDLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMaHD)
                            .addComponent(valueMaHD))
                        .addGap(26, 26, 26)
                        .addGroup(panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTenKH)
                            .addComponent(valueTenKH)))
                    .addGroup(panelChiTietHDLayout.createSequentialGroup()
                        .addGroup(panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valueNgayLHD)
                            .addComponent(labelNgayLHD))
                        .addGap(35, 35, 35)
                        .addGroup(panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTongTien)
                            .addComponent(valueTongTien))))
                .addGap(26, 26, 26)
                .addGroup(panelChiTietHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTenNV)
                    .addComponent(valueTenNV))
                .addGap(29, 29, 29)
                .addComponent(labelDSSP)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChiTietHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChiTietHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DetailBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCTHD;
    private javax.swing.JLabel labelDSSP;
    private javax.swing.JLabel labelMaHD;
    private javax.swing.JLabel labelNgayLHD;
    private javax.swing.JLabel labelTenKH;
    private javax.swing.JLabel labelTenNV;
    private javax.swing.JLabel labelTongTien;
    private javax.swing.JPanel panelChiTietHD;
    private javax.swing.JTable tableDanhSachSP;
    private javax.swing.JLabel valueMaHD;
    private javax.swing.JLabel valueNgayLHD;
    private javax.swing.JLabel valueTenKH;
    private javax.swing.JLabel valueTenNV;
    private javax.swing.JLabel valueTongTien;
    // End of variables declaration//GEN-END:variables
}
