/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomasyonktp;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YAGMUR
 */
public class UyePanel extends javax.swing.JFrame {

    /**
     * Creates new form UyePanel
     */
    public UyePanel() {
        initComponents();
        uyeGetir();
        kitapListele();
        OduncKitapListele();
        IadeKitapListele();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        txtAra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKitap = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUzer = new javax.swing.JTable();
        btnOduncUzat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableIade = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        txtSoyad = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        btnOnay = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtUyeAd = new javax.swing.JTextField();
        btnUyeSil = new javax.swing.JButton();
        txtSifre = new javax.swing.JTextField();
        lblBorc = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblHos = new javax.swing.JLabel();
        btnCikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Üye Paneli");

        txtAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAraActionPerformed(evt);
            }
        });

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel6, org.jdesktop.beansbinding.ELProperty.create("${icon}"), jLabel6, org.jdesktop.beansbinding.BeanProperty.create("icon"));
        binding.setSourceNullValue(new javax.swing.ImageIcon(getClass().getResource("/otomasyonktp/resimler/iconfinder_revisi_03_2191539.png"))); // NOI18N
        bindingGroup.addBinding(binding);

        tblKitap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblKitap);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kitap Ara", jPanel4);

        jTableUzer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableUzer);

        btnOduncUzat.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnOduncUzat.setForeground(new java.awt.Color(153, 0, 153));
        btnOduncUzat.setText("Süre Uzat");
        btnOduncUzat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOduncUzatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOduncUzat)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnOduncUzat)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Üzerimdekiler", jPanel1);

        jTableIade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableIade);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("İadelerim", jPanel2);

        jLabel1.setText("Ad");

        jLabel2.setText("Soyad");

        jLabel3.setText("Mail");

        jLabel4.setText("Şifre");

        txtMail.setText(" ");

        btnOnay.setBackground(new java.awt.Color(255, 255, 102));
        btnOnay.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnOnay.setText("Değişiklikleri Onayla");
        btnOnay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnayActionPerformed(evt);
            }
        });

        jLabel5.setText("Üye Adı");

        btnUyeSil.setBackground(new java.awt.Color(204, 0, 0));
        btnUyeSil.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnUyeSil.setForeground(new java.awt.Color(255, 255, 255));
        btnUyeSil.setText("Üye Hesabımı Sil");
        btnUyeSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUyeSilActionPerformed(evt);
            }
        });

        lblBorc.setBackground(new java.awt.Color(239, 2, 2));
        lblBorc.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        lblBorc.setForeground(new java.awt.Color(95, 0, 44));
        lblBorc.setText("b");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUyeAd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUyeSil)
                    .addComponent(lblBorc))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOnay)
                .addGap(128, 128, 128))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUyeSil, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtUyeAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblBorc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnOnay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("Üye İşlemlerim", jPanel3);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otomasyonktp/resimler/ktplk.png"))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(253, 162, 10));
        jPanel6.setForeground(new java.awt.Color(253, 162, 10));

        jLabel8.setText("1) Kütüphane her gün 8.00-20.00 arası açıktır");

        jLabel7.setText("2) Kitap ödünç süresi 14 gündür");

        jLabel9.setText("3) Ödünç süresi, bir kere iki haftalığına uzatılabilir");

        jLabel10.setText("4) Üzerinizde kitap varken üyeliğinizi sildiremezsiniz");

        jLabel13.setText("6) Borcunuzu kitabı iade ederken ödemeniz gerekmektedir.");

        jLabel12.setText("5) Borç, geciken her gün için 1 TL'dir.  Borcunuz varken üyeliğinizi sildiremezsiniz.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Genel Kurallar", jPanel5);

        lblHos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblHos.setForeground(new java.awt.Color(102, 0, 0));
        lblHos.setText("HOŞGELDİNİZ ");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, lblHos, org.jdesktop.beansbinding.ELProperty.create("${icon}"), lblHos, org.jdesktop.beansbinding.BeanProperty.create("icon"));
        binding.setSourceNullValue(new javax.swing.ImageIcon(getClass().getResource("/otomasyonktp/resimler/iconfinder_ilustracoes_04-10_1519778 (1).png"))); // NOI18N
        bindingGroup.addBinding(binding);

        btnCikis.setBackground(new java.awt.Color(255, 0, 0));
        btnCikis.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnCikis.setForeground(new java.awt.Color(255, 255, 255));
        btnCikis.setText("Çıkış Yap");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHos, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCikis)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblHos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCikis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOnayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnayActionPerformed
        // TODO add your handling code here:
        String ad = txtAd.getText();
        String soyad = txtSoyad.getText();
        String uyead = txtUyeAd.getText();
        String mail = txtMail.getText();
        String sifre = txtSifre.getText();

        if (ad.equals("") || soyad.equals("") || uyead.equals("") || mail.equals("") || sifre.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen boş bırakmayınız");
        } else {
            try {
                Baglanti db = new Baglanti();
                db.baglan().executeUpdate("update uyeler set Ad='" + ad + "', Soyad='" + soyad
                        + "', UyeAdi = '" + uyead + "', Mail='" + mail + "', Sifre='" + sifre + "' where uyeID =" + GirisSayfa.uyeID);
                JOptionPane.showMessageDialog(rootPane, "Düzenlendi");
                uyeGetir();
            } catch (Exception e) {
                System.err.println("İşlem hatası:" + e);
            }
        }
    }//GEN-LAST:event_btnOnayActionPerformed

    private void btnUyeSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUyeSilActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.showConfirmDialog(null, "Emin misiniz? Bu işlem geri alınamaz.", "WARNING", JOptionPane.YES_NO_OPTION);
        if (dialogButton == JOptionPane.YES_OPTION) {
            try {
                Baglanti db = new Baglanti();
                ResultSet rs = db.baglan().executeQuery("select * from odunc where uyeID = " + GirisSayfa.uyeID);
                if (!rs.next()) {
                    int s = db.baglan().executeUpdate("delete from uyeler where uyeID = " + GirisSayfa.uyeID);
                    JOptionPane.showMessageDialog(rootPane, "Üyeliğiniz Silindi");

                    dispose();
                    GirisSayfa g = new GirisSayfa();
                    g.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ödünç aldığınız kitapları iade etmeden bu işlemi gerçekleştiremezsiniz!", null, JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {

            }
        } else {
            remove(dialogButton);
        }
    }//GEN-LAST:event_btnUyeSilActionPerformed

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        // TODO add your handling code here:
        GirisSayfa g = new GirisSayfa();
        g.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCikisActionPerformed

    private void txtAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAraActionPerformed
        // TODO add your handling code here:
        KitapAra();
    }//GEN-LAST:event_txtAraActionPerformed

    private void btnOduncUzatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOduncUzatActionPerformed
        // TODO add your handling code here:
        String uzat = " ";
        try {
              String oduncid = (String) jTableUzer.getValueAt(jTableUzer.getSelectedRow(), 1);
            String odunc = (String) jTableUzer.getValueAt(jTableUzer.getSelectedRow(), 5);
            
            Baglanti db = new Baglanti();
            ResultSet rs = db.baglan().executeQuery("select * from odunc where oduncid =" + oduncid);
            
            if(rs.next())
            {
                if(rs.getString("uzatmi").equals("0"))
              {            
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
               Date d = formatter.parse(odunc);
              Calendar c = Calendar.getInstance();
              c.setTime(d);
              c.add(Calendar.DATE, 14);
              SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
             uzat = f.format(c.getTime());

            db.baglan().executeUpdate("update odunc set iadetarih ='" + uzat + "', uzatmi = 1 where oduncid =" + oduncid);
            OduncKitapListele();
            }
                else
                     JOptionPane.showMessageDialog(rootPane, "İkinci kere süre uzatılamaz");
            }
        } catch (ParseException ex) {

        } catch (SQLException ex) {
           System.err.println("İşlem hatası:" + ex);
        }

    }//GEN-LAST:event_btnOduncUzatActionPerformed

    void uyeGetir() {
        try {
            Baglanti db = new Baglanti();
            ResultSet s = db.baglan().executeQuery("select * from uyeler where uyeID= " + GirisSayfa.uyeID);
            while (s.next()) {
                lblHos.setText(lblHos.getText() + " " + s.getString("Ad").toUpperCase() + " " + s.getString("Soyad").toUpperCase());
                txtAd.setText(s.getString("Ad"));
                txtSoyad.setText(s.getString("Soyad"));
                txtUyeAd.setText(s.getString("UyeAdi"));
                txtMail.setText(s.getString("Mail"));
                txtSifre.setText(s.getString("Sifre"));
                String borc = s.getString("borcgun") == "0" ? "Borcunuz bulunmamaktadır." : "Borcunuz " + s.getString("borcgun") + " TLdir";
                lblBorc.setText(borc);
            }
        } catch (Exception e) {
            System.err.println("İşlem hatası:" + e);
        }

    }

    void kitapListele() {
        int i = 0;
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Sıra No");
        dt.addColumn("Kitap Adı");
        dt.addColumn("Yazar Adı");
        dt.addColumn("Yayınevi");
        dt.addColumn("Basım Yılı");
        dt.addColumn("Yer");
        dt.addColumn("Durum");

        try {
            Baglanti db = new Baglanti();
            ResultSet rs = db.baglan().executeQuery("select * from kitaplar");

            while (rs.next()) {
                i += 1;
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
                String d = formatter.format(rs.getDate("BasimYili"));
                String raf = rs.getString("RaftaMi").equals("0") ? "Emanet" : "Rafta";
                dt.addRow(new String[]{Integer.toString(i), rs.getString("KitapAdi"), rs.getString("YazarAdi"),
                    rs.getString("YayinEvi"), d, rs.getString("Yer"), raf});

            }
            tblKitap.setModel(dt);
        } catch (Exception e) {
        }

    }

    void OduncKitapListele() {
        int i = 0;
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Sıra No");
        dt.addColumn("ID");
        dt.addColumn("Kitap");
        dt.addColumn("Yazar");
        dt.addColumn("Ödünç Tarihi");
        dt.addColumn("İade Tarihi");
        dt.addColumn("Uzatıldı mı");
        try {
            Baglanti db = new Baglanti();
            ResultSet rs = db.baglan().executeQuery("select odunc.oduncid, kitaplar.Kitapadi, kitaplar.yazaradi, odunc.oduncTarih, odunc.iadeTarih, odunc.uzatmi from odunc inner join kitaplar on kitaplar.kitapid = odunc.kitapid where iademi= 0 && uyeid ='" + GirisSayfa.uyeID + "'");

            while (rs.next()) {
                i += 1;
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                String oT = formatter.format(rs.getDate("oduncTarih"));
                String iT = formatter.format(rs.getDate("iadeTarih"));
                String uzat = rs.getString("uzatmi").equals("0") ? "Hayır" : "Evet";
                dt.addRow(new String[]{Integer.toString(i), rs.getString("oduncid"), rs.getString("Kitapadi"), rs.getString("Yazaradi"), oT, iT, uzat});
            }
            jTableUzer.setModel(dt);
        } catch (Exception e) {
              System.err.println("İşlem hatası:" + e);
        }
    }

    void IadeKitapListele() {
        int i = 0;
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Sıra No");
        dt.addColumn("Kitap");
        dt.addColumn("Yazar");
        dt.addColumn("Ödünç Tarihi");
        dt.addColumn("İade Tarihi");
        try {
            Baglanti db = new Baglanti();
            ResultSet rs = db.baglan().executeQuery("select kitaplar.Kitapadi, kitaplar.yazaradi, odunc.oduncTarih, odunc.iadeTarih from odunc inner join kitaplar on kitaplar.kitapid = odunc.kitapid where iademi= 1 && uyeid ='" + GirisSayfa.uyeID + "'");

            while (rs.next()) {
                i += 1;
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                String oT = formatter.format(rs.getDate("oduncTarih"));
                String iT = formatter.format(rs.getDate("iadeTarih"));
                dt.addRow(new String[]{Integer.toString(i), rs.getString("Kitapadi"), rs.getString("yazaradi"), oT, iT});
            }
            jTableIade.setModel(dt);
        } catch (Exception e) {
              System.err.println("İşlem hatası:" + e);
        }
    }

    void KitapAra() {
        int i = 0;
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Sıra No");
        dt.addColumn("Kitap Adı");
        dt.addColumn("Yazar Adı");
        dt.addColumn("Yayınevi");
        dt.addColumn("Basım Yılı");
        dt.addColumn("Yer");
        dt.addColumn("Durum");
        String ara = txtAra.getText();

        try {
            Baglanti db = new Baglanti();
            ResultSet rs = db.baglan().executeQuery("select * from kitaplar where kitapadi like '%" + ara + "%' or yazaradi like '%" + ara + "%' or yayinevi like '%" + ara + "%'");

            while (rs.next()) {
                i += 1;
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
                String d = formatter.format(rs.getDate("BasimYili"));
                String raf = rs.getString("RaftaMi").equals("0") ? "Emanet" : "Rafta";
                dt.addRow(new String[]{Integer.toString(i), rs.getString("KitapAdi"), rs.getString("YazarAdi"),
                    rs.getString("YayinEvi"), d, rs.getString("Yer"), raf});
            }
            tblKitap.setModel(dt);
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
            java.util.logging.Logger.getLogger(UyePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UyePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UyePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UyePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UyePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnOduncUzat;
    private javax.swing.JButton btnOnay;
    private javax.swing.JButton btnUyeSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableIade;
    private javax.swing.JTable jTableUzer;
    private javax.swing.JLabel lblBorc;
    private javax.swing.JLabel lblHos;
    private javax.swing.JTable tblKitap;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtSifre;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtUyeAd;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
