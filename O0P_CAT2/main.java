// Main.java
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // Question 1 Demonstration
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Question 1: Encapsulation, Overloading, and Overriding ---");
        Student student = new Student();
        
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        student.setName(studentName);
        
        System.out.print("Enter student grade: ");
        int studentGrade = scanner.nextInt();
        student.setGrade(studentGrade); 
        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());

        MathOperations mathOps = new MathOperations();
        
        System.out.print("Enter first number to multiply (2 numbers): ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number to multiply: ");
        int num2 = scanner.nextInt();
        System.out.println("Multiply 2 numbers: " + mathOps.multiply(num1, num2));
        
        System.out.print("Enter first number to multiply (3 numbers): ");
        int num3 = scanner.nextInt();
        System.out.print("Enter second number to multiply: ");
        int num4 = scanner.nextInt();
        System.out.print("Enter third number to multiply: ");
        int num5 = scanner.nextInt();
        System.out.println("Multiply 3 numbers: " + mathOps.multiply(num3, num4, num5));

        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();

        // Question 2 Demonstration
        System.out.println("--- Question 2: Abstraction and Exception Handling ---");
        Appliance fan = new Fan();
        Appliance tv = new TV();
        fan.turnOn();
        tv.turnOn();

        ExceptionHandlingDemo exceptionHandling = new ExceptionHandlingDemo();
        exceptionHandling.divideNumbers();
    }
}
