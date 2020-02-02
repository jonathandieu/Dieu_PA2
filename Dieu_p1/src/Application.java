// This portion of the program includes the main method, and it should be able to do the following:
// 1. Display a prompt to the user
// 2. Take a 4 digit input from the user
// 3. Use the Encrypter and Decrypter methods to output the encrypted/decrypted number.
public class Application { 
	public static void main(String[] args) {
		
		int n; //declare the n
		
		// Prompt the user, scan in ints and call methods to output the desired numbers
		
		System.out.println("Please enter a 4 digit number to encrypt/decrypt"); 
		
		System.out.println(" The encrypted number is: ", Encrypt(n));
		System.out.println(" The number after decryption is: ", Decrypt(n));
		
		
		
	}

}
