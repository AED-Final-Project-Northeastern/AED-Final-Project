/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Hospital;
import Business.Network.Network;
import Business.Organization.Medical;
import Business.Organization.Organization;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DiagnosticsWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bhavana
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel processContainerUser;
    private Enterprise Ennterprise;
    private UserAccount accountUser;
    private Patient accountPatient;
    private Medical Organisation;
    EcoSystem ecoSystem;
    Network Network;
    //private DiagnosticsWorkRequest testRequest;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel userProcessContainer, UserAccount account, Patient patientAccount, Enterprise enterprise,Medical organization, EcoSystem ecosystem, Network network) {
        initComponents();
        
        this.processContainerUser = userProcessContainer;
        this.Ennterprise = enterprise;
        this.accountUser = account;
        this.accountPatient=patientAccount;
        this.Organisation=organization;
        this.ecoSystem=ecosystem;
        this.Network=network;
         btnRequestTests.setEnabled(true);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRequestTests = new javax.swing.JButton();
        txtAddition = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jlBacteria = new javax.swing.JLabel();
        checkAntibody = new javax.swing.JCheckBox();
        checkBlood = new javax.swing.JCheckBox();
        checkSurvival = new javax.swing.JCheckBox();
        txtBacteriaInfection = new javax.swing.JTextField();
        jlAddition = new javax.swing.JLabel();
        jlRequesttest = new javax.swing.JLabel();
        jlTests = new javax.swing.JLabel();
        checkWBC = new javax.swing.JCheckBox();
        checkLiver = new javax.swing.JCheckBox();
        checkKidney = new javax.swing.JCheckBox();
        jlViralInfection = new javax.swing.JLabel();
        txtViralInfection = new javax.swing.JTextField();
        jlFungal = new javax.swing.JLabel();
        txtFungal = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 204));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        btnRequestTests.setBackground(new java.awt.Color(204, 204, 204));
        btnRequestTests.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnRequestTests.setText("Request Tests");
        btnRequestTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestTestsActionPerformed(evt);
            }
        });

        txtAddition.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdditionActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 0, 51));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jlBacteria.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlBacteria.setText("Bacterial Infections test");

        checkAntibody.setBackground(new java.awt.Color(255, 255, 255));
        checkAntibody.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        checkAntibody.setText("Reactive Antibodies ");
        checkAntibody.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAntibodyActionPerformed(evt);
            }
        });

        checkBlood.setBackground(new java.awt.Color(255, 255, 255));
        checkBlood.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        checkBlood.setText("Blood Typing");

        checkSurvival.setBackground(new java.awt.Color(255, 255, 255));
        checkSurvival.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        checkSurvival.setText("Survival Capability");

        txtBacteriaInfection.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBacteriaInfection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBacteriaInfectionActionPerformed(evt);
            }
        });

        jlAddition.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlAddition.setText("Addition comments");

        jlRequesttest.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jlRequesttest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlRequesttest.setText("REQUEST TEST ");

        jlTests.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jlTests.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlTests.setText("Tests to be Conducted :");

        checkWBC.setBackground(new java.awt.Color(255, 255, 255));
        checkWBC.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        checkWBC.setText("WBC Count");
        checkWBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWBCActionPerformed(evt);
            }
        });

        checkLiver.setBackground(new java.awt.Color(255, 255, 255));
        checkLiver.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        checkLiver.setText("Liver Culture");

        checkKidney.setBackground(new java.awt.Color(255, 255, 255));
        checkKidney.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        checkKidney.setText("Kidney Culture");
        checkKidney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkKidneyActionPerformed(evt);
            }
        });

        jlViralInfection.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlViralInfection.setText("Viral Infection test");

        txtViralInfection.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtViralInfection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViralInfectionActionPerformed(evt);
            }
        });

        jlFungal.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlFungal.setText("Fungal and Parasite Infection test");

        txtFungal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFungal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFungalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBlood)
                            .addComponent(checkAntibody, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkSurvival, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkWBC)
                            .addComponent(checkLiver)
                            .addComponent(checkKidney)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jlRequesttest, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jlTests, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlViralInfection, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtViralInfection, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlFungal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFungal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(btnRequestTests))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlBacteria, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBacteriaInfection, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRequesttest)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jlTests)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBlood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkSurvival)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkAntibody)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkWBC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkLiver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkKidney)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBacteriaInfection)
                    .addComponent(jlBacteria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlViralInfection, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViralInfection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFungal)
                    .addComponent(jlFungal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAddition))
                .addGap(41, 41, 41)
                .addComponent(btnRequestTests, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestTestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestTestsActionPerformed
        
        String message = txtAddition.getText();
        int f=0;
     
        
        DiagnosticsWorkRequest request = new DiagnosticsWorkRequest();
        request.setPatientAccount(accountPatient);
        
        if(message==null||message.equals("")){
            JOptionPane.showMessageDialog(null, "please fill the comments field");
            
            return;
        }
        request.setMessage(message);
        if(checkBlood.isSelected()){
               f=1;
            request.getTests().add("Blood Typing");
        }
        if(checkSurvival.isSelected()){
            f=1;
            request.getTests().add("Survival Capability");
        }
        if(checkAntibody.isSelected()){
            f=1;
            request.getTests().add("Reactive Antibodies");
        }
        if(checkWBC.isSelected()){
            f=1;
            request.getTests().add("WBC Count");
        }
        if(checkLiver.isSelected()){
            f=1;
            request.getTests().add("Liver Culture");
        }
        if(checkKidney.isSelected()){
            f=1;
            request.getTests().add("Kidney Culture");
        }
        if(!txtBacteriaInfection.getText().isEmpty()){
            f=1;
            request.getTests().add(txtBacteriaInfection.getText());
        }
        if(!txtViralInfection.getText().isEmpty()){
            f=1;
            request.getTests().add(txtViralInfection.getText());
        }if(!txtFungal.getText().isEmpty()){
            f=1;
            request.getTests().add(txtFungal.getText());
        }
        
        
        boolean check;
        check=f>0;
        if(!check){
            JOptionPane.showMessageDialog(null,"Please selects testes to perform");
            return;
        }
        
        
        request.setSender(accountUser);
        request.setStatus("Sent");
        
        Organization org = null;
        Enterprise e=null;
        
        for(Enterprise ent: Network.getEnterpriseDirectory().getEnterpriseList()){
            if(ent instanceof Hospital&&ent.getOrganizationName().equalsIgnoreCase(Ennterprise.getOrganizationName())){
                e=ent;
                ent.getWorkQueue().getWorkRequestList().add(request);
                accountUser.getWorkQueue().getWorkRequestList().add(request);
            }
        }
        
        
        if(f==0){
            JOptionPane.showMessageDialog(null, "Please fill the details");
        }else{
        JOptionPane.showMessageDialog(null, "Test requested");
        accountPatient.setAlive(false);// to not repeat patient
        btnRequestTests.setEnabled(false);}
        
        DoctorWorkAreaJPanel sa=new DoctorWorkAreaJPanel(processContainerUser,accountUser,Organisation,Ennterprise,ecoSystem,Network);
        processContainerUser.add("Customer Adding",sa);
        CardLayout layout=(CardLayout)processContainerUser.getLayout();
        layout.next(processContainerUser);
        
    }//GEN-LAST:event_btnRequestTestsActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        DoctorWorkAreaJPanel sa=new DoctorWorkAreaJPanel(processContainerUser,accountUser,Organisation,Ennterprise,ecoSystem,Network);
        processContainerUser.add("Customer Adding",sa);
        CardLayout layout=(CardLayout)processContainerUser.getLayout();
        layout.next(processContainerUser);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtBacteriaInfectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBacteriaInfectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBacteriaInfectionActionPerformed

    private void checkAntibodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAntibodyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAntibodyActionPerformed

    private void txtAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdditionActionPerformed

    private void checkWBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWBCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkWBCActionPerformed

    private void checkKidneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkKidneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkKidneyActionPerformed

    private void txtViralInfectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViralInfectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViralInfectionActionPerformed

    private void txtFungalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFungalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFungalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnRequestTests;
    private javax.swing.JCheckBox checkAntibody;
    private javax.swing.JCheckBox checkBlood;
    private javax.swing.JCheckBox checkKidney;
    private javax.swing.JCheckBox checkLiver;
    private javax.swing.JCheckBox checkSurvival;
    private javax.swing.JCheckBox checkWBC;
    private javax.swing.JLabel jlAddition;
    private javax.swing.JLabel jlBacteria;
    private javax.swing.JLabel jlFungal;
    private javax.swing.JLabel jlRequesttest;
    private javax.swing.JLabel jlTests;
    private javax.swing.JLabel jlViralInfection;
    private javax.swing.JTextField txtAddition;
    private javax.swing.JTextField txtBacteriaInfection;
    private javax.swing.JTextField txtFungal;
    private javax.swing.JTextField txtViralInfection;
    // End of variables declaration//GEN-END:variables
}