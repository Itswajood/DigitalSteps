
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Q1_10 extends javax.swing.JFrame {
   public static String id = String.valueOf(DigitalStepsMain.myPlayers.firstPlayer().getPlayer_ID());
    /**
     * Creates new form Q1_10
     */
    static boolean flag = false;
    public Q1_10() {
        initComponents();
        setSize(805, 630);
        setResizable(false);
        
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        
        jButton5.setOpaque(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Question 10");
        getContentPane().setLayout(null);

        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 250, 550, 70);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 330, 550, 70);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(100, 410, 550, 70);

        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(100, 490, 550, 70);

        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(670, 540, 110, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Q (10).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        flag=true;
        javaapplication56.incrementPoints();
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        JLabel messageLabel = new JLabel("correct answer", new ImageIcon("correct_40.png"), JLabel.CENTER);
        panel.add(messageLabel);
        JOptionPane.showOptionDialog(null, panel, "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        JLabel messageLabel = new JLabel("wrong answer", new ImageIcon("wrong_400.png"), JLabel.CENTER);
        panel.add(messageLabel);
        JOptionPane.showOptionDialog(null, panel, "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        JLabel messageLabel = new JLabel("wrong answer", new ImageIcon("wrong_400.png"), JLabel.CENTER);
        panel.add(messageLabel);
        JOptionPane.showOptionDialog(null, panel, "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        JLabel messageLabel = new JLabel("wrong answer", new ImageIcon("wrong_400.png"), JLabel.CENTER);
        panel.add(messageLabel);
        JOptionPane.showOptionDialog(null, panel, "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        
        if (flag){
                     try {
                    
                    //Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con1 =  DigitalStepsMain.connectDB();
                    String sql = "INSERT INTO player_anwser_qustion (question_id,Player_ID,Player_score) VALUES (?,?,?)";
                    PreparedStatement statement = (PreparedStatement) con1.prepareStatement(sql);
                    statement.setString(1,"110");
                    statement.setString(2, id);//it will be get Player_id 
                    statement.setString(3,"1");//1 since thy got the anwer corectly
                    statement.execute();
                    
                    }catch (SQLException e){
      
                    }
        
                
                }
                else {
                         try {
                    
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con1 =  DigitalStepsMain.connectDB();
                    String sql = "INSERT INTO player_anwser_qustion (question_id,Player_ID,Player_score) VALUES (?,?,?)";
                    PreparedStatement statement = (PreparedStatement) con1.prepareStatement(sql);
                    statement.setString(1,"110");
                    statement.setString(2, id);//it will be get Player_id 
                    statement.setString(3,"0");//0 since thy got the anwer Wrong
                    statement.execute();
                    
                    }catch (SQLException e){
      
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(Less1.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                
                }
        
        
        
        
        
        if (javaapplication56.getPoints1() >= 10) {
            JOptionPane.showMessageDialog(null,"Congratulations , you have leveled up !","Result",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("star.png"));
            updateLevel(DigitalStepsMain.myPlayers.firstPlayer().getPlayer_ID());
            InterHome InterHomeFrame = new InterHome();
            dispose();
            
            InterHomeFrame.setVisible(true);
                
         
            } else {
                
                JOptionPane.showMessageDialog(null,"You have earned "+javaapplication56.getPoints1()+" points ^_^","Result",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("star.png"));
                choose_the_type_ofquize choose_the_type_ofquizeFrame = new choose_the_type_ofquize();
                dispose();
            
                choose_the_type_ofquizeFrame.setVisible(true);
                
                //Q1_10 goo = new Q1_10();
                addWindowListener(new WindowAdapter() {
              
                @Override
               public void windowClosed(WindowEvent e) {
               // Code to navigate to another frame (e.g., create and display a new frame)
               choose_the_type_ofquize goo = new choose_the_type_ofquize();
               goo.setLocationRelativeTo(null);
               goo.setVisible(true);
        }
    });

        }         
 if (javaapplication56.getPoints1() >= 10) {
        String message = "Congratulations!\n\n(Note that if you choose Cancel, you will sign out and go to WWC)";

        ImageIcon icon = new ImageIcon(getClass().getResource("path/to/star.png"));

        int choice = JOptionPane.showOptionDialog(null, message, "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, new Object[]{"OK", "Cancel"}, null);
        if (choice == JOptionPane.OK_OPTION) {
            dispose();
            WWC_frame frame = new WWC_frame();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
           
        } else if (choice == JOptionPane.CLOSED_OPTION) { // Check for CLOSED_OPTION
            choose_the_type_ofquize frame = new choose_the_type_ofquize();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            dispose();
        }
    }
                
            
    }//GEN-LAST:event_jButton5ActionPerformed

   
            
        
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Q1_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q1_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q1_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q1_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new Q1_10().setVisible(true);
                }catch(Exception e){
                    System.out.println("Here"+e.getMessage());
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
    public void updateLevel(int id){
        
        Connection dbcon = DigitalStepsMain.connectDB();
        
        if(dbcon != null){
            try{
                String sql = "UPDATE Player SET Plyer_Level = 'Intermediate' WHERE Player_ID = ?";
                PreparedStatement st = (PreparedStatement) dbcon.prepareStatement(sql);
                st.setInt(1, id);
                st.executeUpdate();
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
