package javaAssignment1;

import java.util.Scanner;

public class SimpleAndCompund {

	public static void main(String[] args) {
		compound();
		simple();
	}

	public static void compound() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal: ");
		double principal = sc.nextDouble();

		System.out.print("Enter the rate: ");
		double rate = sc.nextDouble();

		System.out.print("Enter the time in years: ");
		double time = sc.nextDouble();

		System.out.print("Enter number of times interest is compounded: ");
		int number = sc.nextInt();

		double interest = principal * (Math.pow((1 + rate / 100), (time * number))) - principal;

		System.out.println("Principal: " + principal);
		System.out.println("Interest Rate: " + rate);
		System.out.println("Time Duration: " + time);
		System.out.println("Number of Time interest Compounded: " + number);
		System.out.println("Compound Interest: " + interest);

	}

	public static void simple() {
		double pr, rate, t, sim, com;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount:");
		pr = sc.nextDouble();
		System.out.println("Enter the No. of years:");
		t = sc.nextDouble();
		System.out.println("Enter the Rate of interest:");
		rate = sc.nextDouble();
		sim = (pr * t * rate) / 100;
		com = pr * Math.pow(1.0 + rate / 100.0, t) - pr;
		System.out.println("Simple Interest" + sim);
		System.out.println("Compound Interest" + com);
	}

}
