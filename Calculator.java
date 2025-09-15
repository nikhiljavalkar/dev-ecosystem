import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!");

        while (true) {
            System.out.print("Enter first number (or 'exit' to quit): ");
            String input1 = scanner.nextLine();
            if (input1.equalsIgnoreCase("exit")) break;

            double num1 = Double.parseDouble(input1);

            System.out.print("Enter an operator (+, -, *, /): ");
            String operator = scanner.nextLine();

            System.out.print("Enter second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator");
                    continue;
            }
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}