//package norahframe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Less1 extends javax.swing.JFrame {
       public static int player_id = DigitalStepsMain.myPlayers.firstPlayer().getPlayer_ID();
    public Less1() {
        initComponents();
        setSize(805, 630);
        setResizable(false);
        setLocationRelativeTo(null);
        
         N.setOpaque(false);
        N.setContentAreaFilled(false);
        N.setBorderPainted(false); 
        
         H.setOpaque(false);
        H.setContentAreaFilled(false);
        H.setBorderPainted(false);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        N = new javax.swing.JButton();
        H = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lesson 1");
        getContentPane().setLayout(null);

        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });
        getContentPane().add(N);
        N.setBounds(610, 510, 140, 50);

        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });
        getContentPane().add(H);
        H.setBounds(60, 510, 70, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lesson (1).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        // TODO add your handling code here:
         try {
                    
                   Connection con2 = DigitalStepsMain.connectDB();
                   // Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3305/digitalstep1", "root", "Norah866378$");
                    String sql = "INSERT INTO player_Take_lesson (lesson_id,Player_ID) VALUES (?,?)";
                    PreparedStatement statement = (PreparedStatement) con2.prepareStatement(sql);
                    statement.setString(1,"1101");
                    statement.setInt(2,player_id);//it will be get Player_id 
                    statement.execute();
                    
                    }catch (SQLException e){
                   System.out.println(e.toString());

                    }

        Less2 less2Frame = new Less2();
        dispose();
        less2Frame.setVisible(true);

    }//GEN-LAST:event_NActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        // TODO add your handling code here:
        BegginerHome begginerHome = new BegginerHome();
        dispose();
       begginerHome.setVisible(true);
    }//GEN-LAST:event_HActionPerformed

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
            java.util.logging.Logger.getLogger(Less1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Less1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Less1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Less1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Less1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton H;
    private javax.swing.JButton N;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
