import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements the array has: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print(" Enter Element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int largestNumber = numbers[0]; 
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }

        System.out.println("The largest number in the array is: " + largestNumber);

        input.close();
    }
}
