import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Por favor, digite o valor do depósito - (Apenas números, ex: 100 ou 100.50): ");
        double saldo = scanner.nextDouble();

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Olá, " + nomeCompleto + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Seu saldo R$" + saldo + " já está disponível para saque");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        scanner.close();
    }
}
