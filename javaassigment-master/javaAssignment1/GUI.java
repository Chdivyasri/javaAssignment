package javaAssignment1;

import java.util.Scanner;

public class GUI {
	static String username = "admin";
	static String password = "admin";
	static String userenteredusername;
	static String userenteredpassword;

	public static void main(String[] args) {

		login();
	}

	public static void askCredentials() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		userenteredusername = sc.nextLine();

		System.out.println("enter Password");
		userenteredpassword = sc.nextLine();
	}

	public static void login() {
		int count = 0;
		askCredentials();

		if (username.equals(userenteredusername) && password.equals(userenteredpassword)) {

			System.out.println("Welcome  " + userenteredusername);
		} else {

			while (count <= 3) {
				count++;
				System.out.println(count);
				if (count == 3) {
					System.out.println("Contact admin");
					break;
				} else {
					System.out.println("you have entered worng credentails");
					askCredentials();
				}
			}
		}
	}
}
