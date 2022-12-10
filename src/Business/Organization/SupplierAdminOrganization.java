/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;


import Business.Role.Role;
import Business.Role.SupplierAdminRole;
import java.util.ArrayList;

/**
 *
 * @author vidyavathipuli
 */
public class SupplierAdminOrganization extends Organization{
    public SupplierAdminOrganization() {
        super(Organization.Type.SupplierAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierAdminRole());
        return roles;
    }
}
