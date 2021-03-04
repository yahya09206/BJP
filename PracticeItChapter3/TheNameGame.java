/*
Write a complete program called "TheNameGame", where the user inputs a first and last name and a song in the following format is printed about their first, then last, name. Use a method to avoid redundancy.

What is your name? Fifty Cent
Fifty Fifty, bo-Bifty
Banana-fana fo-Fifty
Fee-fi-mo-Mifty
FIFTY!

Cent Cent, bo-Bent
Banana-fana fo-Fent
Fee-fi-mo-Ment
CENT!
*/
import java.util.*;
public class TheNameGame {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = console.nextLine();
		song(name);
	}
	public static void song(String name){
		String newName = name.substring(1);
		System.out.print(name.substring(0, name.indexOf(" ")) + " ");
		System.out.print(name.substring(0, name.indexOf(" ")) + "");
		System.out.print(", bo-B" + newName.indexOf(" "));
	}
}