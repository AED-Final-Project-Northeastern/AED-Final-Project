/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.*;
import Business.Network.Network;
import Business.Organization.Medical;
import Business.Organization.Organization;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DiagnosticsWorkRequest;
import Business.WorkQueue.MatchingWorkRequest;
import Business.WorkQueue.ProcurementWorkRequest;
import Business.WorkQueue.PhysicianWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhavana
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel processContainerUser;
    private Medical Organisation;
    private Enterprise Enterprise;
    private UserAccount AccountUser;
    private EnterpriseDirectory DirectoryEnterprise;
    private EcoSystem ecoSystem;
    private Network Network;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Medical organization, Enterprise enterprise, EcoSystem ecosystem, Network network) {
        initComponents();

        this.processContainerUser = userProcessContainer;
        this.Organisation = organization;
        this.Enterprise = enterprise;
        this.ecoSystem = ecosystem;
        this.AccountUser = account;
        this.DirectoryEnterprise = new EnterpriseDirectory();
        this.Network = network;
        txtAge.setVisible(false);
        jlAge.setVisible(false);
        jlName.setVisible(false);
        txtName.setVisible(false);
	btnRequestTest.setVisible(false);
        
        
        cb_patients();
        populateRequestTable();
        initwaitTable();

    }


    public void cb_patients(){
        comboSelectPatient.addItem("--Select");
        for(int i=0;i<Organisation.getPatientDirectory().getPatientList().size();i++){
            if((Organisation.getPatientDirectory().getPatientList().get(i).getDoctor().equalsIgnoreCase(AccountUser.getEmployee().getName()))&&Organisation.getPatientDirectory().getPatientList().get(i).isAlive()){
                comboSelectPatient.addItem(Organisation.getPatientDirectory().getPatientList().get(i).getId()+" : "+Organisation.getPatientDirectory().getPatientList().get(i).getPatientName());
            }
        }
    }
   
    public void initwaitTable(){
        DefaultTableModel model = (DefaultTableModel) organRequestJTable.getModel();
        
        model.setRowCount(0);
        for(int i=0;i<ecoSystem.getWaitList().size();i++){
            if(ecoSystem.getWaitList().get(i).getPatient().getDoctor().equalsIgnoreCase(AccountUser.getEmployee().getName())){
                Object[] row = new Object[5];
                row[0] = ecoSystem.getWaitList().get(i).getPatient().getId();
                row[1] = ecoSystem.getWaitList().get(i).getPatient().getPatientName();
                row[2] = ecoSystem.getWaitList().get(i).getOrgan();
                row[3] = ecoSystem.getWaitList().get(i).getUrgency();
                row[4] = ecoSystem.getWaitList().get(i).getWaitlist();   
                model.addRow(row);
            }
        }
    
    }
    

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tablePatient.getModel();
        model.setRowCount(0);
 
        for (WorkRequest request : AccountUser.getWorkQueue().getWorkRequestList()) {
            if (request instanceof DiagnosticsWorkRequest){
                Object[] row = new Object[6];
                
                
                
                row[0] = ((DiagnosticsWorkRequest) request).getPatient().getId();
                row[1] = ((DiagnosticsWorkRequest) request).getPatient().getPatientName();
                row[2] = request;
                row[3] = request.getReceiver();
                row[4] = request.getStatus();
    
            int counter=0;
            for(Network n: ecoSystem.getNetworkList()){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e instanceof Treatment){
                        for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                            for(WorkRequest w:o.getWorkQueue().getWorkRequestList()){
                                if(((PhysicianWorkRequest)w).getPatient().getId()==((DiagnosticsWorkRequest) request).getPatient().getId()){
                                    counter=counter+1;
                                    if(((PhysicianWorkRequest)w).getReceiver()==null){
                                       row[5] = "Not Assigned"; 
                                    }else{
                                        row[5]=((PhysicianWorkRequest)w).getReceiver();
                                    }
                                }
                            }    
                        }
                    }
                }    
            }
            if(counter==0){
                row[5] = "Not requested"; 
            }   
                model.addRow(row);
            }
        }
    }

    public void initwaitlistTable(){
        DefaultTableModel model = (DefaultTableModel) organRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : AccountUser.getWorkQueue().getWorkRequestList()) {
            if (request instanceof DiagnosticsWorkRequest){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = ((DiagnosticsWorkRequest) request).getPatient().getPatientName();
                row[2] = request.getReceiver();
                row[3] = request.getStatus();
                String result = ((DiagnosticsWorkRequest) request).getTestResult();
                row[4] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePatient = new javax.swing.JTable();
        btnRequestTest = new javax.swing.JButton();
        tableOrganWaitList = new javax.swing.JScrollPane();
        organRequestJTable = new javax.swing.JTable();
        viewRequestOrgan = new javax.swing.JButton();
        jlSelectPatient = new javax.swing.JLabel();
        comboSelectPatient = new javax.swing.JComboBox();
        jlAge = new javax.swing.JLabel();
        jlName = new javax.swing.JLabel();
        btnViewReport = new javax.swing.JButton();
        jlDoctorDashBoard = new javax.swing.JLabel();
        jlRequest = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        jlPatientAndLabTest = new javax.swing.JLabel();
        jlOrganWaitlist = new javax.swing.JLabel();
        btnNotifyOrgan = new javax.swing.JButton();
        checkHeart = new javax.swing.JCheckBox();
        checkKidneys = new javax.swing.JCheckBox();
        checkLiver = new javax.swing.JCheckBox();
        checkPancreas = new javax.swing.JCheckBox();
        btnTherapist = new javax.swing.JButton();
        checkLungs = new javax.swing.JCheckBox();
        checkIntestines = new javax.swing.JCheckBox();
        jlSelectOrgan = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(java.awt.Color.white);

        tablePatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablePatient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablePatient.setForeground(new java.awt.Color(255, 0, 51));
        tablePatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient Name", "Message by Doctor", "Lab Assistant", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePatient);

        btnRequestTest.setBackground(new java.awt.Color(204, 204, 204));
        btnRequestTest.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnRequestTest.setText("Request test");
        btnRequestTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestTestActionPerformed(evt);
            }
        });

        tableOrganWaitList.setBackground(new java.awt.Color(255, 204, 204));
        tableOrganWaitList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableOrganWaitList.setForeground(new java.awt.Color(255, 0, 51));

        organRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Organ Required", "Urgency", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOrganWaitList.setViewportView(organRequestJTable);
        if (organRequestJTable.getColumnModel().getColumnCount() > 0) {
            organRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            organRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            organRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            organRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            organRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        viewRequestOrgan.setBackground(new java.awt.Color(204, 204, 204));
        viewRequestOrgan.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        viewRequestOrgan.setForeground(new java.awt.Color(255, 0, 51));
        viewRequestOrgan.setText("Request Organ");
        viewRequestOrgan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestOrganActionPerformed(evt);
            }
        });

        jlSelectPatient.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlSelectPatient.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlSelectPatient.setText("Select Patient:");

        comboSelectPatient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboSelectPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectPatientActionPerformed(evt);
            }
        });

        jlAge.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlAge.setText("Age:");

        jlName.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlName.setText("Name:");

        btnViewReport.setBackground(new java.awt.Color(204, 204, 204));
        btnViewReport.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnViewReport.setForeground(new java.awt.Color(255, 0, 51));
        btnViewReport.setText("View Test Report");
        btnViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportActionPerformed(evt);
            }
        });

        jlDoctorDashBoard.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jlDoctorDashBoard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDoctorDashBoard.setText("DOCTOR DASHBOARD");

        jlRequest.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jlRequest.setText("Request test for the patient :");

        txtAge.setEditable(false);
        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(204, 204, 204));
        btnView.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jlPatientAndLabTest.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jlPatientAndLabTest.setText("Patient and Lab test History : ");

        jlOrganWaitlist.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jlOrganWaitlist.setText("Organ Waitlist : ");

        btnNotifyOrgan.setBackground(new java.awt.Color(204, 204, 204));
        btnNotifyOrgan.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnNotifyOrgan.setForeground(new java.awt.Color(255, 0, 51));
        btnNotifyOrgan.setText("Notify  organ");
        btnNotifyOrgan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotifyOrganActionPerformed(evt);
            }
        });

        checkHeart.setBackground(new java.awt.Color(255, 204, 204));
        checkHeart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkHeart.setForeground(new java.awt.Color(255, 0, 51));
        checkHeart.setText("Heart");

        checkKidneys.setBackground(new java.awt.Color(255, 204, 204));
        checkKidneys.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkKidneys.setForeground(new java.awt.Color(255, 0, 51));
        checkKidneys.setText("Kidneys");

        checkLiver.setBackground(new java.awt.Color(255, 204, 204));
        checkLiver.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkLiver.setForeground(new java.awt.Color(255, 0, 51));
        checkLiver.setText("Liver");

        checkPancreas.setBackground(new java.awt.Color(255, 204, 204));
        checkPancreas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPancreas.setForeground(new java.awt.Color(255, 0, 51));
        checkPancreas.setText("Pancreas");

        btnTherapist.setBackground(new java.awt.Color(204, 204, 204));
        btnTherapist.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnTherapist.setForeground(new java.awt.Color(255, 0, 51));
        btnTherapist.setText("Therapist");
        btnTherapist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTherapistActionPerformed(evt);
            }
        });

        checkLungs.setBackground(new java.awt.Color(255, 204, 204));
        checkLungs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkLungs.setForeground(new java.awt.Color(255, 0, 51));
        checkLungs.setText("Lungs");
        checkLungs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLungsActionPerformed(evt);
            }
        });

        checkIntestines.setBackground(new java.awt.Color(255, 204, 204));
        checkIntestines.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkIntestines.setForeground(new java.awt.Color(255, 0, 51));
        checkIntestines.setText("Intestines");

        jlSelectOrgan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlSelectOrgan.setForeground(new java.awt.Color(255, 0, 51));
        jlSelectOrgan.setText("Select the organ : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tableOrganWaitList, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlOrganWaitlist)
                            .addComponent(jlPatientAndLabTest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jlSelectPatient)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(comboSelectPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jlAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlName, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtName)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(96, 96, 96))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnRequestTest)
                                    .addGap(109, 109, 109))))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSelectOrgan)
                                .addGap(18, 18, 18)
                                .addComponent(checkHeart, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkKidneys, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkLiver, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkPancreas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkLungs, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkIntestines))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewReport)
                                .addGap(37, 37, 37)
                                .addComponent(viewRequestOrgan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnTherapist)
                                .addGap(33, 33, 33)
                                .addComponent(btnNotifyOrgan))
                            .addComponent(jlDoctorDashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 71, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnNotifyOrgan, btnTherapist, btnViewReport, viewRequestOrgan});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDoctorDashBoard)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlOrganWaitlist)
                            .addComponent(jlRequest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tableOrganWaitList, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jlPatientAndLabTest)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jlSelectPatient))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboSelectPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAge))
                        .addGap(18, 18, 18)
                        .addComponent(btnRequestTest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSelectOrgan)
                    .addComponent(checkHeart)
                    .addComponent(checkKidneys)
                    .addComponent(checkLiver)
                    .addComponent(checkPancreas)
                    .addComponent(checkLungs)
                    .addComponent(checkIntestines))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewReport)
                    .addComponent(viewRequestOrgan)
                    .addComponent(btnNotifyOrgan)
                    .addComponent(btnTherapist))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnNotifyOrgan, btnTherapist, btnViewReport, viewRequestOrgan});

    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestTestActionPerformed
  
        
        String string = comboSelectPatient.getSelectedItem().toString();
        String[] parts = string.split(":");
        String id = parts[0].trim();

        RequestLabTestJPanel rlt=new RequestLabTestJPanel(processContainerUser, AccountUser,patAccount(id),Enterprise,Organisation, ecoSystem,Network);
        processContainerUser.add("Lab test",rlt);
        CardLayout layout=(CardLayout)processContainerUser.getLayout();
        layout.next(processContainerUser);

    }//GEN-LAST:event_btnRequestTestActionPerformed
    public Patient patAccount(String id){
        for(Patient p: Organisation.getPatientDirectory().getPatientList()){
            if((""+id).equalsIgnoreCase(""+p.getId())){
                System.out.println(p);
                return p;
            }
        }
        return null;
    }
    private void viewRequestOrganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestOrganActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=tablePatient.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        Patient p=patAccount(tablePatient.getValueAt(tablePatient.getSelectedRow(), 0).toString());
        RequestOrganJpanel tdj=new RequestOrganJpanel(processContainerUser,Organisation, AccountUser,p,ecoSystem,Enterprise,Network);
        processContainerUser.add("Lab test",tdj);
        CardLayout layout=(CardLayout)processContainerUser.getLayout();
        layout.next(processContainerUser);
        
        
    }//GEN-LAST:event_viewRequestOrganActionPerformed

    private void comboSelectPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectPatientActionPerformed
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_comboSelectPatientActionPerformed

    private void btnViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportActionPerformed
        boolean check;
        check=tablePatient.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        
        Patient p=patAccount(tablePatient.getValueAt(tablePatient.getSelectedRow(), 0).toString());
        
        String id=tablePatient.getValueAt(tablePatient.getSelectedRow(), 0).toString();
        
        check=!(tablePatient.getValueAt(tablePatient.getSelectedRow(), 3)==null);
        if(!check){
            JOptionPane.showMessageDialog(null, "Resulted not generated");
            return;
        }
        
        String labassist=tablePatient.getValueAt(tablePatient.getSelectedRow(), 3).toString();
        
        TestDataJPanel tdj=new TestDataJPanel(processContainerUser, AccountUser,id,p,labassist,Enterprise,Organisation, ecoSystem,Network);
        processContainerUser.add("Lab test",tdj);
        CardLayout layout=(CardLayout)processContainerUser.getLayout();
        layout.next(processContainerUser);
        
        
        
        
    }//GEN-LAST:event_btnViewReportActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=comboSelectPatient.getSelectedIndex()>0;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
        }
        String string = comboSelectPatient.getSelectedItem().toString();
        String[] parts = string.split(":");
        String id = parts[0].trim();
        for(Patient p: Organisation.getPatientDirectory().getPatientList()){
            if(id.equalsIgnoreCase(""+p.getId())){
                
                jlAge.setVisible(true);
                jlName.setVisible(true);
                txtName.setVisible(true);
                txtAge.setVisible(true);
                txtAge.setText(p.getAge());
                txtName.setText(p.getPatientName());
                txtAge.setEnabled(false);
                txtName.setEnabled(false);
                btnRequestTest.setVisible(true);
            
            }
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnNotifyOrganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotifyOrganActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=tablePatient.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        check=(checkHeart.isSelected()||checkKidneys.isSelected()||checkLiver.isSelected()||checkPancreas.isSelected()||checkLungs.isSelected()||checkIntestines.isSelected());
        if(!check){
            JOptionPane.showMessageDialog(null, "Select atleast one checkbox");
            return;
        }
        
        
        ProcurementWorkRequest request = new ProcurementWorkRequest();
        request.setPatientAccount(patAccount(tablePatient.getValueAt(tablePatient.getSelectedRow(), 0).toString()));
        
        MatchingWorkRequest mr=new MatchingWorkRequest();
        mr.setDonpatient(patAccount(tablePatient.getValueAt(tablePatient.getSelectedRow(), 0).toString()));
        
        
        ArrayList<String> orList=new ArrayList<>();
        if(checkHeart.isSelected()){
            orList.add("Heart");
        }
        if(checkKidneys.isSelected()){
            orList.add("Kidney");
        }
        if(checkLiver.isSelected()){
            orList.add("Liver");
        }
        if(checkPancreas.isSelected()){
            orList.add("Pancreas");
        }
        if(checkPancreas.isSelected()){
            orList.add("Lungs");
        }
        if(checkPancreas.isSelected()){
            orList.add("Intestines");
        }
        request.setOrganList(orList);
        
        Patient chkpat=patAccount(tablePatient.getValueAt(tablePatient.getSelectedRow(), 0).toString());
        int dup=0;
        for(Network n:ecoSystem.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof OrganBank){
                    for(WorkRequest w: e.getWorkQueue().getWorkRequestList()){
                        if(w instanceof ProcurementWorkRequest){
                            if(((ProcurementWorkRequest) w).getPatient().getId()==chkpat.getId()){
                                dup=dup+1;
                            }
                        }
                    }
                
                }
            
            }
        }
        
        check=(dup==0);
        if(!check){
            JOptionPane.showMessageDialog(null, "The procurement for this patient is already requested");
            return;
        }
        request.setSender(AccountUser);
        request.setStatus("Procurement Requested");
        
        mr.setStatus("Procurement Requested");
        mr.setSender(AccountUser);
        
        int size=ecoSystem.getWaitList().size();
        int loopcounter=0;
        for(int i=size-1;i>-1;i--){
            for(String s: orList){
                if(s.equalsIgnoreCase(ecoSystem.getWaitList().get(i).getOrgan())){
                    System.out.println("####");
                    loopcounter++;
                    mr.setStatus("Organ Donated");
                    mr.setRecpatient(ecoSystem.getWaitList().get(i).getPatient());
                    mr.setOrgan(ecoSystem.getWaitList().get(i).getOrgan());
                    break;
                }
            } 
            if(loopcounter>0)break;
        }
        
        
        Enterprise ent = null;
        for(Network n: ecoSystem.getNetworkList()){
            if(n.getNetworkName().equalsIgnoreCase(Network.getNetworkName())){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e instanceof OrganBank){
                        ent=e;
                        if(loopcounter>0){
                            ent.getWorkQueue().getWorkRequestList().add(mr);
                            AccountUser.getWorkQueue().getWorkRequestList().add(mr);
                        }else{
                            ent.getWorkQueue().getWorkRequestList().add(request);
                            AccountUser.getWorkQueue().getWorkRequestList().add(request);
                        }
                        
                    }
                }
            
            }
            
        }
        
        
        JOptionPane.showMessageDialog(null, "Organ Procurement Requested");
        
        
    }//GEN-LAST:event_btnNotifyOrganActionPerformed

    private void btnTherapistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTherapistActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=tablePatient.getSelectedRow()>-1;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select a patient");
            return;
        }
        Patient p=patAccount(tablePatient.getValueAt(tablePatient.getSelectedRow(), 0).toString());
        RequestTherapyJPanel tdj=new RequestTherapyJPanel(processContainerUser,Organisation, AccountUser,p,ecoSystem,Enterprise,Network);
        processContainerUser.add("Lab test",tdj);
        CardLayout layout=(CardLayout)processContainerUser.getLayout();
        layout.next(processContainerUser);
    }//GEN-LAST:event_btnTherapistActionPerformed

    private void checkLungsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLungsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkLungsActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNotifyOrgan;
    private javax.swing.JButton btnRequestTest;
    private javax.swing.JButton btnTherapist;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewReport;
    private javax.swing.JCheckBox checkHeart;
    private javax.swing.JCheckBox checkIntestines;
    private javax.swing.JCheckBox checkKidneys;
    private javax.swing.JCheckBox checkLiver;
    private javax.swing.JCheckBox checkLungs;
    private javax.swing.JCheckBox checkPancreas;
    private javax.swing.JComboBox comboSelectPatient;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlAge;
    private javax.swing.JLabel jlDoctorDashBoard;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlOrganWaitlist;
    private javax.swing.JLabel jlPatientAndLabTest;
    private javax.swing.JLabel jlRequest;
    private javax.swing.JLabel jlSelectOrgan;
    private javax.swing.JLabel jlSelectPatient;
    private javax.swing.JTable organRequestJTable;
    private javax.swing.JScrollPane tableOrganWaitList;
    private javax.swing.JTable tablePatient;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JButton viewRequestOrgan;
    // End of variables declaration//GEN-END:variables
}
