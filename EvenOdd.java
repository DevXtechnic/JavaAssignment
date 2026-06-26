//Check whether a number is odd or even

import java.util.Scanner;
public class EvenOdd
{
	public static void main(String[] args) {
	    Scanner Sc = new Scanner(System.in);
	    
		System.out.print("Enter a num: ");
		int num = Sc.nextInt();
		
		if(num%2==0){
		    System.out.println("Even");
		}
		else{
            System.out.println("Odd");
		}
		
		
	}
}
