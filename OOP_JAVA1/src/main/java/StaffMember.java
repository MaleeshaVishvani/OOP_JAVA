/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pentiumcity
 */
public abstract class StaffMember {
    private String fullName;
    private final String staffId;
    protected String department;

    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public String getStaffId() {
        return staffId;
    }
     public String getDepartment() {
        return department;
    }

    public final void displayBasicDetails() {
        System.out.println("Name       : " + fullName);
        System.out.println("Staff ID   : " + staffId);
        System.out.println("Department : " + department);
    }

    public abstract double calculateMonthlyPayment();
    /**StaffMember is abstract because it defines a common structure for all staff types,
     but monthly payment calculation differs per staff type — so no direct objects should be created**/
}
