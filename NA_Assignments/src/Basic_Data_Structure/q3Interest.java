package Basic_Data_Structure;

import java.util.Scanner;

public class q3Interest {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input principal amount, interest rate, and time period
	        System.out.print("Enter the principal amount: ");
	        double principal = scanner.nextDouble();

	        System.out.print("Enter the interest rate (in percentage): ");
	        double rate = scanner.nextDouble() / 100.0;

	        System.out.print("Enter the time period (in years): ");
	        double time = scanner.nextDouble();

	        scanner.close();

	        // Calculate and display simple interest
	        double simpleInterest = calculateSimpleInterest(principal, rate, time);
	        System.out.println("Simple Interest: " + simpleInterest);

	        // Calculate and display compound interest
	        double compoundInterest = calculateCompoundInterest(principal, rate, time);
	        System.out.println("Compound Interest: " + compoundInterest);
	    }

	    // Calculate Simple Interest
	    public static double calculateSimpleInterest(double principal, double rate, double time) {
	        return principal * rate * time;
	    }

	    // Calculate Compound Interest
	    public static double calculateCompoundInterest(double principal, double rate, double time) {
	        double amount = principal * Math.pow((1 + rate), time);
	        return amount - principal;
	    }
	}


