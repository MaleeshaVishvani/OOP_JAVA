/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pentiumcity
 */
public final class UniversityPolicy {
    public static final String UNIVERSITY_NAME = "University Of Kelaniya";
    public static final double BONUS_RATE = 0.10;

    public static void showPolicyHeader() {
        System.out.println("=== University Payment Policy ===");
        System.out.println("University : " + UNIVERSITY_NAME);
        System.out.println("Bonus Rate : " + (BONUS_RATE * 100) + "%");
        System.out.println("=================================");
    }

    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }
}
