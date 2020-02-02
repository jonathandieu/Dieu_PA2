// This portion of the program should include the Decrypt method and should be able to accomplish the following:
// 1. Take 4 integer values 
// 2. Convert each integer value into the proper representation of a 4 digit number
// 3. Encrypt the inputs into a form where the numbers have fulfilled the requirements for the classification of "encrypted"

public class Encrypter {
	public static int Encrypt(int n) {
		int a = n / 1000; // This is like the thousands place of the whole number
		int b = (n % 1000) / 100; // This is like the hundreds place of the whole number
		int c = (n % 100) / 10; // This is like the tens place of the whole number
		int d = n % 10; // This is like the ones place of the whole number
		
		//here the numbers are actually encrypted before returning the final value
		
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		return (c * 1000 + d * 100 + a * 10 + b);
			
	}
}
