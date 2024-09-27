/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        
        int sum = sumOfNumbers(number);
        
        System.out.println(sum);

        int n;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please enter a whole number greater than zero: ");
            String inputString = scanner.next();
            try {
                n = Integer.parseInt(inputString);
                //System.out.println("Correct int");
                if (n <= 0) continue;
                else break;
            } catch (NumberFormatException ne) {
                System.out.println("Input is not a whole number greater than zero.");
                System.out.println("Please try again.");
            }
        } while (true);

        int sum = 0;

        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum is: " + sum);
        }
        else System.out.println("Sum is: " + n);

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    int sumOfNumbers(int n) {
        return 0;
    }
    
    
    int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return 0;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
