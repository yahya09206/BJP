public class Lanterns {
	public static void main(String[] args){
		top();
		System.out.println();
		top();
		middle();
		top();
		System.out.println();
		top();
		weird();
	}
	public static void top() {
		System.out.println("    *****");
		System.out.println("  *********");
		System.out.println("*************");
	}
	public static void middle() {
		System.out.println("* | | | | | *");
		System.out.println("*************");
	}
	public static void weird() {
		System.out.println("    *****");
		System.out.println("* | | | | | *");
		System.out.println("* | | | | | *");
		System.out.println("    *****");
		System.out.println("    *****");
	}
}