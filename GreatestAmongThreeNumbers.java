//Check the greatest among three numbers
import java.util.Scanner;
public class GreatestAmongThreeNumbers{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter A: ");
        int a = inp.nextInt();
        
        System.out.print("Enter B: ");
        int b = inp.nextInt();
        
        System.out.print("Enter C: ");
        int c = inp.nextInt();
        
        if(a>b && a>c){
            System.out.println(a + " is greatest");
        }
        else if(b>a && b>c){
            System.out.println(b + " is greatest");
        }
        else{
            System.out.println(c + " is greatest");
        }
        
    }
}