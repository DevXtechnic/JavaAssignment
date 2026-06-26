import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        
        int originalNum = number,sum =0,digits =0,temp = number;
        while(temp>0){
            temp /= 10;
            digits++;
        }
        temp = number;
        while(temp > 0){
            int digit = temp %10;
            sum += Math.pow(digit,digits);
            temp /= 10;
        }
        
        if(sum==originalNum){
            System.out.println(originalNum + " is a armstrong number");
    }
        else{
            System.out.println(originalNum + " is not a armstrong number");
    }
}
}