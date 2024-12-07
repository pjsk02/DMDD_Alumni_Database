/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Events;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author Giridhar
 */
public class EventSelectionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EventSelectionJPanel
     */
    JPanel container;
    String id;
    public EventSelectionJPanel(JPanel container, String id) {
        initComponents();
        this.container = container;
        this.id = id;
        lblID.setText(id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lblItemsInCart = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegList = new javax.swing.JTable();
        lblProductCatalogue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEventList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        btnDB = new javax.swing.JButton();

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("Events Registration");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle.setIconTextGap(20);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRegister.setText("Register Event");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblItemsInCart.setText("Registered events:");

        tblRegList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Event ID", "Event Name", "Event Date", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRegList);

        lblProductCatalogue.setText("Available Events:");

        tblEventList.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tblEventList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Event ID", "Event Name", "Event Date", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEventList);

        jLabel1.setText("Student ID :");

        lblID.setText("ID");

        btnDB.setText("Click here to get the events");
        btnDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProductCatalogue)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(lblItemsInCart)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDB)
                            .addComponent(lblTitle))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(44, 44, 44)
                .addComponent(btnDB)
                .addGap(45, 45, 45)
                .addComponent(lblProductCatalogue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(jLabel1)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addComponent(lblItemsInCart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        try {
            // Get the selected row from tblEventList
            int selectedRow = tblEventList.getSelectedRow();

            if (selectedRow == -1) {
                // No row selected, show an error message
                JOptionPane.showMessageDialog(null, "Please select an event to register.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Retrieve the EventID from the selected row
            DefaultTableModel eventListModel = (DefaultTableModel) tblEventList.getModel();
            String eventID = eventListModel.getValueAt(selectedRow, 0).toString();

            // Check if the student is already registered for this event
            DefaultTableModel regListModel = (DefaultTableModel) tblRegList.getModel();
            for (int i = 0; i < regListModel.getRowCount(); i++) {
                if (regListModel.getValueAt(i, 0).toString().equals(eventID)) {
                    JOptionPane.showMessageDialog(null, "You are already registered for this event.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            // Add the selected event to tblRegList
            String eventName = eventListModel.getValueAt(selectedRow, 1).toString();
            String eventDate = eventListModel.getValueAt(selectedRow, 2).toString();
            String Location = eventListModel.getValueAt(selectedRow, 3).toString();

            regListModel.addRow(new Object[]{eventID, eventName, eventDate, Location});

            // Insert the registration into the EventParticipants table in the database
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Admin_Database?zeroDateTimeBehavior=CONVERT_TO_NULL",
                    "root",
                    "password"
            );

            String insertSql = "INSERT INTO EventParticipants (EventID, StudentID) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSql);

            pstmt.setString(1, eventID);
            pstmt.setString(2, id); // 'id' is the logged-in student's ID

            pstmt.executeUpdate();

            // Close the connection and statement
            pstmt.close();
            conn.close();

            JOptionPane.showMessageDialog(null, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDBActionPerformed
        // TODO add your handling code here:
       try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a database connection
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Admin_Database?zeroDateTimeBehavior=CONVERT_TO_NULL",
                    "root",
                    "password"
            );

            // Query to fetch all records from the Events table
            String sqlAllEvents = "SELECT * FROM Events";

            // Prepare the SQL statement for all events
            PreparedStatement pstmtAllEvents = conn.prepareStatement(sqlAllEvents);

            // Execute the query and get the result set for all events
            ResultSet rsAllEvents = pstmtAllEvents.executeQuery();

            // Get the table model of tblEventList
            DefaultTableModel modelAllEvents = (DefaultTableModel) tblEventList.getModel();

            // Clear existing rows in the table model
            modelAllEvents.setRowCount(0);

            // Populate tblEventList with all events
            while (rsAllEvents.next()) {
                String eventID = rsAllEvents.getString("EventID");
                String eventName = rsAllEvents.getString("EventName");
                String eventDate = rsAllEvents.getString("EventDate");
                String eventLocation = rsAllEvents.getString("Location");

                modelAllEvents.addRow(new Object[]{eventID, eventName, eventDate, eventLocation});
            }

            // Close result set and prepared statement for all events
            rsAllEvents.close();
            pstmtAllEvents.close();

            // Query to fetch events registered by a specific student
            String sqlRegisteredEvents = "SELECT e.EventID, e.EventName, e.EventDate, e.Location " +
                                         "FROM Events e " +
                                         "INNER JOIN EventParticipants ep ON e.EventID = ep.EventID " +
                                         "WHERE ep.StudentID = ?";

            // Prepare the SQL statement for registered events
            PreparedStatement pstmtRegisteredEvents = conn.prepareStatement(sqlRegisteredEvents);
            pstmtRegisteredEvents.setString(1, id); // Set the student ID parameter

            // Execute the query and get the result set for registered events
            ResultSet rsRegisteredEvents = pstmtRegisteredEvents.executeQuery();

            // Get the table model of tblRegList
            DefaultTableModel modelRegList = (DefaultTableModel) tblRegList.getModel();

            // Clear existing rows in the table model
            modelRegList.setRowCount(0);

            // Populate tblRegList with registered events
            while (rsRegisteredEvents.next()) {
                String eventID = rsRegisteredEvents.getString("EventID");
                String eventName = rsRegisteredEvents.getString("EventName");
                String eventDate = rsRegisteredEvents.getString("EventDate");
                String eventLocation = rsRegisteredEvents.getString("Location");

                modelRegList.addRow(new Object[]{eventID, eventName, eventDate, eventLocation});
            }

            // Close result set, prepared statement, and connection for registered events
            rsRegisteredEvents.close();
            pstmtRegisteredEvents.close();

            conn.close();

            System.out.println("Event records loaded successfully.");
            System.out.println("Registered event records loaded successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDB;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox cmbSupplier;
    private javax.swing.JComboBox cmbSupplier1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblItemsInCart;
    private javax.swing.JLabel lblProductCatalogue;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEventList;
    private javax.swing.JTable tblRegList;
    // End of variables declaration//GEN-END:variables
}