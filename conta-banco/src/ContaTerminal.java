import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeroUsuario = 0;
        String agencia = "";
        String nomeCliente = "";
        float saldo = 0.0f;

        System.out.println("Olá seja bem vindo a este banco! Vamos fazer seu cadastro?");
        System.out.println("Digite 'sim' para continuar ou 'não' para sair.");

        String resposta = scanner.nextLine();

        if(resposta.equalsIgnoreCase("sim")) {
            System.out.println("Ótimo! Vamos começar o cadastro.");

            nomeCliente = pegarNome(scanner);
            agencia = pegarAgencia(scanner);
            numeroUsuario = pegarNumeroUsuario(scanner);
            saldo = pegarSaldo(scanner);

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroUsuario + " e seu saldo R$" + saldo + " já está disponível para saque!");

        } else if(resposta.equalsIgnoreCase("não")) {
            System.out.println("Tudo bem, você pode voltar a qualquer momento para fazer o cadastro.");
        } else {
            System.out.println("Resposta inválida. Por favor, digite 'sim' ou 'não'.");
        }

        scanner.close();
    }

    public static String pegarNome(Scanner scanner) {
        System.out.println("Qual seu nome?");
        return scanner.nextLine();
    }

    public static String pegarAgencia(Scanner scanner) {
        System.out.println("Qual sua agência?");
        return scanner.nextLine();
    }

    public static int pegarNumeroUsuario(Scanner scanner) {
        System.out.println("Qual seu número de cliente?");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido para o número do cliente.");
            return 0; // Valor padrão ou você pode solicitar novamente
        }
    }

    public static float pegarSaldo(Scanner scanner) {
        System.out.println("Qual seu saldo inicial?");
        try {
            return Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido para o saldo.");
            return 0.0f; // Valor padrão ou você pode solicitar novamente
        }
    }
}
