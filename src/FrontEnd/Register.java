/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

/**
 *
 * @author soyidwahyud
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        jregister = new javax.swing.JLabel();
        jnama = new javax.swing.JLabel();
        jnotelp = new javax.swing.JLabel();
        jpassword = new javax.swing.JLabel();
        jemail = new javax.swing.JLabel();
        Jusername = new javax.swing.JLabel();
        jNamaTextField1 = new javax.swing.JTextField();
        jNotelpTextField2 = new javax.swing.JTextField();
        jEmailTextField3 = new javax.swing.JTextField();
        jUsernameTextField4 = new javax.swing.JTextField();
        jPasswordTextField5 = new javax.swing.JTextField();
        jsignupButton1 = new javax.swing.JButton();
        jExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jregister.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jregister.setText("Register");

        jnama.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jnama.setText("Nama");

        jnotelp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jnotelp.setText("No Telpon");

        jpassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jpassword.setText("Password");

        jemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jemail.setText("Email");

        Jusername.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Jusername.setText("Username");

        jsignupButton1.setText("Sign up");
        jsignupButton1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jsignupButton1ComponentMoved(evt);
            }
        });
        jsignupButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsignupButton1ActionPerformed(evt);
            }
        });

        jExitButton.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jregister))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jsignupButton1)
                            .addGap(56, 56, 56)
                            .addComponent(jExitButton)
                            .addGap(27, 27, 27))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jnama)
                                .addComponent(jnotelp)
                                .addComponent(jemail)
                                .addComponent(Jusername)
                                .addComponent(jpassword))
                            .addGap(91, 91, 91)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jUsernameTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jEmailTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jNotelpTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jNamaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jregister)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jnama)
                            .addComponent(jNamaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jnotelp))
                    .addComponent(jNotelpTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jemail)
                    .addComponent(jEmailTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jusername)
                    .addComponent(jUsernameTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpassword)
                    .addComponent(jPasswordTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsignupButton1)
                    .addComponent(jExitButton))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsignupButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsignupButton1ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jsignupButton1ActionPerformed

    private void jsignupButton1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jsignupButton1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jsignupButton1ComponentMoved

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jusername;
    private javax.swing.JTextField jEmailTextField3;
    private javax.swing.JButton jExitButton;
    private javax.swing.JTextField jNamaTextField1;
    private javax.swing.JTextField jNotelpTextField2;
    private javax.swing.JTextField jPasswordTextField5;
    private javax.swing.JTextField jUsernameTextField4;
    private javax.swing.JLabel jemail;
    private javax.swing.JLabel jnama;
    private javax.swing.JLabel jnotelp;
    private javax.swing.JLabel jpassword;
    private javax.swing.JLabel jregister;
    private javax.swing.JButton jsignupButton1;
    // End of variables declaration//GEN-END:variables
}