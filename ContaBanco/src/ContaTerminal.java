import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Por favor, digite o numero da Conta:");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o numero da Agencia:");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo do Cliente:");
        saldo = sc.nextFloat();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente, agencia, numero, saldo));

        sc.close();

    }
}