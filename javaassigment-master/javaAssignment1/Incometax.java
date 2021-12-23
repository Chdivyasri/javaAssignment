package javaAssignment1;

import java.util.Scanner;

public class Incometax {

	public static void main(String args[]) {

		float r, employeeIncome;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter income");
		employeeIncome = sc.nextFloat();

		if (employeeIncome > 500000) {
			r = employeeIncome * (0.3f);
		} else if (employeeIncome > 300000) {
			r = employeeIncome * (0.2f);

		} else if (employeeIncome > 180000) {
			r = employeeIncome * (0.1f);
		} else {
			r = employeeIncome;
		}
		System.out.println(r);
	}
}
