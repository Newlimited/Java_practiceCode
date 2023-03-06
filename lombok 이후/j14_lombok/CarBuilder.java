package j14_lombok;

public abstract class CarBuilder {

	protected Car car;
	
	public Car build() {
		return car;
	}
	public CarBuilder builder() {
		car = new Car();
		return this;
		// Getter Setter 라 보면된다. 위에 두개 
	}

	public abstract CarBuilder company(String company);
	public abstract CarBuilder modle(String model);
	public abstract CarBuilder color(String color);
	
}