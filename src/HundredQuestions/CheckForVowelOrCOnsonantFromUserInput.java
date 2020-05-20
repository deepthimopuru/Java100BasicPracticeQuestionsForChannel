package HundredQuestions;

import java.util.Scanner;

public class CheckForVowelOrCOnsonantFromUserInput {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your Specail Alphabet");
		char ch= scan.next().charAt(0);
		if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("yes it is vowel");
			
		}else {
			System.out.println(ch+"::it is consonat");
		}
		//suing second method by using switch case
		
		System.out.println("enter one more Alphabet");
		char alphabet=scan.next().charAt(0);
		switch (alphabet) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		{
			System.out.println("The  second Alphabet you enetered is an vowel");
		}
			break;

		default:{
			System.out.println("The second Alphabet you Entered is an Consonat");
		}
			break;
		}
		
		


	}

}
