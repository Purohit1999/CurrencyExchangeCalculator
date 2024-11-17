Here’s a sample **README.md** file for your **CurrencyExchangeCalculator** project:

---

# CurrencyExchangeCalculator

**CurrencyExchangeCalculator** is a simple Java-based console application that allows users to convert currency amounts between multiple currencies using predefined exchange rates.

---

## Features

- **Multi-Currency Support**: Convert between popular currencies including:
  - USD (US Dollar)
  - EUR (Euro)
  - GBP (British Pound)
  - JPY (Japanese Yen)
  - INR (Indian Rupee)
  - AUD (Australian Dollar)
  - CAD (Canadian Dollar)
  - CNY (Chinese Yuan)
  - CHF (Swiss Franc)
  - NZD (New Zealand Dollar)
- **User-Friendly Interface**: Interactive console-based input.
- **Error Handling**: Handles invalid inputs and unsupported currency codes gracefully.
- **Customizable Rates**: Easy to update exchange rates or add new currencies.
- **Precision Output**: Results formatted to two decimal places.

---

## How to Use

1. **Run the Program**:
   - Execute the program in your Java IDE or via the terminal.
   
2. **Input Requirements**:
   - Enter the amount you wish to convert.
   - Provide the source currency code (e.g., `USD`).
   - Provide the target currency code (e.g., `EUR`).

3. **Output**:
   - The program will display the equivalent value in the target currency.

---

## Supported Currencies

| Currency Code | Currency Name         |
|---------------|-----------------------|
| USD           | US Dollar            |
| EUR           | Euro                 |
| GBP           | British Pound        |
| JPY           | Japanese Yen         |
| INR           | Indian Rupee         |
| AUD           | Australian Dollar    |
| CAD           | Canadian Dollar      |
| CNY           | Chinese Yuan         |
| CHF           | Swiss Franc          |
| NZD           | New Zealand Dollar   |

---

## Example Usage

### Input:
```
Welcome to the Currency Exchange Calculator
Supported Currencies: [USD, EUR, GBP, JPY, INR, AUD, CAD, CNY, CHF, NZD]
Enter the amount: 100
Enter the source currency code (e.g., USD): USD
Enter the target currency code (e.g., INR): INR
```

### Output:
```
100.0 USD = 8250.0 INR
```

---

## Project Setup

1. **Prerequisites**:
   - Java 8 or higher installed.
   - IDE (e.g., IntelliJ IDEA, Eclipse) or terminal to run the program.

2. **Clone the Repository**:
   ```bash
   git clone https://github.com/<your-username>/CurrencyExchangeCalculator.git
   cd CurrencyExchangeCalculator
   ```

3. **Run the Application**:
   - Open the project in your Java IDE and run the `CurrencyExchangeCalculator` class.
   - Or, compile and run the program via terminal:
     ```bash
     javac CurrencyExchangeCalculator.java
     java CurrencyExchangeCalculator
     ```

---

## Technologies Used

- **Programming Language**: Java
- **Development Environment**: IntelliJ IDEA
- **Libraries**:
  - `java.util.HashMap`: For storing exchange rates.
  - `java.util.Scanner`: For user input.
  - `java.text.DecimalFormat`: For formatting output.

---

## Contributing

Contributions are welcome! If you have suggestions for new features or improvements:
1. Fork this repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-name
   ```
3. Make your changes and commit:
   ```bash
   git commit -m "Description of changes"
   ```
4. Push your branch:
   ```bash
   git push origin feature-name
   ```
5. Open a pull request.

---

## License

This project is open-source and available under the [MIT License](LICENSE).

---

## Author

**[Your Name]**  
[GitHub Profile](https://github.com/Purohit1999>)  

---
