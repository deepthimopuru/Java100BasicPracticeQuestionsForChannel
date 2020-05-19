//Printing number taking input from user
//need to use scanner class
//import scanner from java.util package

package HundredQuestions;

import java.util.Scanner;

public class PrintAnIntegerUsingScanner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your favourite number");
		int num = input.nextInt();
		System.out.println("your num is an integer" + " :" + num);

	}

}
