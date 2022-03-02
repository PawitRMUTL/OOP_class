package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab2_2 {

	public Lab2_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
			throws IOException {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			int user_in = 0 ;
			int i = 0;
			int j = 0;
			int st = 0;
			System.out.print("Enter your value : ");
			user_in = Integer.parseInt( br.readLine() );
			System.out.println("_________________________");
			System.out.println("");
			for (i = 1 ; i <= user_in ; i++) {
			if(i == 2) {
			 System.out.println(i + " = Prime Number");
			 }
			for ( j = 2; j < i; j++) {
			 st = j;
			 if(i % j == 0 ) {

			 System.out.print(i + " = Not Prime: Diide by ");
			 int z = i ;
			 int x = 2 ;
			 for( x=2; x<z ; x++ ) {
			 if( (z%x)==0 ) {
			 System.out.print( x );
			 if( x != z/2 ) {
			 System.out.print( ", " );
			 }
			 }
			 }
			 System.out.print( "\n" );
			 break;
			 }
			 }
			if(st == i-1) {
				System.out.println(i + "= Prime Number");
			 }
			}
			}
			}


