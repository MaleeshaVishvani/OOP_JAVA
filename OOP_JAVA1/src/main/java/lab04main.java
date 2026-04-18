/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pentiumcity
 */
public class lab04main {
    public static void main(String[] args) {
        StaffMember.showSystemName();
        Lecturer lec1 = new Lecturer("Dr. Perera", "LEC-001", "Computing", 4, 15000.0);
        Lecturer lec2 = new Lecturer("Ms. Fernando", "LEC-002", "Mathematics", 3, 12000.0);
        LabAssistant la1 = new LabAssistant("Kasun Silva", "LA-001", "Computing", 80, 500.0);
        
        System.out.println("Total staff created: " + StaffMember.getStaffCount());

    }  

    }

