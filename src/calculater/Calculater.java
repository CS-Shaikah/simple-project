
package calculater;

/**
 *
 * @author shaikah AlMoqbel
 */
import java.util.Scanner;
public class Calculater {

    public static void main(String[] args) {
 
    char operator;
    Double number1, number2, result;

    // create an object of Scanner class to allow the program receive data from users
    Scanner input = new Scanner(System.in);

    // ask users to chooses operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // Request users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      // apply addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // apply subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // apply multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // apply division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

   
  }
}
        
        
    