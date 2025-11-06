import java.util.Scanner;

public class SmartUtilityCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // I prefer the full name for clarity
        int userChoice;

        // Let's make this look nice
        System.out.println("==== Smart Utility Calculator ====");
        System.out.println("1. Check if a number is Even or Odd");
        System.out.println("2. Find the largest of three numbers");
        System.out.println("3. Grade Calculator");
        System.out.println("4. Simple Calculator (+, -, *, /)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:

                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();


                if (number % 2 == 0) {
                    System.out.println("The number is Even.");
                } else {
                    System.out.println("The number is Odd.");
                }
                break;

            case 2:

                System.out.print("Enter first number: ");
                int firstNum = scanner.nextInt();
                System.out.print("Enter second number: ");
                int secondNum = scanner.nextInt();
                System.out.print("Enter third number: ");
                int thirdNum = scanner.nextInt();

                int largest = firstNum;
                if (secondNum > largest) {
                    largest = secondNum;
                }
                if (thirdNum > largest) {
                    largest = thirdNum;
                }
                System.out.println("The largest number is: " + largest);
                break;

            case 3:

                System.out.print("Enter your score (0–100): ");
                int studentScore = scanner.nextInt();

                String grade = "";

                if (studentScore >= 90 && studentScore <= 100) {
                    grade = "A";
                } else if (studentScore >= 80) {
                    grade = "B";
                } else if (studentScore >= 70) {
                    grade = "C";
                } else if (studentScore >= 60) {
                    grade = "D";
                } else if (studentScore >= 0) {
                    grade = "F";
                } else {
                    System.out.println("Invalid score entered.");
                    break;
                }

                if (!grade.isEmpty()) {
                    System.out.println("Grade: " + grade);
                }
                break;

            case 4:

                System.out.print("Enter first number: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double secondNumber = scanner.nextDouble();
                System.out.print("Enter operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                double result = 0;
                boolean validOperation = true;

                switch (operator) {
                    case '+':
                        result = firstNumber + secondNumber;
                        break;
                    case '-':
                        result = firstNumber - secondNumber;
                        break;
                    case '*':
                        result = firstNumber * secondNumber;
                        break;
                    case '/':
                        if (secondNumber != 0) {
                            result = firstNumber / secondNumber;
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                            validOperation = false;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator.");
                        validOperation = false;
                }


                if (validOperation) {
                    System.out.println("Result: " + result);
                }
                break;

            case 5:
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("Invalid menu option.");
        }

        scanner.close();
    }
}