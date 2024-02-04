import java.util.*;

public class ExceptionHandlingExample {

    // Custom exception class
    class BigNumberException extends Exception {
        public BigNumberException(String message) {
            super(message);
        }
    }

    // Example of ArithmeticException handling
    public void ArithmeticExample() {
        System.out.println("!! Example of Arithmetic Exception Handling !!\n");

        int a = 10, b = 0, c;

        try {
            // Attempting to divide by zero
            c = a / b;
        } catch (ArithmeticException error) {
            // Handling ArithmeticException
            System.out.println(error + " Can't divide by zero\n");
        }
    }

    // Example of NullPointerException handling
    public void NullPointerExample(String str) {
        System.out.println("!! Example of Null Pointer Exception Handling !!\n");

        int length = 0;

        try {
            // Attempting to get the length of a null string
            length = str.length();
        } catch (NullPointerException error) {
            // Handling NullPointerException
            System.out.println(error + "\n");
        }
    }

    // Example of ArrayIndexOutOfBoundsException handling
    public void ArrayOutOfBoundExample() {
        System.out.println("!! Example of ArrayIndexOutOfBounds Exception Handling !!\n");

        int[] arr = new int[3];
        int index = 5;
        int num;

        try {
            // Attempting to access an array element outside its bounds
            num = arr[index];
        } catch (ArrayIndexOutOfBoundsException error) {
            // Handling ArrayIndexOutOfBoundsException
            System.out.println(error + "\n");
        }
    }

    // Example of custom exception handling
    public void CustomExceptionExample() throws BigNumberException {
        System.out.println("!! Example of Custom Exception Handling !!\n");

        int num = 10;
        System.out.println("Number: " + num + "\n");
        System.out.println("Number should be smaller than 5\n");

        if (num > 5) {
            // Throwing a custom exception if the number is greater than 5
            throw new BigNumberException("This is a bigger number than 5\n");
        }
        System.out.println("Number is smaller than 5\n");
    }

    // Example of finally block
    public void FinallyBlockExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("!! Example of Finally Block !!\n");

        int a = 10, b = 0, c;

        try {
            // Attempting to divide by zero
            c = a / b;
        } catch (Exception error) {
            // Handling exception (not specified which exception to catch)
            System.out.println("");
        } finally {
            // Closing the scanner in the finally block
            sc.close();
            System.out.println("Scanner closed in the finally block\n");
        }
    }

    public static void main(String args[]) {
        String str = null;
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Exception is an unwanted/abnormal situation that occurs at runtime");
        System.out.println("Exception handling is a mechanism to handle runtime errors");
        System.out.println("-------------------------------------------------------------------------------");

        ExceptionHandlingExample ehe = new ExceptionHandlingExample();

        // Calling each method to demonstrate exception handling
        ehe.ArithmeticExample();
        System.out.println("-------------------------------------------------------------------------------");
        ehe.NullPointerExample(str);
        System.out.println("-------------------------------------------------------------------------------");
        ehe.ArrayOutOfBoundExample();
        System.out.println("-------------------------------------------------------------------------------");

        try {
            ehe.CustomExceptionExample();
        } catch (BigNumberException error) {
            // Handling custom exception
            System.out.println("Caught BigNumberException: " + error.getMessage());
        }

        System.out.println("-------------------------------------------------------------------------------");
        ehe.FinallyBlockExample();
        System.out.println("-------------------------------------------------------------------------------");
    }
}
