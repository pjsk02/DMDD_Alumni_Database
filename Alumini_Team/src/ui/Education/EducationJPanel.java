/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Education;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JPanel;
import ui.WorkExperience.WorkExperienceJPanel;

/**
 *
 * @author Giridhar
 */
public class EducationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EducationJPanel
     */
    private JPanel userProcessContainer;
    private String x;
    public EducationJPanel(JPanel usp, String sid) {
        initComponents();
        this.x = sid;
        this.userProcessContainer = usp;
        lblStudID.setText(x);
        progressBar.setValue(75);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        txtPassingYear = new javax.swing.JTextField();
        txtEducationID = new javax.swing.JTextField();
        txtInstitution = new javax.swing.JTextField();
        txtDegree = new javax.swing.JTextField();
        txtGPA = new javax.swing.JTextField();
        txtStartYear = new javax.swing.JTextField();
        lblInstitution = new javax.swing.JLabel();
        lblEducationId = new javax.swing.JLabel();
        lblDegree = new javax.swing.JLabel();
        lblSpecification = new javax.swing.JLabel();
        lblStartYear = new javax.swing.JLabel();
        lblPassingYear = new javax.swing.JLabel();
        lblGPA = new javax.swing.JLabel();
        txtSpecification = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        lblStudID = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPassingYear.setText("YYYY");
        txtPassingYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassingYearMouseClicked(evt);
            }
        });
        txtPassingYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassingYearActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(txtPassingYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 160, -1));
        jInternalFrame1.getContentPane().add(txtEducationID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 160, -1));

        txtInstitution.setText("Enter Institution Name");
        txtInstitution.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtInstitutionMouseClicked(evt);
            }
        });
        txtInstitution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstitutionActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(txtInstitution, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 160, -1));

        txtDegree.setText("Enter Your Degree");
        txtDegree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDegreeMouseClicked(evt);
            }
        });
        jInternalFrame1.getContentPane().add(txtDegree, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 160, -1));

        txtGPA.setText("Enter GPA in 4 point scale");
        txtGPA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGPAMouseClicked(evt);
            }
        });
        jInternalFrame1.getContentPane().add(txtGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 160, -1));

        txtStartYear.setText("YYYY");
        txtStartYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtStartYearMouseClicked(evt);
            }
        });
        jInternalFrame1.getContentPane().add(txtStartYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 160, -1));

        lblInstitution.setText("Institution :");
        jInternalFrame1.getContentPane().add(lblInstitution, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lblEducationId.setText("Education ID :");
        jInternalFrame1.getContentPane().add(lblEducationId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        lblDegree.setText("Degree :");
        jInternalFrame1.getContentPane().add(lblDegree, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        lblSpecification.setText("Specification :");
        jInternalFrame1.getContentPane().add(lblSpecification, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        lblStartYear.setText("Starting Year :");
        jInternalFrame1.getContentPane().add(lblStartYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        lblPassingYear.setText("Passing Year :");
        jInternalFrame1.getContentPane().add(lblPassingYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        lblGPA.setText("GPA :");
        jInternalFrame1.getContentPane().add(lblGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txtSpecification.setText("Enter Specification");
        txtSpecification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSpecificationMouseClicked(evt);
            }
        });
        txtSpecification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecificationActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(txtSpecification, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 160, -1));

        title.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        title.setText("Student:");
        jInternalFrame1.getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 70, -1));

        lblStudID.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jInternalFrame1.getContentPane().add(lblStudID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 90, 10));

        title1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        title1.setText("Education Details");
        jInternalFrame1.getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel10.setText("Application Progress Bar");

        progressBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        progressBar.setBorderPainted(false);
        progressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassingYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassingYearMouseClicked
        // TODO add your handling code here:
        txtPassingYear.setText("");
    }//GEN-LAST:event_txtPassingYearMouseClicked

    private void txtInstitutionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInstitutionMouseClicked
        // TODO add your handling code here:
        txtInstitution.setText("");
    }//GEN-LAST:event_txtInstitutionMouseClicked

    private void txtDegreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDegreeMouseClicked
        // TODO add your handling code here:
        txtDegree.setText("");
    }//GEN-LAST:event_txtDegreeMouseClicked

    private void txtGPAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGPAMouseClicked
        // TODO add your handling code here:
        txtGPA.setText("");
    }//GEN-LAST:event_txtGPAMouseClicked

    private void txtStartYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStartYearMouseClicked
        // TODO add your handling code here:
        txtStartYear.setText("");
    }//GEN-LAST:event_txtStartYearMouseClicked

    private void txtSpecificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSpecificationMouseClicked
        // TODO add your handling code here:
        txtSpecification.setText("");
    }//GEN-LAST:event_txtSpecificationMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String iname= txtInstitution.getText();
        String eduid= txtEducationID.getText();
        String degree = txtDegree.getText();
        String strt_year = txtStartYear.getText();
        String pass_year = txtPassingYear.getText();
        String specification = txtSpecification.getText();
        String gpa = txtGPA.getText();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Admin_Database?zeroDateTimeBehavior=CONVERT_TO_NULL","root","password");

            String sql = "INSERT INTO Education( StudentID, Institution, Degree, Specialization, StartingYear, PassingYear, GPA)" +
            "VALUES ( ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

//            pstmt.setString(1, eduid);
            pstmt.setString(1, x);
            pstmt.setString(2, iname);
            pstmt.setString(3, degree);
            pstmt.setString(4, specification);
            pstmt.setString(5, strt_year);
            pstmt.setString(6, pass_year);
            pstmt.setString(7, gpa);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Education Details are inserted successfully for the student");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        WorkExperienceJPanel awajp = new WorkExperienceJPanel(userProcessContainer,x);
        userProcessContainer.add("WorkExperienceJPanel",awajp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtInstitutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstitutionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstitutionActionPerformed

    private void txtSpecificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecificationActionPerformed

    private void txtPassingYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassingYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassingYearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel lblDegree;
    private javax.swing.JLabel lblEducationId;
    private javax.swing.JLabel lblGPA;
    private javax.swing.JLabel lblInstitution;
    private javax.swing.JLabel lblPassingYear;
    private javax.swing.JLabel lblSpecification;
    private javax.swing.JLabel lblStartYear;
    private javax.swing.JLabel lblStudID;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField txtDegree;
    private javax.swing.JTextField txtEducationID;
    private javax.swing.JTextField txtGPA;
    private javax.swing.JTextField txtInstitution;
    private javax.swing.JTextField txtPassingYear;
    private javax.swing.JTextField txtSpecification;
    private javax.swing.JTextField txtStartYear;
    // End of variables declaration//GEN-END:variables
}
