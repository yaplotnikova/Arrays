import java.util.Scanner;

public class ControllerConsole {
    Scanner scan = new Scanner(System.in);

    void out(String value) {
        System.out.print(value);
    }

    void outLn(String value) {
        System.out.print(value);
    }

    int readInt() {
        System.out.println("Enter int value: ");
        return scan.nextInt();
    }

    void printArray(int[] array) {
        for (int x : array) {
            out("[" + x + "]");
        }
        outLn(" ");
    }

    int[] getArrayFromConsole() {
        int[] array;
        System.out.println("Enter size of array");
        int size = readInt();
        array = new int[size];
        return fillArray(array);
    }

    int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = readInt();
        }
        return array;
    }
}

