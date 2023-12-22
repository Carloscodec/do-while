import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		char resp = 's';
		
		do {
			System.out.print("Insert the temperature in Celsius:");
			double C = input.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Value in Fahrenheit: %.2f\n", F);
			System.out.print("Again?(y/n)? ");
			resp = input.next().charAt(0);
			
		} while (resp != 'n');
		
		input.close();
	}

}
