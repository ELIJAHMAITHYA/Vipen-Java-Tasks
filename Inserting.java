import java.util.Scanner;

public class Inserting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int numbers = input.nextInt();

        int[] array = new int[numbers + 1];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < numbers; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter the position to insert the number (1 to " + (numbers + 1) + "): ");
        int position = input.nextInt();

        System.out.print("Enter the number to insert: ");
        int numberToInsert = input.nextInt();

        // Shift elements to the right from the given position
        for (int i = numbers; i >= position; i--) {
            array[i] = array[i - 1];
        }

        array[position - 1] = numberToInsert;

        System.out.println("Array after inserting the number:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + array[i]);
        }

        input.close();
    }
}
