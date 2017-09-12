package package1;

import java.util.Scanner;

public class qbstat {
	
	private double PasserRating;
	private double PassingYards;
	private double TouchDowns;
	private double AtemptedPasses;
	private double Interceptions;
	private double CompletedPasses;
	
	public qbstat () {
			Scanner in = new Scanner(System.in);
			System.out.println("enter number of passing yards: ");
		PassingYards = in.nextDouble();
		System.out.println("enter number of touchdowns: ");
		TouchDowns = in.nextDouble();
		System.out.println("enter number of attempted passes: ");
		AtemptedPasses = in.nextDouble();
		System.out.println("enter number of interceptions: ");
		Interceptions = in.nextDouble();
		System.out.println("enter number of completed passes: ");
		CompletedPasses = in.nextDouble();
		in.close();
		
		PasserRating = (((8.4 * PassingYards)+(330*TouchDowns)+(100*CompletedPasses)-(200*Interceptions))/AtemptedPasses);
		/*if (PasserRating > 158.3) {
				return PasserRating = 158.3;
				
		} 
			I could not get the capping to work, kept returning an error 
			about my method being a void method and not being able 
			to return a double, yet I do not believe my method is 
			assigned void. */
		
		}
	public double GETVALUE() {
		return PasserRating;
	}
}
