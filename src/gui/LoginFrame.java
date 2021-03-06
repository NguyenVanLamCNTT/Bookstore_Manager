/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import connect.ConnectDatabase;
import dao.DAO_Login;


class LoginFrame extends javax.swing.JFrame {

	ConnectDatabase con;
        DAO_Login dao_login = new DAO_Login();
        public static String manv;
        public static String mk;
    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
//        con.getConnection();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        panelDangNhap = new javax.swing.JPanel();
        labelTenTK = new javax.swing.JLabel();
        labelMK = new javax.swing.JLabel();
        txtMK = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        labelDangNhap = new javax.swing.JLabel();
        txtTenTK = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập vào hệ thống");

        panelDangNhap.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelDangNhap.setToolTipText("");

        labelTenTK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTenTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/id-card.png"))); // NOI18N
        labelTenTK.setText("Tên tài khoản");

        labelMK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/secure.png"))); // NOI18N
        labelMK.setText("Mật khẩu");

        txtMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKActionPerformed(evt);
            }
        });

        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/enter.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/multiply.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnThoatActionPerformed(e);
			}
		});
        labelDangNhap.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bookstore.png"))); // NOI18N
        labelDangNhap.setText("ĐĂNG NHẬP HỆ THỐNG");

        txtTenTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDangNhapLayout = new javax.swing.GroupLayout(panelDangNhap);
        panelDangNhap.setLayout(panelDangNhapLayout);
        panelDangNhapLayout.setHorizontalGroup(
            panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDangNhapLayout.createSequentialGroup()
                .addGroup(panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDangNhapLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(labelDangNhap))
                    .addGroup(panelDangNhapLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMK)
                            .addComponent(labelTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDangNhapLayout.createSequentialGroup()
                                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        panelDangNhapLayout.setVerticalGroup(
            panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDangNhapLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelDangNhap)
                .addGap(64, 64, 64)
                .addGroup(panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTenTK)
                    .addComponent(txtTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(panelDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap)
                    .addComponent(btnThoat))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent e) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
    	if(txtTenTK.getText().equals("") || txtMK.getText().equals("")) {
    		JOptionPane.showMessageDialog(this,"Vui lòng nhập đầy đủ thông tin!");
    		txtMK.setText("");
    	}else try {
    		if(dao_login.checkLogin(txtTenTK.getText(),txtMK.getText())) {
    			dispose();
    			manv=getMaNVText();
    			manv=txtTenTK.getText();
    			mk=getMKText();
    			mk=txtMK.getText();
    			new HomeFrame().setVisible(true);
    		    
    		}else {
    			JOptionPane.showMessageDialog(this,"Sai thông tin tài khoản!!");
    			txtMK.setText("");
    		}
    	}catch(Exception e1){
    		System.err.println(e1);
    	}
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void txtMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKActionPerformed
    public String getMaNVText() {
    	return manv;
    }
    public String getMKText() {
    	return mk;
    }
    private void txtTenTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenTKActionPerformed
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt)  {                                         
        // TODO add your handling code here:
    	WindowEvent closingEvent = new WindowEvent( this, WindowEvent.WINDOW_CLOSING);
    	Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closingEvent);
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel labelDangNhap;
    private javax.swing.JLabel labelMK;
    private javax.swing.JLabel labelTenTK;
    private javax.swing.JPanel panelDangNhap;
    private javax.swing.JPasswordField txtMK;
    private javax.swing.JTextField txtTenTK;
    // End of variables declaration//GEN-END:variables
}
