/*
Write a method named repl that accepts a String and a number of repetitions as parameters and returns the String concatenated that many times. For example, the call repl("hello", 3) returns "hellohellohello". If the number of repetitions is 0 or less, an empty string is returned.
*/
public class Repl {
	public static void main(String[] args){
		System.out.print(repl("hello", 3));
	}

	public static String repl(String word, int num){
		String result = "";
		for(int i = 1; i <= num; i++){
			if(word.length() <= 0){
				return "";
			}else {
				result += word;
			}
		}
		return result;
	}
}