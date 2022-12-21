// A package declaration. It tells the compiler that the class is part of the Logic package.
package Logic;

/**
 * This class contains methods that perform mathematical operations.
 */
public class Logic {

  /**
   * Those functions takes two integers, adds them together, and prints the result.
   *
   * @param x The first number to be added.
   * @param y The name of the parameter.
   */

  public void sum(int x, int y) {
    int result = x + y;
    System.out.println("The sum of this two numbers is: " + result);
  }

  public void multiply(int x, int y) {
    int result = x * y;
    System.out.println("The multiplication of this two numbers is: " + result);
  }

  public void subtract(int x, int y) {
    int result = x - y;
    System.out.println("The subtract of this two numbers is: " + result);
  }

  public void division(int x, int y) {
    int result = x / y;
    System.out.println("The division of this two numbers is: " + result);
  }
}
