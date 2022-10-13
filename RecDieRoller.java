/**
 * 
 * @author Jerrin C. Redmon
 *
 */

//Imports
import java.util.Random;

public class RecDieRoller {

	int trials;
	int target;
	int rolls = 0;
	
	/**
	 * 
	 * @param trials number of trials to run
	 * @param target number which the die needs to land before trial ends
	 */
	public RecDieRoller(int InputTrials, int InputTarget) {//Constructor
		trials = InputTrials;
		target = InputTarget;
		
	}
	
	public void roll() {
		double mean = 0;
		double trialNum = 1;
		for (int i = 0; i < trials; i++) {
			System.out.println("\nTrial:"+trialNum);
			roller();
			mean = (double) rolls/trials;
			trialNum += 1;
		}
		
		System.out.println("\nMean Number of Rolls: "+mean);
	}
	
	/**
	 * 
	 * @return the number of rolls before die lands on target
	 */
	public double roller() {
		Random die = new Random();
		int toss = die.nextInt(6)+1;
		rolls +=1;
		System.out.print(" "+toss+" ");
		if (toss != target) return roller();
		else return rolls;
	}
}
