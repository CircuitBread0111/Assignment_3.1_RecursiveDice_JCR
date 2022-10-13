/**
 * 
 * @author Jerrin C. Redmon
 *
 */

//Imports
import java.util.Scanner;

public class RecDieRollerDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Recursive Die Roller \nEnter[1] for 10 trials: \nEnter[2] for 1000 trials: \n Enter:   ");
		int choice = input.nextInt();
		if (choice == 1) {
			RecDieRoller die = new RecDieRoller(10,2);
			die.roll();
		}
		else if (choice == 2){
			RecDieRoller die = new RecDieRoller(1000,2);
			die.roll();
		}
		input.close();
		
	}
}
