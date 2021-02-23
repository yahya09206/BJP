public class TwoRockets {
	public static void main(String[] args){
		triangle();
		box();
		unitedStates();
		box();
		triangle();
	}
	public static void triangle(){
		System.out.println("   /\\       /\\");
		System.out.println("  /  \\     /  \\");
		System.out.println(" /    \\   /    \\");
	}
	public static void box(){
		System.out.println("+------+ +------+");
		System.out.println("|      | |      |");
		System.out.println("|      | |      |");
		System.out.println("+------+ +------+");
	}
	public static void unitedStates(){
		System.out.println("|United| |United|");
		System.out.println("|States| |States|");
	}
}