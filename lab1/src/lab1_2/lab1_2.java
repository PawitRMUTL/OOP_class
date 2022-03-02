package lab1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class lab1_2 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int Input = 0 ;
	        System.out.print( "Please enter your value : " );
	        try {
	            Input = Integer.parseInt( br.readLine() );  // Read user inpu
	        } catch ( NumberFormatException nfe) {
	            System.err.println( "Invalid Format!" );
	        }
	        System.out.println( "-----------------------");
	        for (int n = 2 ; n <= Input ; n++) {
	        	System.out.print(n); 
	            if((n==1 || n%2 == 0 || n%3 == 0 || n%5==0 || n%7==0) && (n!=2 && n!=3 && n!=5 && n!=7)){
	            	 System.out.println(" = Not PrimeNumber"); 
	            }else {
	            	System.out.println(" = PrimeNumber"); 
	            }
	        } 
	 }
}
	     
	  
