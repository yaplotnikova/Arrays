import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControllerConsole consoleController = new ControllerConsole();
        int[] inputArray = consoleController.getArrayFromConsole();
        consoleController.outLn("Input array: ");
        consoleController.printArray(inputArray);
        int count = 0;
        for (int x : inputArray) {
            if (x > 0) {
                count++;
            }
        }
        int counter = 0;
        int[] resultArray = new int[count];
        for (int x : inputArray) {
            if (x > 0) {
                resultArray[counter] = x;
                counter++;
            }
        }
        System.out.println();
        consoleController.outLn("Result array: ");
        consoleController.printArray(resultArray);
    }

}
