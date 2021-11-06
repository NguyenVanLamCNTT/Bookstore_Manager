/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import dao.DAO_ChamCong;
import dao.DAO_Login;
import entity.Calam;
import entity.ChitietCalam;
import entity.Nhanvien;

/**
 *
 * @author Lenovo
 */
public class AttendanceFrame extends javax.swing.JFrame {

	/**
	 * Creates new form AttendanceFrame
	 */
	String manv = new LoginFrame().getMaNVText();

	public AttendanceFrame() throws SQLException {

		initComponents();
		setLocationRelativeTo(null);
		new Thread() {
			public void run() {
				while (true) {
					Calendar ca = new GregorianCalendar();
					int hour = ca.get(Calendar.HOUR);
					int minute = ca.get(Calendar.MINUTE);
					int second = ca.get(Calendar.SECOND);
					int PM_AM = ca.get(Calendar.AM_PM);

					String day;
					if (PM_AM == 1) {
						day = "PM";
					} else {
						day = "AM";
					}
					String time = hour + ":" + minute + ":" + second + " " + day;
					labelDongHo.setText(time);
				}
			}
		}.start();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 * 
	 * @throws SQLException
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		panelDD = new javax.swing.JPanel();
		jSeparator1 = new javax.swing.JSeparator();
		labelDD = new javax.swing.JLabel();
		btnThoat = new javax.swing.JButton();
		cbThang = new javax.swing.JComboBox<>();
		labelNam = new javax.swing.JLabel();
		btnChamCong = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		labelDongHo = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		lblValueYear = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tableDiemDanh = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		panelDD.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		labelDD.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
		labelDD.setText("Chấm Công");

		btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
		btnThoat.setText("Thoát");

		cbThang.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		cbThang.setToolTipText("");
		cbThang.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
			public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
			}

			public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
				cbThangPopupMenuWillBecomeInvisible(evt);
			}

			public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
			}

		});

		labelNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		labelNam.setText(" Năm: ");
		labelNam.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		btnChamCong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		btnChamCong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/attendance.png"))); // NOI18N
		btnChamCong.setText("Chấm công");
		lblValueYear.setText("" + LocalDateTime.now().getYear());
		jPanel1.setBackground(new java.awt.Color(153, 153, 153));

		labelDongHo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
		labelDongHo.setForeground(new java.awt.Color(0, 0, 204));
		labelDongHo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		labelDongHo.setText("7:40:00 AM");
		labelDongHo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(53, 53, 53)
						.addComponent(labelDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
						.addContainerGap(48, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap()
								.addComponent(labelDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
								.addContainerGap()));

		jLabel1.setText("Tháng");

		javax.swing.GroupLayout panelDDLayout = new javax.swing.GroupLayout(panelDD);
		panelDD.setLayout(panelDDLayout);
		panelDDLayout.setHorizontalGroup(panelDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jSeparator1)
				.addGroup(panelDDLayout.createSequentialGroup().addGap(24, 24, 24).addComponent(btnThoat)
						.addGap(421, 421, 421).addComponent(labelDD).addContainerGap(616, Short.MAX_VALUE))
				.addGroup(panelDDLayout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addGap(41, 41, 41)
						.addComponent(cbThang, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(labelNam)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(lblValueYear, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(34, 34, 34)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, 189,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(33, 33, 33)));
		panelDDLayout.setVerticalGroup(panelDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panelDDLayout.createSequentialGroup().addGap(16, 16, 16)
						.addGroup(panelDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnThoat)
								.addComponent(labelDD, javax.swing.GroupLayout.Alignment.TRAILING))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(panelDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(cbThang, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(labelNam, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(lblValueYear).addComponent(jLabel1)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		tableDiemDanh.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Ngày", "Ca", "Trạng thái" }) {
			boolean[] canEdit = new boolean[] { false, true, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(tableDiemDanh);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(panelDD, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jScrollPane1))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(panelDD, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		btnChamCong.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					btnChamcongActionListener(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
        
        showCalam();
		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void cbThangPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {// GEN-FIRST:event_cbThangPopupMenuWillBecomeInvisible
		// TODO add your handling code here:
		String s = cbThang.getSelectedItem().toString();
		String manv = new LoginFrame().getMaNVText();
		DefaultTableModel model = new DefaultTableModel(new Object[] { "Ngày làm", "Ca", "Trạng thái" }, 0);
		List<ChitietCalam> ctcl = new DAO_ChamCong().getValuesByMonth(Integer.parseInt(s), manv);
		for (ChitietCalam ct : ctcl) {
			Object[] obj = { ct.getNgaylam(), ct.getCalam().getMaCalam(), ct.getTrangthai() };
			model.addRow(obj);
	        
		}
		tableDiemDanh.setModel(model);
	}// GEN-LAST:event_cbThangPopupMenuWillBecomeInvisible

	protected void btnChamcongActionListener(ActionEvent evt) throws SQLException {
		// TODO Auto-generated method stub
		ChitietCalam chitiet = revert();
		if (new DAO_ChamCong().insertCongLam(chitiet)) {
			JOptionPane.showMessageDialog(this, "Chấm công thành công!");
			showCalam();
		} else {
			JOptionPane.showMessageDialog(this, "Chấm công thất bại! Vui lòng xem lại!!");
		}

	}

	private void showCalam() {
		// TODO Auto-generated method stub
		DefaultTableModel newRow;
		newRow = new DefaultTableModel(new Object[] { "Ngày làm", "Ca", "Trạng thái" }, 0);
		ArrayList<ChitietCalam> chitiet;
		try {
			chitiet = new DAO_ChamCong().getValues(manv);
			for (ChitietCalam calam : chitiet) {
				newRow.addRow(new Object[] { calam.getNgaylam(), calam.getCalam().getMaCalam(), calam.getTrangthai()});
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		tableDiemDanh.setModel(newRow);

	}

	public ChitietCalam revert() {
		int time = new Date().getHours();
		String calam = null;
		if (time <= 14 && time >= 6) {
			calam = "CA1";
		} else if (time > 14 && time <= 22) {
			calam = "CA1";
		} else if (time > 22 && time < 6) {
			JOptionPane.showMessageDialog(this, "Không có ca này!");
			return null;
		}
		String trangthai;
		if (time <= 9 && time >= 6) {
			trangthai = "Dung Gio";
		} else {
			trangthai = "Tre Gio";
		}
		Date ngaylam = new Date();

		return new ChitietCalam(new Calam(calam), new Nhanvien(manv), ngaylam, trangthai);
	}

	private void btnThoatSPActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

		dispose();
		new HomeFrame().setVisible(true);

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AttendanceFrame.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AttendanceFrame.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AttendanceFrame.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AttendanceFrame.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new AttendanceFrame().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnChamCong;
	private javax.swing.JButton btnThoat;
	private javax.swing.JComboBox<String> cbThang;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JLabel labelDD;
	private javax.swing.JLabel labelDongHo;
	private javax.swing.JLabel labelNam;
	private javax.swing.JLabel lblValueYear;
	private javax.swing.JPanel panelDD;
	private javax.swing.JTable tableDiemDanh;
	// End of variables declaration//GEN-END:variables
}
