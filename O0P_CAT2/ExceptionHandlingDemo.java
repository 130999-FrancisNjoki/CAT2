// Question2.java (Abstraction and Exception Handling)
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public void divideNumbers() {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}
