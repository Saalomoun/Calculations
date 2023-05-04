package com.calculations;

public class Result {

	public static void main(String[] args) {

		System.out.println("Add Test Result");
		Addition add = new Addition();
		int addAns = add.add(25, 25);
		System.out.println(addAns);
		if (addAns == 50) {
			System.out.println("Bingo!");
		} else {
			System.out.println("Oops , Wrong Answer !!");
		}

		System.out.println("-----------------------------");

		System.out.println("Substract Test Result");
		Subtract subs = new Subtract();
		int subAns = subs.subtract(15, 10);
		System.out.println(subAns);
		if (subAns == 5) {
			System.out.println("Bingo !");
		} else {
			System.out.println("Oops , Wrong Answer !!");
		}

		System.out.println("-----------------------------");

		System.out.println("Multiplication Test Result");
		Multiplication multiply = new Multiplication();
		int multiplyAns = multiply.multiply(10, 10);
		System.out.println(multiplyAns);
		if (multiplyAns == 100) {
			System.out.println("Bingo !");
		} else {
			System.out.println("Oops , Wrong Answer !!");
		}

		System.out.println("-----------------------------");
		System.out.println("Division Test Result");
		Division divide = new Division();
		int divideAns = divide.divide(25, 5);
		System.out.println(divideAns);

		if (divideAns == 5) {
			System.out.println("Bingo !");
		} else {
			System.out.println("Oops , Wrong Answer !!");
		}

		System.out.println("-----------------------------");

	}
}
