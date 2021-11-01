/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.DAO_TimKiem;

/**
 *
 * @author Lenovo
 */
public class SearchBillFrame extends javax.swing.JFrame {
	
	DAO_TimKiem dao_timkiem = new DAO_TimKiem();
	DefaultTableModel tableModel;
	List<List<String>> listHD;
    /**
     * Creates new form SearchBillFrame
     */
    public SearchBillFrame() {
        initComponents();
        setLocationRelativeTo(null);
       
        dateNgayLHD.setEnabled(false);
        tableModel = (DefaultTableModel) tableHD.getModel();
    }

    private void checkNgayLapHD() {
    	if(cbThuocTinhTK.getSelectedItem().toString().equals("Ngày lập hóa đơn")) {
    		dateNgayLHD.setEnabled(true);
    		txtSearch.setEnabled(false);
    	}else {
			dateNgayLHD.setEnabled(false);
			txtSearch.setEnabled(true);
		}
    }
    private void searchHoaDon(String thuoctinh, String tukhoa) throws SQLException {
    	if(thuoctinh.equals("mahd") || thuoctinh.equals("tongtien")) {
    		listHD = dao_timkiem.searchHoaDon(thuoctinh, tukhoa);
    	}else {
			listHD = dao_timkiem.searchHoaDon(thuoctinh,"%" +tukhoa+"%");
		}
    	if(listHD.size() == 0) {
    		JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả! Vui lòng nhập lại từ khóa","Error!",JOptionPane.ERROR_MESSAGE);
    	}
    	tableModel.setRowCount(0);
    	for(List<String> l: listHD) {
    		tableModel.addRow(new Object[] {l.get(0),l.get(1),l.get(2),l.get(3),l.get(4)});
    	}
    }
    private void submitTimKiem() throws SQLException {
    	String tukhoa = txtSearch.getText();
    	String thuoctinh = cbThuocTinhTK.getSelectedItem().toString();
    	if(thuoctinh.equals("Mã hóa đơn")) {
    		searchHoaDon("mahd", tukhoa);
    	}
    	if(thuoctinh.equals("Tên nhân viên")) {
    		searchHoaDon("ten__nv", tukhoa);
    	}
    	if(thuoctinh.equals("Tên khách hàng")) {
    		searchHoaDon("tenkh", tukhoa);
    	}
    	if(thuoctinh.equals("Tổng tiền")) {
    		searchHoaDon("tongtien", tukhoa);
    	}
    	if(thuoctinh.equals("Ngày lập hóa đơn")) {
    		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    		String date = df.format(dateNgayLHD.getDate());
    		searchHoaDon("ngaylap_hd", date);
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

        panelTKHD = new javax.swing.JPanel();
        btnTimDDH = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        labelTKHD = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        labelSearch = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHD = new javax.swing.JTable();
        labelThuocTinhTK = new javax.swing.JLabel();
        cbThuocTinhTK = new javax.swing.JComboBox<>();
        labelNgayLapHD = new javax.swing.JLabel();
        dateNgayLHD = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTKHD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        labelTKHD.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelTKHD.setText("Tìm kiếm Hóa đơn");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        labelSearch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelSearch.setText("Từ khóa tìm kiếm");

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        btnThoat.setText("Thoát");

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
        tableHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					tableHDMouseClicked(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jScrollPane2.setViewportView(tableHD);

        labelThuocTinhTK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelThuocTinhTK.setText("Thuộc tính tìm kiếm:");

        cbThuocTinhTK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbThuocTinhTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hóa đơn", "Tên nhân viên", "Tên khách hàng", "Tổng tiền", "Ngày lập hóa đơn" }));
        cbThuocTinhTK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbThuocTinhTKItemStateChanged(evt);
            }
        });
      
        labelNgayLapHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNgayLapHD.setText("Ngày lập hóa đơn:");

        dateNgayLHD.setDateFormatString("yyyy-MM-dd");
        dateNgayLHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelTKHDLayout = new javax.swing.GroupLayout(panelTKHD);
        panelTKHD.setLayout(panelTKHDLayout);
        panelTKHDLayout.setHorizontalGroup(
            panelTKHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTKHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTKHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(panelTKHDLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnThoat)
                        .addGap(339, 339, 339)
                        .addComponent(labelTKHD)
                        .addGap(0, 587, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(panelTKHDLayout.createSequentialGroup()
                .addGroup(panelTKHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTKHDLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(labelThuocTinhTK))
                    .addGroup(panelTKHDLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labelNgayLapHD)))
                .addGap(18, 18, 18)
                .addGroup(panelTKHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbThuocTinhTK, 0, 142, Short.MAX_VALUE)
                    .addComponent(dateNgayLHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSearch)
                .addGap(40, 40, 40)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnTimDDH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
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
                    .addComponent(labelSearch)
                    .addComponent(labelThuocTinhTK)
                    .addComponent(cbThuocTinhTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelTKHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTKHDLayout.createSequentialGroup()
                        .addComponent(labelNgayLapHD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTKHDLayout.createSequentialGroup()
                        .addComponent(dateNgayLHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

    private void btnTimDDHActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnTimDDHActionPerformed
        // TODO add your handling code here:
    	submitTimKiem();
    }//GEN-LAST:event_btnTimDDHActionPerformed

    private void cbThuocTinhTKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbThuocTinhTKItemStateChanged
        // TODO add your handling code here:
        checkNgayLapHD();
    }//GEN-LAST:event_cbThuocTinhTKItemStateChanged

    private void tableHDMouseClicked(java.awt.event.MouseEvent evt) throws SQLException {//GEN-FIRST:event_tableHDMouseClicked
        // TODO add your handling code here:
    	int index = tableHD.getSelectedRow();
    	new DetailBill(listHD.get(index).get(0)).setVisible(true);
    }//GEN-LAST:event_tableHDMouseClicked

	private void btnThoatActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				dispose();
				new HomeFrame().setVisible(true);
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
    private javax.swing.JComboBox<String> cbThuocTinhTK;
    private com.toedter.calendar.JDateChooser dateNgayLHD;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelNgayLapHD;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelTKHD;
    private javax.swing.JLabel labelThuocTinhTK;
    private javax.swing.JPanel panelTKHD;
    private javax.swing.JTable tableHD;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
