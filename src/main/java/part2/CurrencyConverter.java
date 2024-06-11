package part2;

import java.util.Scanner;

public class CurrencyConverter {
    private static final double RUB_TO_EUR = 0.010;
    private static final double EUR_TO_RUB = 95.76;
    private static final double EUR_TO_DKK = 7.46;
    private static final double DKK_TO_EUR = 0.13;
    private static final double NOK_TO_EUR = 0.087;
    private static final double EUR_TO_NOK = 11.49;
    private static final double DKK_TO_NOK = 1.54;
    private static final double NOK_TO_DKK = 0.65;

    private static final double BAHT_TO_SEK = 2.28;
    private static final double SEK_TO_BAHT = 0.44;
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
            System.out.println("5. SEK  to BAHT");
            System.out.println("6. BAHT  to SEK");
            System.out.println("7. NOK to DKK");
            System.out.println("8. DKK to NOK");
            System.out.println("9. NOK to EUR");
            System.out.println("10. EUR to NOK");
            System.out.println("11.DKK to EUR");
            System.out.println("12. EUR to DKK");
            System.out.println("13. RUB to EUR");
            System.out.println("14. EUR to RUB");
            System.out.println("15. Exit");
            System.out.println("Choose an option: ");

            int option = scanner.nextInt(); // Scans for the next int option
            if (option == 15) { // If option is number 5 it will print the message down below
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
                case 5:
                    convertedAmount = convertCurrency(amount, SEK_TO_BAHT);
                    System.out.printf("%.2f SEK = %.2f BAHT \n", amount, convertedAmount);
                    break;
                case 6:
                    convertedAmount = convertCurrency(amount, BAHT_TO_SEK);
                    System.out.printf("%.2f BAHT = %.2f SEK \n", amount, convertedAmount);
                    break;
                case 7:
                    convertedAmount = convertCurrency(amount, NOK_TO_DKK);
                    System.out.printf("%.2f NOK = %.2f DKK \n", amount, convertedAmount);
                    break;
                case 8:
                    convertedAmount = convertCurrency(amount, DKK_TO_NOK);
                    System.out.printf("%.2f DKK = %.2f NOK \n", amount, convertedAmount);
                    break;
                case 9:
                    convertedAmount = convertCurrency(amount, NOK_TO_EUR);
                    System.out.printf("%.2f NOK = %.2f EUR \n", amount, convertedAmount);
                    break;
                case 10:
                    convertedAmount = convertCurrency(amount, EUR_TO_NOK);
                    System.out.printf("%.2f EUR = %.2f NOK \n", amount, convertedAmount);
                    break;
                case 11:
                    convertedAmount = convertCurrency(amount, DKK_TO_EUR);
                    System.out.printf("%.2f DKK = %.2f EUR \n", amount, convertedAmount);
                    break;
                case 12:
                    convertedAmount = convertCurrency(amount, EUR_TO_DKK);
                    System.out.printf("%.2f EUR = %.2f DKK \n", amount, convertedAmount);
                    break;
                case 13:
                    convertedAmount = convertCurrency(amount, RUB_TO_EUR);
                    System.out.printf("%.2f RUB = %.2f EUR \n", amount, convertedAmount);
                    break;
                case 14:
                    convertedAmount = convertCurrency(amount, EUR_TO_RUB);
                    System.out.printf("%.2f EUR = %.2f RUB \n", amount, convertedAmount);
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
