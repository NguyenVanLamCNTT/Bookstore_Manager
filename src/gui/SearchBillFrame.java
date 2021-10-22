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
public class SearchBillFrame extends javax.swing.JFrame {

    /**
     * Creates new form SearchBillFrame
     */
    public SearchBillFrame() {
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

        panelTKHD = new javax.swing.JPanel();
        btnTimDDH = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        labelTKHD = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        labelSearch = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        labelMaHD = new javax.swing.JLabel();
        cbMaHD = new javax.swing.JComboBox<>();
        labelTenKH = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        labelNLHD = new javax.swing.JLabel();
        dateNgayLHD = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTKHD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnTimDDH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTimDDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnTimDDH.setText("Tìm");
        btnTimDDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimDDHActionPerformed(evt);
            }
        });

        labelTKHD.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelTKHD.setText("Tìm kiếm Hóa đơn");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        labelSearch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelSearch.setText("Từ khóa tìm kiếm");

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        btnThoat.setText("Thoát");

        labelMaHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMaHD.setText("Mã hóa đơn");

        cbMaHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenKH.setText("Tên khách hàng");

        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        labelNLHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNLHD.setText("Ngày lập hóa đơn");

        tableHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Tên nhân viên", "Tên khách hàng", "Tổng tiền", "Ngày lập hóa đơn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableHD);

        javax.swing.GroupLayout panelTKHDLayout = new javax.swing.GroupLayout(panelTKHD);
        panelTKHD.setLayout(panelTKHDLayout);
        panelTKHDLayout.setHorizontalGroup(
            panelTKHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTKHDLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(labelSearch)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnTimDDH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
            .addGroup(panelTKHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTKHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(panelTKHDLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnThoat)
                        .addGap(339, 339, 339)
                        .addComponent(labelTKHD)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelTKHDLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(labelMaHD)
                .addGap(18, 18, 18)
                .addComponent(cbMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189)
                .addComponent(labelTenKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(labelNLHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateNgayLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelTKHDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        panelTKHDLayout.setVerticalGroup(
            panelTKHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTKHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTKHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTKHD)
                    .addComponent(btnThoat))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelTKHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimDDH)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(panelTKHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTKHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelMaHD)
                        .addComponent(cbMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTenKH)
                        .addComponent(labelNLHD)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTKHDLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dateNgayLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTKHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTKHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimDDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimDDHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimDDHActionPerformed

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed

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
            java.util.logging.Logger.getLogger(SearchBillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBillFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimDDH;
    private javax.swing.JComboBox<String> cbMaHD;
    private com.toedter.calendar.JDateChooser dateNgayLHD;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelMaHD;
    private javax.swing.JLabel labelNLHD;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelTKHD;
    private javax.swing.JLabel labelTenKH;
    private javax.swing.JPanel panelTKHD;
    private javax.swing.JTable tableHD;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
