// leap year :for all century years is divisible by 4
// century years: is leap year which is perfectly divisible by 400
// 1900 is not leap year
// 2012 is leap year because its divisible by 4

package HundredQuestions;

import java.util.Scanner;

public class HowToCheckLeapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("eneter your year");

		int year = scan.nextInt();

		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;

				} else {
					leap = false;
				}

			} else {
				leap = true;
			}

		} else {
			leap = false;
		}
		if (leap) {
			System.out.println("The year" + year + "is a leap year which has 366 days");
		} else {
			System.out.println("The year" + year + "is not a leap year and has only 365 days");
		}

	}

}
