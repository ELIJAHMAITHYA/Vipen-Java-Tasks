import java.util.Scanner;

class CheckIfDivisibleBy5And7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.print("Enter the number to be checked: ");
            int number = input.nextInt();

            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println(number + " is divisible by both 5 and 7.");
            } else {
                System.out.println(number + " is not divisible by both 5 and 7.");
            }

            System.out.print("Do you wish to try another number? (y/n): ");
            String choice = input.next();

            if (choice.equalsIgnoreCase("n")) {
                shouldContinue = false;
                System.out.println("Exiting the program...");
            }
        }

        input.close();
    }
}
