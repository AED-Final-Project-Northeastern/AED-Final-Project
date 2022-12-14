/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhavana
 */
public class EmployeeManagement extends javax.swing.JPanel {

    private OrganizationDirectory directoryOrganisation;
    private JPanel processContainerUser;
    ArrayList<String> listUser = new ArrayList<String>();
    EcoSystem ecosystem;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public EmployeeManagement(JPanel userProcessContainer,OrganizationDirectory organizationDirectory,Enterprise enterprise,EcoSystem ecoSystem) {
        initComponents();
        this.processContainerUser = userProcessContainer;
        this.directoryOrganisation = organizationDirectory;
        this.ecosystem=ecoSystem;
        initOrganizationEmpComboBox();
        initTable();
    }
    
    
    public void initOrganizationEmpComboBox(){
        cmbxOrganization.removeAllItems();
        cmbxOrganization.addItem("--Select--");
        for (Organization organization : directoryOrganisation.getOrganizationList()){
            cmbxOrganization.addItem(organization);
        }
    }

    private void initTable(){
        DefaultTableModel model = (DefaultTableModel) tblCurrentEmployees.getModel();
        
        model.setRowCount(0);

        for(Organization or:directoryOrganisation.getOrganizationList()){
            for (Employee employee : or.getEmployeeDirectory().getEmployeeList()){
                Object[] row = new Object[2];
                row[0] = employee.getId();
                row[1] = employee.getName();
                listUser.add(employee.getName());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCurrentEmployees = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btnBackk = new javax.swing.JButton();
        jlName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmbxOrganization = new javax.swing.JComboBox();
        jlOrganisation = new javax.swing.JLabel();
        txtCreateEmployee = new javax.swing.JLabel();
        labelEmployeeList = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        tblCurrentEmployees.setBackground(new java.awt.Color(0, 153, 153));
        tblCurrentEmployees.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCurrentEmployees.setForeground(new java.awt.Color(255, 0, 51));
        tblCurrentEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCurrentEmployees.setSelectionBackground(new java.awt.Color(255, 153, 153));
        tblCurrentEmployees.setSelectionForeground(new java.awt.Color(255, 255, 51));
        jScrollPane1.setViewportView(tblCurrentEmployees);
        if (tblCurrentEmployees.getColumnModel().getColumnCount() > 0) {
            tblCurrentEmployees.getColumnModel().getColumn(0).setResizable(false);
            tblCurrentEmployees.getColumnModel().getColumn(1).setResizable(false);
        }

        btnadd.setBackground(new java.awt.Color(204, 204, 204));
        btnadd.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnBackk.setBackground(new java.awt.Color(204, 204, 204));
        btnBackk.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnBackk.setText("Back");
        btnBackk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackkActionPerformed(evt);
            }
        });

        jlName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlName.setText("Name:");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        cmbxOrganization.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbxOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlOrganisation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlOrganisation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlOrganisation.setText("Organization:");

        txtCreateEmployee.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        txtCreateEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCreateEmployee.setText("CREATE EMPLOYEE");

        labelEmployeeList.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        labelEmployeeList.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelEmployeeList.setText("Employee List :");

        btnUpdate.setText("Update Employee");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Employee");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlOrganisation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbxOrganization, 0, 175, Short.MAX_VALUE)
                                    .addComponent(txtName)))
                            .addComponent(labelEmployeeList)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCreateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(btnBackk, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnUpdate)
                        .addGap(89, 89, 89)
                        .addComponent(btnDelete)))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBackk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCreateEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlOrganisation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbxOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(btnadd)
                .addGap(37, 37, 37)
                .addComponent(labelEmployeeList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        boolean check;
        check=cmbxOrganization.getSelectedIndex()>0;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select an organisation");
            return;
        }
        
        Organization organization = (Organization) cmbxOrganization.getSelectedItem();
        String name = txtName.getText();
        for(String s:listUser){
            if(s.equals(name)){
                JOptionPane.showMessageDialog(null, "Employee name already exists");
                return;
            }
        }
     
        if(name.matches("^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$")){
        organization.getEmployeeDirectory().AddEmployee(ecosystem.getEmployeeId(),name);
        ecosystem.incEmployeeId();
        initTable();
        txtName.setText("");}
         else{
            JOptionPane.showMessageDialog(null, "Names can't contain numbers or special characters");
        }
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnBackkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackkActionPerformed

        processContainerUser.remove(this);
        CardLayout layout = (CardLayout) processContainerUser.getLayout();
        layout.previous(processContainerUser);
    }//GEN-LAST:event_btnBackkActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCurrentEmployees.getSelectedRow();
        if (selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please Select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCurrentEmployees.getModel();
        Employee sel  = (Employee)model.getValueAt(selectedRowIndex, 0);

        Organization organization = (Organization) cmbxOrganization.getSelectedItem();
        organization.getEmployeeDirectory().DeleteEmployee(sel);

        JOptionPane.showMessageDialog(this, "Employee Details Deleted");
        initTable();

    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackk;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnadd;
    private javax.swing.JComboBox cmbxOrganization;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlOrganisation;
    private javax.swing.JLabel labelEmployeeList;
    private javax.swing.JTable tblCurrentEmployees;
    private javax.swing.JLabel txtCreateEmployee;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
