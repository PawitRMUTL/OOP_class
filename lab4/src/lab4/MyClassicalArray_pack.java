package lab4;

import java.util.Random;

public class MyClassicalArray_pack {
	
	 //----| Properties
	
    public int[] MyArray = new int[5];
    public Random rd = new Random(); 

    //----| Method 
    
    public void getRandom() {
        System.out.print( "Random Number ----|  " );
        for ( int i = 0 ; i < MyArray.length ; i++ ) {
            MyArray[i] = rd.nextInt(999); 
            if( i < 4 ) {
                System.out.print( "[" + MyArray[i] + "] " );
            }else {
                System.out.print( "[" + MyArray[i] + "] \n\n" );
            } //end if else
        } //end for
    } //end method
    
    
    public void FindMax() {
        int tempMax = 0;
        for ( int i = 0 ; i < MyArray.length ; i++ ) {
             if( MyArray[i] > tempMax) {
                 tempMax = MyArray[i];
             } // end if
        } // end for
        System.out.println( "Max Number -----| " + tempMax );
    } // end method

    
    public void FindMin() {
        int tempMin = 9999;
        for ( int i = 0 ; i < MyArray.length ; i++ ) {
             if( MyArray[i] < tempMin) {
                 tempMin = MyArray[i];
             } // end if
        } // end for
        System.out.println( "Min Number -----| " + tempMin );
    } // end method
    
    
} //end class
