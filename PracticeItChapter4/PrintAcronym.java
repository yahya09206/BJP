/*
Write a method called printAcronym that accepts a String as its parameter and prints the first letter of each word of the string as an acronym. For example, the call of printAcronym("Breath of the Wild") should print "BotW". You may assume that the string contains at least one word and does not have any surrounding whitespace at its start or end.
*/
public class PrintAcronym {
	public static void main(String[] args){
		printAcronym("Breath of the Wild");
	}
	public static void printAcronym(String phrase){
		String result = "";
		for(int i = 0; i <= phrase.length(); i++){
			String firstLetter = phrase.substring(0,1);
		}
		System.out.print(firstLetter);
	}
}