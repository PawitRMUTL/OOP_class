package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab2 {

	public Lab2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new
		InputStreamReader(System.in));
		int user_in = 0 ;
		int i = 1;
		System.out.print("Enter your value : ");
		user_in = Integer.parseInt( br.readLine() );
		System.out.println("_________________________");
		System.out.println("");
		for(i = 1 ; i <= user_in ; i++) {
		if (i != user_in) {
		if(i % 5 != 0) {
		System.out.print(i + ",");
		} else {
		System.out.println(i);
		}
		} else {
		System.out.println(i);
		}
		}
		}//end function
}
