/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Medical;
import Business.Organization.Organization;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import Business.Waitlist.Wait;
import java.awt.CardLayout;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bhavana
 */
public class RequestOrganJpanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestOrganJpanel
     */
    JPanel processContainerUser;
    UserAccount accountUser;
    String id;
    Organization org;
    EcoSystem ecosystem;
    Enterprise Enterprise;
    Network Network;
    Patient patient;
    public RequestOrganJpanel(JPanel userProcessContainer, Medical organization, UserAccount userAccount, Patient p, EcoSystem ecosystem, Enterprise enterprise, Network network) {
        initComponents();
        this.processContainerUser=userProcessContainer;
        this.accountUser=userAccount;
        this.id=""+p.getId();
        this.ecosystem=ecosystem;
        this.patient=p;
        this.org=organization;
        this.Network=network;
        this.Enterprise=enterprise;
        txtPatientID.setText(id);
        txtPatientName.setText(this.patient.getPatientName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlOrganRequest = new javax.swing.JLabel();
        jlPatientId = new javax.swing.JLabel();
        jlPatientName = new javax.swing.JLabel();
        jlRequestOrgan = new javax.swing.JLabel();
        jlAge = new javax.swing.JLabel();
        jlStatus = new javax.swing.JLabel();
        jlSurvival = new javax.swing.JLabel();
        jlUrgency = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        comboRequiredOrgan = new javax.swing.JComboBox<>();
        comboAge = new javax.swing.JComboBox<>();
        comboStatus = new javax.swing.JComboBox<>();
        comboSurvival = new javax.swing.JComboBox<>();
        comboUrgency = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(0, 204, 204));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jlOrganRequest.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jlOrganRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlOrganRequest.setText("Organ Request");

        jlPatientId.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlPatientId.setText("Patient ID :");

        jlPatientName.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlPatientName.setText("Patient Name :");

        jlRequestOrgan.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlRequestOrgan.setText("Required Organ :");

        jlAge.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlAge.setText("Age Group :");

        jlStatus.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlStatus.setText("Pediatric Status :");

        jlSurvival.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlSurvival.setText("Survival Benefit :");

        jlUrgency.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlUrgency.setText("Urgency :");

        txtPatientID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPatientName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        comboRequiredOrgan.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        comboRequiredOrgan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Heart", "Kidney", "Liver", "Lungs", "Pancreas", "Intestines" }));

        comboAge.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        comboAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "0-20", "20-35", "35-50", "50-65", ">65" }));

        comboStatus.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Yes", "No" }));

        comboSurvival.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        comboSurvival.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "85-100", "60-85", "50-60", "30-50", "<30" }));

        comboUrgency.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        comboUrgency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Critical", "Not Critical" }));

        btnSubmit.setBackground(new java.awt.Color(204, 204, 204));
        btnSubmit.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 51));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlAge)
                            .addComponent(jlStatus)
                            .addComponent(jlSurvival)
                            .addComponent(jlUrgency)
                            .addComponent(jlPatientId)
                            .addComponent(jlPatientName)
                            .addComponent(jlRequestOrgan))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientID)
                            .addComponent(txtPatientName)
                            .addComponent(comboRequiredOrgan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboAge, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboSurvival, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboUrgency, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(btnSubmit))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlOrganRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlOrganRequest)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPatientId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPatientName)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRequestOrgan)
                    .addComponent(comboRequiredOrgan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAge)
                    .addComponent(comboAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlStatus)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSurvival)
                    .addComponent(comboSurvival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUrgency)
                    .addComponent(comboUrgency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnSubmit)
                .addGap(219, 219, 219))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboAge, comboRequiredOrgan, comboStatus, comboSurvival, comboUrgency, jlAge, jlPatientId, jlPatientName, jlRequestOrgan, jlStatus, jlSurvival, jlUrgency, txtPatientID, txtPatientName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        boolean check;
        check=(comboStatus.getSelectedIndex()>0&&comboAge.getSelectedIndex()>0&&comboRequiredOrgan.getSelectedIndex()>0&&comboSurvival.getSelectedIndex()>0&&comboUrgency.getSelectedIndex()>0);
        if(check == false) {
            JOptionPane.showMessageDialog(null, "Please provide all parameters");
            return;
        }
        
        
        int dup=0;
        for(Wait w: ecosystem.getWaitList()){
            if(w.getPatient().getId()==patient.getId()&&w.getOrgan().equalsIgnoreCase(comboRequiredOrgan.getSelectedItem().toString())){
               dup++; 
            }
        }
        
        check=(dup==0);
        if(!check){
            JOptionPane.showMessageDialog(null, "Patient is already in waitlist");
            return;
        }
        

        int score=0;
        if(ecosystem.getWaitList().size()<1){
            score=calculateScore();
        }else{
//            Collections.sort(ecoSystem.getWaitList());
            for(Wait w: ecosystem.getWaitList()){
                if(w.getOrgan().equalsIgnoreCase(comboRequiredOrgan.getSelectedItem().toString())){
                    score=w.getWaitlist()-1;
                    break;
                }else{
                    score=calculateScore();
                }
            }
        
        }
        
        Wait w=new Wait(patient,comboAge.getSelectedItem().toString(),comboStatus.getSelectedItem().toString(),comboSurvival.getSelectedItem().toString(),comboUrgency.getSelectedItem().toString(),comboRequiredOrgan.getSelectedItem().toString(),score,0);
        ecosystem.addWaitlist(w);
        
        
        
        
        DoctorWorkAreaJPanel rlt=new DoctorWorkAreaJPanel(processContainerUser, accountUser,(Medical) org,Enterprise,ecosystem,Network);
        rlt.initwaitTable();
        processContainerUser.add("Lab test",rlt);
        CardLayout layout=(CardLayout)processContainerUser.getLayout();
        layout.next(processContainerUser);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        DoctorWorkAreaJPanel rlt=new DoctorWorkAreaJPanel(processContainerUser, accountUser,(Medical) org,Enterprise,ecosystem,Network);
        rlt.initwaitTable();
        processContainerUser.add("Lab test",rlt);
        CardLayout layout=(CardLayout)processContainerUser.getLayout();
        layout.next(processContainerUser);
    }//GEN-LAST:event_btnBackActionPerformed
    public int calculateScore(){
        int counter=0;
        int age=comboAge.getSelectedIndex();
        int ped=comboStatus.getSelectedIndex();
        int sur=comboSurvival.getSelectedIndex();
        int urg=comboUrgency.getSelectedIndex();
        if(age==1){
            counter=counter+10;
        }else if(age==2){
            counter=counter+8;
        }else if(age==3){
            counter=counter+6;
        }else if(age==4){
            counter=counter+4;
        }else if(age==5){
            counter=counter+2;
        }
        
        if(sur==1){
            counter=counter+10;
        }else if(sur==2){
            counter=counter+8;
        }else if(sur==3){
            counter=counter+6;
        }else if(sur==4){
            counter=counter+4;
        }else if(sur==5){
            counter=counter+2;
        }
        
        if(ped==1){
            counter=counter+10;
        }else if(ped==2){
            counter=counter+0;
        }
        
        if(urg==1){
            counter=counter+10;
        }else if(ped==2){
            counter=counter+5;
        }
        
        
        return counter;
    }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> comboAge;
    private javax.swing.JComboBox<String> comboRequiredOrgan;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JComboBox<String> comboSurvival;
    private javax.swing.JComboBox<String> comboUrgency;
    private javax.swing.JLabel jlAge;
    private javax.swing.JLabel jlOrganRequest;
    private javax.swing.JLabel jlPatientId;
    private javax.swing.JLabel jlPatientName;
    private javax.swing.JLabel jlRequestOrgan;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JLabel jlSurvival;
    private javax.swing.JLabel jlUrgency;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
