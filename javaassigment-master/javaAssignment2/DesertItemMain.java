package javaAssignment2;

import java.util.Scanner;

abstract class DessertItem {
	abstract int getCost(int items);

	public static DessertItem getInstance() {
		return null;
	}
}

class Candy extends DessertItem {
	public int getCost(int items) {

		return items * 60;
	}

}

class Coockie extends DessertItem {
	public int getCost(int items) {
		return items * 70;

	}
}

class IceCream extends DessertItem {
	public int getCost(int items) {
		return items * 1;

	}

}

public class DesertItemMain {

	public static void main(String[] args) {

		Candy cnd = new Candy();
		Coockie ck = new Coockie();
		IceCream ic = new IceCream();

		System.out.println("Press 1 if you are Owner \n Press 2 if you are Customer");
		Scanner sc = new Scanner(System.in);

		int type = sc.nextInt();

		if (type == 1) {

			System.out.println("\nHow many do you want to add to storage");
			int noofOwnerOrder = sc.nextInt();
			System.out.println("\nokay we will keep " + noofOwnerOrder + " items in storage ");
		} else if (type == 2) {
			System.out.println("\nPlace your order");
			int noofCustOrder = sc.nextInt();
			System.out.println("\nThankyou for ordering" + noofCustOrder + " items");
			System.out.println("Dessert Items \nCandy :" + cnd.getCost(noofCustOrder) + "\nCoockie: "
					+ ck.getCost(noofCustOrder) + "\nIcecream:" + ic.getCost(noofCustOrder));
		}
	}

}
