/**
	*Lesson: Input
	* Author: Leo
	* Date Created: February 17, 2025
	* Date Last Modified: February 17, 2025
	*/

import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		
		String word1;
		System.out.print("What is your name: ");
		word1 = input.nextLine();
		System.out.println(word1);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		
		Integer num1;
		System.out.print("Input a whole number: ");
		num1 = input.nextInt();
		input.nextLine();
		num1 = (num1 * 2 + 2);
		System.out.println(num1);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		
		Double num1;
		System.out.print("Input a radius: ");
		num1 = input.nextDouble();
		input.nextLine();
		System.out.println(num1 * 2 * 3.14);
		System.out.println(num1 * num1 * 3.14);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a first name: ");
		String word1 = input.nextLine();

		System.out.print("Input a last name: ");
		String word2 = input.nextLine();

		System.out.print("Input an age: ");
		String word3 = input.nextLine();

		System.out.println(word2 + ", " + word1 + " - " + word3);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a name: ");
		String name = input.nextLine();

		System.out.print("Input an age: ");
		Integer age = input.nextInt();

		Integer iq = age;
		System.out.print(name);
		System.out.println(age + 3);
		System.out.println(iq);
	}

}
