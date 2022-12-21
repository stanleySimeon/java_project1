import java.util.Scanner;
import Logic.Logic;
import static java.lang.System.exit;

public class Main extends Logic {
  /**
   * ShowMenu() takes an array of strings and prints each string in the array,
   * then prints a prompt for the user to choose an option.
   *
   * @param menu an array of strings that will be printed out as the menu options
   */
  public static void showMenu(String[] menu) {
    for (String options : menu) {
      System.out.println(options);
    }
    System.out.print("Choose an option: ");
  }

  // Creating a menu for the user to choose from.
  static private final String[] menu = {
    "1- Addition",
    "2- Multiplication",
    "3- Subtraction",
    "4- Division",
    "5- Exit"
  };

  // This is the main method that is used to run the program.
  public static void main(String[] args) {
    /* This is a try-with-resources statement.
    * It declares a resource that must be closed when the program is finished with it.
    */
    try (Scanner newScanner = new Scanner(System.in)) {
      System.out.print("Enter the first number: ");
      int x = newScanner.nextInt();

      System.out.print("Enter the second number: ");
      int y = newScanner.nextInt();

      // Setting the default value of the variable options to 1.
      int options = 1;
      // This is a while loop that will keep running until the user enters 5.
      while (options != 5) {
        // Calling the showMenu method and passing the menu array as an argument.
        showMenu(menu);
       // Creating a new instance of the Logic class.
       final Logic newLogic = new Logic();

        // This is a try-catch block that is used to catch any exceptions that may occur.
        try {
          options = newScanner.nextInt();
          switch(options) {
            case 1:
              newLogic.sum(x, y);
                break;
            case 2:
              newLogic.multiply(x, y);
              break;
            case 3:
              newLogic.subtract(x, y);
              break;
            case 4:
              newLogic.division(x, y);
              break;
            case 5:
              exit(0);
          }
        }
        // This is a try-catch block that is used to catch any exceptions that may occur.
        catch(Exception Error) {
          if(options > menu.length) {
            System.out.print("Please enter a number between 1 to " + menu.length);
            newScanner.next();
          }
        }
      }
    }
  }
}


