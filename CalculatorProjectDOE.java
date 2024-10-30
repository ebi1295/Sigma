import java.util.*;

public class CalculatorProjectDOE {
    static Scanner userInput = new Scanner(System.in);

    static int BMI = 1;
    static int BasicCalc = 2;
    static int TipCalc = 3;
    static int DiscCalc = 4;
    static int Mortgage = 5;
    static int AgeCalc = 6;
    static int CalorieCalc = 7;
    static int SpeedCalc = 8;
    static int CompIntCalc = 9;
    static int FuelCalc = 10;
    static int SurfaceArea = 11;
    static int ConverterCalc = 12;










    public static void main(String[] args) {

        System.out.println("Hello! This is your Calculators!");
        System.out.println("Here are your options :)");
        System.out.println("1: BMI Calculator - Om\n" +
                "2: Basic Calculator - Daniel\n" +
                "3: Tip Calculator - Daniel\n" +
                "4: Discount Calculator - Emad\n" +
                "5: Mortgage Calculator - Emad\n" +
                "6: Age Calculator - Om\n" +
                "7: Calorie Calculator - Om\n" +
                "8: Speed Calculator - Daniel \n" +
                "9: Compoound Interest Calculator - Daniel\n" +
                "10: Fuel Efficiency - Emad\n" +
                "11: Surface Area of objects - Om\n" +
                "12: Converting Calculator of sorts - Emad");

        System.out.println("\n Write the # of calc. you want to use:");
        int CalcOptions = userInput.nextInt();



       if (CalcOptions == 1){
           BMI_Calculator();
       }
       if (CalcOptions == 2){
            BasicCalculator();
       }
       if (CalcOptions == 3){

       }
       if (CalcOptions == 4) {
            discountCalculator();
       }
       if (CalcOptions == 5){

       }
       if (CalcOptions == 6){

       }
       if (CalcOptions == 7){

       }
       if (CalcOptions == 8){

       }
       if (CalcOptions == 9){

       }
       if (CalcOptions == 10){

       }
       if (CalcOptions == 11){

       }
       if (CalcOptions == 12){

       }
    }


    public static void BMI_Calculator() {
        //getting user weight
        System.out.println("What is your weight in kilograms");
        double UserKGWeight = userInput.nextDouble();
        userInput.nextLine();
        //getting users height
        System.out.println("What is your height in meters?");
        double UserHeightMeters = userInput.nextDouble();
        userInput.nextLine();
        //table for users health
        System.out.println("Here is a table to see how much your BMI is healthy to be");
        System.out.println("If your are less than 18.5, you are underweight.");
        System.out.println("If your are in between than 18.5 to 25, you are normal.");
        System.out.println("If your are between than 25 to 30 you are overweight.");
        System.out.println("If your are more than 30, you are obese.");
        //BMI calculation
        double userBMI = UserKGWeight/(UserHeightMeters*UserHeightMeters);
        if (userBMI <18.5){
            System.out.println("Therefore, your BMI is" + userBMI + ".");
        }



    }

    public static void BasicCalculator(){
        System.out.print("Enter first number: ");
        double num1 = userInput.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = userInput.nextDouble();

        // Ask the user to choose an operation
        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = userInput.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        // Perform the chosen operation using if and else
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is undefined.");
                validOperation = false;
            }
        } else {
            System.out.println("Invalid operation. Please choose +, -, *, or /.");
            validOperation = false;
        }

        // Print the result if the operation was valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }
    }

    public static void discountCalculator(){
        System.out.println("Welcome to the Discount Calculator. This calculator will allow you to find the price of an item after its discount.");
        System.out.println("Please enter the original price of the item:");
        Scanner P = new Scanner(System.in);
        int Price = userInput.nextInt();
        userInput.nextLine();
        System.out.println("Please enter the amount of discount you want to apply:");
        Scanner d = new Scanner(System.in);
        int Discount = userInput.nextInt();
        userInput.nextLine();

    }
}









