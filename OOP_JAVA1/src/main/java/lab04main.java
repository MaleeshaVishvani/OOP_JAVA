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
        Lecturer lec1 = new Lecturer("Dr. Perera", "LEC-001", "Computing", 4, 15000.0);
        lec1.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec1.calculateMonthlyPayment());
    }
}
