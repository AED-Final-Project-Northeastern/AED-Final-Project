/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author vidyavathipuli
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    
    
     public Organization createOrganization(Type type,String name){
        Organization organization = null;
        if (type.getValue().equals(Type.Medical.getValue())){
            organization = new Medical(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Diagnostics.getValue())){
            organization = new Diagnostics(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Services.getValue())){
            organization = new Services(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.OrganManagement.getValue())){
            organization = new OrganManagement(name);
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.AccountsAndPolicies.getValue())){
          organization = new AccountsAndCompliance(name);
          organizationList.add(organization);
        }else if(type.getValue().equals(Type.CampaignManagement.getValue())){
             organization = new CampaignManagement(name);
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.Physician.getValue())){
             organization = new Physician(name);
             organizationList.add(organization);
        }
        return organization;
    }
}
