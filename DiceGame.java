/*
      Name:           Mandeep Singh
	  Student Number: A00214509
	  Couse:          App Development for Android JAV1001 - 11329 
*/
// Add random package
import java.util.Random; 

public class DiceGame
{
	public static void main(String[] args)
	{
		//Creating different size die object using different constructor
		Die die = new Die();
		Die die2 = new Die(20);
		Die die3 = new Die("D10",10);
		//To Show upside value before using Roll method 
		System.out.println("creating a default " + die.type);
		System.out.println("creating a " + die2.type);
		System.out.println("Creating percentile die (a special " + die3.type+")");
		System.out.println("The current side up for d6 is " + die.upside);				
		System.out.println("The current side up for d20 is " + die2.upside);				
		System.out.println("The current side up for Percentile is " + die3.upside);
		System.out.println();
		System.out.println("Testing the roll method");
		System.out.println();
		
		//To show upside value After using Roll method
		System.out.println("Rolling the d6.");
		System.out.println("The new value is " + die.Roll());
		System.out.println("Rolling the d20.. ");
		System.out.println("The new value is " + die2.Roll());						
		System.out.println("Rolling the Percentile");						
		System.out.println("The new value is " + die3.Roll());
		System.out.println();
		//Set upsinde value of d20 at 20
		die2.upside = 20;
		System.out.println("Setting the d20 to show 20");
		System.out.println("The upside is now " + die2.upside);
		System.out.println();
		
		
		int roll = 1;
		//Creating % Six-sided dice
		System.out.println("Creating 5 d6...");
		Die die4 = new Die();
		Die die5 = new Die();
		Die die6 = new Die();
		Die die7 = new Die();
		Die die8 = new Die();
		//Using loop to roll dice untill all dice have same up side.
		for(int i=0; i< roll; i++)
		{
			int dice1 = die4.Roll();
			int dice2 = die5.Roll();
			int dice3 = die6.Roll();
			int dice4 = die7.Roll();
			int dice5 = die8.Roll();
			//Using if else statement to check that all dice have same upside or not and display the number of roll
			if(dice1 == dice2 && dice1 == dice3 && dice1 == dice4 && dice1 == dice5)
			{
				System.out.println("It took "+ roll + " rolls to have same upside.");
			}
			else
			{
				roll = roll + 1;
			}
		}	
	}
}