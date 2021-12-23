package javaAssignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Sixth_2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("john", "sam", "monica", "phobe", "chandler"));

		System.out.println(alphabets);

		alphabets.replaceAll(new MyOperator());

		System.out.println(alphabets);
	}
}

class MyOperator implements UnaryOperator<String> {
	@Override
	public String apply(String t) {
		return t.toUpperCase();
	}

}
