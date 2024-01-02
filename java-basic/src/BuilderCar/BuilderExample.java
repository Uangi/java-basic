package BuilderCar;


// Client
public class BuilderExample {
	public static void main(String[] args) {
		CarBuilder carBuilder = new CarBuilderImpl();
		CarDirector carDirector = new CarDirector(carBuilder);
		Car car = carDirector.ConstructCar();
		
		System.out.println("Constructed Car : " + car);
	}
}
