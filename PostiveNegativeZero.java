//Check whether a num is Positive,Negative or Zero 
import java.util.Scanner;
public class PostiveNegativeZero
{
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
		System.out.print("Enter a Num: ");
		int n = inp.nextInt();
		
		if(n==0){
		    System.out.print("Zero");
		}
		else if(n>0){
		    System.out.print("Positive");
		}
		else{
		    System.out.print("Negative");
		}
	}
}
