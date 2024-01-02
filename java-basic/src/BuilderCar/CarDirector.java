package BuilderCar;


	// Director	-- Product ��ü ����
public class CarDirector {

	private CarBuilder carBuilder;
	
	public CarDirector(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}
	
	public Car ConstructCar() {
		return carBuilder
				.setBrand("Toyota")
				.setModel("camry")
				.setYear(2022)
				.build();
	}
}
