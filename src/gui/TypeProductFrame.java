/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import dao.DAO_Loaisanpham;
import entity.LoaiSanpham;

/**
 *
 * @author Lenovo
 */
public class TypeProductFrame extends javax.swing.JFrame {
	DefaultTableModel tableMode;
	Pattern reg_maLoaiSP = Pattern.compile("^[A-Z]{1,4}(\\-[1-9]{1,2}){0,1}$");
	Pattern reg_tenLoaiSP = Pattern.compile("^([A-Z][a-z]{0,20}.){0,4}[A-Z][a-z]{0,20}$");
	List<LoaiSanpham> listLoaiSP;
    /**
     * Creates new form TypeProductFrame
     * @throws SQLException 
     */
    public TypeProductFrame() throws SQLException {
        initComponents();
        tableMode = (DefaultTableModel) tableCapNhatLoaiSP.getModel();
        showLoaiSP();
    }
    private void showLoaiSP() throws SQLException{
    	listLoaiSP = DAO_Loaisanpham.getLoaiSanPham();
    	tableMode.setRowCount(0);
    	for	(LoaiSanpham loaisp : listLoaiSP) {
    		tableMode.addRow(new Object[] {loaisp.getMaLoaiSp(),loaisp.getTenLoaiSp()});
    	}
    }
    private void clickBtnThem(boolean a) {
    	 btnQuayLai.setEnabled(a);
         txtMaLoaiSP.setEnabled(a);
         txtTenLoaiSP.setEnabled(a);
         btnLuu.setEnabled(a);
    }
    private void reset() {
    	txtMaLoaiSP.setText("");
    	txtTenLoaiSP.setText("");
    	btnSua.setEnabled(false);
    	btnXoa.setEnabled(false);
    	txtMaLoaiSP.setBorder(new LineBorder(Color.black));
    	txtTenLoaiSP.setBorder(new LineBorder(Color.black));
    }
    private void regex() {
    	String maLoaiSP = txtMaLoaiSP.getText();
    	String tenLoaiSP = txtTenLoaiSP.getText();
    	if (reg_maLoaiSP.matcher(maLoaiSP).matches() == false) {
    		JOptionPane.showMessageDialog(this, "Mã loại sản phẩm không hợp lệ\nVí dụ : SS-1 hoặc TT","Error!",JOptionPane.ERROR_MESSAGE);
    		txtMaLoaiSP.setBorder(new LineBorder(Color.red));
    	}else {
    		txtMaLoaiSP.setBorder(new LineBorder(Color.green));
    	}
    	if	(reg_tenLoaiSP.matcher(tenLoaiSP).matches() == false) {
    		JOptionPane.showMessageDialog(this, "Tên loại sản phẩm không hợp lệ\nVí dụ : Truyen Tranh","Error!",JOptionPane.ERROR_MESSAGE);
    		txtTenLoaiSP.setBorder(new LineBorder(Color.red));
    	}else {
    		txtTenLoaiSP.setBorder(new LineBorder(Color.green));
    	}
    }
    private boolean checkMaLoaiSP(String maLoaiSP) {
    	for(LoaiSanpham lsp: listLoaiSP) {
    		if(maLoaiSP.equals(lsp.getMaLoaiSp())) {
    			JOptionPane.showMessageDialog(this, "Tên loại sản phẩm tồn tại","Error!",JOptionPane.ERROR_MESSAGE);
        		txtMaLoaiSP.setBorder(new LineBorder(Color.red));
    			return true;
    		}
    	}
    	txtMaLoaiSP.setBorder(new LineBorder(Color.green));
    	return false;
    }
    private int notify(String title, String message) {
    	int n = JOptionPane.showConfirmDialog(this, message,title,JOptionPane.YES_NO_OPTION);
    	return n;
    }
    private boolean checkInput() {
    	String maLoaiSP = txtMaLoaiSP.getText();
    	String tenLoaiSP = txtTenLoaiSP.getText();
    	if(reg_maLoaiSP.matcher(maLoaiSP).matches() == true && reg_tenLoaiSP.matcher(tenLoaiSP).matches() == true) {
    		return true;
    	}else {
			return false;
		}
    }
    private boolean search(String maLoaiSP) {
    	int selectedIndex = tableCapNhatLoaiSP.getSelectedRow();
    	if(selectedIndex == -1) {
    		return false;
    	}else {
    		if(maLoaiSP.equals(listLoaiSP.get(selectedIndex).getMaLoaiSp())) {
        		return true;
        	}else {
    			return false;
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
    	setLocationRelativeTo(null);
        panelCapNhatLSP = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        labelCapNhatLSP = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        labelMaLoaiSP = new javax.swing.JLabel();
        txtMaLoaiSP = new javax.swing.JTextField();
        labelTenLoaiSP = new javax.swing.JLabel();
        txtTenLoaiSP = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCapNhatLoaiSP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cập nhật loại sản phẩm");

        panelCapNhatLSP.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelCapNhatLSP.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelCapNhatLSP.setText("CẬP NHẬT LOẠI SẢN PHẨM");

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        labelMaLoaiSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMaLoaiSP.setText("Mã Loại sản phẩm");

        txtMaLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLoaiSPActionPerformed(evt);
            }
        });

        labelTenLoaiSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenLoaiSP.setText("Tên loại sản phẩm");

        txtTenLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenLoaiSPActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnXoaActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fix.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnLuuActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        btnQuayLai.setText("Quay Lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnQuayLaiActionPerformed(evt);
            }
        });
        txtMaLoaiSP.setEnabled(false);
        txtTenLoaiSP.setEnabled(false);
        btnLuu.setEnabled(false);
        btnQuayLai.setEnabled(false);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);

        javax.swing.GroupLayout panelCapNhatLSPLayout = new javax.swing.GroupLayout(panelCapNhatLSP);
        panelCapNhatLSP.setLayout(panelCapNhatLSPLayout);
        panelCapNhatLSPLayout.setHorizontalGroup(
            panelCapNhatLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelCapNhatLSPLayout.createSequentialGroup()
                .addGap(73, 1068, Short.MAX_VALUE)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(panelCapNhatLSPLayout.createSequentialGroup()
                .addGroup(panelCapNhatLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCapNhatLSPLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnThoat)
                        .addGap(323, 323, 323)
                        .addComponent(labelCapNhatLSP))
                    .addGroup(panelCapNhatLSPLayout.createSequentialGroup()
                        .addGroup(panelCapNhatLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelCapNhatLSPLayout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(labelMaLoaiSP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(labelTenLoaiSP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(panelCapNhatLSPLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)))
                        .addGroup(panelCapNhatLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        panelCapNhatLSPLayout.setVerticalGroup(
            panelCapNhatLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCapNhatLSPLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelCapNhatLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCapNhatLSP)
                    .addComponent(btnThoat))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelCapNhatLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCapNhatLSPLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(labelMaLoaiSP))
                    .addGroup(panelCapNhatLSPLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelCapNhatLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCapNhatLSPLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(labelTenLoaiSP))
                            .addComponent(txtTenLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(panelCapNhatLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnLuu)
                    .addComponent(btnQuayLai))
                .addGap(75, 75, 75))
        );

        tableCapNhatLoaiSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã loại sản phẩm", "Tên loại sản phẩm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCapNhatLoaiSP);
        tableCapNhatLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
       	 public void mouseClicked(java.awt.event.MouseEvent evt) {
       		tableCapNhatLoaiSPMouseClicked(evt);
         }
    });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCapNhatLSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCapNhatLSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tableCapNhatLoaiSPMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub
		int index = tableCapNhatLoaiSP.getSelectedRow();
		reset();
		btnSua.setEnabled(true);
		btnXoa.setEnabled(true);
		txtMaLoaiSP.setText(listLoaiSP.get(index).getMaLoaiSp());
		txtTenLoaiSP.setText(listLoaiSP.get(index).getTenLoaiSp());
		txtMaLoaiSP.setEnabled(false);
		txtTenLoaiSP.setEnabled(false);
	}
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
    	dispose();
    	new HomeFrame().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void txtMaLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLoaiSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLoaiSPActionPerformed

    private void txtTenLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenLoaiSPActionPerformed
    }//GEN-LAST:event_txtTenLoaiSPActionPerformed
    
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
    	String maLoaiSP = txtMaLoaiSP.getText();
    	if(notify("", "Bạn có chắc muốn xóa loại sản phẩm có mã "+maLoaiSP) == 0) {
    		boolean success =  DAO_Loaisanpham.delete(maLoaiSP);
    		if(success == true) {
    			JOptionPane.showMessageDialog(this,"Bạn đã xóa thành công!");
    			showLoaiSP();
    		}else {
    			JOptionPane.showMessageDialog(this,"Lỗi không thể xóa!","", JOptionPane.ERROR_MESSAGE);
    			showLoaiSP();
			}
    	}
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
       clickBtnThem(true);
       btnSua.setEnabled(false);
	   btnXoa.setEnabled(false);
       reset();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    	clickBtnThem(true);
    	txtMaLoaiSP.setEnabled(false);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnLuuActionPerformed
    	String maLoaiSP = txtMaLoaiSP.getText();
    	String tenLoaiSP = txtTenLoaiSP.getText();
    	if(search(maLoaiSP) == true) {
    		DAO_Loaisanpham.delete(maLoaiSP);
    		regex();
            // TODO add your handling code here:
        	if(checkInput() == true && notify("", "Bạn có chắc muốn lưu thay đổi không ?") == 0)  {
        		DAO_Loaisanpham.insert(maLoaiSP, tenLoaiSP);
        		showLoaiSP();
        		clickBtnThem(false);
        		reset();
        		btnSua.setEnabled(false);
        		btnXoa.setEnabled(false);
        		JOptionPane.showMessageDialog(this,"Bạn đã cập nhật thành công!");
        		showLoaiSP();
        	}
    	}else {
    		regex();
            // TODO add your handling code here:
        	if(checkInput() == true && notify("", "Bạn có chắc muốn lưu thông tin vừa nhập không ?") == 0 && checkMaLoaiSP(maLoaiSP) == false)  {
        		DAO_Loaisanpham.insert(maLoaiSP, tenLoaiSP);
        		showLoaiSP();
        		clickBtnThem(false);
        		reset();
        		btnSua.setEnabled(false);
        		btnXoa.setEnabled(false);
        		JOptionPane.showMessageDialog(this,"Bạn đã lưu thành công!");
        		showLoaiSP();
        	}
		}
    	btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }

			
        });
    }//GEN-LAST:event_btnLuuActionPerformed
    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
    	reset();
    }//GEN-LAST:event_btnLuuActionPerformed
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
            java.util.logging.Logger.getLogger(TypeProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TypeProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TypeProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TypeProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new TypeProductFrame().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCapNhatLSP;
    private javax.swing.JLabel labelMaLoaiSP;
    private javax.swing.JLabel labelTenLoaiSP;
    private javax.swing.JPanel panelCapNhatLSP;
    private javax.swing.JTable tableCapNhatLoaiSP;
    private javax.swing.JTextField txtMaLoaiSP;
    private javax.swing.JTextField txtTenLoaiSP;
    // End of variables declaration//GEN-END:variables
}
