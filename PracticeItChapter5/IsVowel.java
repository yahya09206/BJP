/*
Write a method named isVowel that returns whether a String is a vowel (a single-letter string containing a, e, i, o, or u, case-insensitively).
*/
public class IsVowel {
	public static void main(String[] args){
		System.out.println(isVowel('a'));
		System.out.println(isVowel('b'));
	}
	public static boolean isVowel(char c){
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}