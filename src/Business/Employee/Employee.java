/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author vidyavathipuli
 */
public class Employee {
      private String employeeName;
    private int empId;
    public Employee(int count) {
        empId = count;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return employeeName;
    }
}
