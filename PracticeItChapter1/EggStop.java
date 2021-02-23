public class EggStop {
	public static void main(String[] args){
		top();
		bottom();
		System.out.println();
		top();
		bottom();
		line();
		System.out.println();
		top();
		stop();
		bottom();
		line();
	}
	public static void top(){
		System.out.println("  _______");
		System.out.println(" /       \\");
		System.out.println("/         \\");
	}
	public static void line(){
		System.out.println("+--------+");
	}
	public static void bottom(){
		System.out.println("\\         /");
		System.out.println(" \\_______/");
	}
	public static void stop() {
		System.out.println("|  STOP  |");
	}
}