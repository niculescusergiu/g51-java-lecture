package part2;

import java.util.Scanner;

public class CurrencyConverter {
    private static final double SEK_TO_USD = 0.1;                       //Preset value for all the SEK to USD calculations
    private static final double SEK_TO_EUR = 0.09;                   //Preset value for all the SEK to EUR calculations
    private static final double USD_TO_SEK = 1 / SEK_TO_USD;            //Preset value for all the USD to SEK or SEK to USD calculations
    private static final double EUR_TO_SEK = 1 / SEK_TO_EUR;             //Preset value for all the EUR to SEK  or SEK to EUR calculations

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Starts a new scanner named scanner that we need to be able to scan for input
        while (true) {
            System.out.println("Currency Converter Menu:");
            System.out.println("1. SEK to USD");
            System.out.println("2. USD to SEK");
            System.out.println("3. SEK to EUR");
            System.out.println("4. EUR to SEK");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");

            int option = scanner.nextInt(); // Scans for the next int option
            if (option == 5) { // If option is number 5 it will print the message down below
                System.out.println("Exiting the application.");
                break; // We put the break; inside the if scope that exits the program, using break with while we can apply the exit
            }
            System.out.println("Enter amount: ");
            double amount = scanner.nextDouble(); // Scans the next double amount typed in
            double convertedAmount = 0;

            switch (option) {
                case 1:
                    convertedAmount = convertCurrency(amount, SEK_TO_USD);
                    System.out.printf("%.2f SEK = %.2f USD\n", amount, convertedAmount);
                    break;
                case 2:
                    convertedAmount = convertCurrency(amount, USD_TO_SEK);
                    System.out.printf("%.2f USD = %.2f SEK\n", amount, convertedAmount);
                    break;
                case 3: convertedAmount = convertCurrency(amount, SEK_TO_EUR);
                    System.out.printf("%.2f SEK = %.2f EUR\n", amount, convertedAmount);
                    break;
                case 4:
                    convertedAmount = convertCurrency(amount, EUR_TO_SEK);
                    System.out.printf("%.2f EUR = %.2f SEK \n", amount, convertedAmount);
                    break;
                default:
                    System.out.println("Invalid option. Please try again."); //This prints out a default message in case the option is
                                                                                //not one of the premade ones
            }
        }
        scanner.close(); //this stops the scanner from scanning
    }
    private static double convertCurrency(double amount, double rate) { //sets amount and rate to double and applies it to the name
        return amount * rate;                                               //convertCurrency so that our switch syntaxes dont show error
                                         //return shows what value the calling of name convertCurrency should return
                                                   //In our case amount * rate
    }

}
