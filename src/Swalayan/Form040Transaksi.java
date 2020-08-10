package Swalayan;

import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Form040Transaksi extends javax.swing.JFrame {

    public Form040Transaksi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbBack = new javax.swing.JLabel();
        lbExit1 = new javax.swing.JLabel();
        lbMinimize1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfIdCustomer = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btEnter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbCreate = new javax.swing.JLabel();
        lbError = new javax.swing.JLabel();
        btRiwayatTransaksi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        lbBack.setFont(new java.awt.Font("HelvLight", 1, 24)); // NOI18N
        lbBack.setForeground(new java.awt.Color(236, 240, 241));
        lbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swalayan/iconGoBack_50px.png"))); // NOI18N
        lbBack.setText("   MyMart");
        lbBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBackMouseClicked(evt);
            }
        });

        lbExit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbExit1.setForeground(new java.awt.Color(255, 255, 255));
        lbExit1.setText("x");
        lbExit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExit1MouseClicked(evt);
            }
        });

        lbMinimize1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbMinimize1.setForeground(new java.awt.Color(255, 255, 255));
        lbMinimize1.setText("-");
        lbMinimize1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMinimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimize1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1122, Short.MAX_VALUE)
                .addComponent(lbMinimize1)
                .addGap(18, 18, 18)
                .addComponent(lbExit1)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMinimize1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(lbBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("ID CUSTOMER");

        tfIdCustomer.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tfIdCustomer.setBorder(null);

        btEnter.setBackground(new java.awt.Color(0, 51, 255));
        btEnter.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btEnter.setForeground(new java.awt.Color(255, 255, 255));
        btEnter.setText("ENTER");
        btEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swalayan/icons8-receipt-100.png"))); // NOI18N
        jLabel2.setText("TRANSAKSI");

        lbCreate.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCreate.setText("click here to create and view customers");
        lbCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCreateMouseClicked(evt);
            }
        });

        lbError.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbError.setForeground(new java.awt.Color(255, 0, 0));
        lbError.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbError.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbError.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbErrorMouseClicked(evt);
            }
        });

        btRiwayatTransaksi.setBackground(new java.awt.Color(0, 51, 255));
        btRiwayatTransaksi.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btRiwayatTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btRiwayatTransaksi.setText("RIWAYAT TRANSAKSI");
        btRiwayatTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRiwayatTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btRiwayatTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbError, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                            .addComponent(tfIdCustomer)
                            .addComponent(jSeparator1))))
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tfIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRiwayatTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lbCreate)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(1254, 1254, 1254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(459, 459, 459))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 50, 1420, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbExit1MouseClicked

    private void lbMinimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimize1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbMinimize1MouseClicked

    private void lbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseClicked
        Form02Seller seller = new Form02Seller();
        seller.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbBackMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void lbCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCreateMouseClicked
        Form041Register register = new Form041Register();
        register.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbCreateMouseClicked

    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed
        if (tfIdCustomer.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Masukkan ID Customer");
        } else {
            Connection conn;
            conn = ClassConfig.Conn();
            Statement st;
            ResultSet rs;

            try {
                int id = Integer.parseInt(tfIdCustomer.getText());
                ClassCustomer customer = new ClassCustomer();
                customer.setId(id);

                String sql = "SELECT * FROM customer WHERE id_customer = '" + customer.getId() + "'";
                st = conn.createStatement();
                rs = st.executeQuery(sql);

                if (rs.next()) {
                    try {
                        Statement st2;

                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();

                        String sql2 = "INSERT INTO transaksi (nomor_transaksi, id_customer, tanggal) VALUES(NULL, '" + customer.getId() + "', '" + dtf.format(now) + "')";
                        st2 = conn.createStatement();
                        st2.executeUpdate(sql2);

                        Form042Proses proses = new Form042Proses();
                        try {
                            Statement st4;
                            ResultSet rs4;

                            String sql4 = "SELECT * FROM customer WHERE id_customer = " + customer.getId() + "";
                            st4 = conn.createStatement();
                            rs4 = st4.executeQuery(sql4);

                            while (rs4.next()) {
                                customer.setNama(rs4.getString("nama_customer"));
                                customer.setKategori(rs4.getString("kategori"));
                                customer.setPoin(rs4.getInt("poin"));

                                proses.nama = customer.getNama();
                                proses.kategori = customer.getKategori();
                                proses.poin = customer.getPoin();
                                try {
                                    Statement st3;
                                    ResultSet rs3;

                                    String sql3 = "SELECT * FROM transaksi ORDER BY nomor_transaksi DESC LIMIT 1";
                                    st3 = conn.createStatement();
                                    rs3 = st3.executeQuery(sql3);

                                    while (rs3.next()) {
                                        int nomorTransaksi = rs3.getInt("nomor_transaksi");
                                        Timestamp tanggalTransaksi = rs3.getTimestamp("tanggal");
                                        customer.setId(rs3.getInt("id_customer"));
                                        proses.id = customer.getId();
                                        if ("Member".equals(customer.getKategori())) {
                                            ClassTransaksiMember transaksi = new ClassTransaksiMember(nomorTransaksi, tanggalTransaksi);
                                            proses.nomor = transaksi.getNomor();
                                            proses.tanggal = transaksi.getTanggal();
                                        } else {
                                            ClassTransaksiNonMember transaksi = new ClassTransaksiNonMember(nomorTransaksi, tanggalTransaksi);
                                            proses.nomor = transaksi.getNomor();
                                            proses.tanggal = transaksi.getTanggal();
                                        }

                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                        }

                        proses.setVisible(true);
                        this.setVisible(false);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    lbError.setText("Failed ID Customer");
                    tfIdCustomer.setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btEnterActionPerformed

    private void lbErrorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbErrorMouseClicked

    }//GEN-LAST:event_lbErrorMouseClicked

    private void btRiwayatTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRiwayatTransaksiActionPerformed
        Form044TampilTransaksi tampil = new Form044TampilTransaksi();
        tampil.setVisible(true);
    }//GEN-LAST:event_btRiwayatTransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(Form040Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form040Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form040Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form040Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form040Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnter;
    private javax.swing.JButton btRiwayatTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbCreate;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbExit1;
    private javax.swing.JLabel lbMinimize1;
    private javax.swing.JTextField tfIdCustomer;
    // End of variables declaration//GEN-END:variables
}
