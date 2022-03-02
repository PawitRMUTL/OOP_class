package lab7;


public class vehicle {
	public int wheel ;
	
	public vehicle() {
		System.out.println("\n | Vehicle start |");
	}//end method
	
	public void move() {
		System.out.print(" | Vehicle Move  |");
	}//end method
	
	public void move( String name) {
		System.out.println("--|My Driver ::" + name +" --->");
	}//end method
}
