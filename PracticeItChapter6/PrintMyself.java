/*
Write a complete Java program that prints itself to the console as output. Assume that the program is stored in a file named PrintMyself.java, and make your code open the file PrintMyself.java and print its contents to the console.
*/
import java.util.*;
public class PrintMyself {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("PrintMyself.java"));
		while(input.hasNextLine()){
            System.out.println(input.nextLine());
        }
	}
}