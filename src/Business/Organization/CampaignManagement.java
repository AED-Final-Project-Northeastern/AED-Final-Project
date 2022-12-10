/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EventManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sandeepbarla
 */
public class CampaignManagement extends Organization {

    public CampaignManagement(String name){
        super(name);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventManager());
        return roles;
    }
    @Override
    public Type getType() {
        return Organization.Type.AwarnessCampaign;
    } 
} 
