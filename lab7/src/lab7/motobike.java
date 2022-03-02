package lab7;

public class motobike extends car {
	
	public motobike() {
		System.out.println(" | motobike start ! |");
	}//end method
	
	
	public void move(String brands , int km ) {
		System.out.println( "This " + brands + " motorcycle at speed on the roads "+ km   + " km/hr" );
	}//end method
}//end class