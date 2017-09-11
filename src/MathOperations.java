import java.util.Scanner;

public class MathOperations {

  private static Scanner keyboardInput = new Scanner(System.in);

  public static void main (String[] args) {
    String input;
    double sum;
    double difference;
    double numOneAndNumTwoMultiplied;
    double divisiOne;
    double divisiTwo;
    double remainderOne;
    double remainderTwo;

    System.out.print("Feed me a number: ");
    input = keyboardInput.next();
    double myFirstNum = Double.parseDouble(input);
    System.out.println("You entered: " + input);

    System.out.print("Feed me another number: ");
    input = keyboardInput.next();
    double mySecondNum = Double.parseDouble(input);
    System.out.println("You entered: " + input);
    sum = myFirstNum + mySecondNum;
    difference = Math.abs(myFirstNum - mySecondNum);
    numOneAndNumTwoMultiplied = myFirstNum * mySecondNum;
    divisiOne = myFirstNum / mySecondNum;
    divisiTwo = mySecondNum / myFirstNum;
    remainderOne = myFirstNum % mySecondNum;
    remainderTwo = mySecondNum % myFirstNum;

    showResults(sum, difference, numOneAndNumTwoMultiplied, divisiOne, divisiTwo, remainderOne, remainderTwo);
  }

  private static void showResults(double mySum, double myDifference, double myNumOneAndNumTwoMultiplied, double myDivisiOne, double myDivisiTwo, double myRemainderOne, double myRemainderTwo) {

    System.out.println("Sum is: " + mySum);
    System.out.println("Difference is: " + myDifference);
    System.out.println("Total multiplied: " + myNumOneAndNumTwoMultiplied);
    System.out.println("Num1 divided by Num2: " + myDivisiOne);
    System.out.println("Num2 divided by Num1: " + myDivisiTwo);
    System.out.println("Remainder of Num1 divided by Num2: " + myRemainderOne);
    System.out.println("Remainder of Num2 divided by Num1: " + myRemainderTwo);

  }
}
