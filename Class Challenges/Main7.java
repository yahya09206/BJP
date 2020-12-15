class Car {
	private boolean engine;
	private int cyclinders;
	private String name;
	private int wheels;

	public Car(int cyclinders, String name){
		this.cyclinders = cyclinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}

	public int getCyclinders(){
		return this.cyclinders;
	}

	public String getName(){
		return name;
	}

	public String startEngine(){
		return "Car -> startEngine()";
	}

	public String accelerate(){
		return "Car -> accelerate()";
	}

	public String brake(){
		return "Car -> brake()";
	}
}

class Mitsubishi extends Car {
	public Mitsubishi(int cyclinders, String name){
		super(cyclinders, name);
	}
	@Override
	public String startEngine(){
		return "Mitsubishi -> startEngine()";
	}
	@Override
	public String accelerate(){
		return "Mitsubishi -> accelerate()";
	}
	@Override
	public String brake(){
		return "Mitsubishi -> brake()";
	}

}
public class Main7 {
	public static void main(String[] args) {
		Car car = new Car(8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());

		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());

	}
}