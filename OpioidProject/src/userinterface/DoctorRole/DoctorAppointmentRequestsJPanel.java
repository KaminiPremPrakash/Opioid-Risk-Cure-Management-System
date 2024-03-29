/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorLabRequest;
import Business.WorkQueue.PatientAppointmentRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kamini Prakash
 */
public class DoctorAppointmentRequestsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorAppointmentRequestsJPanel() {
        initComponents();
        populateRequestTable();
    }

    public DoctorAppointmentRequestsJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (DoctorOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;

        //valueLabel.setText(enterprise.getName());
        populateRequestTable();

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
        docWorkRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnViewlabresult = new javax.swing.JButton();

        setBackground(new java.awt.Color(188, 194, 223));

        docWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Request Intended By", "Request Received By", "Status", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(docWorkRequestJTable);

        assignJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        processJButton.setText("Collect Medical History");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Appointment Requests");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnViewlabresult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewlabresult.setText("View Lab Result");
        btnViewlabresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewlabresultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(assignJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshJButton)
                        .addGap(44, 44, 44)
                        .addComponent(jButton1)
                        .addGap(41, 41, 41)
                        .addComponent(btnViewlabresult))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(refreshJButton)
                    .addComponent(processJButton)
                    .addComponent(jButton1)
                    .addComponent(btnViewlabresult))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        //   System.out.println("assign to me pressed ");
        String status;

        int selectedRow = docWorkRequestJTable.getSelectedRow();

        //    System.out.println(docWorkRequestJTable.getValueAt(selectedRow, 3));
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a patient first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            status = (String) docWorkRequestJTable.getValueAt(selectedRow, 3);

            if (status.equals("Sent By Patient")) {
                WorkRequest request = (WorkRequest) docWorkRequestJTable.getValueAt(selectedRow, 0);
                request.setReceiver(userAccount);
                request.setStatus("Assigned To Doc");
                

                populateRequestTable();
            } else if (status.equals("Assigned To Doc")) {
                JOptionPane.showMessageDialog(null, "Request is already with you" + "\n"
                        + "Now start capturing medical history", "Warning", JOptionPane.WARNING_MESSAGE);

                return;
            } else if (status.equals("Med Hist Coll Req")) {
                JOptionPane.showMessageDialog(null, "Already Collected Medical History" + "\n"
                        + "No Action Needed", "Warning", JOptionPane.WARNING_MESSAGE);

                return;
            } else {
                JOptionPane.showMessageDialog(null, "Request is not with you", "Warning", JOptionPane.WARNING_MESSAGE);

                return;
            }

        }


    }//GEN-LAST:event_assignJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        //     System.out.println("refresh pressed ");
        populateRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        PatientAppointmentRequest p_req = new PatientAppointmentRequest();

        String status;
        int selectedRow = docWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a patient first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String s = (String) docWorkRequestJTable.getValueAt(selectedRow, 3);

        if (s.equals("Assigned To Doc")) {

            PatientAppointmentRequest request = (PatientAppointmentRequest) docWorkRequestJTable.getValueAt(selectedRow, 0);

            //  request.setStatus("Med Hist Coll Req");
            //  ProcessAppointmentRequestJPanel processAppointmentRequestJPanel = new ProcessAppointmentRequestJPanel(userProcessContainer, request, userAccount,enterprise);
            DoctorPatientMedicalHistoryJPanel processAppointmentRequestJPanel = new DoctorPatientMedicalHistoryJPanel(userProcessContainer, request, userAccount, enterprise);

            userProcessContainer.add("processWorkRequestJPanel", processAppointmentRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();

            layout.next(userProcessContainer);

        } else if (s.equals("Med Hist Coll Req")) {
            JOptionPane.showMessageDialog(null, "Medical history already collected" + "\n"
                    + "No action required", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Request is not with you" + "\n"
                    + "No action needed", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }


    }//GEN-LAST:event_processJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewlabresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewlabresultActionPerformed
        String status;
        int selectedRow = docWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a patient first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest) docWorkRequestJTable.getValueAt(selectedRow, 0);

         ViewLabResultcases viewLabResultcases = new ViewLabResultcases(userProcessContainer, request, network, enterprise, userAccount);
         userProcessContainer.add("viewLabResultcasesJPanel", viewLabResultcases);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        populateRequestTable();
    }//GEN-LAST:event_btnViewlabresultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnViewlabresult;
    private javax.swing.JTable docWorkRequestJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables

    public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) docWorkRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            //    row[0] = request.getMessage();
            row[0] = request;
            row[1] = request.getSender().getUsername();
            row[2] = request.getReceiver();
            String result = request.getStatus();
            // System.out.println(result);
            row[3] = result == null ? "Waiting" : result;

            row[4] = request.getRequestDate();

            model.addRow(row);

        }

    }
}
