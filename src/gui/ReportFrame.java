/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Lenovo
 */
public class ReportFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReportFrame
     */
    public ReportFrame(String spbcn, String spbin,int tong) {
        initComponents();
        setLocationRelativeTo(null);
        labelValueSPBCN.setText(spbcn);
        labelValueSPBIN.setText(spbin);
        labelValueTong.setText(String.valueOf(tong));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelBaoCao = new javax.swing.JLabel();
        labelSanPhamBanChayNhat = new javax.swing.JLabel();
        labelSPBanItNhat = new javax.swing.JLabel();
        labelTongSanPhamBanDuoc = new javax.swing.JLabel();
        labelValueSPBIN = new javax.swing.JLabel();
        labelValueSPBCN = new javax.swing.JLabel();
        labelValueTong = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelBaoCao.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelBaoCao.setText("Báo Cáo");

        labelSanPhamBanChayNhat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelSanPhamBanChayNhat.setText("Sản phẩm bán chạy nhất: ");

        labelSPBanItNhat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelSPBanItNhat.setText("Sản phẩm bán ít nhất: ");

        labelTongSanPhamBanDuoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTongSanPhamBanDuoc.setText("Tổng sản phẩm bán được:");

        labelValueSPBIN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelValueSPBIN.setText("value");

        labelValueSPBCN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelValueSPBCN.setText("value");

        labelValueTong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelValueTong.setText("value");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTongSanPhamBanDuoc)
                                .addGap(60, 60, 60)
                                .addComponent(labelValueTong))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSPBanItNhat)
                                    .addComponent(labelSanPhamBanChayNhat))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelValueSPBCN)
                                    .addComponent(labelValueSPBIN)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(labelBaoCao)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(labelBaoCao)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSanPhamBanChayNhat)
                    .addComponent(labelValueSPBCN))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSPBanItNhat)
                    .addComponent(labelValueSPBIN))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTongSanPhamBanDuoc)
                    .addComponent(labelValueTong))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ReportFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBaoCao;
    private javax.swing.JLabel labelSPBanItNhat;
    private javax.swing.JLabel labelSanPhamBanChayNhat;
    private javax.swing.JLabel labelTongSanPhamBanDuoc;
    private javax.swing.JLabel labelValueSPBCN;
    private javax.swing.JLabel labelValueSPBIN;
    private javax.swing.JLabel labelValueTong;
    // End of variables declaration//GEN-END:variables
}