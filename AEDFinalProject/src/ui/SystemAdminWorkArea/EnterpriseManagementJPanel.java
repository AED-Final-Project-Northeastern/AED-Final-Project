/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vidyavathipuli
 */
public class EnterpriseManagementJPanel extends javax.swing.JPanel {

    private JPanel processContainerUser;
    private EcoSystem System;
    ArrayList<String> arrayListEnterpriseNetwork = new ArrayList<String>();

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public EnterpriseManagementJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.processContainerUser = userProcessContainer;
        this.System = system;
        initEntTable();
        initComboBox();
        loadtable();
    }

    private void initEntTable() {
        DefaultTableModel entTable = (DefaultTableModel) tableCities.getModel();
        entTable.setRowCount(0);
        for (Network network : System.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getOrganizationName();
                row[1] = network.getNetworkName();
                row[2] = enterprise.getEnterpriseType().getValue();
                entTable.addRow(row);
            }
        }
    }

    private boolean checkEnterprise(Enterprise.EnterpriseType type) {
        ArrayList<Enterprise.EnterpriseType> estEnterprises = new ArrayList<Enterprise.EnterpriseType>();
        for (Network network : System.getNetworkList()) {
            if (network == comboNetwork.getSelectedItem()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    estEnterprises.add(enterprise.getEnterpriseType());

                }

            }
        }
        if (estEnterprises.contains(type)&&(type.getValue().equalsIgnoreCase("government")||type.getValue().equalsIgnoreCase("organ bank"))) {
            JOptionPane.showMessageDialog(null, "Only one enterprise allowed for the selected option");
            return true;
        }

        return false;
    }

    private void initComboBox() {
        comboNetwork.removeAllItems();
        comboEnterprise.removeAllItems();
        comboNetwork.addItem("--Select--");
        comboEnterprise.addItem("--Select--");
        comboCities.addItem("-All Enterprises-");
        for (Network network : System.getNetworkList()) {
            comboNetwork.addItem(network);
            comboCities.addItem(network.toString());
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            comboEnterprise.addItem(type);
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
        tableCities = new javax.swing.JTable();
        jlNetwork = new javax.swing.JLabel();
        comboNetwork = new javax.swing.JComboBox();
        jlEName = new javax.swing.JLabel();
        txtEnterpiseName = new javax.swing.JTextField();
        jlType = new javax.swing.JLabel();
        comboEnterprise = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jlEnterprises = new javax.swing.JLabel();
        jlCurrentCities = new javax.swing.JLabel();
        jlAddEnterprise = new javax.swing.JLabel();
        comboCities = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 204, 204));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        tableCities.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableCities.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCities);

        jlNetwork.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlNetwork.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlNetwork.setText("Network:");

        comboNetwork.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNetworkActionPerformed(evt);
            }
        });

        jlEName.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlEName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlEName.setText("Enterprise Name:");

        txtEnterpiseName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jlType.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlType.setText("Type of Enterprise:");

        comboEnterprise.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEnterpriseActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jlEnterprises.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jlEnterprises.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEnterprises.setText("ENTERPRISES");

        jlCurrentCities.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlCurrentCities.setText("Current cities :");

        jlAddEnterprise.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jlAddEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlAddEnterprise.setText("Add Enterprise");

        comboCities.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        comboCities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCitiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlCurrentCities, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCities, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlAddEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jlType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlEName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlNetwork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jlEnterprises, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboEnterprise, 0, 216, Short.MAX_VALUE)
                            .addComponent(comboNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEnterpiseName)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEnterprises, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCurrentCities)
                    .addComponent(comboCities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jlAddEnterprise)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNetwork)
                            .addComponent(comboNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlType)
                            .addComponent(comboEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEName)
                            .addComponent(txtEnterpiseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(330, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        int counter = 0;
        String name = txtEnterpiseName.getText();
        String city = comboNetwork.getSelectedItem().toString();
        if (name.matches("^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$")) {
            name = name.trim();
            for (String s : arrayListEnterpriseNetwork) {
                if (s.equalsIgnoreCase(name + city)) {
                    JOptionPane.showMessageDialog(null, "The Enterprise already exists in this city");
                    counter++;
                    break;
                }
            }
            if (counter == 0) {
                arrayListEnterpriseNetwork.add(name + city);
                Network network = (Network) comboNetwork.getSelectedItem();
                Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) comboEnterprise.getSelectedItem();

                if (network == null || type == null) {
                    JOptionPane.showMessageDialog(null, "Invalid Input!");
                    return;
                }
                
                if (checkEnterprise(type)) {
                    return;

                } else {
                    Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
                    
                    initEntTable();
                    txtEnterpiseName.setText("");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Enterprise can only contain alphabets");
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        processContainerUser.remove(this);
        Component[] componentArray = processContainerUser.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) processContainerUser.getLayout();
        layout.previous(processContainerUser);
    }//GEN-LAST:event_btnBackActionPerformed


    private void comboEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEnterpriseActionPerformed

    private void comboNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNetworkActionPerformed

    public void loadtable(){
        DefaultTableModel model = (DefaultTableModel) tableCities.getModel();
        model.setRowCount(0);
        for (Network network : System.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getOrganizationName();
                    row[1] = network.getNetworkName();
                    row[2] = enterprise.getEnterpriseType().getValue();
                    model.addRow(row);
                }
            
        }
    }
    
    private void comboCitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCitiesActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableCities.getModel();
        model.setRowCount(0);
        for (Network network : System.getNetworkList()) {
            if (network.getNetworkName() == comboCities.getSelectedItem()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getOrganizationName();
                    row[1] = network.getNetworkName();
                    row[2] = enterprise.getEnterpriseType().getValue();
                    model.addRow(row);
                }
            }else if(comboCities.getSelectedIndex()==0){
                loadtable();
            }
        }
    }//GEN-LAST:event_comboCitiesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> comboCities;
    private javax.swing.JComboBox comboEnterprise;
    private javax.swing.JComboBox comboNetwork;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlAddEnterprise;
    private javax.swing.JLabel jlCurrentCities;
    private javax.swing.JLabel jlEName;
    private javax.swing.JLabel jlEnterprises;
    private javax.swing.JLabel jlNetwork;
    private javax.swing.JLabel jlType;
    private javax.swing.JTable tableCities;
    private javax.swing.JTextField txtEnterpiseName;
    // End of variables declaration//GEN-END:variables
}
