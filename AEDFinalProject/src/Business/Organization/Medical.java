/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Doctor;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shivanigole
 */
public class Medical extends Organization{
    
    public Medical(String name){
        super(name);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Doctor());
        return roles;
    }
    @Override
    public Type getType() {
        return Organization.Type.Medical;
    } 
} 