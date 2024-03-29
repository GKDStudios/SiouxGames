
package TelaLogin;

import Jogao.Principal;
import javax.swing.ImageIcon;
import Jogao.VaiJogo;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;


public class TelaLogin extends javax.swing.JFrame {
    
    public TelaLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        jbINICIAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jlIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sioux");
        setIconImage(new ImageIcon(getClass().getResource("IconJFrame.png")).getImage());
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlNome.setFont(new java.awt.Font("Quadrit", 1, 24)); // NOI18N
        jlNome.setForeground(new java.awt.Color(218, 215, 225));
        jlNome.setText("Sioux");
        jPanel1.add(jlNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 70, 30));

        jbINICIAR.setBackground(new java.awt.Color(102, 102, 102));
        jbINICIAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbINICIAR.setForeground(new java.awt.Color(212, 52, 33));
        jbINICIAR.setText("INICIAR");
        jbINICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbINICIARActionPerformed(evt);
            }
        });
        jPanel1.add(jbINICIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(212, 215, 225));
        jLabel1.setText("©Copyright GKDSTUDIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(102, 102, 102));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(212, 52, 33));
        jToggleButton1.setText("SAIR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 110, -1));

        jlIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TelaLogin/battleback10.png"))); // NOI18N
        jlIcon.setText("jLabel1");
        jPanel1.add(jlIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jbINICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbINICIARActionPerformed
        setVisible(false);
        Principal p1 = new Principal ();
        p1.setVisible(true);
    }//GEN-LAST:event_jbINICIARActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbINICIAR;
    private javax.swing.JLabel jlIcon;
    private javax.swing.JLabel jlNome;
    // End of variables declaration//GEN-END:variables
}
