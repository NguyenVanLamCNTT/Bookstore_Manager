/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.DAO_TimKiem;
import entity.NhaCungcap;

/**
 *
 * @author Lenovo
 */
public class SearchProducerFrame extends javax.swing.JFrame {

	DAO_TimKiem dao_timkiem = new DAO_TimKiem();
	DefaultTableModel tableModel;
	List<NhaCungcap> listNCC;
    /**
     * Creates new form SearchProducerFrame
     */
    public SearchProducerFrame() {
        initComponents();
        setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tableNCC.getModel();
    }
//    private void searchNCC(String thuoctinh, String tukhoa) throws SQLException {
//    	listNCC = dao_timkiem.searchNhaCC(thuoctinh, tukhoa);
//    	if(listNCC.size() == 0) {
//    		JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả! Vui lòng nhập lại từ khóa","Error!",JOptionPane.ERROR_MESSAGE);
//    	}
//    	tableModel.setRowCount(0);
//    	for(NhaCungcap ncc: listNCC) {
//    		tableModel.addRow(new Object[] {ncc.getMaNCC(),ncc.getTenNCC(),ncc.getDiachi()});
//    	}
//    }
//    private void submitTimKiem() throws SQLException {
//    	String tukhoa = txtSearch.getText();
//    	String thuoctinh = cbThuocTinhTK.getSelectedItem().toString();
//    	if(thuoctinh.equals("Mã nhà cung cấp")) {
//    		searchNCC("ma_ncc", tukhoa);
//    	}
//    	if(thuoctinh.equals("Tên nhà cung cấp")) {
//    		searchNCC("ten_ncc", tukhoa);
//    	}
//    	if(thuoctinh.equals("Địa chỉ")) {
//    		searchNCC("diachi", tukhoa);
//    	}
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTKNCC = new javax.swing.JPanel();
        btnTimDDH = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        labelTkNCC = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableNCC = new javax.swing.JTable();
        labelMaNCC = new javax.swing.JLabel();
        txtMaNCC = new javax.swing.JTextField();
        labelTenNCC = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        labelDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTKNCC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnTimDDH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTimDDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnTimDDH.setText("Tìm");
        btnTimDDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnTimDDHActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        labelTkNCC.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelTkNCC.setText("Tìm kiếm nhà cung cấp");

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        tableNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableNCC);

        labelMaNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMaNCC.setText("Mã nhà cung cấp");

        labelTenNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenNCC.setText("Tên nhà cung cấp");

        labelDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDiaChi.setText("Địa chỉ");

        javax.swing.GroupLayout panelTKNCCLayout = new javax.swing.GroupLayout(panelTKNCC);
        panelTKNCC.setLayout(panelTKNCCLayout);
        panelTKNCCLayout.setHorizontalGroup(
            panelTKNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTKNCCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTKNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(panelTKNCCLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnThoat)
                        .addGap(339, 339, 339)
                        .addComponent(labelTkNCC)
                        .addGap(0, 479, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
            .addGroup(panelTKNCCLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelTKNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTKNCCLayout.createSequentialGroup()
                        .addComponent(labelDiaChi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTKNCCLayout.createSequentialGroup()
                        .addComponent(labelMaNCC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(140, 140, 140)
                .addComponent(labelTenNCC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimDDH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        panelTKNCCLayout.setVerticalGroup(
            panelTKNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTKNCCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTKNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTkNCC)
                    .addComponent(btnThoat))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelTKNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMaNCC)
                    .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTenNCC)
                    .addComponent(btnTimDDH))
                .addGap(65, 65, 65)
                .addGroup(panelTKNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDiaChi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTKNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTKNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnTimDDHActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnTimDDHActionPerformed
        // TODO add your handling code here:
//    	submitTimKiem();
    }//GEN-LAST:event_btnTimDDHActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    	dispose();
		new HomeFrame().setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(SearchProducerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchProducerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchProducerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchProducerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchProducerFrame().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimDDH;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelDiaChi;
    private javax.swing.JLabel labelMaNCC;
    private javax.swing.JLabel labelTenNCC;
    private javax.swing.JLabel labelTkNCC;
    private javax.swing.JPanel panelTKNCC;
    private javax.swing.JTable tableNCC;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtTenNCC;
    // End of variables declaration//GEN-END:variables
}
