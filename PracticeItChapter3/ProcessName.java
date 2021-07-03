/*
Write a method called processName that accepts a Scanner for the console as a parameter and that prompts the user to enter his or her full name, then prints the name in reverse order (i.e., last name, first name). You may assume that only a first and last name will be given. You should read the entire line of input at once with the Scanner and then break it apart as necessary. Here is a sample dialogue with the user:

Please enter your full name: Sammy Jankis
Your name in reverse order is Jankis, Sammy
*/
import java.util.Scanner;
public class ProcessName {
	public static void main(String[] args){

	}
	public static void processName(Scanner scan){
		System.out.print("Please enter your full name: ");
		String name = scan.nextLine();
		String lastName = name.substring(indexOf(" "));
		String firstName = name.substring(0, indexOf(" "));
		System.out.println("Your name in reverse order is " + lastName + ", " + firstName);
	}
}