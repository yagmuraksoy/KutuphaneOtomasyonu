/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomasyonktp;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author YAGMUR
 */
public class KitapDuzen extends javax.swing.JFrame {

    /**
     * Creates new form KitapDuzen
     */
    public KitapDuzen() {
        initComponents();
        kitapGetir(AdminPanel.yerD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtKitapAdi = new javax.swing.JTextField();
        txtYazarAdi = new javax.swing.JTextField();
        txtYayinevi = new javax.swing.JTextField();
        txtBasim = new javax.swing.JTextField();
        txtYer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chkRaf = new javax.swing.JCheckBox();
        btnGuncel = new javax.swing.JButton();
        lblIptal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kitap Düzenleme");

        jLabel1.setText("Yer");

        jLabel2.setText("Basım Yılı");

        jLabel3.setText("Yayınevi");

        jLabel8.setText("Yazar Adı");

        jLabel9.setText("Kitap Adı");

        jLabel10.setText("Rafta mı?");

        chkRaf.setText("Rafta");
        chkRaf.setEnabled(false);

        btnGuncel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnGuncel.setText("GÜNCELLE");
        btnGuncel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelActionPerformed(evt);
            }
        });

        lblIptal.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblIptal.setForeground(new java.awt.Color(153, 0, 0));
        lblIptal.setText("İPTAL");
        lblIptal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iptal(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkRaf)
                            .addComponent(txtYer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtYazarAdi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(txtYayinevi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBasim, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKitapAdi))
                        .addGap(146, 146, 146)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuncel)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIptal)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKitapAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYazarAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYayinevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBasim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(chkRaf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuncel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIptal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuncelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelActionPerformed
        // TODO add your handling code here: 
        try {
            String kitap = txtKitapAdi.getText();
            String yazar = txtYazarAdi.getText();
            String yayin = txtYayinevi.getText();
            String basim = txtBasim.getText();
            String yer = txtYer.getText();
            String raf = chkRaf.isSelected() ? "1" : "0";
            int admin = AdminGiris.adminID;
            Baglanti db = new Baglanti();
            db.baglan().executeUpdate("update kitaplar set kitapadi ='" + kitap + "', "
                    + "yazaradi ='" + yazar + "', yayinevi ='" + yayin + "', basimyili ='" + basim
                    + "', yer ='" + yer + "', raftami ='" + raf + "', adminid ='"+admin+"' where yer='" + AdminPanel.yerD + "'");

           JOptionPane.showMessageDialog(rootPane, "Kitap Düzenlendi!");
              AdminPanel p = new AdminPanel();
        p.setVisible(true);
        dispose();
        } catch (Exception e) {
            System.err.println("İşlem hatası:" + e);
        }
    }//GEN-LAST:event_btnGuncelActionPerformed

    private void iptal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iptal
        // TODO add your handling code here:
         AdminPanel p = new AdminPanel();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_iptal

    void kitapGetir(String y) {
        try {
            Baglanti db = new Baglanti();
            ResultSet s = db.baglan().executeQuery("select * from kitaplar where yer='" + y + "'");
            while (s.next()) {
                 SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
                String basim = formatter.format(s.getDate("BasimYili"));
                boolean raf = s.getString("RaftaMi").equals("1") ? true : false;
                txtKitapAdi.setText(s.getString("KitapAdi"));
                txtYazarAdi.setText(s.getString("YazarAdi"));
                txtYayinevi.setText(s.getString("Yayinevi"));
                txtBasim.setText(basim);
                txtYer.setText(s.getString("Yer"));
                chkRaf.setSelected(raf);
            }
        } catch (Exception e) {
            System.err.println("İşlem hatası:" + e);
        }

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
            java.util.logging.Logger.getLogger(KitapDuzen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapDuzen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapDuzen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapDuzen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KitapDuzen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuncel;
    private javax.swing.JCheckBox chkRaf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblIptal;
    private javax.swing.JTextField txtBasim;
    private javax.swing.JTextField txtKitapAdi;
    private javax.swing.JTextField txtYayinevi;
    private javax.swing.JTextField txtYazarAdi;
    private javax.swing.JTextField txtYer;
    // End of variables declaration//GEN-END:variables
}
