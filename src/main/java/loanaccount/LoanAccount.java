/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package loanaccount;

/**
 *
 * @author alexchristopher
 */
public class LoanAccount {
    static double annualInterestRate;
    private double principal; 
    public LoanAccount(double principal) {
        this.annualInterestRate = annualInterestRate;
        this.principal = principal;
    }   
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    public double calculateMonthlyPayment(int numberOfPayments) {
        double monthlyInterest = annualInterestRate / 12;
        return principal * ( monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -numberOfPayments)));
    }
}
