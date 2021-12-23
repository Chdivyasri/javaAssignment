package javaAssignment1;

import java.util.Scanner;

public class Subjectcondition {
	public static void main(String[] args) {
		int s1, s2, s3, totalmarks;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter subject1 marks");
		s1 = s.nextInt();
		System.out.println("Enter subject2 marks");
		s2 = s.nextInt();
		System.out.println("Enter subject3 marks");
		s3 = s.nextInt();
		totalmarks = s1 + s2 + s3;
		if ((s1 >= 60) && (s2 >= 60) && (s3 >= 60)) {
			System.out.println("passed");
		} else if (((s1 >= 60) && (s2 >= 60)) || ((s1 >= 60) && (s3 >= 60)) || ((s2 >= 60) && (s3 >= 60))) {
			System.out.println("promoted");
		} else {
			System.out.println("failed");
		}
	}

}
