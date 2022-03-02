package lab1;
	
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class lab1 {
	 static int fxShowText(int userInput) {
	        int i = 0 ;
	        for( i = 1 ; i <= userInput ; i++ ) {
	            if( i%5 == 0 ) {
	                System.out.println(i);
	            } else {
	                System.out.print(i+", ");
	            }
	        }
	        return userInput;
	    }
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int userInput = 0 ;
	        System.out.print( "Please enter your value : " );
	        try {
	            userInput = Integer.parseInt( br.readLine() );  // Read user inpu
	        } catch ( NumberFormatException nfe) {
	            System.err.println( "Invalid Format!" );
	        }
	        System.out.println( "-----------------------");
	        fxShowText(userInput);
	    }

}
