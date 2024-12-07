/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.table.EducationJPanel;
import ui.table.StudAddressJPanel;
import ui.table.StudTableJPanel;
import ui.table.WorkTableJPanel;

/**
 *
 * @author KAILASH
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    JPanel userProcessContainer;
    public ViewJPanel(JPanel upc) {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnStudent = new javax.swing.JButton();
        btnAddress = new javax.swing.JButton();
        btnEdu = new javax.swing.JButton();
        btnWorkExperienceTable = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnStudent.setText("Student Table");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnAddress.setText("Student Address Table");
        btnAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressActionPerformed(evt);
            }
        });

        btnEdu.setText("Education Table");
        btnEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEduActionPerformed(evt);
            }
        });

        btnWorkExperienceTable.setText("Work Experience Table");
        btnWorkExperienceTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkExperienceTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnStudent)
                .addGap(76, 76, 76)
                .addComponent(btnAddress)
                .addGap(102, 102, 102)
                .addComponent(btnEdu)
                .addGap(101, 101, 101)
                .addComponent(btnWorkExperienceTable)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStudent)
                    .addComponent(btnAddress)
                    .addComponent(btnEdu)
                    .addComponent(btnWorkExperienceTable))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:
        StudTableJPanel awajp = new StudTableJPanel(container);
        container.add("StudTableJPanel",awajp);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressActionPerformed
        // TODO add your handling code here:
        StudAddressJPanel awajp = new StudAddressJPanel(container);
        container.add("StudAddressJPanel",awajp);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnAddressActionPerformed

    private void btnEduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEduActionPerformed
        // TODO add your handling code here:
        EducationJPanel awajp = new EducationJPanel(container);
        container.add("EducationJPanel",awajp);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnEduActionPerformed

    private void btnWorkExperienceTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkExperienceTableActionPerformed
        // TODO add your handling code here:
        WorkTableJPanel awajp = new WorkTableJPanel(container);
        container.add("WorkTableJPanel",awajp);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnWorkExperienceTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddress;
    private javax.swing.JButton btnEdu;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnWorkExperienceTable;
    private javax.swing.JPanel container;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}