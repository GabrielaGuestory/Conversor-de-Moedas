
import java.util.Scanner;

public class Principal {

    private static final double USD_TO_EUR = 0.9231;
    private static final double USD_TO_BRL = 5.4905;
    private static final double USD_TO_ARS = 918.2500;
    private static final double USD_TO_BOB = 6.9276;
    private static final double USD_TO_CLP = 935.9473;
    private static final double USD_TO_COP = 4104.9473;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Seja bem-vindo/a ao Conversor de Moeda!");

        while (!exit) {
            int option = getConversionOption(scanner);
            if (option == 0) {
                exit = true;
            } else if (option < 0 || option > 6) {
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            } else {
                double amount = getAmount(scanner);
                double convertedAmount = convertCurrency(option, amount);
                String[] currencyNames = {"EUR", "BRL", "ARS", "BOB", "CLP", "COP"};
                System.out.printf("O valor convertido é: %.2f %s\n", convertedAmount, currencyNames[option - 1]);
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
    private static int getConversionOption(Scanner scanner) {
        System.out.println("Escolha no menu, a opção de conversão:");
        System.out.println("1. USD para EUR");
        System.out.println("2. USD para BRL");
        System.out.println("3. USD para ARS");
        System.out.println("4. USD para BOB");
        System.out.println("5. USD para CLP");
        System.out.println("6. USD para COP");
        System.out.println("0. Sair");
        return scanner.nextInt();
    }

    private static double getAmount(Scanner scanner) {
        System.out.println("Informe o valor que precisa converter:");
        return scanner.nextDouble();
    }

    private static double convertCurrency(int option, double amount) {
        switch (option) {
            case 1:
                return amount * USD_TO_EUR;
            case 2:
                return amount * USD_TO_BRL;
            case 3:
                return amount * USD_TO_ARS;
            case 4:
                return amount * USD_TO_BOB;
            case 5:
                return amount * USD_TO_CLP;
            case 6:
                return amount * USD_TO_COP;
            default:
                return 0;
        }
    }
}
