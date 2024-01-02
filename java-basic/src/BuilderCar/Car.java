package BuilderCar;

public class Car {

	private String brand;
	private String model;
	private int year;
	// 객체 Product는 브랜드, 이름, 제조년도를 가짐.
	
	public Car() {
//		this.brand = brand;
//		this.model = model;
//		this.year = year;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		
		return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
	}

}


	// Builder interface
interface CarBuilder {	// 객체의 생성 과정
	CarBuilderImpl setBrand(String brand);
	CarBuilderImpl setModel(String model);
	CarBuilderImpl setYear(int year);
	Car build();
	
}

