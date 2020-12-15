public class PC {

	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherboard;

	public PC(Case theCase, Monitor monitor, MotherBoard motherboard){
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public void powerUp(){
		theCase.pressPowerButton();
		drawLogo();
	}

	private void drawLogo() {
		monitor.drawPixelAt(1200, 50, "yellow");
	}

	// private Case getTheCase(){
	// 	return this.theCase;
	// }

	// private Monitor getMonitor(){
	// 	return this.monitor;
	// }

	// private MotherBoard getMotherBoard(){
	// 	return this.motherboard;
	// }
}