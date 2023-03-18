import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int first = 10;
		int second = 20;

		System.out.printf("Enter an integer: \n");
		first = scanner.nextInt();

		System.out.printf("Enter another integer: \n");
		second = scanner.nextInt();

		scanner.close();

		int sum = first + second;
		System.out.println("The sum of " + first + " + " + second + " is " + sum);
	}
}