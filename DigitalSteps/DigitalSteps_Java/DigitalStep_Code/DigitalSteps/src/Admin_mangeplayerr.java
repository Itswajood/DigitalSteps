

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author Ms_Al
 */
public class Admin_mangeplayerr extends javax.swing.JFrame {

    private static JFrame mainFrame;
    private static JFrame feedbackFrame;

    /**
     * Creates new form Admin_mangeplayerr
     */
    public Admin_mangeplayerr() {
        initComponents();

        AmineCreater.setOpaque(false);
        AmineCreater.setContentAreaFilled(false);
        AmineCreater.setBorderPainted(false);

        A_profile.setOpaque(false);
        A_profile.setContentAreaFilled(false);
        A_profile.setBorderPainted(false);
        //button fixed 
        DB_inplayerAdmin.setOpaque(false);
        DB_inplayerAdmin.setContentAreaFilled(false);
        DB_inplayerAdmin.setBorderPainted(false);

        QS_admin.setOpaque(false);
        QS_admin.setContentAreaFilled(false);
        QS_admin.setBorderPainted(false);

        WWC_admin.setOpaque(false);
        WWC_admin.setContentAreaFilled(false);
        WWC_admin.setBorderPainted(false);
        players_feedback_admin.setOpaque(false);
        players_feedback_admin.setContentAreaFilled(false);
        players_feedback_admin.setBorderPainted(false);

        Display_player.setOpaque(false);
        Display_player.setContentAreaFilled(false);
        Display_player.setBorderPainted(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DB_inplayerAdmin = new javax.swing.JButton();
        QS_admin = new javax.swing.JButton();
        WWC_admin = new javax.swing.JButton();
        A_profile = new javax.swing.JButton();
        AmineCreater = new javax.swing.JButton();
        players_feedback_admin = new javax.swing.JButton();
        Display_player = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Admin_mangeplayerr ");
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        DB_inplayerAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DB_inplayerAdminActionPerformed(evt);
            }
        });
        getContentPane().add(DB_inplayerAdmin);
        DB_inplayerAdmin.setBounds(10, 120, 210, 80);

        QS_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QS_adminActionPerformed(evt);
            }
        });
        getContentPane().add(QS_admin);
        QS_admin.setBounds(10, 310, 210, 80);

        WWC_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WWC_adminActionPerformed(evt);
            }
        });
        getContentPane().add(WWC_admin);
        WWC_admin.setBounds(10, 400, 210, 90);

        A_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_profileActionPerformed(evt);
            }
        });
        getContentPane().add(A_profile);
        A_profile.setBounds(10, 5, 70, 80);

        AmineCreater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminB_DB.png"))); // NOI18N
        AmineCreater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmineCreaterActionPerformed(evt);
            }
        });
        getContentPane().add(AmineCreater);
        AmineCreater.setBounds(60, 500, 90, 80);

        players_feedback_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                players_feedback_adminActionPerformed(evt);
            }
        });
        getContentPane().add(players_feedback_admin);
        players_feedback_admin.setBounds(300, 340, 330, 70);

        Display_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Display_playerActionPerformed(evt);
            }
        });
        getContentPane().add(Display_player);
        Display_player.setBounds(300, 200, 320, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminHomeMangePlayer.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WWC_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WWC_adminActionPerformed
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
    }//GEN-LAST:event_WWC_adminActionPerformed

    private void DB_inplayerAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DB_inplayerAdminActionPerformed
        dispose();
        AdminHomeDashBoaedQuize addQuizeFrame = new AdminHomeDashBoaedQuize();
        addQuizeFrame.setLocationRelativeTo(null);
        addQuizeFrame.setVisible(true);
    }//GEN-LAST:event_DB_inplayerAdminActionPerformed

    private void QS_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QS_adminActionPerformed
        dispose();
        Adminquizsystemfrasme addQuizeFrame = new Adminquizsystemfrasme();
        addQuizeFrame.setLocationRelativeTo(null);
    addQuizeFrame.setVisible(true);    }//GEN-LAST:event_QS_adminActionPerformed

    private void A_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_profileActionPerformed
        dispose();
        AdminProfile addQuizeFrame = new AdminProfile();
        addQuizeFrame.setLocationRelativeTo(null);
        addQuizeFrame.setVisible(true);
    }//GEN-LAST:event_A_profileActionPerformed

    private void AmineCreaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmineCreaterActionPerformed
        dispose();
        Admins_name addQuizeFrame = new Admins_name();
        addQuizeFrame.setLocationRelativeTo(null);
        addQuizeFrame.setVisible(true);
    }//GEN-LAST:event_AmineCreaterActionPerformed

    private void players_feedback_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_players_feedback_adminActionPerformed
        dispose();
        JFrame feedbackFrame = new JFrame("Feedback Admin");
        feedbackFrame.setSize(805, 630);
        feedbackFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Load the background image
        try {
            Image backgroundImage = new ImageIcon("background.png").getImage();
            feedbackFrame.setContentPane(new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(backgroundImage, 0, 0, null);
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Read the contents of the feedback file
        JTextArea feedbackText = new JTextArea();
        feedbackText.setEditable(false);
        feedbackText.setForeground(new Color(0, 0, 139)); // Set the text color to blue
        feedbackText.setBackground(new Color(240, 240, 255)); // Set a light white background color
        feedbackText.setFont(feedbackText.getFont().deriveFont(20.0f)); // Set the font size to 20 pixels

        try (BufferedReader br = new BufferedReader(new FileReader("Feedback.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            feedbackText.setText(sb.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Create a scroll pane for the feedback text area
        JScrollPane scrollPane = new JScrollPane(feedbackText);

        feedbackFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        feedbackFrame.setLocationRelativeTo(null); // Center the feedback frame

        //  window listener to handle the frame closing event
        feedbackFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Code to navigate to another frame (e.g., create and display a new frame)
                Admin_mangeplayerr addQuizeFrame = new Admin_mangeplayerr();
                addQuizeFrame.setLocationRelativeTo(null);
                addQuizeFrame.setVisible(true);
            }
        });
        feedbackFrame.setLayout(new GridBagLayout());
        GridBagConstraints tryy = new GridBagConstraints();
        tryy.gridx = 0;
        tryy.gridy = 0;
        tryy.weighty = 100;
        tryy.weightx = 100;
        //Create a panel with GridLayout to hold the feedback text area
        JPanel panel = new JPanel(new GridLayout());
        panel.add(feedbackText, BorderLayout.CENTER);
        panel.setPreferredSize(new Dimension(770, 400));
        feedbackFrame.add(panel, tryy);
        feedbackFrame.setVisible(true);
        feedbackFrame.setVisible(true);

        // Center the text within the JTextArea
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                feedbackText.setCaretPosition(feedbackText.getDocument().getLength());
                feedbackText.scrollRectToVisible(new Rectangle(0, feedbackText.getHeight() / 2 - feedbackText.getVisibleRect().height / 2, 1, 1));
            }
        });
    }//GEN-LAST:event_players_feedback_adminActionPerformed

    private void Display_playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_playerActionPerformed
        dispose();
        AdminDisplyPlayer Frame = new AdminDisplyPlayer();
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);
    }//GEN-LAST:event_Display_playerActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_mangeplayerr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_mangeplayerr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_mangeplayerr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_mangeplayerr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Admin_mangeplayerr frame = new Admin_mangeplayerr();
                frame.setLocationRelativeTo(null); // Center the frame on the screen
                frame.setVisible(true);
            }
        });
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Admin_mangeplayerr().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_profile;
    private javax.swing.JButton AmineCreater;
    private javax.swing.JButton DB_inplayerAdmin;
    private javax.swing.JButton Display_player;
    private javax.swing.JButton QS_admin;
    private javax.swing.JButton WWC_admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton players_feedback_admin;
    // End of variables declaration//GEN-END:variables
}
