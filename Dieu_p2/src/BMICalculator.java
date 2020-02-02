import java.util.Scanner; // This imported file allows for the program to scan in data from the user's input

// This program must accomplish the following tasks
// 1. Prompt the user to input their body measurements
// 2. Scan in user input that is stored as body measurements, (e.g. weight and height)
// 3. Output the conclusion formed based on the given information to the user

public class BMICalculator {

	public static void main(String[] args) {
		
		
		double pounds, inches, kilograms, meters, BMI=0; // Declare Variables
		Scanner input = new Scanner(System.in);
		System.out.println("Choose option for inputs height and weight: \n 1. pounds and inches \n2. kilograms and meters");
		int option=input.nextInt();
		
		// Create a switch statement that allows for a variety of scenarios/cases
		switch(option)
		{	
			// For the case that the imperial system is being used
			case 1:System.out.println("Enter weight in pounds :");
			pounds=input.nextDouble();
			System.out.println("Enter height in inches :");
			inches=input.nextDouble();
			BMI= 703*pounds / (inches*inches);
			break;
			
			// In the case that the metric system is being used
			case 2:System.out.println("Enter weight in kilograms:");
			kilograms=input.nextDouble();
			System.out.println("Enter height in meters:");
			meters=input.nextDouble();
			BMI= kilograms / (meters*meters);
			break;
			
			// Just in case the user provides an invalid entry
			default:System.out.println("invalid choice");
			break;
		}
		
		// The conditions for the output may be established and created
		// The program can output the responses based on the scanned in information
		// A series of if statements can check whether or not the data corresponds to the appropriate conditions
		if(BMI<=18.5)
		System.out.println("BMI is less than 18.5 means: Underweight");
		
		else if(BMI<=24.9)
		System.out.println("BMI between 18.5 and 24.9 means: Healthy");
		
		else if(BMI<=29.9)
		System.out.println("BMI between 25 TO 29.9 means: Overweight");
		
		else
		System.out.println("BMI greater than or equal to 30.0 means: Obese");
		}

		

	}


