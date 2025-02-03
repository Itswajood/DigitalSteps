
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.image.ImageProducer;
import javax.swing.JButton;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Adminquizsystemfrasme extends javax.swing.JFrame {

    private int playerCount = 0;
    public int totalQuizzes = 0;
    private Connection connection;
    public static long admin_id = DigitalStepsMain.myAdmins.firstAdmin().getAdmin_ID();
    public Adminquizsystemfrasme() {

        initComponents();
//        initComponents();
        setSize(805, 630);
        setResizable(false);

        setResizable(false);
        //must imp button 

        //button lesson 
        AmineCreater.setOpaque(false);
        AmineCreater.setContentAreaFilled(false);
        AmineCreater.setBorderPainted(false);

        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);

        adminAddQuiz_B.setOpaque(false);
        adminAddQuiz_B.setContentAreaFilled(false);
        adminAddQuiz_B.setBorderPainted(false);

        player_mange_B.setOpaque(false);
        player_mange_B.setContentAreaFilled(false);
        player_mange_B.setBorderPainted(false);

        dashboard_B.setOpaque(false);
        dashboard_B.setContentAreaFilled(false);
        dashboard_B.setBorderPainted(false);

        Modifie_quizAdmin.setOpaque(false);
        Modifie_quizAdmin.setContentAreaFilled(false);
        Modifie_quizAdmin.setBorderPainted(false);

        display_quizAdmin.setOpaque(false);
        display_quizAdmin.setContentAreaFilled(false);
        display_quizAdmin.setBorderPainted(false);

        B_editquizAdmin.setOpaque(false);
        B_editquizAdmin.setContentAreaFilled(false);
        B_editquizAdmin.setBorderPainted(false);

        profile_button.setOpaque(false);
        profile_button.setContentAreaFilled(false);
        profile_button.setBorderPainted(false);

        // toatl player and quizez
        totalOfPlayer_admineQuizSystem = new JLabel(String.valueOf(playerCount));
        totalOfPlayer_admineQuizSystem.setFont(new Font("Arial", Font.BOLD, 24));
        totalOfPlayer_admineQuizSystem.setForeground(Color.BLUE); // Set text color to blue

        totalQuizzesLabel = new JLabel(String.valueOf(totalQuizzes));
        totalQuizzesLabel.setFont(new Font("Arial", Font.BOLD, 24));
        totalQuizzesLabel.setForeground(Color.BLUE); // Set text color to blue

    }

    public void close() {

        WindowEvent winEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winEvent);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player_mange_B = new javax.swing.JButton();
        dashboard_B = new javax.swing.JButton();
        totalOfPlayer_admineQuizSystem = new javax.swing.JLabel();
        adminAddQuiz_B = new javax.swing.JButton();
        totalQuizzesLabel = new javax.swing.JLabel();
        B_editquizAdmin = new javax.swing.JButton();
        Modifie_quizAdmin = new javax.swing.JButton();
        display_quizAdmin = new javax.swing.JButton();
        profile_button = new javax.swing.JButton();
        AmineCreater = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adminquizsystemfrasme");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setPreferredSize(new java.awt.Dimension(820, 655));
        getContentPane().setLayout(null);

        player_mange_B.setText(" ");
        player_mange_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player_mange_BActionPerformed(evt);
            }
        });
        getContentPane().add(player_mange_B);
        player_mange_B.setBounds(10, 210, 210, 80);

        dashboard_B.setText(" ");
        dashboard_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboard_BActionPerformed(evt);
            }
        });
        getContentPane().add(dashboard_B);
        dashboard_B.setBounds(10, 120, 210, 80);
        getContentPane().add(totalOfPlayer_admineQuizSystem);
        totalOfPlayer_admineQuizSystem.setBounds(310, 150, 140, 60);

        adminAddQuiz_B.setText(" ");
        adminAddQuiz_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddQuiz_BActionPerformed(evt);
            }
        });
        getContentPane().add(adminAddQuiz_B);
        adminAddQuiz_B.setBounds(270, 190, 220, 80);
        getContentPane().add(totalQuizzesLabel);
        totalQuizzesLabel.setBounds(590, 160, 130, 50);

        B_editquizAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_editquizAdminActionPerformed(evt);
            }
        });
        getContentPane().add(B_editquizAdmin);
        B_editquizAdmin.setBounds(540, 190, 230, 90);

        Modifie_quizAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modifie_quizAdminActionPerformed(evt);
            }
        });
        getContentPane().add(Modifie_quizAdmin);
        Modifie_quizAdmin.setBounds(260, 330, 230, 90);

        display_quizAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_quizAdminActionPerformed(evt);
            }
        });
        getContentPane().add(display_quizAdmin);
        display_quizAdmin.setBounds(530, 330, 230, 100);

        profile_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(profile_button);
        profile_button.setBounds(10, 0, 90, 80);

        AmineCreater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminB_DB.png"))); // NOI18N
        AmineCreater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmineCreaterActionPerformed(evt);
            }
        });
        getContentPane().add(AmineCreater);
        AmineCreater.setBounds(60, 500, 90, 80);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 400, 220, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminQuize.png"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // add quiz button 
    private void adminAddQuiz_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddQuiz_BActionPerformed
        // Close the current frame
        dispose();
        AddNewQuiz addQuizeFrame = new AddNewQuiz();
        addQuizeFrame.setLocationRelativeTo(null);
        addQuizeFrame.setVisible(true);
    }//GEN-LAST:event_adminAddQuiz_BActionPerformed

    private void B_editquizAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_editquizAdminActionPerformed
        // pop-up window
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load and draw the background image
                ImageIcon icon = new ImageIcon("background.png");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(new BorderLayout());
        JTextField quizIDField = new JTextField(10);
        JButton deleteButton = new JButton("Delete Quiz");

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the quiz ID from the text field
                int quizID = Integer.parseInt(quizIDField.getText());

                // Check if the quiz exists in the database
                if (isQuizExist(quizID)) {
                    if (deleteFromUpdateQuiz(quizID)) {
                        // Delete the quiz from the database
                        if (deleteQuizFromDatabase(quizID)) {
                            // Display a confirmation message
                            JOptionPane.showMessageDialog(null, "Quiz with ID " + quizID + " has been deleted.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to delete quiz with ID " + quizID, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        System.out.println("did not delete in update table");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Quiz with ID " + quizID + " does not exist", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(quizIDField, BorderLayout.CENTER);
        panel.add(deleteButton, BorderLayout.SOUTH);

        // Create and display the pop-up window
        JOptionPane.showMessageDialog(null, panel, "Delete Quiz", JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_B_editquizAdminActionPerformed
    private boolean deleteQuizFromDatabase(int quizID) {

        try {
            Connection con = DigitalStepsMain.connectDB();
            PreparedStatement statement = con.prepareStatement("DELETE FROM Quiz WHERE Quiz_ID = ?");
            statement.setInt(1, quizID);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        }// Return true if rows were affected (quiz was deleted) 
        catch (SQLException ex) {
            ex.printStackTrace();
            return false; // Error occurred, consider the deletion failed
        }
    }

    private boolean isQuizExist(int quizID) {

        try (Connection connection = DigitalStepsMain.connectDB(); PreparedStatement statement = connection.prepareStatement("SELECT * FROM Quiz WHERE Quiz_ID = ?")) {
            statement.setInt(1, quizID);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next(); // If a row is returned, the quiz exists in the database
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // Error occurred, consider the quiz doesn't exist
        }
    }
    private void profile_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_buttonActionPerformed

        dispose();
        AdminProfile addQuizeFrame = new AdminProfile();
        addQuizeFrame.setLocationRelativeTo(null);
        addQuizeFrame.setVisible(true);

    }//GEN-LAST:event_profile_buttonActionPerformed

    private void dashboard_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_BActionPerformed
        dispose();
        AdminHomeDashBoaedQuize addQuizeFrame = new AdminHomeDashBoaedQuize();
        addQuizeFrame.setLocationRelativeTo(null);
        addQuizeFrame.setVisible(true);

    }//GEN-LAST:event_dashboard_BActionPerformed

    private void player_mange_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player_mange_BActionPerformed
        dispose();
        Admin_mangeplayerr addQuizeFrame = new Admin_mangeplayerr();
        addQuizeFrame.setLocationRelativeTo(null);
        addQuizeFrame.setVisible(true);
    }//GEN-LAST:event_player_mange_BActionPerformed

    private void Modifie_quizAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modifie_quizAdminActionPerformed
        try {
            // Prompt the user to enter the quiz ID
            String inputQuizId = JOptionPane.showInputDialog(this, "Enter Quiz ID:");
            if (inputQuizId != null && !inputQuizId.isEmpty()) {
                int quizId = Integer.parseInt(inputQuizId);

                // Prompt the user to enter the question text
                String questionText = JOptionPane.showInputDialog(this, "Enter Question Text:");

                // Prompt the user to enter the choices
                String choiceA = JOptionPane.showInputDialog(this, "Enter Choice A:");
                String choiceB = JOptionPane.showInputDialog(this, "Enter Choice B:");
                String choiceC = JOptionPane.showInputDialog(this, "Enter Choice C:");
                String choiceD = JOptionPane.showInputDialog(this, "Enter Choice D:");

                // Prompt the user to enter the correct answer
                String correctAnswer = JOptionPane.showInputDialog(this, "Enter Correct Answer:");

                // Establish a database connection
                Connection connection = DigitalStepsMain.connectDB();

                // Update the quiz in the database
                String query = "UPDATE Quiz SET Qustion = ?, Choice_A = ?, Choice_B = ?, Choice_C = ?, Choice_D = ?, correct_anwser = ? WHERE Quiz_ID = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, questionText);
                statement.setString(2, choiceA);
                statement.setString(3, choiceB);
                statement.setString(4, choiceC);
                statement.setString(5, choiceD);
                statement.setString(6, correctAnswer);
                statement.setInt(7, quizId);
                int rowsAffected = statement.executeUpdate();

                // Check if the update was successful
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Quiz updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Quiz update failed. Please check the entered Quiz ID.");
                }

                // Close the statement and connection
                statement.close();
                connection.close();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Quiz ID. Please enter a valid integer ID.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_Modifie_quizAdminActionPerformed

    private void display_quizAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_quizAdminActionPerformed
        dispose();
        QuizChoiceWindow addQuizeFrame = new QuizChoiceWindow();
        addQuizeFrame.setLocationRelativeTo(null);
        addQuizeFrame.setVisible(true);
    }//GEN-LAST:event_display_quizAdminActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AmineCreaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmineCreaterActionPerformed
        // TODO add your handling code here:
          dispose();
        Admins_name  frame =new Admins_name ();
        frame.setVisible(true);
    }//GEN-LAST:event_AmineCreaterActionPerformed
    //fix then wuth database#######

    private void incrementTotalPlayers() {
        // Increment the total number of players
        playerCount++;
        playerCount = 10;

        // Update the total players label
        totalOfPlayer_admineQuizSystem.setText(String.valueOf(playerCount));
    }

    private void incrementTotalQuizzes() {
        // Increment the total number of quizzes
        totalQuizzes++;

        // Update the total quizzes label
        totalQuizzesLabel.setText(String.valueOf(totalQuizzes));
    }

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
            java.util.logging.Logger.getLogger(Adminquizsystemfrasme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminquizsystemfrasme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminquizsystemfrasme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminquizsystemfrasme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Adminquizsystemfrasme frame = new Adminquizsystemfrasme();
                frame.setLocationRelativeTo(null); // Center the frame on the screen
                frame.setVisible(true);
            }
        });
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Adminquizsystemfrasme().setVisible(true);
//            }
//        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmineCreater;
    private javax.swing.JButton B_editquizAdmin;
    private javax.swing.JButton Modifie_quizAdmin;
    private javax.swing.JButton adminAddQuiz_B;
    private javax.swing.JButton dashboard_B;
    private javax.swing.JButton display_quizAdmin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton player_mange_B;
    private javax.swing.JButton profile_button;
    private javax.swing.JLabel totalOfPlayer_admineQuizSystem;
    private javax.swing.JLabel totalQuizzesLabel;
    // End of variables declaration//GEN-END:variables

    public static boolean deleteFromUpdateQuiz(int quiz_id) {
        Connection dbcon = DigitalStepsMain.connectDB();
        
        if(dbcon!= null){
            try{
                String sql = "delete from administrative_update_quize where Quiz_ID = ?";
                PreparedStatement st = (PreparedStatement) dbcon.prepareStatement(sql);
                st.setInt(1, quiz_id);
                //st.setLong(2,admin_id);
                int result = st.executeUpdate();
                
                return(result > 0);
            }catch (Exception e){
                e.printStackTrace();
            }
        } 
        return false;
    }
    
    
}
