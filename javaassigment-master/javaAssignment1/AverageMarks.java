package javaAssignment1;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input student1 marks: ");
		int student1subject1 = sc.nextInt();
		int student1subject2 = sc.nextInt();
		int student1subject3 = sc.nextInt();

		System.out.print("Input student2 marks: ");
		int student2subject1 = sc.nextInt();
		int student2subject2 = sc.nextInt();
		int student2subject3 = sc.nextInt();

		System.out.print("Input student3 marks: ");
		int student3subject1 = sc.nextInt();
		int student3subject2 = sc.nextInt();
		int student3subject3 = sc.nextInt();

		int total1 = student1subject1 + student1subject2 + student1subject3;
		int total2 = student2subject1 + student2subject2 + student2subject3;
		int total3 = student3subject1 + student3subject2 + student3subject3;

		int averageofTotal = (total1 + total2 + total3) / 3;
		int avg1 = student1subject1 + student2subject1 + student3subject1;
		int avg2 = student1subject2 + student2subject2 + student3subject2;
		int avg3 = student1subject3 + student2subject3 + student3subject3;

		System.out.println("Total markes of student1 : " + total1);
		System.out.println("Total markes of student2 : " + total2);
		System.out.println("Total markes of student3 : " + total3);
		System.out.println("Average markes of student1 : " + avg1);
		System.out.println("Average markes of student2 : " + avg2);
		System.out.println("Average markes of student3 : " + avg3);
		System.out.println("Average markes of students : " + averageofTotal);
	}

}
