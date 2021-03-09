/*
Write an if statement that tests to see whether a String stored in a variable named phrase begins with a capital letter. If the string begins with a capital letter, print capital . If not, print not capital . Use at least one method call from the Character class in your solution. You may assume that the string is non-empty (contains at least one character).
*/
public class CapitalLetter {
	public static void main(String[] args){
		String phrase = "John";
		if(Character.isUpperCase(phrase.charAt(0))){
			System.out.print("capital");
		}else {
			System.out.print("not capital");
		}
	}
}