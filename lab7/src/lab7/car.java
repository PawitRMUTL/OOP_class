package lab7;

public class car extends vehicle {

	public car() {
		System.out.println(" | car start ! |");
	}//end method
	
	public void move(int speed , float km) {
		System.out.println(" My Driver , drive at speed "+ speed  + " km/hr form home " + km + " kilometer");
	}//end method
}//end class