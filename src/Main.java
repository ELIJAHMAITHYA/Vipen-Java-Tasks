import java.util.Scanner;

class Average_Of_5_Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers = 0;
        double sum = 0;

        System.out.println("Enter  the five numbers:");

        while (numbers < 5) {
            System.out.print(" Enter Number " + (numbers + 1) + ": ");
            double number = input.nextDouble();
            sum += number;
            numbers++;
        }
        double average = sum / 5;
        System.out.println("The average of the five numbers is: " + average);

        input.close();
    }
}
