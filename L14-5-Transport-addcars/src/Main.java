
import java.util.*;
public class Main {
	static void addCars(List<? super Car> vehicles) {
		vehicles.add(new Car());
		vehicles.add(new Car());
	}
	
	
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<Car>();
		List<Vehicle> vehicles = new ArrayList<Vehicle>();

		addCars(cars);
		addCars(vehicles);
		
	}
}
