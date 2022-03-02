package lap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class lab3 {
	
	static int ranNumber(int userInput) {
		Random ranNum = new Random();
		int[] x = new int [userInput];
		int sum = 0 ; 
		for( int i = 0 ; i < userInput ; i++ ) {
			int Number = ranNum.nextInt(99);
			x[i] 	= Number ;
			sum 	+= x[i] ;
			System.out.println( "Array["+i+"] = " + x[i] );
		}
		System.out.println( "sum = " + sum );
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int userInput = 0 ;
		System.out.print( "Please enter your value : " );
		try {
			userInput = Integer.parseInt( br.readLine() );  // Read user input
			//System.out.println( "User Input = " + userInput );  // Output user input
		} catch ( NumberFormatException nfe) {
			System.err.println( "Invalid Format!" );
		}
		System.out.println( "-----------------------");
		ranNumber(userInput);
	}
}