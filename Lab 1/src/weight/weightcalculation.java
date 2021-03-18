package weight;
import java.util.Scanner;

public class weightcalculation {
	public static void main(String[] args ) {

		Scanner input = new Scanner(System.in);

		System.out.print("How many kilogram (kg) do you weight? (example:50.0 ): ") ;

		double weight = input.nextDouble();

		// compute weights on other planets

	
		double earth = (weight * 1);
		double mars = (weight * .38);
		
		// display results

		System.out.print("You weigh " + earth + " kg on Earth \n");
		System.out.print("You weigh " + mars + " kg on Mars \n");


		} // end of main method

		} // end of class planetWeight


