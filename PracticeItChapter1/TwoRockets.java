/*
Write a complete Java program in a class named TwoRockets that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

Note that there are two rocket ships next to each other. What redundancy can you eliminate using static methods? What redundancy cannot be eliminated?

   /\       /\
  /  \     /  \
 /    \   /    \
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
|United| |United|
|States| |States|
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
   /\       /\
  /  \     /  \
 /    \   /    \
*/
 public class TwoRockets {
 	public static void main(String[] args){
 		triangle();
 		box();
 		united();
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

 	public static void united(){
 		System.out.println("|United| |United|");
 		System.out.println("|States| |States|");
 	}
 }