package lab4;

import java.io.IOException;

public class MyClassicalArray {


	public static void main(String[] args) throws IOException {
		
		MyClassicalArray_pack  	packA = new MyClassicalArray_pack();
		MyCurrentArray 			packB = new MyCurrentArray();
		
		
		packA.getRandom();
		packA.FindMax();
		packA.FindMin();
		System.out.print("\n");
		packB.Sort(packA.MyArray);
		packB.Search(packA.MyArray);
	}

}
