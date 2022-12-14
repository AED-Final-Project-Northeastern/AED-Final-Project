/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vidyavathipuli
 */
public class Physician extends Organization{
    
    public Physician(String name){
        super(name);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Business.Role.PhysicianRole());
        return roles;
    }
    @Override
    public Type getType() {
        return Organization.Type.Physician;
    } 
    
    
}
