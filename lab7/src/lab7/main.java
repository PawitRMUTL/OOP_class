package lab7;

public class main {
	public static void main (String[] args) {
		vehicle vehicle = new vehicle();
		vehicle.move();
		vehicle.move("Pawit");
		
		car car = new car();
		car.move(100, 50);
		
		supercar supercar = new supercar();
		supercar.move();
		
		motobike motobike = new motobike();
		motobike.move("Yammaha", 100);
		
		ballon balloon = new ballon();
		balloon.move();
		
		drone drone = new drone();
		drone.move('b', 90);;
		
	}
}
