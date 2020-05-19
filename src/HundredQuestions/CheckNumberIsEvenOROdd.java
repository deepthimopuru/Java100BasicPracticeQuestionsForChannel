package HundredQuestions;

public class CheckNumberIsEvenOROdd {

	public static void main(String[] args) {
		int num = 20;
		while (num > 0) {
			if (num % 2 == 0) {
				System.out.println("The number is Even");
			} else if (num % 2 == 1) {
				System.out.println("The NUmber is ODD");

			} else {
				System.out.println("the number is not valid");
			}
			break;
		}

	}

}
