/*
Write a method named boyGirl that accepts a Scanner as a parameter. The Scanner is reading its input from a file containing a series of names followed by integers. The names alternate between boys' names and girls' names. Your method should compute the absolute difference between the sum of the boys' integers and the sum of the girls' integers. The input could end with either a boy or girl; you may not assume that it contains an even number of names. If the input file tas.txt contains the following text:

Steve 3 Sylvia 7 Craig 14 Lisa 13 Brian 4 Charlotte 9 Jordan 6
then your method could be called in the following way:

Scanner input = new Scanner(new File("tas.txt"));
boyGirl(input);
and should produce the following output, since the boys' sum is 27 and the girls' sum is 29:

4 boys, 3 girls
Difference between boys' and girls' sums: 2
*/
import java.util.*;
public class BoyGirl {
	public static void main(String[] args){
		boyGirl();
	}
	public void boyGirl(Scanner sc) {
	    int boyCount = 0;
	    int boySum = 0;
	    int girlCount = 0;
	    int girlSum = 0;
	    
	    while(sc.hasNext()) {
	        sc.next();
	        boyCount++;
	        boySum += sc.nextInt();
	        
	        if(!sc.hasNext())
	            break;
	        
	        sc.next();
	        girlCount++;
	        girlSum += sc.nextInt();
	    }
	    
	    System.out.println(boyCount + " boys, " + girlCount + " girls");
	    System.out.println("Difference between boys' and girls' sums: " + 
	        Math.abs(boySum - girlSum));
	}
}