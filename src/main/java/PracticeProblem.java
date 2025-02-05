import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);

		String word;
		System.out.print("In: ");
		word = input.nextLine();
		System.out.println(word);
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		
		int num;
		int num2;

		System.out.print("In: ");
		num = input.nextInt();
		input.nextLine();
		System.out.print("In: ");
		num2 = input.nextInt();
		input.nextLine();

		System.out.println(num / num2);
		System.out.println(num % num2);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		
		String word;
		System.out.print("In: ");
		word = input.nextLine();
		System.out.println(word + " was the text you wrote");
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);

		int num;
		System.out.print("In: ");
		num = input.nextInt();
		input.nextLine();
		System.out.println(num * 5);
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);

		boolean bool;
		System.out.print("In: ");
		bool = input.nextBoolean();
		input.nextLine();
		System.out.println(bool + " is a boolean");
	}

	public static void q6() {
		Scanner input = new Scanner(System.in);

		double fractionalNum;
		System.out.print("In: ");
		fractionalNum = input.nextDouble();
		input.nextLine();
		System.out.println(fractionalNum - 3.2);
	}

}
