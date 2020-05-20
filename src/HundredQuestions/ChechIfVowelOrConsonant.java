// the vowels are== a,e,i,o,u;
package HundredQuestions;

public class ChechIfVowelOrConsonant {

	public static void main(String[] args) {
		// First method using if else

		char ch = 'w';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("the character " + ch + ":::is an vowel");

		} else {
			System.out.println("the character " + ch + ":::is an consonant");
		}
		// second method using switch case method
		
		char cha='e';

		switch (cha) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': {
			System.out.println("the character " + ch + ":::is an vowel");
		}

			break;

		default: {
			System.out.println("the character " + ch + ":::is an consonant");

		}
			break;
		}

	}

}
