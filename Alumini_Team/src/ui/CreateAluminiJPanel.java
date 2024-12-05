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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNationality = new javax.swing.JTextField();
        txtStudID = new javax.swing.JTextField();
        txtStudName = new javax.swing.JTextField();
        txtContactnum = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Student ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setText("Nationality");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel3.setText("Student Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setText("Contact Number");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setText("Primary Email");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setText("Gender");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel7.setText("Date of Birth");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        add(txtNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 110, -1));

        txtStudID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudIDActionPerformed(evt);
            }
        });
        add(txtStudID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 110, -1));
        add(txtStudName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 110, -1));
        add(txtContactnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 110, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 110, -1));

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 110, -1));
        add(txtDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 110, -1));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Create Student Table");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtStudIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudIDActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        String sname= txtStudName.getText();
        String sid= txtStudID.getText();
        String contact = txtContactnum.getText();
        String email = txtEmail.getText();
        String gender = txtGender.getText();
        String dob = txtDob.getText();
        String nation= txtNationality.getText();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Admin_Database?zeroDateTimeBehavior=CONVERT_TO_NULL","root","password");
        
            
            
            String sql = "INSERT INTO Student(sid,sname,contact,semail,sgender,sdob,snationality)" +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setString(1, sid);        
        pstmt.setString(2, sname);
        pstmt.setString(3, contact);
        pstmt.setString(4, email);
        pstmt.setString(5, gender);
        pstmt.setString(6, dob);       
        pstmt.setString(7, nation);
        
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new student was inserted successfully!");
        }
        }
        catch(Exception e){
        System.out.println(e.getMessage());            
        }
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtContactnum;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtStudID;
    private javax.swing.JTextField txtStudName;
    // End of variables declaration//GEN-END:variables
}