/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ProcurementTeamRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.OrganBank;
import Business.Network.Network;
import Business.Organization.Services;
import Business.Organization.OrganManagement;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProcurementWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saikr
 */
public class ProcurementTeamJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcurementTeamJPanel
     */
     JPanel processContainerUser;
    OrganizationDirectory directoryOrganisation; 
    Enterprise Enterprise;
    EcoSystem ecosytem;
    UserAccount Account;
    Organization organization;
    Network Network;
    
    public ProcurementTeamJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.processContainerUser=userProcessContainer;
        this.Enterprise=enterprise;
        this.ecosytem=business;
        this.Account = account;
        this.organization =organization;
        this.Network=network;
        populateTable();
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
        tableProcrument = new javax.swing.JTable();
        btnInProcess = new javax.swing.JButton();
        btnCOmpleted = new javax.swing.JButton();
        jlTeamDashBoard = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        tableProcrument.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableProcrument.setForeground(new java.awt.Color(255, 0, 51));
        tableProcrument.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient", "Status", "Organs", "Patient", "Doctor"
            }
        ));
        tableProcrument.setSelectionBackground(new java.awt.Color(255, 153, 153));
        tableProcrument.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jScrollPane1.setViewportView(tableProcrument);

        btnInProcess.setBackground(new java.awt.Color(204, 204, 204));
        btnInProcess.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnInProcess.setText("InProcess");
        btnInProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInProcessActionPerformed(evt);
            }
        });

        btnCOmpleted.setBackground(new java.awt.Color(204, 204, 204));
        btnCOmpleted.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnCOmpleted.setText("Completed");
        btnCOmpleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOmpletedActionPerformed(evt);
            }
        });

        jlTeamDashBoard.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jlTeamDashBoard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTeamDashBoard.setText("Procurement Team Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInProcess)
                                .addGap(43, 43, 43)
                                .addComponent(btnCOmpleted))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jlTeamDashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlTeamDashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCOmpleted, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInProcessActionPerformed
        // TODO add your handling code here:
        
        
        
        int selectedRow = tableProcrument.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select request to Process", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        ProcurementWorkRequest orgwr = (ProcurementWorkRequest)tableProcrument.getValueAt(selectedRow, 0);
        boolean check;
        check=orgwr.getTeam().equalsIgnoreCase(organization.getOrganizationName());
                
        if(!check){
            JOptionPane.showMessageDialog(null, "This task is assigned to other team");
            return;
        }
        if(orgwr.getStatus().equals("Assigned")){
        
          orgwr.setStatus("InProcess");  
        }
        
    
      
     populateTable();
  
        
    }//GEN-LAST:event_btnInProcessActionPerformed

    private void btnCOmpletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOmpletedActionPerformed
        // TODO add your handling code here:
       int selectedRow = tableProcrument.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select request to Complete", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        ProcurementWorkRequest orgwr = (ProcurementWorkRequest)tableProcrument.getValueAt(selectedRow, 0);
        if(!orgwr.getStatus().equals("InProcess")){
        JOptionPane.showMessageDialog(null,"Request should be InProcess", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        
        }
         
                   if(organization instanceof Services){
                       orgwr.setStatus("Completed");

                   ((Services) organization).setCounter(0);}

     populateTable();  
    }//GEN-LAST:event_btnCOmpletedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCOmpleted;
    private javax.swing.JButton btnInProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlTeamDashBoard;
    private javax.swing.JTable tableProcrument;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
         DefaultTableModel model = (DefaultTableModel) tableProcrument.getModel();
         model.setRowCount(0);
         for(Network n: ecosytem.getNetworkList()){
            if(n.getNetworkName().equalsIgnoreCase(Network.getNetworkName())){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof OrganBank){
                   
                    if(e.getWorkQueue()== null){
                        System.out.println("catched by repears");
                      break;}
                    for(WorkRequest wr: e.getWorkQueue().getWorkRequestList()){
                        
                        if( wr.getStatus().equals("Assigned")|| wr.getStatus().equals("InProcess")|| wr.getStatus().equals("Completed")){
                            ProcurementWorkRequest opr = (ProcurementWorkRequest)wr;
                            System.out.println("In Ark space ship");
                            String a ="";
                            for( String s: opr.getOrganList()){
                                a= s+":"+a;
                            }
                            Object[] row = new Object[80];
                        row[0]= opr;
                        row[1] = opr.getMessage();
                        
                        row[1] = opr.getStatus();
                        row[2] = a;
                        
                        row[3] = opr.getPatient().getPatientName();
                        row[4] = opr.getPatient().getDoctor();
                        model.addRow(row);
                       
                        }
                      
                     
                    
                    }
                }
            }
            }
        }
    }
}
