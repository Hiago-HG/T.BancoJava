import java.util.Scanner;

public class TerminalBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String agencia;
		String nome;
		int conta;

        System.out.println("Me informe seu nome: ");
		nome = scanner.next();

		System.out.println("Digite o número da Conta");
		conta = scanner.nextInt();

		System.out.println("Digite o número da Agência:");
		agencia = scanner.next();
		scanner.nextLine();

		System.out.println();
		System.out.printf("Bom dia, " +nome+  " seja bem vindo ao banco Omega, sua agência é " +agencia+ ", e sua conta é " +conta+ ", agora você já pode acesssar o terminal");

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu consultar saldo.");
                    consultarSaldo();
                    break;
                case 2:
                    System.out.println("Saindo do terminal. Até logo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n--- Terminal de Banco ---");
        System.out.println("\n infelizmente esse terminal está diponivel apelas para consulta de saldo hoje");
        System.out.println("1. Consultar saldo ");
        System.out.println("2. Sair");
    }

    public static void consultarSaldo() {
    
        System.out.println("Seu saldo é R$ 8.000.000,00"); 
    }

   
}