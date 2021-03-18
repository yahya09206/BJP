/*
Write a method named readEntireFile that accepts a Scanner representing an input file as its parameter, then reads that file and returns the entire text contents of that file as a String.
*/
import java.util.*;
public class ReadEntireFile {
	public static void main(String[] args){
		readEntireFile();
	}
	public static String readEntireFile(Scanner sc){
		String text = "";

		while(sc.hasNextLine()){
           text += sc.nextLine() + "\n";
        }
        return text;
	}
}