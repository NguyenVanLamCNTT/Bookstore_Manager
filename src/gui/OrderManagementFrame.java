/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.DAO_TimKiem;

/**
 *
 * @author Lenovo
 */
public class OrderManagementFrame extends javax.swing.JFrame {

	DAO_TimKiem dao_timkiem = new DAO_TimKiem();
	DefaultTableModel tableModel;
	List<List<String>> listDDH;
    /**
     * Creates new form NewJFrame
     */
    public OrderManagementFrame() {
        initComponents();
        setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tableDDH.getModel();
    }
    private void submitTimKiem() throws SQLException {
		Map<String, String> map = new HashMap<String, String>();
		if(txtMaDH.getText().equals("") == false) {
			map.put("madon", txtMaDH.getText());
		}
		if(txtSDTKH.getText().equals("") == false) {
			map.put("kh.sodienthoai", txtSDTKH.getText());
		}
		if(txtTenKH.getText().equals("") == false) {
			map.put("tenkh", "%" + txtTenKH.getText() + "%");
		}
		if(txtTrangThai.getText().equals("") == false) {
			map.put("trangthai", "%" + txtTrangThai.getText() + "%");
		}
		if(dateNgayDat.getDate() != null) {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			map.put("ngaygiao", df.format(dateNgayDat.getDate()));
		}
		if(dateNgayGiao.getDate() != null) {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			map.put("ngaydat", df.format(dateNgayGiao.getDate()));
		}
    	if(map.size() == 0) {
    		JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả! Vui lòng nhập lại từ khóa","Error!",JOptionPane.ERROR_MESSAGE);
    	}else {
    		listDDH = dao_timkiem.searchDonDatHang(map);
    		if(listDDH.size() == 0) {
        		JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả! Vui lòng nhập lại từ khóa","Error!",JOptionPane.ERROR_MESSAGE);
        	}else {
        		tableModel.setRowCount(0);
            	for(List<String> l: listDDH) {
            		tableModel.addRow(new Object[] {l.get(0),l.get(1),l.get(2),l.get(3),l.get(4),l.get(5)});
            	}
    		}
		}
		
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTkDDH = new javax.swing.JPanel();
        btnTimDDH = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableDDH = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        labelTkDDH = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        labelNgayDat = new javax.swing.JLabel();
        labelNgayGiao = new javax.swing.JLabel();
        dateNgayDat = new com.toedter.calendar.JDateChooser();
        dateNgayGiao = new com.toedter.calendar.JDateChooser();
        labelMaHD = new javax.swing.JLabel();
        txtMaDH = new javax.swing.JTextField();
        labelTenKH = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        labelSDTKH = new javax.swing.JLabel();
        txtSDTKH = new javax.swing.JTextField();
        labelTrangthai = new javax.swing.JLabel();
        txtTrangThai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTkDDH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        tableDDH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đơn hàng", "Tên khách hàng", "Ngày đặt", "Ngày giao", "Tổng tiền", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	try {
					tableHDMouseClicked(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jScrollPane7.setViewportView(tableDDH);

        labelTkDDH.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelTkDDH.setText("Quản lý đơn hàng");

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        labelNgayDat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNgayDat.setText("Ngày đặt:");

        labelNgayGiao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNgayGiao.setText("Ngày giao:");

        dateNgayDat.setDateFormatString("yyyy-MM-dd");
        dateNgayDat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        dateNgayGiao.setDateFormatString("yyyy-MM-dd");
        dateNgayGiao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        labelMaHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMaHD.setText("Mã đơn hàng:");

        txtMaDH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenKH.setText("Tên khách hàng:");

        txtTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelSDTKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSDTKH.setText("Số điện thoại khách hàng:");

        txtSDTKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelTrangthai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTrangthai.setText("Trạng thái:");

        txtTrangThai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelTkDDHLayout = new javax.swing.GroupLayout(panelTkDDH);
        panelTkDDH.setLayout(panelTkDDHLayout);
        panelTkDDHLayout.setHorizontalGroup(
            panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTkDDHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTkDDHLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnThoat)
                        .addGap(428, 428, 428)
                        .addComponent(labelTkDDH)
                        .addContainerGap(483, Short.MAX_VALUE))
                    .addGroup(panelTkDDHLayout.createSequentialGroup()
                        .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4)
                            .addComponent(jScrollPane7))
                        .addContainerGap())))
            .addGroup(panelTkDDHLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTkDDHLayout.createSequentialGroup()
                        .addComponent(labelTenKH)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTkDDHLayout.createSequentialGroup()
                        .addComponent(labelMaHD)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTkDDHLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(labelNgayGiao)
                        .addGap(22, 22, 22)
                        .addComponent(dateNgayGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117)
                .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTkDDHLayout.createSequentialGroup()
                        .addComponent(labelSDTKH)
                        .addGap(18, 18, 18)
                        .addComponent(txtSDTKH, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTkDDHLayout.createSequentialGroup()
                            .addComponent(labelNgayDat)
                            .addGap(27, 27, 27)
                            .addComponent(dateNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTkDDHLayout.createSequentialGroup()
                            .addComponent(labelTrangthai)
                            .addGap(18, 18, 18)
                            .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimDDH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        panelTkDDHLayout.setVerticalGroup(
            panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTkDDHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTkDDH)
                    .addComponent(btnThoat))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTimDDH)
                    .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelMaHD)
                        .addComponent(txtMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelSDTKH)
                        .addComponent(txtSDTKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTenKH)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTrangthai)
                    .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelNgayDat, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dateNgayDat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTkDDHLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNgayGiao)
                            .addComponent(dateNgayGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTkDDH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTkDDH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnTimDDHActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnTimDDHActionPerformed
        // TODO add your handling code here:
    	submitTimKiem();
    }//GEN-LAST:event_btnTimDDHActionPerformed

    private void tableHDMouseClicked(java.awt.event.MouseEvent evt) throws SQLException {//GEN-FIRST:event_tableHDMouseClicked
        // TODO add your handling code here:
    	int index = tableDDH.getSelectedRow();
    	new DetailOrder(listDDH.get(index).get(0)).setVisible(true);
    }//GEN-LAST:event_tableHDMouseClicked

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
            java.util.logging.Logger.getLogger(OrderManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderManagementFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimDDH;
    private com.toedter.calendar.JDateChooser dateNgayDat;
    private com.toedter.calendar.JDateChooser dateNgayGiao;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelMaHD;
    private javax.swing.JLabel labelNgayDat;
    private javax.swing.JLabel labelNgayGiao;
    private javax.swing.JLabel labelSDTKH;
    private javax.swing.JLabel labelTenKH;
    private javax.swing.JLabel labelTkDDH;
    private javax.swing.JLabel labelTrangthai;
    private javax.swing.JPanel panelTkDDH;
    private javax.swing.JTable tableDDH;
    private javax.swing.JTextField txtMaDH;
    private javax.swing.JTextField txtSDTKH;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}
