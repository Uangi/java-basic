package BuilderCar;



		// ConcreteBuilder	- Builder �������̽��� �����ϴ� Ŭ����, (��ü ����)
		// dto ���� ����
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
