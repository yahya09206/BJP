public class StarFigures {
	public static void main(String[] args){
		top();
		x();
		System.out.println();
		top();
		x();
		top();
		System.out.println();
		line();
		top();
		x();
	}
	public static void top() {
		System.out.println("*****");
		System.out.println("*****");
	}
	public static void x() {
		System.out.println(" * *");
		System.out.println("  * ");
		System.out.println(" * *");
	}
	public static void line() {
		System.out.println("  * ");
		System.out.println("  * ");
		System.out.println("  * ");
	}
}