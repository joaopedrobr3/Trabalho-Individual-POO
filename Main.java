import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        double valor;
        int opcao;

        System.out.println("Olá!");
        System.out.println("Digite o número da conta que deseja acessar: ");
        int numero = leia.nextInt();
        while(numero <= 0){
            System.out.println("Número invalido!\nDigite um número válido: ");
            numero = leia.nextInt();
        }
        leia.nextLine();

        System.out.println("Digite o nome do titular da conta que deseja acessar: ");
        String titular = leia.nextLine();
        while(titular == null || titular.isEmpty()){
            System.out.println("O nome do titular não pode ficar vazio\nDigite um nome de titular válido:");
            titular = leia.nextLine();
        }
        ContaBancaria conta = new ContaBancaria(numero, titular);

        do {
            System.out.println("MENU");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            opcao = leia.nextInt();

            switch(opcao){

                case 1:
                   System.out.println("Seu saldo é de :R$ " + conta.getSaldo());
                    break;

                case 2:
                    System.out.println("Quanto você deseja depositar: ");
                    valor = leia.nextDouble();
                    conta.depositar(valor);
                    break;

                case 3:
                    System.out.println("Quanto você deseja sacar: ");
                    valor = leia.nextDouble();
                    conta.sacar(valor);
                    break;

                case 0:
                    System.out.println("Finalizando Atendimento...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }while(opcao != 0);
    }
}
