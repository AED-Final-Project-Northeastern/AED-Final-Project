/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.DonorDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author shiva
 */
public abstract class Role {
    public enum RoleType{
       Sysadmin("Syadmin") ,
       Admin("Admin"),
       Doctor("Doctor"),
       LabAssistant("Lab Assistant"),
       ProcurementTeamHead("Procurement Team Head"),
       PublicHealthOfficer("Public Health Officer"),
       EventManager("Event Manager"),
       Donor("Donor"),
       OrganBankManager("Organ Bank Manager"),
       Physician("Physician");
        private String value;

        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network,
            DonorDirectory donorDirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
