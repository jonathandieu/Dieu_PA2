// This portion of the program should include the Decrypt method and should be able to accomplish the following:
// 1. Take 4 integer values 
// 2. Convert each integer value into the proper representation of a 4 digit number
// 3. Undo the encryption that the Encrypt method performs.

public class Decrypter {
	public static int Decrypt(int n) {
		int a = n / 1000; // This is like the thousands place of the whole number
		int b = (n % 1000) / 100; // This is like the hundreds place of the whole number
		int c = (n % 100) / 10; // This is like the tens place of the whole number
		int d = n % 10; // This is like the ones place of the whole number
		
		//here the numbers are actually encrypted and return the final value
		
		a = (a + 3) % 10;
		b = (b + 3) % 10;
		c = (c + 3) % 10;
		d = (d + 3) % 10;
		return (c * 1000 + d * 100 + a * 10 + b);
	}
	

}
