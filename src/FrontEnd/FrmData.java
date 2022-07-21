/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;
import BackEnd.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author soyidwahyud
 */
public class FrmData extends javax.swing.JFrame {

    /**
     * Creates new form FrmData
     */
    public boolean click = false; 
    public FrmData() {
        initComponents();
        kosongkan();
        tampilkan();
    }
    public void kosongkan(){
        txtIDdata.setText("0");
        txtNama.setText("");
        txtNIK.setText("");
        txtNoTelp.setText("");
        txtUmur.setText("");
        txtAlamat.setText("");
        click = false;
    }
    public void tampilkan(){
        String[] kolom = {"Id","nama","NIK","Umur","No Telp","Alamat"};
        Object row[] = new Object[6];
        ArrayList<Data> l = new Data().getAll();
        tabelData.setModel(new DefaultTableModel(new Object[][]{}, kolom));
        for (int i = 0; i < l.size(); i++) {
            row[0] = l.get(i).getIddata();
            row[1] = l.get(i).getNama();
            row[2] = l.get(i).getNik();
            row[3] = l.get(i).getUmur();
            row[4] = l.get(i).getNotelp();
            row[5] = l.get(i).getAlamat();
            ((DefaultTableModel)tabelData.getModel()).addRow(row);
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

        Tambah = new javax.swing.JButton();
        jNik = new javax.swing.JLabel();
        hapus = new javax.swing.JButton();
        txtNIK = new javax.swing.JTextField();
        jjumlah = new javax.swing.JLabel();
        txtUmur = new javax.swing.JTextField();
        jdata = new javax.swing.JLabel();
        jharga = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        jIDPenumpang = new javax.swing.JLabel();
        txtIDdata = new javax.swing.JTextField();
        txtNoTelp = new javax.swing.JTextField();
        jnama = new javax.swing.JLabel();
        Simpan = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Booking = new javax.swing.JMenuItem();
        Data = new javax.swing.JMenuItem();
        Jadwal = new javax.swing.JMenuItem();
        Maskapai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        jNik.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jNik.setText("NIK");

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jjumlah.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jjumlah.setText("Umur");

        jdata.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jdata.setText("Data Penumpang");

        jharga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jharga.setText("No Telpon");

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelData);

        jIDPenumpang.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jIDPenumpang.setText("Id Penumpang");

        txtIDdata.setEditable(false);
        txtIDdata.setEnabled(false);

        jnama.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jnama.setText("Nama");

        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        jLabel1.setText("Alamat");

        jMenu4.setText("File");

        jMenuItem8.setText("Exit");
        jMenu4.add(jMenuItem8);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");

        Booking.setText("FrmBooking");
        Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingActionPerformed(evt);
            }
        });
        jMenu5.add(Booking);

        Data.setText("FrmData");
        Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataActionPerformed(evt);
            }
        });
        jMenu5.add(Data);

        Jadwal.setText("FrmJadwal");
        Jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JadwalActionPerformed(evt);
            }
        });
        jMenu5.add(Jadwal);

        Maskapai.setText("FrmMaskapai");
        Maskapai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaskapaiActionPerformed(evt);
            }
        });
        jMenu5.add(Maskapai);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jdata)
                        .addGap(115, 115, 115))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jnama, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jIDPenumpang, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jNik)
                            .addGap(333, 333, 333))
                        .addComponent(jjumlah, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jharga, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Simpan))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tambah)
                                .addGap(76, 76, 76)
                                .addComponent(hapus))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addComponent(txtIDdata, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addComponent(txtNIK, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addComponent(txtUmur, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addComponent(txtNoTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addComponent(txtAlamat)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIDPenumpang)
                    .addComponent(txtIDdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNik)
                    .addComponent(txtNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jjumlah)
                    .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jharga)
                    .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Simpan)
                    .addComponent(Tambah)
                    .addComponent(hapus))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingActionPerformed
        // TODO add your handling code here:
        FrmBooking frmBooking = new FrmBooking();
        frmBooking.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BookingActionPerformed

    private void DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataActionPerformed
        // TODO add your handling code here:
        FrmData frmdata = new FrmData();
        frmdata.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DataActionPerformed

    private void JadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JadwalActionPerformed
        // TODO add your handling code here:
        FrmJadwal frmjadwal = new FrmJadwal();
        frmjadwal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JadwalActionPerformed

    private void MaskapaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaskapaiActionPerformed
        // TODO add your handling code here:
        FrmMaskapai frmmaskapai = new FrmMaskapai();
        frmmaskapai.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MaskapaiActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
        kosongkan();
    }//GEN-LAST:event_TambahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        if (click) {
            DefaultTableModel model = (DefaultTableModel)tabelData.getModel();
            int row = tabelData.getSelectedRow();
            Data d = new Data().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
            d.delete();
            kosongkan();
            tampilkan();
        } else {
            
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        Data d = new Data();
        d.setIddata(Integer.parseInt(txtIDdata.getText()));
        d.setNama(txtNama.getText());
        d.setNik(txtNIK.getText());
        d.setNotelp(txtNoTelp.getText());
        d.setUmur(Integer.parseInt(txtUmur.getText()));
        d.setAlamat(txtAlamat.getText());
        d.save();
        txtIDdata.setText(Integer.toString(d.getIddata()));
        tampilkan();
        
    }//GEN-LAST:event_SimpanActionPerformed

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tabelData.getModel();
        int row = tabelData.getSelectedRow();
        Data d = new Data().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        txtIDdata.setText(String.valueOf(d.getIddata()));
        txtNama.setText(d.getNama());
        txtNIK.setText(d.getNik());
        txtUmur.setText(String.valueOf(d.getUmur()));
        txtNoTelp.setText(d.getNotelp());
        txtAlamat.setText(d.getAlamat());
        click = true;
    }//GEN-LAST:event_tabelDataMouseClicked

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
            java.util.logging.Logger.getLogger(FrmData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Booking;
    private javax.swing.JMenuItem Data;
    private javax.swing.JMenuItem Jadwal;
    private javax.swing.JMenuItem Maskapai;
    private javax.swing.JButton Simpan;
    private javax.swing.JButton Tambah;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jIDPenumpang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JLabel jNik;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jdata;
    private javax.swing.JLabel jharga;
    private javax.swing.JLabel jjumlah;
    private javax.swing.JLabel jnama;
    private javax.swing.JTable tabelData;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtIDdata;
    private javax.swing.JTextField txtNIK;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JTextField txtUmur;
    // End of variables declaration//GEN-END:variables
}
