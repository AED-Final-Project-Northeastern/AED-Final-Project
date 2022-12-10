/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author vidyavathipuli
 */
public abstract class Organization {

    private String organizationName;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        SalesPerson("Sales Person Organisation"),SalesSupervisorOrganisation("Sales Supervisor Organisation"),
        DistributorAdmin("Distributor Admin"),FirstMileDriver("Heavy Driver"),LastMileDriver("Light Driver"), 
        CareTaker("CareTaker"), OrphanageAdmin("Orphanage Admin"),
        Customer("Customer"), CustomerAdmin("Customer Admin"),SupplierAdmin("Supplier Admin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.organizationName = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getOrganizationName() {
        return organizationName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setOrganizationName(String OrganizationName) {
        this.organizationName = OrganizationName;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return organizationName;
    }
    
    
}
