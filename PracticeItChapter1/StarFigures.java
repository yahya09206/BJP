/*
Write a complete Java program in a class named StarFigures that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *
*/
public class StarFigures {
	public static void main(String[] args){
		two();
		cross();
		System.out.println();
		two();
		cross();
		two();
		System.out.println();
		three();
		two();
		cross();
	}
	public static void two(){
		System.out.println("*****");
		System.out.println("*****");
	}

	public static void cross(){
		System.out.println(" * *");
		System.out.println("  * ");
		System.out.println(" * *");
	}

	public static void three(){
		System.out.println("  *");
		System.out.println("  *");
		System.out.println("  *");
	}
}