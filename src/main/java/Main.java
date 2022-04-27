import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        int[] inputArray = new int[size];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Введите числа: ");
            inputArray[i] = scan.nextInt();
        }
        System.out.print("inputArray: ");
        for (int x : inputArray) {
            System.out.print("[" + x + "] ");
        }
        int count = 0;
        for (int x : inputArray) {
            if (x > 0) {
                count++;
            }
        }
        int counter = 0;
        int[] resultArray = new int[count];
        System.out.println();
        System.out.print("resultArray: ");
        for (int x : inputArray) {
            if (x > 0) {
                resultArray[counter] = x;
                counter++;
                System.out.print("[" + x + "] ");
            }
        }

    }
}








