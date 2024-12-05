/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deepthiramesh
 */
public class CreateAluminiJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAluminiJPanel
     */
    private JPanel userProcessContainer;
    
    public CreateAluminiJPanel(JPanel upc) {
        initComponents();
        this.userProcessContainer = upc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStudID = new javax.swing.JTextField();
        txtStudName = new javax.swing.JTextField();
        txtContactnum = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        genderCB = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setText("Click here to Continue to enter Address");
        btnCreate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Northeastern");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        progressBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        progressBar.setBorderPainted(false);
        progressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, 20));

        jInternalFrame2.setVisible(true);
        jInternalFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NU ID");
        jInternalFrame2.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 80, -1));

        jLabel3.setText("Student Name");
        jInternalFrame2.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel4.setText("Contact Number");
        jInternalFrame2.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel5.setText("Confirm Code");
        jInternalFrame2.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel6.setText("Gender");
        jInternalFrame2.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel7.setText("Date of Birth");
        jInternalFrame2.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        txtStudID.setText("Enter 9 Digit NUID");
        txtStudID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtStudIDMouseClicked(evt);
            }
        });
        txtStudID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudIDActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(txtStudID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, -1));

        txtStudName.setText("Enter Student Full Name");
        txtStudName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtStudNameMouseClicked(evt);
            }
        });
        jInternalFrame2.getContentPane().add(txtStudName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 170, -1));

        txtContactnum.setText("Enter US Mobile Number");
        txtContactnum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContactnumMouseClicked(evt);
            }
        });
        jInternalFrame2.getContentPane().add(txtContactnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 170, -1));

        txtEmail.setText("Enter your Personal Email");
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });
        jInternalFrame2.getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, -1));

        txtDob.setText("YYYY-MM-DD");
        jInternalFrame2.getContentPane().add(txtDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 110, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Student Contact Information Pane");
        jInternalFrame2.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        genderCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderCB.setSelectedIndex(-1);
        genderCB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jInternalFrame2.getContentPane().add(genderCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 110, -1));

        jLabel12.setText("Primary Email");
        jInternalFrame2.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 80, -1));

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 170, -1));

        jScrollPane2.setViewportView(jInternalFrame2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 380, 400));

        jLabel9.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        jLabel9.setText(" Alumni Relations");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel10.setText("Application Progress Bar");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtStudIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudIDActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        String sname= txtStudName.getText();
        String sid= txtStudID.getText();
        String contact = txtContactnum.getText();
        String email = txtEmail.getText();
        String gender = (String) genderCB.getSelectedItem();
        String dob = txtDob.getText();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Admin_Database?zeroDateTimeBehavior=CONVERT_TO_NULL","root","password");
        
            
            
            String sql = "INSERT INTO Student(sid,sname,contact,semail,sgender,sdob,snationality)" +
                     "VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setString(1, sid);        
        pstmt.setString(2, sname);
        pstmt.setString(3, contact);
        pstmt.setString(4, email);
        pstmt.setString(5, gender);
        pstmt.setString(6, dob);       
        
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new student was inserted successfully!");
        }
        }
        catch(Exception e){
        System.out.println(e.getMessage());         
        progressBar.setValue(10);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtStudIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStudIDMouseClicked
        // TODO add your handling code here:
        txtStudID.setText("");
    }//GEN-LAST:event_txtStudIDMouseClicked

    private void txtStudNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStudNameMouseClicked
        // TODO add your handling code here:
        txtStudName.setText("");
    }//GEN-LAST:event_txtStudNameMouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void txtContactnumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContactnumMouseClicked
        // TODO add your handling code here:
        txtContactnum.setText("");
    }//GEN-LAST:event_txtContactnumMouseClicked

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        // TODO add your handling code here:
        txtEmail.setText("");
    }//GEN-LAST:event_txtEmailMouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> genderCB;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextField txtContactnum;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtStudID;
    private javax.swing.JTextField txtStudName;
    // End of variables declaration//GEN-END:variables
}
