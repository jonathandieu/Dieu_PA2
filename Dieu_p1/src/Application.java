import java.util.Scanner; // This imported file allows for the program to scan in data from the user's input


// This portion of the program includes the main method, and it should be able to do the following:
// 1. Display a prompt to the user
// 2. Take a 4 digit input from the user
// 3. Use the Encrypter and Decrypter methods to output the encrypted/decrypted number.


	



public class Application { 
	public static void main(String[] args) {
		
		// get and/or set the methods to make them able to be called in this function
		// e.g. public Encrypter = new encrypt();
		// e.g. public decrypter = new decrypt();

		int n; //declare the n
		
		// Prompt the user, scan in ints and call methods to output the desired numbers
		
		System.out.println("Please enter a 4 digit number to encrypt/decrypt"); 
		Scanner input = new Scanner(System.in); // scan in data
		System.out.println(" The encrypted number is: "); // make it return output of encrypt method
		System.out.println(" The number after decryption is: "); // make it return output of decrypt method
		
		
		
	}

}
