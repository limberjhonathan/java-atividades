import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String agencia = solicitarAgencia(scanner);
        int numero = solicitarNumeroConta(scanner);
        String nomeCliente = solicitarNomeCliente(scanner);
        double saldo = solicitarSaldo(scanner);

        exibirMensagem(nomeCliente, agencia, numero, saldo);

        scanner.close();
    }

    private static String solicitarAgencia(Scanner scanner) {
        System.out.print("Por favor, digite o número da Agência: ");
        return scanner.nextLine();
    }

    private static int solicitarNumeroConta(Scanner scanner) {
        System.out.print("Agora, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }

    private static String solicitarNomeCliente(Scanner scanner) {
        System.out.print("Por favor, digite o nome do Cliente: ");
        return scanner.nextLine();
    }

    private static double solicitarSaldo(Scanner scanner) {
        double saldo = 0.0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite o saldo inicial da conta: ");
                String saldoStr = scanner.next();
                saldoStr = saldoStr.replace(',', '.');
                saldo = Double.parseDouble(saldoStr);
                entradaValida = true;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                scanner.next();
            }
        }

        return saldo;
    }

    private static void exibirMensagem(String nomeCliente, String agencia, int numero, double saldo) {
        Locale brasil = Locale.of("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);
        String saldoFormatado = formatoMoeda.format(saldo);

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldoFormatado + " já está disponível para saque.");
    }
}
