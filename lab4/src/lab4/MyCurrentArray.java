package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyCurrentArray extends MyClassicalArray_pack{

	//---| Properties
	MyClassicalArray_pack p = new MyClassicalArray_pack();
	
	//---| Method
	
	public void Sort( int[] MyArray ) {
        System.out.print( "Sort -----|  " );
        for (int i = 0; i < MyArray.length; i++) {
            for (int j = i + 1; j < MyArray.length; j++) {
                int temp = 0;
                if (MyArray[i] > MyArray[j]) {
                    temp = MyArray[i];
                    MyArray[i] = MyArray[j];
                    MyArray[j] = temp;
                } // end if 
            } // end for
        System.out.print( MyArray[i] + "   " ) ;
        } // end for
    } // end method
	
	
	public void Search(int[] MyArray) throws IOException {
        int userInput = 0 ;
        int Searchtemp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "\nEnter Number = " );
        try {
            userInput = Integer.parseInt( br.readLine() );
        } /* end try */  catch ( NumberFormatException nfe) {
            System.err.println( "Invalid Format!" );
        } // end catch
        for ( int i = 0 ; i <= MyArray.length ; i++ ) {
            int tempInput = 0;
            tempInput = userInput;
            if( MyArray[i] == tempInput ) {
                Searchtemp = i;
                System.out.print( "Search -----| " + Searchtemp );
                break;
            } // end if
        } // end for
    } // end Method
}
