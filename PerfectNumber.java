import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number : ");
        
        int number = scanner.nextInt();
        
        int total = 0; 
        
        if (number < 0) {
            number = -number; 
        }
        
        if (number > 1) {
        	
            for(int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total += i; 
                }
            }
        } else {
            System.out.println("The number you entered is not a perfect number :(");
            return; 
        }
        
        if (total == number) { 
            System.out.println("The number you entered is a perfect number :)");
        } else {
            System.out.println("The number you entered is not a perfect number :(");
        }
    }
}
