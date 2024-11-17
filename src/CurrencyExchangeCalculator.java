import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyExchangeCalculator {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        // Initialize exchange rates for more currencies
        exchangeRates.put("USD", 1.0);     // US Dollar
        exchangeRates.put("EUR", 0.85);   // Euro
        exchangeRates.put("GBP", 0.73);   // British Pound
        exchangeRates.put("JPY", 109.86); // Japanese Yen
        exchangeRates.put("INR", 82.50);  // Indian Rupee
        exchangeRates.put("AUD", 1.40);   // Australian Dollar
        exchangeRates.put("CAD", 1.35);   // Canadian Dollar
        exchangeRates.put("CNY", 6.90);   // Chinese Yuan
        exchangeRates.put("CHF", 0.92);   // Swiss Franc
        exchangeRates.put("NZD", 1.50);   // New Zealand Dollar
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Exchange Calculator");
        System.out.println("Supported Currencies: " + exchangeRates.keySet());

        try {
            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter the source currency code (e.g., USD): ");
            String sourceCurrency = scanner.next().toUpperCase();

            System.out.print("Enter the target currency code (e.g., EUR): ");
            String targetCurrency = scanner.next().toUpperCase();

            if (!exchangeRates.containsKey(sourceCurrency)) {
                System.out.println("Error: Source currency code is not supported.");
                return;
            }

            if (!exchangeRates.containsKey(targetCurrency)) {
                System.out.println("Error: Target currency code is not supported.");
                return;
            }

            double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String formattedAmount = decimalFormat.format(convertedAmount);

            System.out.println(amount + " " + sourceCurrency + " = " + formattedAmount + " " + targetCurrency);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers and currency codes.");
        } finally {
            scanner.close();
        }
    }

    public static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        double sourceRate = exchangeRates.get(sourceCurrency);
        double targetRate = exchangeRates.get(targetCurrency);
        return amount * (targetRate / sourceRate);
    }
}
