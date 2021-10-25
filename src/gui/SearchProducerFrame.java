/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;

/**
 *
 * @author Lenovo
 */
public class SearchProducerFrame extends javax.swing.JFrame {

    /**
     * Creates new form SearchProducerFrame
     */
    public SearchProducerFrame() {
        initComponents();
    }

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
        txtSearch = new javax.swing.JTextField();
        labelSearch = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableNCC = new javax.swing.JTable();
        labelMaNCC = new javax.swing.JLabel();
        cbMaNCC = new javax.swing.JComboBox<>();
        labelTenNCC = new javax.swing.JLabel();
        cbTenNCC = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTKNCC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnTimDDH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTimDDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnTimDDH.setText("Tìm");
        btnTimDDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimDDHActionPerformed(evt);
            }
        });

        labelTkNCC.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelTkNCC.setText("Tìm kiếm nhà cung cấp");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        labelSearch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelSearch.setText("Từ khóa tìm kiếm");

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        btnThoat.setText("Thoát");

        tableNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ", "Quốc gia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableNCC);

        labelMaNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMaNCC.setText("Mã nhà cung cấp");

        cbMaNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelTenNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenNCC.setText("Tên nhà cung cấp");

        cbTenNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelTKNCCLayout = new javax.swing.GroupLayout(panelTKNCC);
        panelTKNCC.setLayout(panelTKNCCLayout);
        panelTKNCCLayout.setHorizontalGroup(
            panelTKNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTKNCCLayout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(labelSearch)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnTimDDH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
            .addGroup(panelTKNCCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTKNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(panelTKNCCLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnThoat)
                        .addGap(339, 339, 339)
                        .addComponent(labelTkNCC)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
            .addGroup(panelTKNCCLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(labelMaNCC)
                .addGap(18, 18, 18)
                .addComponent(cbMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTenNCC)
                .addGap(18, 18, 18)
                .addComponent(cbTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365))
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
                .addGap(32, 32, 32)
                .addGroup(panelTKNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimDDH)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(panelTKNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaNCC)
                    .addComponent(cbMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTenNCC)
                    .addComponent(cbTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }

			
        });
        pack();
    }// </editor-fold>//GEN-END:initComponents

			private void btnThoatActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				dispose();
				new HomeFrame().setVisible(true);
			}
    private void btnTimDDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimDDHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimDDHActionPerformed

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
    private javax.swing.JComboBox<String> cbMaNCC;
    private javax.swing.JComboBox<String> cbTenNCC;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelMaNCC;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelTenNCC;
    private javax.swing.JLabel labelTkNCC;
    private javax.swing.JPanel panelTKNCC;
    private javax.swing.JTable tableNCC;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
