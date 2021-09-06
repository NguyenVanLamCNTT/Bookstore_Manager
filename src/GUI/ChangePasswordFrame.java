/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

/**
 *
 * @author Lenovo
 */
public class ChangePasswordFrame extends javax.swing.JFrame {

    /** Creates new form ChangePasswordFrame */
    public ChangePasswordFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        panelDoiMK = new javax.swing.JPanel();
        labelTenTK = new javax.swing.JLabel();
        labelMKCu = new javax.swing.JLabel();
        txtMKCu = new javax.swing.JPasswordField();
        btnKetThuc = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        labelDoiMK = new javax.swing.JLabel();
        txtTenTK = new javax.swing.JTextField();
        labelMKMoi = new javax.swing.JLabel();
        txtMKMoi = new javax.swing.JPasswordField();
        labelNhapLai = new javax.swing.JLabel();
        txtNhapLaiMKMoi = new javax.swing.JPasswordField();

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/secure.png"))); // NOI18N
        jLabel5.setText("Mật khẩu");

        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đổi mật khẩu");

        panelDoiMK.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelDoiMK.setToolTipText("");

        labelTenTK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTenTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/id-card.png"))); // NOI18N
        labelTenTK.setText("Tên tài khoản");

        labelMKCu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelMKCu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/secure.png"))); // NOI18N
        labelMKCu.setText("Mật khẩu cũ");

        txtMKCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKCuActionPerformed(evt);
            }
        });

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/enter.png"))); // NOI18N
        btnKetThuc.setText("Kết Thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/multiply.png"))); // NOI18N
        btnThoat.setText("Thoát");

        labelDoiMK.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bookstore.png"))); // NOI18N
        labelDoiMK.setText("ĐỔI MẬT KHẨU");

        txtTenTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenTKActionPerformed(evt);
            }
        });

        labelMKMoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelMKMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/secure.png"))); // NOI18N
        labelMKMoi.setText("Mật khẩu mới");

        txtMKMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKMoiActionPerformed(evt);
            }
        });

        labelNhapLai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNhapLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/secure.png"))); // NOI18N
        labelNhapLai.setText("Nhập lại mật khẩu");

        txtNhapLaiMKMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNhapLaiMKMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDoiMKLayout = new javax.swing.GroupLayout(panelDoiMK);
        panelDoiMK.setLayout(panelDoiMKLayout);
        panelDoiMKLayout.setHorizontalGroup(
            panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoiMKLayout.createSequentialGroup()
                .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDoiMKLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(labelDoiMK))
                    .addGroup(panelDoiMKLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMKCu)
                            .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelDoiMKLayout.createSequentialGroup()
                                    .addComponent(labelTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelDoiMKLayout.createSequentialGroup()
                                    .addComponent(labelNhapLai)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNhapLaiMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelDoiMKLayout.createSequentialGroup()
                                            .addComponent(btnKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(labelMKMoi))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        panelDoiMKLayout.setVerticalGroup(
            panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoiMKLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelDoiMK)
                .addGap(64, 64, 64)
                .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTenTK)
                    .addComponent(txtTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMKCu)
                    .addComponent(txtMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMKMoi)
                    .addComponent(txtMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhapLaiMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNhapLai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(panelDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKetThuc)
                    .addComponent(btnThoat))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDoiMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMKCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKCuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKCuActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void txtTenTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenTKActionPerformed

    private void txtMKMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKMoiActionPerformed

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3ActionPerformed

    private void txtNhapLaiMKMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNhapLaiMKMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNhapLaiMKMoiActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JLabel labelDoiMK;
    private javax.swing.JLabel labelMKCu;
    private javax.swing.JLabel labelMKMoi;
    private javax.swing.JLabel labelNhapLai;
    private javax.swing.JLabel labelTenTK;
    private javax.swing.JPanel panelDoiMK;
    private javax.swing.JPasswordField txtMKCu;
    private javax.swing.JPasswordField txtMKMoi;
    private javax.swing.JPasswordField txtNhapLaiMKMoi;
    private javax.swing.JTextField txtTenTK;
    // End of variables declaration//GEN-END:variables

}