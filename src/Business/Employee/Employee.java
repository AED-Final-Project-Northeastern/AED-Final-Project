/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author vidyavathipuli
 */
public class Employee {
    
    private String EmpName;
    private int EmpId;
    private static int count = 1;
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String number) {
        this.cardNumber = number;
    }
    
    public Employee(String Name, String number){
        this.EmpName = EmpName;
        this.cardNumber = number;
    }

    public Employee() {
        EmpId = count;
        count++;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    
    public String getEmpName() {
        return EmpName;
    }

    @Override
    public String toString() {
        return EmpName;
    }
    
    
}
