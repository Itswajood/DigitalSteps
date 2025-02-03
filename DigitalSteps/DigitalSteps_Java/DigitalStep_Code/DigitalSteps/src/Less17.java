//package norahframe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Miad2
 */
public class Less17 extends javax.swing.JFrame {
 public static int player_id = DigitalStepsMain.myPlayers.firstPlayer().getPlayer_ID();
    /**
     * Creates new form Less17
     */
    public Less17() {
        initComponents();
         setSize(805, 630);
        setResizable(false);
        setLocationRelativeTo(null);
        
        N.setOpaque(false);
        N.setContentAreaFilled(false);
        N.setBorderPainted(false); 
        P.setOpaque(false);
        P.setContentAreaFilled(false);
        P.setBorderPainted(false);
        H.setOpaque(false);
        H.setContentAreaFilled(false);
        H.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        H = new javax.swing.JButton();
        N = new javax.swing.JButton();
        P = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lesson 17");
        getContentPane().setLayout(null);

        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });
        getContentPane().add(H);
        H.setBounds(670, 60, 76, 60);

        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });
        getContentPane().add(N);
        N.setBounds(630, 500, 120, 50);

        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });
        getContentPane().add(P);
        P.setBounds(60, 500, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lesson (17).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        // TODO add your handling code here:
        InterHome interHome = new InterHome();
	dispose();
        interHome.setVisible(true);
    }//GEN-LAST:event_HActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        // TODO add your handling code here:
        
        
           try {
                    
                     Connection con2 = DigitalStepsMain.connectDB();
                    String sql = "INSERT INTO player_Take_lesson (lesson_id,Player_ID) VALUES (?,?)";
                    PreparedStatement statement = (PreparedStatement) con2.prepareStatement(sql);
                    statement.setString(1,"1117");
                    statement.setInt(2, player_id);//it will be get Player_id 
                    statement.execute();
                    
                    }catch (SQLException e){
          System.out.println(e.toString());
                    }
        
        Less18 lessFrame = new Less18();
        dispose();
        lessFrame.setVisible(true);
    }//GEN-LAST:event_NActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        // TODO add your handling code here:
        Less16 lessFrame = new Less16();
        dispose();
        lessFrame.setVisible(true);
    }//GEN-LAST:event_PActionPerformed

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
            java.util.logging.Logger.getLogger(Less17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Less17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Less17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Less17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Less17().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton H;
    private javax.swing.JButton N;
    private javax.swing.JButton P;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
