package HundredQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;

		System.out.println("Before swapping value of a is:"+a);
		System.out.println("Before sapping value of b is:"+b);
		
		System.out.println("*************************************");
		
		// Fist way By Using 3rd variable

		int temp;

		temp = a; // here temp is 20;
		a = b; // here a is 10;
		b = temp; // here b is 20

		System.out.println("After swapping value of a is:"+a);
		System.out.println("After swapping value of B is:"+b);
		
		//Second way with out 3rd variable
		System.out.println("#####################################");
		
		int q=100;
		int w=200;
		System.out.println("Before swapping value of q is:"+q);
		System.out.println("Before sapping value of w is:"+w);
		
		System.out.println("*************************************");
	    q=w+q;//here q is 300;
		w=q-w;//here w is 100;
		q=q-w;//here q is 200;
		System.out.println("After swapping value of q is:"+q);
		System.out.println("After swapping value of w is:"+w);
		
		
		
		
	

	}

}
