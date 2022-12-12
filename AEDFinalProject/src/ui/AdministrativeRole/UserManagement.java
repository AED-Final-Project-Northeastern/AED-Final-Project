/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhavana
 */
public class UserManagement extends javax.swing.JPanel {

    /**
     * Creates new form UserManagement
     */
    private JPanel Container;
    private Enterprise Enterprise;
    private String filePath;
    private UserAccountDirectory userAccountDirectory;
    ArrayList <String> nameArrayList = new ArrayList<String>();
    HashMap <String,String> name_id = new HashMap<String, String>();
        public UserManagement(JPanel container, Enterprise enterprise) {
        initComponents();
        this.Enterprise = enterprise;
        this.Container = container;

        
        popname_id();
        popOrganizationComboBox();
      
        popData();
          popuser();
      
    }
    public void popname_id(){
        
        for(Organization o:Enterprise.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount u:o.getUserAccountDirectory().getUserAccountList()){
            System.out.println("Actual users"+u.toString());
            name_id.put(u.getEmployee().toString(),u.toString());}
        }
    }
    public void popuser(){
        for(UserAccount u:Enterprise.getUserAccountDirectory().getUserAccountList()){
            nameArrayList.add(u.toString());
        }
    }

    public void popOrganizationComboBox() {
        comboOrganisation.removeAllItems();
       

        for (Organization organization : Enterprise.getOrganizationDirectory().getOrganizationList()) {
            comboOrganisation.addItem(organization);
        }
    }
    

    
    public void initEmployeeComboBox(Organization organization){
        comboEmployee.removeAllItems();
        
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            comboEmployee.addItem(employee);
        }
    }
    
    private void initRoleComboBox(Organization organization){
        comboRole.removeAllItems();
       
        for (Role role : organization.getSupportedRole()){
            comboRole.addItem(role);
        }
    }
    
   

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) tableCurruntAccount.getModel();

        model.setRowCount(0);

        for (Organization organization : Enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tableCurruntAccount.getModel()).addRow(row);
                nameArrayList.add(ua.toString());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        btncreate = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jlUserName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCurruntAccount = new javax.swing.JTable();
        jlPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jlEmployee = new javax.swing.JLabel();
        comboEmployee = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        jlOrganisation = new javax.swing.JLabel();
        comboOrganisation = new javax.swing.JComboBox();
        jlRole = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox();
        jlAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jlQulifications = new javax.swing.JLabel();
        txtQualifications = new javax.swing.JTextField();
        jlContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jlAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jlsex = new javax.swing.JLabel();
        radioBtnMale = new javax.swing.JRadioButton();
        radioBtnFemale = new javax.swing.JRadioButton();
        jlCreateUserAccount = new javax.swing.JLabel();
        jlAccountDetails = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        btncreate.setBackground(new java.awt.Color(204, 204, 204));
        btncreate.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jlUserName.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jlUserName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlUserName.setText("User Name*:");

        tableCurruntAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableCurruntAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableCurruntAccount.setForeground(new java.awt.Color(255, 0, 51));
        tableCurruntAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCurruntAccount);
        if (tableCurruntAccount.getColumnModel().getColumnCount() > 0) {
            tableCurruntAccount.getColumnModel().getColumn(0).setResizable(false);
            tableCurruntAccount.getColumnModel().getColumn(1).setResizable(false);
        }

        jlPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jlPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlPassword.setText("Password*:");

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jlEmployee.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jlEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlEmployee.setText("Employee:");

        comboEmployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmployeeActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jlOrganisation.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jlOrganisation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlOrganisation.setText("Organization:");

        comboOrganisation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboOrganisation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboOrganisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrganisationActionPerformed(evt);
            }
        });

        jlRole.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jlRole.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlRole.setText("Role:");

        comboRole.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRoleActionPerformed(evt);
            }
        });

        jlAddress.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jlAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlAddress.setText("Address*:");

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jlQulifications.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jlQulifications.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlQulifications.setText("Qualifications*:");

        txtQualifications.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jlContact.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jlContact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlContact.setText("Contact*:");

        txtContact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jlAge.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jlAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlAge.setText("Age*:");

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jlsex.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jlsex.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlsex.setText("Sex*:");

        radioBtnMale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioBtnMale);
        radioBtnMale.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        radioBtnMale.setText("M");

        radioBtnFemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioBtnFemale);
        radioBtnFemale.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        radioBtnFemale.setText("F");

        jlCreateUserAccount.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jlCreateUserAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCreateUserAccount.setText("CREATE USER ACCOUNT");

        jlAccountDetails.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jlAccountDetails.setText("Account details : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlAccountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlRole, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jlPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jlContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlOrganisation, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboOrganisation, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(comboEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlQulifications, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlAge, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlsex, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(radioBtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radioBtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jlCreateUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCreateUserAccount)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jlAccountDetails)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboOrganisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlOrganisation))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlRole))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlUserName))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlPassword))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlContact)
                                    .addComponent(jlsex)
                                    .addComponent(radioBtnMale)
                                    .addComponent(radioBtnFemale))
                                .addGap(18, 18, 18)
                                .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEmployee)
                                    .addComponent(comboEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlAddress)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlQulifications)
                                    .addComponent(txtQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlAge))
                                .addGap(92, 92, 92)))
                        .addGap(20, 20, 20)))
                .addGap(425, 425, 425))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboEmployee, comboOrganisation, comboRole, jlAddress, jlAge, jlContact, jlEmployee, jlOrganisation, jlPassword, jlQulifications, jlRole, jlUserName, jlsex, radioBtnFemale, radioBtnMale, txtAddress, txtAge, txtContact, txtPassword, txtQualifications, txtUserName});

    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String phNum = txtContact.getText();
        String address = txtAddress.getText();
        String qualification = txtQualifications.getText();
         boolean nameMatch=true,userNameMatch=true,passMatch=true,qualificationMatch=true;
        String sex;
        int f=0;
        int newage=0;
        boolean availability=true;
        boolean organavail = true;
        String age = txtAge.getText();
        if(radioBtnMale.isSelected()){
            sex = radioBtnMale.getText();
        } 
        else {
            sex = radioBtnFemale.getText();
        }
        
        if(address.equals("")){
            JOptionPane.showMessageDialog(null, "Address can't be empty");
            return;
        }
        boolean flag;
        flag = userName.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "UserName must be in format of A@B.C");
            userNameMatch=false;
            return;}
         else {
              for(String s:nameArrayList){
               if(s.equalsIgnoreCase(userName)){
                 JOptionPane.showMessageDialog(null, "Username exists please take another username");
                 userNameMatch=false;
                 return;
                }
            }
            
        }
          
       
        flag =password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Password should contain at least  a Character, One Captial,Small letter with minimum 8 characters length");
           passMatch = false;  
           
           return;}
         if(phNum == null || phNum.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter Contact Number");
                return;
            }
             else{
                 if(!phNum.matches("^(?=.*[0-9]).{10,10}")){
                     JOptionPane.showMessageDialog(null, "Please enter valid Contact Number");
                     return;
                 }
             }

        if(qualification.matches("^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$")){
            f=1;
        }
        else{
            qualificationMatch=false;
            return;
        }
        if(age.matches("[0-9]+")){
            newage = Integer.parseInt(age);
            if(newage<0 || newage>200){
                JOptionPane.showMessageDialog(null, "Age should be between 1 and 199");
            }
            f=1;
        }
        else{
            return;
        }
        
        if(f==0){
           JOptionPane.showMessageDialog(null, "Please fill all the details");
        }
        else{
            for(String s:name_id.keySet()){
                System.out.println("In keyset"+s);
                if(name_id.containsKey(comboEmployee.getSelectedItem().toString())){
                    JOptionPane.showMessageDialog(null, "User already has an account");
                    return;
                }
            }
        Organization organization = (Organization) comboOrganisation.getSelectedItem();
        Employee employee = (Employee) comboEmployee.getSelectedItem();
        Role role = (Role) comboRole.getSelectedItem();
       
        organization.getUserAccountDirectory().createUserAccount(userName,password,phNum,address,qualification, sex, availability, newage, employee, role,organavail);
        popname_id();
        popData();
        txtUserName.setText("");
        txtPassword.setText("");
        txtContact.setText("");
        txtAddress.setText("");
        txtQualifications.setText("");
        txtAge.setText("");
//        btnRadioMale.setSelected(false);
//        btnRadioFemale.setSelected(false);
        }
    }//GEN-LAST:event_btncreateActionPerformed

    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Container.remove(this);
        CardLayout layout = (CardLayout) Container.getLayout();
        layout.previous(Container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboOrganisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrganisationActionPerformed
        Organization organization = (Organization) comboOrganisation.getSelectedItem();
        if (organization != null){
            initEmployeeComboBox(organization);
            initRoleComboBox(organization);
        }
        

    }//GEN-LAST:event_comboOrganisationActionPerformed

    private void comboRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRoleActionPerformed
        // TODO add your handling code here:
        txtAge.setVisible(true);
        jlAge.setVisible(true);
        radioBtnFemale.setVisible(true);
        radioBtnMale.setVisible(true);
        jlsex.setVisible(true);

        
    }//GEN-LAST:event_comboRoleActionPerformed

    private void comboEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEmployeeActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btncreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboEmployee;
    private javax.swing.JComboBox comboOrganisation;
    private javax.swing.JComboBox comboRole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlAccountDetails;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlAge;
    private javax.swing.JLabel jlContact;
    private javax.swing.JLabel jlCreateUserAccount;
    private javax.swing.JLabel jlEmployee;
    private javax.swing.JLabel jlOrganisation;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlQulifications;
    private javax.swing.JLabel jlRole;
    private javax.swing.JLabel jlUserName;
    private javax.swing.JLabel jlsex;
    private javax.swing.JRadioButton radioBtnFemale;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JTable tableCurruntAccount;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtQualifications;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}