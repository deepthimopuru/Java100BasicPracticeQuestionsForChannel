package HundredQuestions;

import java.util.Scanner;

public class ToFindLargestOfThreeNumbersTakenAsInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your 1st number");
		int num1= scan.nextInt();
		System.out.println("enter your 2nd number");
		int num2=scan.nextInt();
		System.out.println("enter your 3rd number");
		int num3=scan.nextInt();
		
		if(num1>num2 & num1>num3) {
			System.out.println(num1+"is greater");
		}else if(num2>num1 & num2>num3) {
			System.out.println(num2+"is greater");
		}else {
			System.out.println(num3+"is greater");
		}
		
		

	}

}
