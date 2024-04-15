package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the loan amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter the interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter the loan length in years: ");
        int loanLength = input.nextInt();

        double monthlyInterestRate = interestRate / 100 / 12;
        int numberOfPayments = loanLength * 12;
        double monthlyPayment = principal * monthlyInterestRate / (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));
        double totalInterest = (monthlyPayment * numberOfPayments) - principal;

        System.out.printf("The monthly payment is: $%.2f%n", monthlyPayment);
        System.out.printf("The total interest paid is: $%.2f%n", totalInterest);
    }
}