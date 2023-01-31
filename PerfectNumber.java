import java.util.*;
public class PerfectNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is perfect or not: ");
        int number = sc.nextInt();
        int value = 0;

        for ( int i = 1; i <= number/2; i++){
            if( number % i == 0){
                value += i;
            }
        }
        if(value == number){
            System.out.println(number+ " is a perfect number.");
        } else {
            System.out.println(number+ " is not a perfect number.");
        }
    }
}