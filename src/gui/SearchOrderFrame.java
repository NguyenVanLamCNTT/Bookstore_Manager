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
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.DAO_TimKiem;

/**
 *
 * @author Lenovo
 */
public class SearchOrderFrame extends javax.swing.JFrame {

	DAO_TimKiem dao_timkiem = new DAO_TimKiem();
	DefaultTableModel tableModel;
	List<List<String>> listDDH;
    /**
     * Creates new form NewJFrame
     */
    public SearchOrderFrame() {
        initComponents();
        setLocationRelativeTo(null);
        dateNgayDat.setEnabled(false);
        dateNgayGiao.setEnabled(false);
        tableModel = (DefaultTableModel) tableDDH.getModel();
    }
    private void checkNgay() {
    	if(cbThuocTinhTK.getSelectedItem().toString().equals("Ngày giao")) {
    		dateNgayDat.setEnabled(false);
    		dateNgayGiao.setEnabled(true);
    		txtSearch.setEnabled(false);
    	}else if (cbThuocTinhTK.getSelectedItem().toString().equals("Ngày đặt")) {
    		dateNgayDat.setEnabled(true);
    		dateNgayGiao.setEnabled(false);
    		txtSearch.setEnabled(false);
		}
    	else {
    		dateNgayDat.setEnabled(false);
    		dateNgayGiao.setEnabled(false);
    		txtSearch.setEnabled(true);
		}
    }
    private void searchDonDatHang(String thuoctinh, String tukhoa) throws SQLException {
    	if(thuoctinh.equals("madon") || thuoctinh.equals("tongtien")) {
    		listDDH = dao_timkiem.searchDonDatHang(thuoctinh, tukhoa);
    	}else {
			listDDH = dao_timkiem.searchDonDatHang(thuoctinh,"%" +tukhoa+"%");
		}
    	if(listDDH.size() == 0) {
    		JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả! Vui lòng nhập lại từ khóa","Error!",JOptionPane.ERROR_MESSAGE);
    	}
    	tableModel.setRowCount(0);
    	for(List<String> l: listDDH) {
    		tableModel.addRow(new Object[] {l.get(0),l.get(1),l.get(2),l.get(3),l.get(4),l.get(5)});
    	}
    }
    private void submitTimKiem() throws SQLException {
    	String tukhoa = txtSearch.getText();
    	String thuoctinh = cbThuocTinhTK.getSelectedItem().toString();
    	if(thuoctinh.equals("Mã đơn hàng")) {
    		searchDonDatHang("madon", tukhoa);
    	}
    	if(thuoctinh.equals("Tên khách hàng")) {
    		searchDonDatHang("tenkh", tukhoa);
    	}
    	if(thuoctinh.equals("Ngày đặt")) {
    		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    		String date = df.format(dateNgayDat.getDate());
    		searchDonDatHang("ngaydat", date);
    	}
    	if(thuoctinh.equals("Ngày giao")) {
    		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    		String date = df.format(dateNgayGiao.getDate());
    		searchDonDatHang("ngaygiao", date);
    	}
    	if(thuoctinh.equals("Tổng tiền")) {
    		searchDonDatHang("tongtien", tukhoa);
    	}
    	if(thuoctinh.equals("Trạng thái")) {
    	    searchDonDatHang("ten_trangthai", tukhoa);
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
        txtSearch = new javax.swing.JTextField();
        labelSearch = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        labelThuocTinhTK = new javax.swing.JLabel();
        cbThuocTinhTK = new javax.swing.JComboBox<>();
        labelNgayDat = new javax.swing.JLabel();
        labelNgayGiao = new javax.swing.JLabel();
        dateNgayDat = new com.toedter.calendar.JDateChooser();
        dateNgayGiao = new com.toedter.calendar.JDateChooser();

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
        labelTkDDH.setText("Tìm kiếm đơn hàng");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        labelSearch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelSearch.setText("Từ khóa tìm kiếm");

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        btnThoat.setText("Thoát");

        labelThuocTinhTK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelThuocTinhTK.setText("Thuộc tính tìm kiếm:");

        cbThuocTinhTK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbThuocTinhTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã đơn hàng", "Tên khách hàng", "Ngày đặt", "Ngày giao", "Tổng tiền", "Trạng thái" }));
        cbThuocTinhTK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbThuocTinhTKItemStateChanged(evt);
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
                        .addComponent(labelThuocTinhTK)
                        .addGap(18, 18, 18)
                        .addComponent(cbThuocTinhTK, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSearch)
                        .addGap(33, 33, 33)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnTimDDH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(panelTkDDHLayout.createSequentialGroup()
                        .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelTkDDHLayout.createSequentialGroup()
                                .addComponent(labelNgayGiao)
                                .addGap(22, 22, 22)
                                .addComponent(dateNgayGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTkDDHLayout.createSequentialGroup()
                                .addComponent(labelNgayDat)
                                .addGap(27, 27, 27)
                                .addComponent(dateNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelTkDDHLayout.setVerticalGroup(
            panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTkDDHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTkDDHLayout.createSequentialGroup()
                        .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTkDDH)
                            .addComponent(btnThoat))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelThuocTinhTK)
                                .addComponent(cbThuocTinhTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnTimDDH)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelSearch)))
                        .addGap(20, 20, 20)
                        .addComponent(labelNgayDat))
                    .addComponent(dateNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelTkDDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNgayGiao)
                    .addComponent(dateNgayGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
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
private void btnThoatActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				dispose();
				new HomeFrame().setVisible(true);
			}
    private void btnTimDDHActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnTimDDHActionPerformed
        // TODO add your handling code here:
    	submitTimKiem();
    }//GEN-LAST:event_btnTimDDHActionPerformed

    private void cbThuocTinhTKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbThuocTinhTKItemStateChanged
        // TODO add your handling code here:
    	checkNgay();
    }//GEN-LAST:event_cbThuocTinhTKItemStateChanged

    private void tableHDMouseClicked(java.awt.event.MouseEvent evt) throws SQLException {//GEN-FIRST:event_tableHDMouseClicked
        // TODO add your handling code here:
    	int index = tableDDH.getSelectedRow();
//    	new DetailBill(listDDH.get(index).get(0)).setVisible(true);
    }//GEN-LAST:event_tableHDMouseClicked
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
            java.util.logging.Logger.getLogger(SearchOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchOrderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimDDH;
    private javax.swing.JComboBox<String> cbThuocTinhTK;
    private com.toedter.calendar.JDateChooser dateNgayDat;
    private com.toedter.calendar.JDateChooser dateNgayGiao;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelNgayDat;
    private javax.swing.JLabel labelNgayGiao;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelThuocTinhTK;
    private javax.swing.JLabel labelTkDDH;
    private javax.swing.JPanel panelTkDDH;
    private javax.swing.JTable tableDDH;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
