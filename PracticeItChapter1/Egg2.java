public class Egg2 {
	public static void main(String[] args){
		top();
		bottom();
		line();
		top();
		bottom();
		line();
		bottom();
		top();
		line();
		bottom();
	}
	public static void top(){
		System.out.println("  _______");
		System.out.println(" /       \\");
		System.out.println("/         \\");
	}
	public static void line(){
		System.out.println("-\"-'-\"-'-\"-");
	}
	public static void bottom(){
		System.out.println("\\         /");
		System.out.println(" \\_______/");
	}
}