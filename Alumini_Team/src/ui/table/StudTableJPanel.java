/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KAILASH
 */
public class StudTableJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudTableJPanel
     */
    JPanel container;
    public StudTableJPanel(JPanel c) {
        initComponents();
        this.container = c;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStud = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Contact", "Email", "Gender", "DOB"
            }
        ));
        jScrollPane1.setViewportView(tblStud);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 790, 254));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select a student from the list and Press the Button to delete Student Record");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 50));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 110, 50));

        jButton1.setText("Populate Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Admin_Database?zeroDateTimeBehavior=CONVERT_TO_NULL","root","password");
        
        Statement st = conn.createStatement();
            String sql = "select * from student;";
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                // Retrieve data from each column
                String sid = String.valueOf(rs.getInt("sid"));
                String sname = rs.getString("sname");
                String contact = rs.getString("contact");
                String semail = rs.getString("semail");
                String sgender = rs.getString("sgender");
                String sdob = rs.getDate("sdob").toString();

                // Create a row of data
                String tbData[] = {sid, sname, contact, semail, sgender, sdob};

                // Get the table model and add the row
                DefaultTableModel tblModel = (DefaultTableModel) tblStud.getModel();
                tblModel.addRow(tbData);
            }
           conn.close();
        }
        catch(Exception e){
        System.out.println(e.getMessage());       
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
        // Get the selected row index from the JTable
        int selectedRow = tblStud.getSelectedRow();

        // If no row is selected, show a message
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a record to delete.");
            return;
        }

        // Retrieve the StudentID (or unique identifier) from the selected row
        String studentID = (String) tblStud.getValueAt(selectedRow, 0); // Assuming StudentID is in the first column

        // Confirm the deletion action with the user
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Admin_Database?zeroDateTimeBehavior=CONVERT_TO_NULL", 
                "root", 
                "password"
            );

            // SQL query to delete the record from the WorkExperience table
            String sql = "DELETE FROM Student WHERE sid = ?"; // Assuming StudentID is the primary key

            // Prepare the statement
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, studentID); // Set the StudentID to delete

            // Execute the update (delete)
            int rowsAffected = pstmt.executeUpdate();

            // Check if the deletion was successful
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Record deleted successfully.");

                // Remove the selected row from the JTable
                DefaultTableModel model = (DefaultTableModel) tblStud.getModel();
                model.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete the record.");
            }

            // Close the connection
            conn.close();
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStud;
    // End of variables declaration//GEN-END:variables
}
