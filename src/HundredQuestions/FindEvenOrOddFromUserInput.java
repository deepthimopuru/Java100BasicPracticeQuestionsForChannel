//Here We are using while condition to check only positive numbers
// by using if else condition we can check the odd or even numbers
//Break is must other wise infinite loop will be running 
package HundredQuestions;

import java.util.Scanner;

public class FindEvenOrOddFromUserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number to find out Even or Odd");
		int num= scan.nextInt();
		System.out.println("Your number is:: "+num);
		while(num>0) {
			if(num%2==0) {
				System.out.println("Your Number"+num+"::is even");
			}else if(num%2==1) {
				System.out.println("Your Number"+num+"::is Odd");
			}else {
				System.out.println("Your Number"+num+"::is not a Valid Number");
			}
			break;
		}

	}

}
