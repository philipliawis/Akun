package frames;

public class frameTengah extends javax.swing.JFrame {

    String id;

    public frameTengah() {
        initComponents();
    }

    public frameTengah(String s) {
        setLocationRelativeTo(null);
        initComponents();
        this.id = s;
        setTitle("Welcome " + s + " to Program A");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonJurnal = new javax.swing.JButton();
        buttonPembelian = new javax.swing.JButton();
        buttonInventory = new javax.swing.JButton();
        buttonPenjualan = new javax.swing.JButton();
        buttonAbout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonJurnal.setText("Jurnal");
        buttonJurnal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJurnalActionPerformed(evt);
            }
        });
        getContentPane().add(buttonJurnal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 273, 200, 150));

        buttonPembelian.setText("Transaksi Pembelian");
        buttonPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPembelianActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 0, 200, 150));

        buttonInventory.setText("Inventory");
        buttonInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInventoryActionPerformed(evt);
            }
        });
        getContentPane().add(buttonInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 273, 200, 150));

        buttonPenjualan.setText("Transaksi Penjualan");
        buttonPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPenjualanActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 150));

        buttonAbout.setText("About");
        buttonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAboutActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 151, 120, 120));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPenjualanActionPerformed
        framePenjualan fp = new framePenjualan(id);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonPenjualanActionPerformed

    private void buttonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAboutActionPerformed
        util.Sutil.msg(null, "Program ini dibuat oleh " + "\n" + "Eric Yapnata" + "\n" + "Wilbert Lauren" + "\n" + "Edward WIjaya" + "\n" +"Philip");
    }//GEN-LAST:event_buttonAboutActionPerformed

    private void buttonPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPembelianActionPerformed
        framePembelian fpn = new framePembelian(id);
        fpn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonPembelianActionPerformed

    private void buttonJurnalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJurnalActionPerformed
        frameJurnal fj = new frameJurnal(id);
        fj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonJurnalActionPerformed

    private void buttonInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInventoryActionPerformed
       frameInventory fi = new frameInventory(id);
       fi.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_buttonInventoryActionPerformed

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
            java.util.logging.Logger.getLogger(frameTengah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameTengah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameTengah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameTengah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameTengah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAbout;
    private javax.swing.JButton buttonInventory;
    private javax.swing.JButton buttonJurnal;
    private javax.swing.JButton buttonPembelian;
    private javax.swing.JButton buttonPenjualan;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
