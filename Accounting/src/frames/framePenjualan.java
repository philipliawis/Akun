package frames;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ButtonGroup;

public class framePenjualan extends javax.swing.JFrame {

    String id = "";
    Connection conn;
    SimpleDateFormat formatIn = new SimpleDateFormat("yyyy-MM-dd");
    java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());

    public framePenjualan(String id) {
        setLocationRelativeTo(null);
        initComponents();
        this.id = id;
        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioCash);
        buttonGroup1.add(radioPayable);
    }

    public framePenjualan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        fieldItem = new javax.swing.JTextField();
        fieldPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        radioPayable = new javax.swing.JRadioButton();
        radioCash = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        fieldPay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldDetail = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel3.setText("Nama Pembeli");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, -1));

        jLabel5.setText("Item yang dijual");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        getContentPane().add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 70, -1));
        getContentPane().add(fieldItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 70, -1));
        getContentPane().add(fieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 70, -1));

        jLabel1.setText("Harga Item");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, 20));

        radioPayable.setText("Account Payable");
        getContentPane().add(radioPayable, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        radioCash.setText("Cash");
        getContentPane().add(radioCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel4.setText("Jumlah Bayar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        getContentPane().add(fieldPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 70, -1));

        jLabel6.setText("Keterangan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        fieldDetail.setColumns(20);
        fieldDetail.setRows(5);
        jScrollPane1.setViewportView(fieldDetail);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel7.setText("Tambah Penjualan");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jLabel8.setText("Tipe Pembayaran");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, -1));

        jLabel9.setText("Banyak Item");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frameTengah ft = new frameTengah(id);
        this.dispose();
        ft.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        validation();
    }//GEN-LAST:event_jButton2ActionPerformed
    public void validation() {
        boolean con = true;
        if (fieldName.getText().equals("")) {
            con = false;
        }
        if (fieldPay.getText().equals("")) {
            con = false;
        }
        if (fieldItem.getText().equals("")) {
            con = false;
        }
        if (fieldPrice.getText().equals("")) {
            con = false;
        }
        if (fieldDetail.getText().equals("")) {
            con = false;
        }
        PreparedStatement pstmt;
        Connection conn;
        if (con) {
            Integer cogs = 0;
            Integer priceAwal = 0;
            try {
                Integer stockAwal = Integer.parseInt(jTextField1.getText());
                Integer hargaAwal = Integer.parseInt(fieldPrice.getText());
                Integer priceDatabase = getPriceDatabase();
                Integer hargaJual = hargaAwal * stockAwal;
                Integer HPP = stockAwal * priceDatabase;
                conn = util.connection.connect();
                if (radioCash.isSelected()) {
                    //nama , item , harga , jumlah , details , date
                    String sql = "Insert into penjualan values(?,?,?,?,?,?)";
                    pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, fieldName.getText());
                    pstmt.setString(2, fieldItem.getText());
                    pstmt.setString(3, fieldPay.getText());
                    pstmt.setString(4, jTextField1.getText());
                    pstmt.setString(5, fieldPay.getText());
                    pstmt.setString(6, fieldDetail.getText());
                    pstmt.execute();

                    sql = "Insert into jurnal values(?,?,?,?,?,?)";
                    //jurnal ,no akun,nama akun, debet, kredit, keterangan 
                    pstmt = conn.prepareStatement(sql);
                    pstmt.setDate(1, date);
                    pstmt.setInt(2, 101);
                    pstmt.setString(3, "Kas");
                    pstmt.setInt(4, Integer.parseInt(fieldPay.getText()));
                    pstmt.setInt(5, 0);
                    pstmt.setString(6, fieldDetail.getText());
                    pstmt.execute();

                    sql = "Insert into jurnal values(?,?,?,?,?,?)";
                    //jurnal ,no akun,nama akun, debet, kredit, keterangan 
                    pstmt = conn.prepareStatement(sql);
                    pstmt.setDate(1, date);
                    pstmt.setInt(2, 400);
                    pstmt.setString(3, "Penjualan");
                    pstmt.setInt(5, Integer.parseInt(fieldPay.getText()));
                    pstmt.setInt(4, 0);
                    pstmt.setString(6, fieldDetail.getText());
                    pstmt.execute();

                    Double avgNew = 0d;
                    //modify inventory
                    //avg price tidak berubah, stock saja
                    try {
                        sql = "update inventory_detail set inventory_detail_stock = inventory_detail_stock-? where inventory_id_inventory = ?";
                        pstmt = conn.prepareStatement(sql);
                        pstmt.setInt(1, Integer.parseInt(jTextField1.getText()));
                        pstmt.setInt(2, checkItemID());
                        System.out.println(pstmt);
                        pstmt.executeUpdate();
                    } catch (SQLException ex) {
                    }
                    if (pstmt.executeUpdate() == 1) {
                        util.Sutil.msg(null, "Updated data");
                    }

                } else {
                    String sql = "Insert into penjualan values(?,?,?,?,?,?)";
                    pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, fieldName.getText());
                    pstmt.setString(2, fieldItem.getText());
                    pstmt.setString(3, fieldPay.getText());
                    pstmt.setString(4, jTextField1.getText());
                    pstmt.setString(5, fieldPay.getText());
                    pstmt.setString(6, fieldDetail.getText() + " via credit");
                    pstmt.execute();

                    sql = "Insert into jurnal values(?,?,?,?,?,?)";
                    //jurnal ,no akun, debet, kredit, keterangan 
                    pstmt = conn.prepareStatement(sql);
                    pstmt.setDate(1, date);
                    pstmt.setInt(2, 103);
                    pstmt.setString(3, "Piutang Dagang");
                    pstmt.setInt(4, Integer.parseInt(fieldPay.getText()));
                    pstmt.setInt(5, 0);
                    pstmt.setString(6, fieldDetail.getText());
                    pstmt.execute();

                    sql = "Insert into jurnal values(?,?,?,?,?,?)";
                    //jurnal ,no akun, debet, kredit, keterangan 
                    pstmt = conn.prepareStatement(sql);
                    pstmt.setDate(1, date);
                    pstmt.setInt(2, 400);
                    pstmt.setString(3, "Penjualan");
                    pstmt.setInt(5, Integer.parseInt(fieldPay.getText()));
                    pstmt.setInt(4, 0);
                    pstmt.setString(6, fieldDetail.getText());
                    pstmt.execute();

                    Double avgNew = 0d;
                    //modify inventory
                    try {
                        sql = "update inventory_detail set inventory_detail_stock = inventory_detail_stock-? where inventory_id_inventory = ?";
                        pstmt = conn.prepareStatement(sql);
                        pstmt.setInt(1, Integer.parseInt(jTextField1.getText()));
                        pstmt.setInt(2, checkItemID());
                        System.out.println(pstmt);
                        pstmt.executeUpdate();
                    } catch (SQLException ex) {
                    }
                }
                //jurnal cogs
                String sql = "Insert into jurnal values(?,?,?,?,?,?)";
                //jurnal ,no akun, debet, kredit, keterangan 
                pstmt = conn.prepareStatement(sql);
                pstmt.setDate(1, date);
                pstmt.setInt(2, 500);
                pstmt.setString(3, "Harga Pokok Penjualan");
                pstmt.setInt(4, HPP);
                pstmt.setInt(5, 0);
                pstmt.setString(6, fieldDetail.getText());
                pstmt.execute();
                sql = "Insert into jurnal values(?,?,?,?,?,?)";
                //jurnal ,no akun, debet, kredit, keterangan 
                pstmt = conn.prepareStatement(sql);
                pstmt.setDate(1, date);
                pstmt.setInt(2, 102);
                pstmt.setString(3, "Persediaan Barang Dagangan");
                pstmt.setInt(5, HPP);
                pstmt.setInt(4, 0);
                pstmt.setString(6, fieldDetail.getText());
                pstmt.execute();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }

    public int getPriceDatabase() {
        Integer priceDB = 0;
        try {
            String sql = "Select * from inventory_detail where id_inventory = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, dataItem);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                priceDB = rs.getInt("inventory_detail_price");
            }
        } catch (SQLException ex) {

        }
        return priceDB;
    }

    public int getStockDatabase() {
        Integer stockDB = 0;
        try {
            String sql = "Select * from inventory_detail where id_inventory = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, dataItem);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                stockDB = rs.getInt("inventory_detail_stock");
            }
        } catch (SQLException ex) {

        }
        return stockDB;
    }

    public int getAvgPrice() {
        Integer avgPrice = 0;
        try {
            String sql = "Select * from inventory_detail where id_inventory = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, dataItem);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                avgPrice = rs.getInt("inventory_detail_average_price");
            }
        } catch (SQLException ex) {

        }
        return avgPrice;
    }

    public int checkItemID() {
        Integer itemId = 0;
        try {
            String sql = "Select * from inventory where name_inventory = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, fieldItem.getText());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                itemId = rs.getInt("id_inventory");
            }
        } catch (SQLException ex) {

        }
        return itemId;
    }
    Integer dataItem = 0;

    public boolean checkItemExist() {
        Boolean exists = false;
        try {
            String sql = "Select * from inventory where name_inventory = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, fieldItem.getText());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                exists = true;
                dataItem = rs.getInt("id_inventory");
            }
        } catch (SQLException ex) {

        }
        return exists;
    }

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
            java.util.logging.Logger.getLogger(framePenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea fieldDetail;
    private javax.swing.JTextField fieldItem;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldPay;
    private javax.swing.JTextField fieldPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton radioCash;
    private javax.swing.JRadioButton radioPayable;
    // End of variables declaration//GEN-END:variables
}
