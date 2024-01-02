package BuilderCar;



		// ConcreteBuilder	- Builder 인터페이스를 구현하는 클래스, (객체 조립)
		// dto 같은 느낌
class CarBuilderImpl implements CarBuilder {

	private Car car = new Car();
	
	@Override
	public CarBuilderImpl setBrand(String brand) {
		car.setBrand(brand);
		return this;
	}

	@Override
	public CarBuilderImpl setModel(String model) {
		
		return this;
	}

	@Override
	public CarBuilderImpl setYear(int year) {
		
		return this;
	}

	@Override
	public Car build() {
		
		return car;
	}

}
