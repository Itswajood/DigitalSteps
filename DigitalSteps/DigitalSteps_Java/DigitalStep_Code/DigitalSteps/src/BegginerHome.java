

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Miad2
 */
public class BegginerHome extends javax.swing.JFrame {

    /**
     * Creates new form BegginerHome
     */
    public BegginerHome() {
        initComponents();
 setSize(805, 630);
 setResizable(false);
        setLocationRelativeTo(null);
         N.setOpaque(false);
        N.setContentAreaFilled(false);
        N.setBorderPainted(false);
        
        moveToReAndWa.setOpaque(false);
        moveToReAndWa.setContentAreaFilled(false);
        moveToReAndWa.setBorderPainted(false);
        moveToLQ.setOpaque(false);
        moveToLQ.setContentAreaFilled(false);
        moveToLQ.setBorderPainted(false);
        moveToComp.setOpaque(false);
        moveToComp.setContentAreaFilled(false);
        moveToComp.setBorderPainted(false);
       
        moveToInfo.setOpaque(false);
        moveToInfo.setContentAreaFilled(false);
        moveToInfo.setBorderPainted(false);
        moveToAboutUs.setOpaque(false);
        moveToAboutUs.setContentAreaFilled(false);
        moveToAboutUs.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        N = new javax.swing.JButton();
        moveToReAndWa = new javax.swing.JButton();
        moveToAboutUs = new javax.swing.JButton();
        moveToInfo = new javax.swing.JButton();
        moveToLQ = new javax.swing.JButton();
        moveToComp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Begginer Home");
        getContentPane().setLayout(null);

        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });
        getContentPane().add(N);
        N.setBounds(10, 150, 380, 180);

        moveToReAndWa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToReAndWaActionPerformed(evt);
            }
        });
        getContentPane().add(moveToReAndWa);
        moveToReAndWa.setBounds(410, 150, 380, 180);

        moveToAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToAboutUsActionPerformed(evt);
            }
        });
        getContentPane().add(moveToAboutUs);
        moveToAboutUs.setBounds(720, 10, 70, 70);

        moveToInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToInfoActionPerformed(evt);
            }
        });
        getContentPane().add(moveToInfo);
        moveToInfo.setBounds(10, 10, 70, 70);

        moveToLQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToLQActionPerformed(evt);
            }
        });
        getContentPane().add(moveToLQ);
        moveToLQ.setBounds(20, 350, 380, 180);

        moveToComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToCompActionPerformed(evt);
            }
        });
        getContentPane().add(moveToComp);
        moveToComp.setBounds(410, 350, 380, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OPP2 interfaces.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        // TODO add your handling code here:
        Less1 less1Frame = new Less1();
        dispose();
        less1Frame.setVisible(true);
    }//GEN-LAST:event_NActionPerformed

    private void moveToReAndWaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToReAndWaActionPerformed
      choose_the_type_ofquize(BegginerHome.this) ;
    }//GEN-LAST:event_moveToReAndWaActionPerformed
private void choose_the_type_ofquize(JFrame previousFrame) {
        choose_the_type_ofquize aboutUsFrame = new choose_the_type_ofquize(previousFrame);
        setVisible(false); // Hide current frame
        aboutUsFrame.setVisible(true);
    }
    private void moveToAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToAboutUsActionPerformed
        // TODO add your handling code here:
         goToAboutUs(BegginerHome.this);   
    }//GEN-LAST:event_moveToAboutUsActionPerformed
private void goToAboutUs(JFrame previousFrame) {
        AboutUs aboutUsFrame = new AboutUs(previousFrame);
        setVisible(false); // Hide current frame
        aboutUsFrame.setLocationRelativeTo(null);
        aboutUsFrame.setVisible(true);
    }
    private void moveToInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToInfoActionPerformed
       dispose();
        PlayerProfile addQuizeFrame = new PlayerProfile();
        addQuizeFrame.setLocationRelativeTo(null);
        addQuizeFrame.setVisible(true);

    }//GEN-LAST:event_moveToInfoActionPerformed

    private void moveToLQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToLQActionPerformed
        QuizQuestion1 takelevel = new QuizQuestion1();
        dispose();
        takelevel.setVisible(true);
    }//GEN-LAST:event_moveToLQActionPerformed

    private void moveToCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToCompActionPerformed
        String message = "<html><body><p style='font-size:16px;'>You will be signed out<br>and go to a worldwide competition.</p></body></html>";

        // Create a JLabel with the custom-styled message
        JLabel messageLabel = new JLabel(message);

        int choice = JOptionPane.showOptionDialog(null, messageLabel, "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
//int choice = JOptionPane.showConfirmDialog(null, "You will be signed out and go to a worldwide competition.", "Warning", JOptionPane.YES_NO_OPTION);
        
        if (choice == JOptionPane.YES_OPTION) {
            dispose();
            // Open a new frame or perform any desired action
             WWC_frame addQuizeFrame = new WWC_frame();
addQuizeFrame.setLocationRelativeTo(null);
    addQuizeFrame.setVisible(true);
        }
    }//GEN-LAST:event_moveToCompActionPerformed

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
            java.util.logging.Logger.getLogger(BegginerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BegginerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BegginerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BegginerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BegginerHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton N;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton moveToAboutUs;
    private javax.swing.JButton moveToComp;
    private javax.swing.JButton moveToInfo;
    private javax.swing.JButton moveToLQ;
    private javax.swing.JButton moveToReAndWa;
    // End of variables declaration//GEN-END:variables
}
