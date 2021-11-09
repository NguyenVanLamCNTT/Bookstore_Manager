/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;

import dao.DAO_NhanVien;
import entity.Nhanvien;

/**
 *
 * @author Lenovo
 */
public class AccountFrame extends javax.swing.JFrame {

    /**
     * Creates new form AccountFrame
     */
    public AccountFrame(String manv,String mk) {
        initComponents(manv,mk);
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String manv,String mk) {

        panelTaiKhoan = new javax.swing.JPanel();
        labelTaiKhoan = new javax.swing.JLabel();
        labelMaNV = new javax.swing.JLabel();
        labelMatKhau = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        labelNLMatKhau = new javax.swing.JLabel();
        txtNLMatKhau = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMatKhau1 = new javax.swing.JTextField();


        panelTaiKhoan.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTaiKhoan.setText("Tài khoản");

        labelMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMaNV.setText("Mã nhân viên:");

        labelMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMatKhau.setText("Mật khẩu mới:");

        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt,manv);
            }
        });

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        labelNLMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNLMatKhau.setText("Nhập lại mật khẩu:");

        txtNLMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNLMatKhauActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mật khẩu cũ: ");

        txtMatKhau1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhau1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTaiKhoanLayout = new javax.swing.GroupLayout(panelTaiKhoan);
        panelTaiKhoan.setLayout(panelTaiKhoanLayout);
        panelTaiKhoanLayout.setHorizontalGroup(
            panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTaiKhoanLayout.createSequentialGroup()
                .addGroup(panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTaiKhoanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelTaiKhoanLayout.createSequentialGroup()
                                    .addComponent(labelMatKhau)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelTaiKhoanLayout.createSequentialGroup()
                                    .addGroup(panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelMaNV)
                                        .addComponent(labelNLMatKhau))
                                    .addGroup(panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTaiKhoanLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNLMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelTaiKhoanLayout.createSequentialGroup()
                                            .addGap(42, 42, 42)
                                            .addGroup(panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtMatKhau1)
                                                .addGroup(panelTaiKhoanLayout.createSequentialGroup()
                                                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))))))))
                    .addGroup(panelTaiKhoanLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(labelTaiKhoan)))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        panelTaiKhoanLayout.setVerticalGroup(
            panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTaiKhoanLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTaiKhoan)
                .addGap(35, 35, 35)
                .addGroup(panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaNV)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMatKhau))
                .addGap(42, 42, 42)
                .addGroup(panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNLMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNLMatKhau))
                .addGap(56, 56, 56)
                .addGroup(panelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        txtMaNV.setText(manv);
        txtMatKhau1.setText(mk);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNLMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNLMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNLMatKhauActionPerformed

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt,String manv) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    	
    	String mkmoi=txtNLMatKhau.getText();
    	Nhanvien nv= new Nhanvien(manv,mkmoi);
    	int yes = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn sửa tài khoản!", "Warnning!", JOptionPane.YES_NO_CANCEL_OPTION);
		if(yes == JOptionPane.YES_OPTION) {
			if(checkThongTin()) {
				if(new DAO_NhanVien().updateTK(nv)) {
				JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
				txtMatKhau.setText("");
				txtNLMatKhau.setText("");
				txtMatKhau1.setText(mkmoi);
			}else JOptionPane.showMessageDialog(this, "Cập nhật không thành công!Vui lòng kiểm tra lại!");
			}
		}
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtMatKhau1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhau1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhau1ActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
    	dispose();
    	new EmployeeFrame().setVisible(true);
    }//GEN-LAST:event_btnLuuActionPerformed
    private boolean checkThongTin() {
    	String mkmoi=txtMatKhau.getText();
    	String mklai=txtNLMatKhau.getText();
    	if(mkmoi.equals("")|| mklai.equals("") ) {
    		JOptionPane.showMessageDialog(this,"Mật khẩu trống!");
    		return false;
    	}
    	else if(!mkmoi.matches("^[a-zA-Z0-9]{4,}$")) {
    		JOptionPane.showMessageDialog(this, "Mật khẩu dài ít nhất 4 kí tự (gồm chữ cái ,sô)!");
    		return false;
    	}
    	else if( !mklai.matches(mkmoi)) {
    		JOptionPane.showMessageDialog(this, "Không trùng với mật khẩu mới");
    		return false;
    	}
    	return true;
    }
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
            java.util.logging.Logger.getLogger(AccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	String manv=null;
            	String mk=null;
                new AccountFrame(manv,mk).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelMaNV;
    private javax.swing.JLabel labelMatKhau;
    private javax.swing.JLabel labelNLMatKhau;
    private javax.swing.JLabel labelTaiKhoan;
    private javax.swing.JPanel panelTaiKhoan;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtMatKhau1;
    private javax.swing.JTextField txtNLMatKhau;
    // End of variables declaration//GEN-END:variables
}
