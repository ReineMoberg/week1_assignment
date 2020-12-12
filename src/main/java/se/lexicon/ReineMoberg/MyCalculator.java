package se.lexicon.ReineMoberg;


import java.util.Scanner;

public class MyCalculator {

    //public static void main(String[] args) {
    public static void calculator(){                    //The class main method

        Scanner userInput = new Scanner(System.in);     //Declaring vaiables
        String operationType;
        int firstNumber;
        int secondNumber;
        int result;
        long mulResult;
        float divResult;
        boolean userContinue = true;

        //Perform calculations until user wants to quit

        System.out.println("Welcome to calculator.");
        while (userContinue) {
            System.out.println("Enter type of operation ('+', '-', '*', '/', or quit 'q'):");
            operationType = userInput.next();
            if (!operationType.equals("q")) {
                System.out.println("Enter first number:");
                firstNumber = userInput.nextInt();
                System.out.println("Enter second number:");
                secondNumber = userInput.nextInt();
                switch (operationType) {
                    case "+":
                        result = addition(firstNumber, secondNumber);
                        System.out.println("Result: " + result + "\n");
                        break;
                    case "-":
                        result = subtraction(firstNumber, secondNumber);
                        System.out.println("Result: " + result + "\n");
                        break;
                    case "*":
                        mulResult = multiplication(firstNumber, secondNumber);
                        System.out.println("Result: " + mulResult + "\n");
                        break;
                    case "/":
                        divResult = division(firstNumber, secondNumber);
                        System.out.println("Result: " + divResult + "\n");
                        break;
                    default:
                        System.out.println("Operation is not valid.\n");
                }
            } else {
                System.out.println("Ok, see you.");
                userContinue = false;
            }
        }


    }

    //Each calculation has own method with parameters

    public static int addition(int num1, int num2){
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static long multiplication(int num1, int num2){
        return (long)num1 * (long)num2;
    }

    public static float division(int num1, int num2){
        return (float)num1 / (float)num2;
    }


}
