/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.table.DefaultTableModel;

import dao.DAO_TimKiem;

/**
 *
 * @author Lenovo
 */
public class DetailOrder extends javax.swing.JFrame {

	
	DAO_TimKiem dao_timkiem = new DAO_TimKiem();
	DefaultTableModel tableModel;
	List<List<String>> listSP;
	List<List<String>> thongtindonhang;
    /**
     * Creates new form DetailOrder
     * @throws SQLException 
     */
    public DetailOrder(String madonhang) throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tableDanhSachSP.getModel();
        showData(madonhang);
    }
    private void showData(String ma) throws SQLException {
    	Map<String,String> map = new HashMap<String, String>();
    	map.put("madon", ma);
    	thongtindonhang = dao_timkiem.searchDonDatHang(map);
    	listSP = dao_timkiem.getDanhSachSPDDH(ma);
    	valueMaDH.setText(ma);
    	valueTenKH.setText(thongtindonhang.get(0).get(1));
    	valueNgayDat.setText(thongtindonhang.get(0).get(2));
    	valueNgayGiao.setText(thongtindonhang.get(0).get(3));
    	valueTongTien.setText(thongtindonhang.get(0).get(4));
    	valueTrangThai.setText(thongtindonhang.get(0).get(5));
    	tableModel.setRowCount(0);
    	for(List<String> l: listSP) {
    		tableModel.addRow(new Object[] {l.get(0),l.get(1),l.get(2),Double.parseDouble(l.get(1))*Double.parseDouble(l.get(2))});
    	}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelChiTietDH = new javax.swing.JPanel();
        labelCTDH = new javax.swing.JLabel();
        labelMaDH = new javax.swing.JLabel();
        labelTrangThai = new javax.swing.JLabel();
        labelTenKH = new javax.swing.JLabel();
        labelDSSP = new javax.swing.JLabel();
        labelNgayGiao = new javax.swing.JLabel();
        labelTongTien = new javax.swing.JLabel();
        valueMaDH = new javax.swing.JLabel();
        valueTrangThai = new javax.swing.JLabel();
        valueTenKH = new javax.swing.JLabel();
        valueNgayDat = new javax.swing.JLabel();
        valueTongTien = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDanhSachSP = new javax.swing.JTable();
        labelNgayDat = new javax.swing.JLabel();
        valueNgayGiao = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelChiTietDH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCTDH.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCTDH.setText("CHI TIẾT ĐƠN HÀNG");

        labelMaDH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMaDH.setText("Mã đơn hàng: ");

        labelTrangThai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTrangThai.setText("Trạng thái");

        labelTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenKH.setText("Tên khách hàng: ");

        labelDSSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDSSP.setText("Danh sách sản phẩm:");

        labelNgayGiao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNgayGiao.setText("Ngày giao:");

        labelTongTien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTongTien.setText("Tổng tiền: ");

        valueMaDH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueMaDH.setText("value_MDH");

        valueTrangThai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueTrangThai.setText("value_trangthai");

        valueTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueTenKH.setText("value_TKH");

        valueNgayDat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueNgayDat.setText("value_NgayDat");

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

        labelNgayDat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNgayDat.setText("Ngày đặt:");

        valueNgayGiao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueNgayGiao.setText("value_NgayGiao");
        
        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fix.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChiTietDHLayout = new javax.swing.GroupLayout(panelChiTietDH);
        panelChiTietDH.setLayout(panelChiTietDHLayout);
        panelChiTietDHLayout.setHorizontalGroup(
            panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChiTietDHLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChiTietDHLayout.createSequentialGroup()
                        .addComponent(labelDSSP)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChiTietDHLayout.createSequentialGroup()
                        .addGroup(panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelChiTietDHLayout.createSequentialGroup()
                                .addComponent(labelTrangThai)
                                .addGap(18, 18, 18)
                                .addComponent(valueTrangThai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTongTien)
                                .addGap(64, 64, 64)
                                .addComponent(valueTongTien))
                            .addGroup(panelChiTietDHLayout.createSequentialGroup()
                                .addGroup(panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelChiTietDHLayout.createSequentialGroup()
                                        .addComponent(labelMaDH)
                                        .addGap(18, 18, 18)
                                        .addComponent(valueMaDH))
                                    .addGroup(panelChiTietDHLayout.createSequentialGroup()
                                        .addComponent(labelTenKH)
                                        .addGap(18, 18, 18)
                                        .addComponent(valueTenKH)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelNgayDat)
                                    .addComponent(labelNgayGiao))
                                .addGap(63, 63, 63)
                                .addGroup(panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valueNgayGiao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(valueNgayDat, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(26, 26, 26))))
            .addGroup(panelChiTietDHLayout.createSequentialGroup()
                .addGroup(panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChiTietDHLayout.createSequentialGroup()
                        .addGroup(panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelChiTietDHLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelChiTietDHLayout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addComponent(labelCTDH)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChiTietDHLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSua)))
                .addContainerGap())
        );
        panelChiTietDHLayout.setVerticalGroup(
            panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChiTietDHLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelCTDH)
                .addGap(37, 37, 37)
                .addGroup(panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChiTietDHLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMaDH)
                            .addComponent(valueMaDH))
                        .addGap(26, 26, 26)
                        .addGroup(panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTenKH)
                            .addComponent(valueTenKH)
                            .addComponent(valueNgayGiao)
                            .addComponent(labelNgayGiao)))
                    .addGroup(panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valueNgayDat)
                        .addComponent(labelNgayDat)))
                .addGap(26, 26, 26)
                .addGroup(panelChiTietDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTrangThai)
                    .addComponent(valueTrangThai)
                    .addComponent(labelTongTien)
                    .addComponent(valueTongTien))
                .addGap(29, 29, 29)
                .addComponent(labelDSSP)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChiTietDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChiTietDH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        // TODO add your handling code here:
    	dispose();
    }                                  

    private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
    }                                 

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    	dispose();
    	new OrderFrame().setVisible(true);
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
            java.util.logging.Logger.getLogger(DetailOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new DetailOrder("30").setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnSua;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCTDH;
    private javax.swing.JLabel labelDSSP;
    private javax.swing.JLabel labelMaDH;
    private javax.swing.JLabel labelNgayDat;
    private javax.swing.JLabel labelNgayGiao;
    private javax.swing.JLabel labelTenKH;
    private javax.swing.JLabel labelTongTien;
    private javax.swing.JLabel labelTrangThai;
    private javax.swing.JPanel panelChiTietDH;
    private javax.swing.JTable tableDanhSachSP;
    private javax.swing.JLabel valueMaDH;
    private javax.swing.JLabel valueNgayDat;
    private javax.swing.JLabel valueNgayGiao;
    private javax.swing.JLabel valueTenKH;
    private javax.swing.JLabel valueTongTien;
    private javax.swing.JLabel valueTrangThai;
    // End of variables declaration                   
}
