package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 454;
		int original = input;
		int remainder = 0, sum = 0;

		while (input > 0) {

			remainder = input % 10;
			sum = (sum * 10) + remainder;
			input = input / 10;
		}
		if (sum == original) {
			System.out.println("The Entered is polindrome  :" + sum);
		} else {
			System.out.println("The Entered  not polindrome");
		}
	}

}
