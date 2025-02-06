import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // declarando Scanner
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.println("Por favor Digite o número da agência ");
        int numeroAgencia = entrada.nextInt();

        System.out.println("Por favor Digite o número da Conta ");
        int numeroConta = entrada.nextInt();

        System.out.println("Agora Digite seu nome ");
        String nomeCliente = entrada.next();

        System.out.println("Digite Seu Saldo ");
        Double saldoTotal = entrada.nextDouble();

        // saída de dados

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nossa banco, sua agência é " + numeroAgencia +
                        ", conta: " + numeroConta + ", e seu saldo de: " + saldoTotal
                        + ", já está disponível para saque.");

    }
}
