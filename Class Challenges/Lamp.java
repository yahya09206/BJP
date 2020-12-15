public class Lamp {
	private String style;
	private boolean battery;
	private int globeRating;

	public Lamp(String style, boolean battery, int globeRating){
		this.style = style;
		this.battery = battery;
		this.globeRating = globeRating;
	}

	public void turnOn(){
		System.out.println("Lamp -> Turning on");
	}

	public String getStyle(){
		return this.style;
	}

	public boolean getBattery(){
		return this.battery;
	}

	public int getGlobeRating(){
		return this.globeRating;
	}
}