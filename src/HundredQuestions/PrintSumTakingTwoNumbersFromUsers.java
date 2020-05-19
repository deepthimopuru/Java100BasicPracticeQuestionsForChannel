package HundredQuestions;

import java.util.Scanner;

public class PrintSumTakingTwoNumbersFromUsers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your First Favourite number::");

		int num1 = scan.nextInt();

		System.out.println("Enter your Second Favourite Number::");

		int num2 = scan.nextInt();
//		
//		//or you can do like this also 
//		int sum = num1+num2;
//		System.out.println("The Sum Of your Favorite Number is"+"::"+sum);
//		

		System.out.println("The Sum Of your Favourite Number's is" + "::" + (num1 + num2));

	}

}
