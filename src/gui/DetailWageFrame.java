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
public class DetailWageFrame extends javax.swing.JFrame {

    /**
     * Creates new form DetailWageFrame
     */
    public DetailWageFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLuong = new javax.swing.JPanel();
        labelLuongNV = new javax.swing.JLabel();
        labelSoNgayTre = new javax.swing.JLabel();
        labelSoNgayDungGio = new javax.swing.JLabel();
        labelTongLuong = new javax.swing.JLabel();
        labelLuongCoBan = new javax.swing.JLabel();
        labelValueSoNgayTre = new javax.swing.JLabel();
        labelValueLuongCoBan = new javax.swing.JLabel();
        labelValueSoNgayDungGio = new javax.swing.JLabel();
        labelValueTongLuong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLuong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelLuongNV.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelLuongNV.setText("Lương nhân viên");

        labelSoNgayTre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSoNgayTre.setText("Số ngày đi làm trễ:");

        labelSoNgayDungGio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSoNgayDungGio.setText("Số ngày đi làm đúng giờ:");

        labelTongLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTongLuong.setText("Tổng lương nhận được:");

        labelLuongCoBan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLuongCoBan.setText("Lương cơ bản:");

        labelValueSoNgayTre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelValueSoNgayTre.setText("value");

        labelValueLuongCoBan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelValueLuongCoBan.setText("value");

        labelValueSoNgayDungGio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelValueSoNgayDungGio.setText("value");

        labelValueTongLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelValueTongLuong.setText("value");

        javax.swing.GroupLayout panelLuongLayout = new javax.swing.GroupLayout(panelLuong);
        panelLuong.setLayout(panelLuongLayout);
        panelLuongLayout.setHorizontalGroup(
            panelLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLuongLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSoNgayDungGio)
                    .addComponent(labelSoNgayTre)
                    .addComponent(labelTongLuong)
                    .addComponent(labelLuongCoBan))
                .addGap(52, 52, 52)
                .addGroup(panelLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelValueSoNgayTre)
                    .addComponent(labelLuongNV)
                    .addComponent(labelValueLuongCoBan)
                    .addComponent(labelValueTongLuong)
                    .addComponent(labelValueSoNgayDungGio))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        panelLuongLayout.setVerticalGroup(
            panelLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLuongLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelLuongNV)
                .addGap(49, 49, 49)
                .addGroup(panelLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSoNgayTre)
                    .addComponent(labelValueSoNgayTre))
                .addGap(61, 61, 61)
                .addGroup(panelLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSoNgayDungGio)
                    .addComponent(labelValueSoNgayDungGio))
                .addGap(55, 55, 55)
                .addGroup(panelLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLuongCoBan)
                    .addComponent(labelValueLuongCoBan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(panelLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTongLuong)
                    .addComponent(labelValueTongLuong))
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(DetailWageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailWageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailWageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailWageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailWageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelLuongCoBan;
    private javax.swing.JLabel labelLuongNV;
    private javax.swing.JLabel labelSoNgayDungGio;
    private javax.swing.JLabel labelSoNgayTre;
    private javax.swing.JLabel labelTongLuong;
    private javax.swing.JLabel labelValueLuongCoBan;
    private javax.swing.JLabel labelValueSoNgayDungGio;
    private javax.swing.JLabel labelValueSoNgayTre;
    private javax.swing.JLabel labelValueTongLuong;
    private javax.swing.JPanel panelLuong;
    // End of variables declaration//GEN-END:variables
}
