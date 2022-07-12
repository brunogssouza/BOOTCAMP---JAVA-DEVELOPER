package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        try {
            System.out.println("Por favor, digite seu nome completo");
            nomeCliente = input.next();
            input.nextLine();

            System.out.println("Por favor, digite o numero da sua agencia");
            agencia = input.next();
            input.nextLine();

            System.out.println("Por favor, digite o numero da sua conta");
            numeroConta = input.nextInt();
            input.nextLine();

            System.out.println("Por favor, digite o seu saldo");
            saldo = input.nextDouble();
            input.nextLine();

            System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "
                    + agencia + " conta " + numeroConta + " e seu saldo " + saldo + " ja está disponivel para saque");
        } finally {
            input.close();
        }

    }

}
